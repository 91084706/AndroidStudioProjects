package com.example.palmdigital.buttonchallenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button buttonObject1;
    public Button buttonObject2;
    public Button buttonObject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        buttonObject1 = findViewById(R.id.button1);
        buttonObject1.setText("Contacts");
        buttonObject1.setBackgroundColor(0xff00ff00);

        buttonObject2 = findViewById(R.id.button2);
        buttonObject2.setText("Email");
        buttonObject2.setBackgroundColor(0xff00ffff);

        buttonObject3 = findViewById(R.id.button3);
        buttonObject3.setText("Messages");
        buttonObject3.setBackgroundColor(0xffff0000);

        buttonObject1.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button1)
        {
            Toast.makeText(this, "Opening Contacts...", Toast.LENGTH_SHORT).show();
            Log.i("info", "Opening Contacts...");
        }
        else if(view.getId() == R.id.button2)
        {
            Toast.makeText(this, "You selected Email", Toast.LENGTH_SHORT).show();
            Log.i("info", "You selected Email");
        }
        else
        {
            Toast.makeText(this, "Gathering your Messages...", Toast.LENGTH_SHORT).show();
            Log.i("info", "Gathering your Messages...");
        }
    }
}
