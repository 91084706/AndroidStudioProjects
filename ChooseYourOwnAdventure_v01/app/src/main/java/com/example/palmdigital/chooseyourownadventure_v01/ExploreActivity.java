package com.example.palmdigital.chooseyourownadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Button buttonToiletObject = findViewById(R.id.buttonRight_Toilet);
        Button buttonBackyardObject = findViewById(R.id.buttonLeft_Backyard);
        buttonToiletObject.setOnClickListener(this);
        buttonBackyardObject.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.buttonRight_Toilet)
        {
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
    }
}
