package com.kanchan.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        textView.setText("Before Clicking : Kanchan Kaushal");

        textView.setTextSize(30);   //SETS THE SIZE OF THE TEXT
        textView.setTextColor(Color.BLACK);     //SETS THE COLOR OF THE TEXT BEFORE CLICKING
        textView.setGravity(Gravity.CENTER);    //MAKES THE TEXT TO BE IN CENTER OF THE TEXT FIELD BY SETTING ITS GRAVITY TO BE CENTER
        textView.setBackgroundColor(Color.RED); //SETS THE BACKGROUND COLOR OF THE TEXT TO BE RED

        Button b1 = findViewById(R.id.b1);    // INITIALISE BUTTON b1

        b1.setOnClickListener(new View.OnClickListener() {    // WHEN CLIKING EVENT OCCURS
            @Override
            public void onClick(View v) {
                textView.setText("After Clicking: SP");   //SETS THE TEXT AFTER CLICKING
                textView.setTextSize(50);                              // SETS THE SIZE OF THE TEXT
                textView.setTextColor(Color.RED);                      //SETS THE COLOR OF THE TEXT BEFORE CLICKING
                textView.setGravity(Gravity.CENTER);                   //MAKES THE TEXT TO BE IN CENTER OF THE TEXT FIELD BY SETTING ITS GRAVITY TO BE CENTER
                textView.setBackgroundColor(Color.YELLOW);            //SETS THE BACKGROUND COLOR OF THE TEXT TO BE YELLOW
            }
        });


    }
}
