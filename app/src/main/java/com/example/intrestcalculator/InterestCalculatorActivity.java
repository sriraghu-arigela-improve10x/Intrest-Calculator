package com.example.intrestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InterestCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_calculator);
        handleInterestButton();
    }

    public void handleInterestButton() {
        Button interestCalculatorBtn = findViewById(R.id.interest_calculator_btn);
        interestCalculatorBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalculaterActivity.class);
            startActivity(intent);
        });
    }
}