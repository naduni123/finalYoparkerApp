package com.example.finalapnlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificationCode3 extends AppCompatActivity {
    //Initialize Variable
    Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code3);

        //Assign Variable
        continueBtn = findViewById(R.id.continueBtn);

        //Direct to OTP Confirmation UI
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otpConfirmationIntent = new Intent(VerificationCode3.this, ConfirmCode4.class);
                startActivity(otpConfirmationIntent);
                finish();
            }
        });
    }
}