package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //
    int myInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare a local variable
        // dataType variableName; <-- this is a local variable declaration

        // some examples of primitive type and declarations
        int myInt; // int is a Java primitive type
        double myDouble; // double is a Java primitive type
        char myChar;
        float myFloat;
        boolean myBoolean;
        long myLong;
        byte myByte;
        // these are not primitive; they are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        // assign values to these variables;
        myString = "this is an awesome string";
        myInt = 5;
        myInt = awesomeMethod(myInt);
        Log.i("info", "myInt = " + myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBoolean = true;
        myBoolean = false;

        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awesomeMethod2();




    } // end of onCreate



    public int awesomeMethod(int input)
    {
        myInt = 10;
        awesomeMethod2();
        return input + 5;
    }

    public void awesomeMethod2()
    {
        myInt = 42;
        System.out.print("myInt = " + myInt);
    }




} // end of MainActivity class
