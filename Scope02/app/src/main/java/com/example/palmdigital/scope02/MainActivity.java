package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // member variables or fields
    char myChar = 'a';
    float myFloat = 67f;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myAwesomeMethod01()
    {
        int myInt = 1;
        double myDouble = 1.35;
        String myString = "HI";
        TextView myTextView = null;
        ImageView myImageView = null;
        Button myButton = null;
        myButton = findViewById(R.id.button_top);
    }
    public void myAwesomeMethod02()
    {
        int myInt2 = 2;
        double myDouble2 = 6.78;
        String myString2 = "hi";
        TextView myTextView2 = null;
        ImageView myImageView2 = null;
        Button myButton2 = null;
    }
    public void myAwesomeMethod03()
    {
        int myInt3 = 3;
        double myDouble3 = 4.59;
        String myString3 = "hello";
        TextView myTextView3 = null;
        ImageView myImageView3 = null;
        Button myButton3 = null;
    }
    public void myAwesomeMethod04()
    {
        int myInt4 = 4;
        double myDouble4 = 45.2;
        String myString4 = "HELLO";
        TextView myTextView4 = null;
        ImageView myImageView4 = null;
        Button myButton4 = null;
    }
    public void myAwesomoeMethod05()
    {
        int myInt5 = 5;
        double myDouble5 = 2.78;
        String myString5 = "hey";
        TextView myTextView5 = null;
        ImageView myImageView5 = null;
        Button myButton5 = null;
    }
}
