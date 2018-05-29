package com.example.palmdigital.caesarcipher_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_decrypt = findViewById(R.id.btn_decrypt);
        btn_decrypt.setOnClickListener(this);

        Button btn_encrypt = findViewById(R.id.btn_encrypt);
        btn_encrypt.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        // get the input string
        EditText  et_input = findViewById(R.id.et_input);
        String inputStr = et_input.getText().toString();

        // get the shift as a string and convert to an int
        String theShiftStr = "";
        EditText et_shift = findViewById(R.id.et_shift);
        theShiftStr += et_shift.getText().toString();
        int theShift = Integer.parseInt(theShiftStr);

        if(view.getId() == R.id.btn_encrypt)
        {
            String encrypted = encrypt(inputStr, theShift);
            TextView tv_encrypt = findViewById(R.id.tv_encrypt);
            tv_encrypt.setText(encrypted);
        }
        else if (view.getId() == R.id.btn_decrypt)
        {
            //Log.i("info", "hello");
            String decrypted = decrypt(inputStr, theShift);
            TextView tv_decrypt = findViewById(R.id.tv_decrypt);
            tv_decrypt.setText(decrypted);
        }
    }

    public String encrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        // for each character in the input string
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            // spaces
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        int shiftedIndex = (j + shift) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }

    public static String decrypt(String input, int shift)
    {
        String output = "";
        int alphabetSize = 26;
        char[] alphabet = new char[alphabetSize];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        // make every character in input uppercase
        input = input.toUpperCase();
        // for each character in the input string
        for (int i = 0; i < input.length(); i++)
        {
            char thisVal = input.charAt(i);
            // spaces
            if (thisVal == ' ')
            {
                output += ' ';
            }
            else
            {
                for (int j = 0; j < alphabetSize; j++)
                {
                    if (alphabet[j] == thisVal)
                    {
                        //int shiftedIndex_right = (alphabetSize + (j - shift)) % alphabetSize;
                        int shiftedIndex = (j - shift + alphabetSize) % alphabetSize;
                        output += alphabet[shiftedIndex];
                    }
                }
            }
        }
        return output;
    }

}
