package com.example.palmdigital.chooseyourownadventure_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);
        Button buttonYesObject = findViewById(R.id.buttonLeft_Yes);
        Button buttonHeckYesObject = findViewById(R.id.buttonRight_HeckYes);
        buttonHeckYesObject.setOnClickListener(this);
        buttonYesObject.setOnClickListener(this);
    }
    public void OnClick (View v)
    {
        if ()
    }
}
