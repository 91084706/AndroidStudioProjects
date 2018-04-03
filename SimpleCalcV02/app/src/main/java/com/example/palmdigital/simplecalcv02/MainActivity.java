package com.example.palmdigital.simplecalcv02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1 = 0;
    int num2 = 0;
    boolean operation = true;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display = findViewById(R.id.tvNum1Display);
        textViewNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tvOutput);

        // create a reference to the ImageView XML UI elements
        ImageView imageView1 = findViewById(R.id.imageView_1);
        ImageView imageView2 = findViewById(R.id.imageView_2);
        ImageView imageView3 = findViewById(R.id.imageView_3);
        ImageView imageView4 = findViewById(R.id.imageView_4);
        ImageView imageView5 = findViewById(R.id.imageView_5);
        ImageView imageView6 = findViewById(R.id.imageView_6);
        ImageView imageViewPlus = findViewById(R.id.imageView_Plus);
        ImageView imageViewMinus = findViewById(R.id.imageView_Minus);
        ImageView imageViewEqual = findViewById(R.id.imageView_Equal);

        // setting ImageView objects to be clickable
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewMinus.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);

    } // end of onCreate()

    public void onClick(View v)
    {
        if(v.getId() == R.id.imageView_1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (v.getId() == R.id.imageView_2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if (v.getId() == R.id.imageView_3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (v.getId() == R.id.imageView_4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if (v.getId() == R.id.imageView_5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if(v.getId() == R.id.imageView_6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if(v.getId() == R.id.imageView_Plus)
        {
            operation = true;
        }
        else if (v.getId() == R.id.imageView_Minus)
        {
            operation = false;
        }
        else if (v.getId() == R.id.imageView_Equal)
        {
            if (operation == true)
            {
                result = num1 + num2;
            }
            else if (operation == false)
            {
                result = num1 - num2;
            }
            textViewOutput.setText("" + result);
        }

    }
} // end of class
