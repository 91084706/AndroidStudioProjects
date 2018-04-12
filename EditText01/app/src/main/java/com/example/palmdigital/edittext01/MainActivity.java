package com.example.palmdigital.edittext01;

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

        Button bGetName = findViewById(R.id.buttonGetName);
        bGetName.setOnClickListener(this);
    } // end of onCreate method

    public void onClick(View view)
    {
        EditText etFirstName = (EditText) findViewById(R.id.et_firstName);
        String firstStr = etFirstName.getText().toString();

        EditText etLastName = findViewById(R.id.et_lastName);
        String lastStr = etLastName.getText().toString();

        String fullName = firstStr + " " + lastStr;

        TextView tvOutput = findViewById(R.id.tv_output);
        tvOutput.setText(fullName);
    }
}
