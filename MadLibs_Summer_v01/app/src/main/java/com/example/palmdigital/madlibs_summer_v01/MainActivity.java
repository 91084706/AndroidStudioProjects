package com.example.palmdigital.madlibs_summer_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button makeStory = findViewById(R.id.button);
        makeStory.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        EditText etName = findViewById(R.id.et_name);
        String nameStr = etName.getText().toString();

        EditText etPlace1 = findViewById(R.id.et_place1);
        String placeStr = etPlace1.getText().toString();

        String story = "Last summer my mom and dad took me and ";
        story += nameStr;
        story += "on a trip to ";
        story += placeStr;
        story += ". The weather there is very ";

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
