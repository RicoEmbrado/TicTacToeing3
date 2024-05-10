package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionsActivity extends AppCompatActivity {
    private Button toHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        toHomeButton = findViewById(R.id.toHome);
    }

    public void openHome(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        this.startActivity(intent);
    }
}