package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button toPlayLocalCoopButton;
    private Button toInstructionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPlayLocalCoopButton = (Button) findViewById(R.id.toPlayLocalCoopScreen);
        toInstructionsButton = (Button) findViewById(R.id.toInstructions);
    }

    public void openInstructions()
    {
        Intent intent = new Intent(this, InstructionsActivity.class);
        startActivity(intent);
    }
    public void openPlayScreen()
    {
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }


}