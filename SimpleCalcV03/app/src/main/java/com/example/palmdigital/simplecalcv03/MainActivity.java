package com.example.palmdigital.simplecalcv03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    TextView textViewClear;
    int num1;
    int num2;
    char operation;
    double result;
    ImageView imageViewPlus;
    ImageView imageViewMinus;
    ImageView imageViewMultiplication;
    ImageView imageViewDivision;
    ImageView imageViewExponentiation;
    ImageView imageViewEqual;
    TextView clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textViewNum1Display = findViewById(R.id.tvDisplay1);
    textViewNum2Display = findViewById(R.id.tvDisplay2);
    textViewOutput = findViewById(R.id.tvOutput);

    // create a reference to the ImageView XML UI elements

    ImageView imageView1a = findViewById(R.id.imageView_1);
    ImageView imageView2a = findViewById(R.id.imageView_2);
    ImageView imageView3a = findViewById(R.id.imageView_3);
    ImageView imageView4a = findViewById(R.id.imageView_4);
    ImageView imageView5a = findViewById(R.id.imageView_5);
    ImageView imageView6a = findViewById(R.id.imageView_6);
    ImageView imageView7a = findViewById(R.id.imageView_7);
    ImageView imageView8a = findViewById(R.id.imageView_8);
    ImageView imageView9a = findViewById(R.id.imageView_9);
        ImageView imageView0a = findViewById(R.id.imageView_0);

    ImageView imageView1b = findViewById(R.id.imageView2_1);
    ImageView imageView2b = findViewById(R.id.imageView2_2);
    ImageView imageView3b = findViewById(R.id.imageView2_3);
    ImageView imageView4b = findViewById(R.id.imageView2_4);
    ImageView imageView5b = findViewById(R.id.imageView2_5);
    ImageView imageView6b = findViewById(R.id.imageView2_6);
    ImageView imageView7b = findViewById(R.id.imageView2_7);
    ImageView imageView8b = findViewById(R.id.imageView2_8);
    ImageView imageView9b = findViewById(R.id.imageView2_9);
    ImageView imageView0b = findViewById(R.id.imageView2_0);

    imageViewPlus = findViewById(R.id.imageView_plus_sign);
    imageViewMinus = findViewById(R.id.imageView_minus_sign);
    imageViewMultiplication = findViewById(R.id.imageView_multiplication_sign);
    imageViewDivision = findViewById(R.id.imageView_division_sign);
    imageViewExponentiation = findViewById(R.id.imageView_exponentiation_sign);
    imageViewEqual = findViewById(R.id.imageView_equal_sign);

    clear = findViewById(R.id.tvClearButton);

    // setting ImageView objects to be clickable
        imageView1a.setOnClickListener(this);
        imageView2a.setOnClickListener(this);
        imageView3a.setOnClickListener(this);
        imageView4a.setOnClickListener(this);
        imageView5a.setOnClickListener(this);
        imageView6a.setOnClickListener(this);
        imageView7a.setOnClickListener(this);
        imageView8a.setOnClickListener(this);
        imageView9a.setOnClickListener(this);
        imageView0a.setOnClickListener(this);

        imageView1b.setOnClickListener(this);
        imageView2b.setOnClickListener(this);
        imageView3b.setOnClickListener(this);
        imageView4b.setOnClickListener(this);
        imageView5b.setOnClickListener(this);
        imageView6b.setOnClickListener(this);
        imageView7b.setOnClickListener(this);
        imageView8b.setOnClickListener(this);
        imageView9b.setOnClickListener(this);
        imageView0b.setOnClickListener(this);

        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewMultiplication.setOnClickListener(this);
        imageViewDivision.setOnClickListener(this);
        imageViewExponentiation.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);

        clear.setOnClickListener(this);

} // end of onCreate()

    public void onClick(View v)
    {
        String currNum1Val = textViewNum1Display.getText().toString();
        String currNum2Val = textViewNum2Display.getText().toString();


        if(v.getId() == R.id.imageView_0)
        {
            //String temp = currNum1Val + "0";
            textViewNum1Display.setText(currNum1Val + "0");
            int temp = Integer.parseInt(currNum1Val + "0");
            num1 = temp;
        }
        else if(v.getId() == R.id.imageView_1)
        {
            textViewNum1Display.setText(currNum1Val + "1");
            int temp = Integer.parseInt(currNum1Val + "1");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_2)
        {
            textViewNum1Display.setText(currNum1Val + "2");
            int temp = Integer.parseInt(currNum1Val + "2");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_3)
        {
            textViewNum1Display.setText(currNum1Val + "3");
            int temp = Integer.parseInt(currNum1Val + "3");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_4)
        {
            textViewNum1Display.setText(currNum1Val + "4");
            int temp = Integer.parseInt(currNum1Val + "4");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_5)
        {
            textViewNum1Display.setText(currNum1Val + "5");
            int temp = Integer.parseInt(currNum1Val + "5");
            num1 = temp;
        }
        else if(v.getId() == R.id.imageView_6)
        {
            textViewNum1Display.setText(currNum1Val + "6");
            int temp = Integer.parseInt(currNum1Val + "6");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_7)
        {
            textViewNum1Display.setText(currNum1Val + "7");
            int temp = Integer.parseInt(currNum1Val + "7");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_8)
        {
            textViewNum1Display.setText(currNum1Val + "8");
            int temp = Integer.parseInt(currNum1Val + "8");
            num1 = temp;
        }
        else if (v.getId() == R.id.imageView_9)
        {
            textViewNum1Display.setText(currNum1Val + "9");
            int temp = Integer.parseInt(currNum1Val + "9");
            num1 = temp;
        }


        //end of num1

        else if(v.getId() == R.id.imageView2_0)
        {
            textViewNum2Display.setText(currNum2Val + "0");
            int temp = Integer.parseInt(currNum2Val + "0");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_1)
        {
            textViewNum2Display.setText(currNum2Val + "1");
            int temp = Integer.parseInt(currNum2Val + "1");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_2)
        {
            textViewNum2Display.setText(currNum2Val + "2");
            int temp = Integer.parseInt(currNum2Val + "2");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_3)
        {
            textViewNum2Display.setText(currNum2Val + "3");
            int temp = Integer.parseInt(currNum2Val + "3");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_4)
        {
            textViewNum2Display.setText(currNum2Val + "4");
            int temp = Integer.parseInt(currNum2Val + "4");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_5)
        {
            textViewNum2Display.setText(currNum2Val + "5");
            int temp = Integer.parseInt(currNum2Val + "5");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_6)
        {
            textViewNum2Display.setText(currNum2Val + "6");
            int temp = Integer.parseInt(currNum2Val + "6");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_7)
        {
            textViewNum2Display.setText(currNum2Val + "7");
            int temp = Integer.parseInt(currNum2Val + "7");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_8)
        {
            textViewNum2Display.setText(currNum2Val + "8");
            int temp = Integer.parseInt(currNum2Val + "8");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView2_9)
        {
            textViewNum2Display.setText(currNum2Val + "9");
            int temp = Integer.parseInt(currNum2Val + "9");
            num2 = temp;
        }
        else if(v.getId() == R.id.imageView_plus_sign)
        {
            operation = '+';
            imageViewPlus.setBackgroundColor(0xff888888);
            imageViewMinus.setBackgroundColor(0000000000);
            imageViewMultiplication.setBackgroundColor(0000000000);
            imageViewDivision.setBackgroundColor(0000000000);
            imageViewExponentiation.setBackgroundColor(0000000000);
        }
        else if (v.getId() == R.id.imageView_minus_sign)
        {
            operation = '-';
            imageViewPlus.setBackgroundColor(0000000000);
            imageViewMinus.setBackgroundColor(0xff888888);
            imageViewMultiplication.setBackgroundColor(0000000000);
            imageViewDivision.setBackgroundColor(0000000000);
            imageViewExponentiation.setBackgroundColor(0000000000);
        }
        else if (v.getId() == R.id.imageView_multiplication_sign)
        {
            operation = '*';
            imageViewPlus.setBackgroundColor(0000000000);
            imageViewMinus.setBackgroundColor(0000000000);
            imageViewMultiplication.setBackgroundColor(0xff888888);
            imageViewDivision.setBackgroundColor(0000000000);
            imageViewExponentiation.setBackgroundColor(0000000000);
        }
        else if (v.getId() == R.id.imageView_division_sign)
        {
            operation = '/';
            imageViewPlus.setBackgroundColor(0000000000);
            imageViewMinus.setBackgroundColor(0000000000);
            imageViewMultiplication.setBackgroundColor(0000000000);
            imageViewDivision.setBackgroundColor(0xff888888);
            imageViewExponentiation.setBackgroundColor(0000000000);
        }
        else if (v.getId() == R.id.imageView_exponentiation_sign)
        {
            operation = 'e';
            imageViewPlus.setBackgroundColor(0000000000);
            imageViewMinus.setBackgroundColor(0000000000);
            imageViewMultiplication.setBackgroundColor(0000000000);
            imageViewDivision.setBackgroundColor(0000000000);
            imageViewExponentiation.setBackgroundColor(0xff888888);
        }
        else if (v.getId() == R.id.imageView_equal_sign)
        {
            if (operation == '/' && num2 == 0)
            {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }
            else if (operation == '+')
            {
                result = num1 + num2;
            }
            else if (operation == '-')
            {
                result = num1 - num2;
            }
            else if (operation == '*')
            {
                result = num1 * num2;
            }
            else if (operation == '/')
            {
                result = (double) num1 / num2;
            }
            else if (operation == 'e')
            {
                result = exp(num1, num2);
            }
            textViewOutput.setText("" + result);
        }
        else if (v.getId() == R.id.tvClearButton)
        {
            textViewNum1Display.setText("0");
            textViewNum2Display.setText("0");
            textViewOutput.setText("0");
        }

    } // end of onClick()
    public int exp(int num1, int num2)
    {
        int product = 1;
        int base = num1;
        int exp = num2;

        for (int i = 0; i < exp; i++)
        {
            product = product * base;
        }

        return product;
    }
}
