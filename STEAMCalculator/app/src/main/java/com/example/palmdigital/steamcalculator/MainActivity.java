package com.example.palmdigital.steamcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewNum1;
    TextView textViewNum2;
    TextView textViewOutput;
    ImageView iv_one;
    ImageView iv_two;
    ImageView iv_three;
    ImageView iv_four;
    ImageView iv_five;
    ImageView iv_six;
    ImageView iv_seven;
    ImageView iv_eight;
    ImageView iv_nine;
    //
    ImageView iv_one2;
    ImageView iv_two2;
    ImageView iv_three2;
    ImageView iv_four2;
    ImageView iv_five2;
    ImageView iv_six2;
    ImageView iv_seven2;
    ImageView iv_eight2;
    ImageView iv_nine2;

    ImageView iv_plus;
    ImageView iv_minus;
    ImageView iv_multi;
    ImageView iv_divi;
    ImageView iv_equal;

    int output;
    int num1;
    int num2;
    char operation;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1 = findViewById(R.id.tv_input);
        textViewNum2 = findViewById(R.id.iv_input2);
        textViewOutput = findViewById(R.id.tv_output);
        iv_one = findViewById(R.id.iv_one);
        iv_two = findViewById(R.id.iv_two);
        iv_three = findViewById(R.id.iv_three);
        iv_four = findViewById(R.id.iv_four);
        iv_five = findViewById(R.id.iv_five);
        iv_six = findViewById(R.id.iv_six);
        iv_seven = findViewById(R.id.iv_seven);
        iv_eight = findViewById(R.id.iv_eight);
        iv_nine = findViewById(R.id.iv_nine);

        iv_one2 = findViewById(R.id.iv_one_2);
        iv_two2 = findViewById(R.id.iv_two_2);
        iv_three2 = findViewById(R.id.iv_three_2);
        iv_four2 = findViewById(R.id.iv_four_2);
        iv_five2 = findViewById(R.id.iv_five_2);
        iv_six2 = findViewById(R.id.iv_six_2);
        iv_seven2 = findViewById(R.id.iv_seven_2);
        iv_eight2 = findViewById(R.id.iv_eight_2);
        iv_nine2 = findViewById(R.id.iv_nine_2);

        iv_plus = findViewById(R.id.iv_plus);
        iv_minus = findViewById(R.id.iv_minus);
        iv_multi = findViewById(R.id.iv_multi);
        iv_divi = findViewById(R.id.iv_divi);
        iv_equal = findViewById(R.id.iv_equals);

        iv_one.setOnClickListener(this);
        iv_two.setOnClickListener(this);
        iv_three.setOnClickListener(this);
        iv_four.setOnClickListener(this);
        iv_five.setOnClickListener(this);
        iv_six.setOnClickListener(this);
        iv_seven.setOnClickListener(this);
        iv_eight.setOnClickListener(this);
        iv_nine.setOnClickListener(this);
        //
        iv_one2.setOnClickListener(this);
        iv_two2.setOnClickListener(this);
        iv_three2.setOnClickListener(this);
        iv_four2.setOnClickListener(this);
        iv_five2.setOnClickListener(this);
        iv_six2.setOnClickListener(this);
        iv_seven2.setOnClickListener(this);
        iv_eight2.setOnClickListener(this);
        iv_nine2.setOnClickListener(this);

        iv_equal.setOnClickListener(this);

    } // end of onCreate

    // Start of onClick
    public void onClick (View v)
    {
        if (v.getId() == R.id.iv_one)
        {
            textViewNum1.setText("1");
            num1 = 1;
        }
        else if (v.getId() == R.id.iv_two)
        {
            textViewNum1.setText("2");
            num1 = 2;
        }
        else if (v.getId() == R.id.iv_three)
        {
            textViewNum1.setText("3");
            num1 = 3;
        }
        else if (v.getId() == R.id.iv_four)
        {
            textViewNum1.setText("4");
            num1 = 4;
        }
        else if (v.getId() == R.id.iv_five)
        {
            textViewNum1.setText("5");
            num1 = 5;
        }
        else if (v.getId() == R.id.iv_six)
        {
            textViewNum1.setText("6");
            num1 = 6;
        }
        else if (v.getId() == R.id.iv_seven)
        {
            textViewNum1.setText("7");
            num1 = 7;
        }
        else if (v.getId() == R.id.iv_eight)
        {
            textViewNum1.setText("8");
            num1 = 8;
        }
        else if (v.getId() == R.id.iv_nine)
        {
            textViewNum1.setText("9");
            num1 = 9;
        }
        //
        //
        //
        //
        else if(v.getId() == R.id.iv_one_2)
        {
            textViewNum2.setText("1");
            num2 = 1;
        }
        else if(v.getId() == R.id.iv_two_2)
        {
            textViewNum2.setText("2");
            num2 = 2;
        }
        else if(v.getId() == R.id.iv_three_2)
        {
            textViewNum2.setText("3");
            num2 = 3;
        }
        else if(v.getId() == R.id.iv_four_2)
        {
            textViewNum2.setText("4");
            num2 = 4;
        }
        else if(v.getId() == R.id.iv_five_2)
        {
            textViewNum2.setText("5");
            num2 = 5;
        }
        else if(v.getId() == R.id.iv_six_2)
        {
            textViewNum2.setText("6");
            num2 = 6;
        }
        else if(v.getId() == R.id.iv_seven_2)
        {
            textViewNum2.setText("7");
            num2 = 7;
        }
        else if(v.getId() == R.id.iv_eight_2)
        {
            textViewNum2.setText("8");
            num2 = 8;
        }
        else if(v.getId() == R.id.iv_nine_2)
        {
            textViewNum2.setText("9");
            num2 = 9;
        }
        else if (v.getId() == R.id.iv_plus)
        {
            operation = '+';
        }
        else if (v.getId() == R.id.iv_minus)
        {
            operation = '-';
            Log.i("info", "minus sign");
        }
        else if (v.getId() == R.id.iv_multi)
        {
            operation = '*';
        }
        else if (v.getId() == R.id.iv_divi)
        {
            operation = '/';
        }
        else if(v.getId() == R.id.iv_equals)
        {
            System.out.println("operation = " + operation);
            if (operation == '+')
            {
                System.out.println("getting in here...");
                output = num1 + num2;
            }
            else if (operation == '-')
            {
                output = num1 - num2;
            }
            else if (operation == '*')
            {
                output = num1 * num2;
            }
            else if (operation == '/')
            {
                output = num1 / num2;
            }
            textViewOutput.setText("" + output);
            Log.i("info", "# is = " + output);
        }


    } // end of onClick
} // end of MainActivity
