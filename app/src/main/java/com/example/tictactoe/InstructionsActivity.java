package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InstructionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
//        Button toHomeButton = findViewById(R.id.toHome);
    }

    public void openHome(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        this.startActivity(intent);
    }
}