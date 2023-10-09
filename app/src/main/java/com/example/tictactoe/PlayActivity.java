package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PlayActivity extends AppCompatActivity {
    private Button toHomeButton;
    private Button
            buttonTL, buttonTC, buttonTR,
            buttonML, buttonMC, buttonMR,
            buttonBL, buttonBC, buttonBR;
    private int[][] grid;
    private boolean player1Turn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        grid = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        toHomeButton = (Button) findViewById(R.id.toHome);
        toHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        //declare button for all grid locations
        buttonTL = (Button) findViewById(R.id.buttonTopL); //TopLeft
        buttonTC = (Button) findViewById(R.id.buttonTopC); //TopCenter
        buttonTR = (Button) findViewById(R.id.buttonTopR); //TopRight
        buttonML = (Button) findViewById(R.id.buttonMidL); //MidLeft
        buttonMC = (Button) findViewById(R.id.buttonMidC); //MidCenter
        buttonMR = (Button) findViewById(R.id.buttonMidR); //MidRight
        buttonBL = (Button) findViewById(R.id.buttonBotL); //BotLeft
        buttonBC = (Button) findViewById(R.id.buttonBotC); //BotCenter
        buttonBR = (Button) findViewById(R.id.buttonBotR); //BotRight

        //onclick listeners
        allOnCLicks();

    }
    public void openHome()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void allOnCLicks()
    {
        buttonTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[0][0] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[0][0] = 1;
                        buttonTL.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[0][0] = -1;
                        buttonTL.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[0][1] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[0][1] = 1;
                        buttonTC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[0][1] = -1;
                        buttonTC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[0][2] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[0][2] = 1;
                        buttonTR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[0][2] = -1;
                        buttonTR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][0] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[1][0] = 1;
                        buttonML.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[1][0] = -1;
                        buttonML.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][1] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[1][1] = 1;
                        buttonMC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[1][1] = -1;
                        buttonMC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][2] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[1][2] = 1;
                        buttonMR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[1][2] = -1;
                        buttonMR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][0] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[2][0] = 1;
                        buttonBL.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[2][0] = -1;
                        buttonBL.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][1] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[2][1] = 1;
                        buttonBC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[2][1] = -1;
                        buttonBC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][2] == 0) {
                    if (player1Turn)
                    {
                        player1Turn = !player1Turn;
                        grid[2][2] = 1;
                        buttonBR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        player1Turn = !player1Turn;
                        grid[2][2] = -1;
                        buttonBR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}