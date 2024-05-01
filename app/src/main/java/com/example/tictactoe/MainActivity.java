package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button toPlayLocalCoopButton;
    private Button toInstructionsButton;
    private Button toPlayAIScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        System.out.println("blbl: Entered onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("blbl: about to create some buttons");
        toPlayLocalCoopButton = (Button) findViewById(R.id.toPlayLocalCoopScreen);
        toInstructionsButton = (Button) findViewById(R.id.toInstructions);
        toPlayAIScreen = (Button) findViewById(R.id.toPlayAIScreen);
        toPlayLocalCoopButton.setOnClickListener(new View.OnClickListener() {
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
        toPlayAIScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPlayAIScreen();
            }
        });
        System.out.println("blbl: ending onCreate for Main Activity");
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
    public void openPlayAIScreen()
    {
        Intent intent = new Intent(this, PlayAIActivity.class);
        startActivity(intent);
    }
}