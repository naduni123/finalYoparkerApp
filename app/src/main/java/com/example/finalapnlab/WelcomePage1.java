package com.example.finalapnlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomePage1 extends AppCompatActivity {
    //Initialize Variables
    Button currentLocationBtn, otherLocationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page1);

        //Assign Variables
        currentLocationBtn = findViewById(R.id.currentLocationBtn);
        otherLocationBtn = findViewById(R.id.otherLocationBtn);

        //Direct to Login-Signup UI
        currentLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginSignupIntent = new Intent(WelcomePage1.this, LoginAndSignUp2.class);
                startActivity(loginSignupIntent);
                finish();
            }
        });

        otherLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginSignupIntent = new Intent(WelcomePage1.this, LoginAndSignUp2.class);
                startActivity(loginSignupIntent);
                finish();
            }
        });
    }
}