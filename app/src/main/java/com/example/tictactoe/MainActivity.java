package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button toPlayButton;
    private Button toInstructionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPlayButton = (Button) findViewById(R.id.toPlayScreen);
        toInstructionsButton = (Button) findViewById(R.id.toInstructions);
        toPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlayScreen();
            }
        });
        toInstructionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInstructions();
            }
        });
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