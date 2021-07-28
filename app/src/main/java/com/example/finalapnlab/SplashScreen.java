package com.example.finalapnlab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {
    //Initialize Variables
    Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Assign variables
        homeBtn = findViewById(R.id.homeBtn);

        //Direct to Main Option UI
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainOptionIntent = new Intent(SplashScreen.this, WelcomePage1.class);
                startActivity(mainOptionIntent);
                finish();
            }
        });
    }
}