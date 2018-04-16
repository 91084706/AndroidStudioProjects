package com.example.palmdigital.madlibspizza_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText etAdj1 = findViewById(R.id.et_adjective1);
        String adjStr = etAdj1.getText().toString();

        EditText etNationality = findViewById(R.id.et_nationality);
        String nationalityStr = etNationality.getText().toString();

        EditText etName = findViewById(R.id.et_name);
        String nameStr = etName.getText().toString();

        EditText etNoun = findViewById(R.id.et_noun1);
        String nounStr = etNoun.getText().toString();

        String story = "Pizza was invented by a ";
        story = story + adjStr;
        story = story + " " + nationalityStr;
        story = story + "chef named ";
        story = story + " " + nameStr;
        story = story + ". To make a pizza, you need to take a lump of ";
        story = story + " " + nounStr;

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
