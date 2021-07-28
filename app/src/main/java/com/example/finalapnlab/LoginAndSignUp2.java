package com.example.finalapnlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class LoginAndSignUp2 extends AppCompatActivity {
    //Initialize Variable
    Button loginSignupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_sign_up2);

        //Assign Variable
        loginSignupBtn = findViewById(R.id.loginSignupBtn);

        //Direct to OTP Verification UI
        loginSignupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otpVerificationIntent = new Intent(LoginAndSignUp2.this, VerificationCode3.class);
                startActivity(otpVerificationIntent);
                finish();
            }
        });
    }
}