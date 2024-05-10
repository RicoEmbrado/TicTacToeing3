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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toPlayLocalCoopButton = (Button) findViewById(R.id.toPlayLocalCoopScreen);
        toInstructionsButton = (Button) findViewById(R.id.toInstructions);
// <<<<<<< master
//         toPlayAIScreen = (Button) findViewById(R.id.toPlayAIScreen);
//         toPlayLocalCoopButton.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 openPlayScreen();
//             }
//         });
//         toInstructionsButton.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 openInstructions();
//             }
//         });
//         toPlayAIScreen.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 openPlayAIScreen();
//             }
//         });
//         System.out.println("blbl: ending onCreate for Main Activity");
// =======
// >>>>>>> master
    }
    public void openInstructions(View v)
    {
        Intent intent = new Intent(this, InstructionsActivity.class);
        finish();
        this.startActivity(intent);
    }
    public void openPlayScreen(View v)
    {
        Intent intent = new Intent(this, PlayActivity.class);
        finish();
        this.startActivity(intent);
    }
// <<<<<<< master
//     public void openPlayAIScreen()
//     {
//         Intent intent = new Intent(this, PlayAIActivity.class);
//         startActivity(intent);
//     }
// =======
// >>>>>>> master
}