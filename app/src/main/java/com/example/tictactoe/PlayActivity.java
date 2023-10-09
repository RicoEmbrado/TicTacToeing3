package com.example.tictactoe;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayActivity extends AppCompatActivity {
    private Button toHomeButton;
    private Button
            buttonTL, buttonTC, buttonTR,
            buttonML, buttonMC, buttonMR,
            buttonBL, buttonBC, buttonBR;
    private int[][] grid;
    private int turnNum = 1;
    private int winsX = 0;
    private int winsO = 0;
    private TextView currentPlayer;

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
        buttonTL = (Button) findViewById(R.id.btn0); //TopLeft
        buttonTC = (Button) findViewById(R.id.btn1); //TopCenter
        buttonTR = (Button) findViewById(R.id.btn2); //TopRight
        buttonML = (Button) findViewById(R.id.btn3); //MidLeft
        buttonMC = (Button) findViewById(R.id.btn4); //MidCenter
        buttonMR = (Button) findViewById(R.id.btn5); //MidRight
        buttonBL = (Button) findViewById(R.id.btn6); //BotLeft
        buttonBC = (Button) findViewById(R.id.btn7); //BotCenter
        buttonBR = (Button) findViewById(R.id.btn8); //BotRight

        //current palyer declaration
        currentPlayer = (TextView)findViewById(R.id.currentPlayer);

        //onclick listeners
        allOnCLicks();

        //check for tie

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
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[0][0] = 1;
                        buttonTL.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[0][0] = -1;
                        buttonTL.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCL(turnNum, grid)); //checks win
                    reset(winCheckDL(turnNum, grid)); //checks win
                    reset(winCheckRT(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });

        buttonTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[0][1] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[0][1] = 1;
                        buttonTC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[0][1] = -1;
                        buttonTC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCC(turnNum, grid)); //checks win
                    reset(winCheckRT(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });

        buttonTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[0][2] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[0][2] = 1;
                        buttonTR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[0][2] = -1;
                        buttonTR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCR(turnNum, grid)); //checks win
                    reset(winCheckDR(turnNum, grid)); //checks win
                    reset(winCheckRT(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });

        buttonML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][0] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[1][0] = 1;
                        buttonML.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[1][0] = -1;
                        buttonML.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCL(turnNum, grid)); //checks win
                    reset(winCheckRM(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });

        buttonMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][1] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[1][1] = 1;
                        buttonMC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[1][1] = -1;
                        buttonMC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCC(turnNum, grid)); //checks win
                    reset(winCheckDL(turnNum, grid)); //checks win
                    reset(winCheckDR(turnNum, grid)); //checks win
                    reset(winCheckRM(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });
        buttonMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[1][2] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[1][2] = 1;
                        buttonMR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[1][2] = -1;
                        buttonMR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCR(turnNum, grid)); //checks win
                    reset(winCheckRM(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });
        buttonBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][0] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[2][0] = 1;
                        buttonBL.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[2][0] = -1;
                        buttonBL.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCL(turnNum, grid)); //checks win
                    reset(winCheckDR(turnNum, grid)); //checks win
                    reset(winCheckRB(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });
        buttonBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][1] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[2][1] = 1;
                        buttonBC.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[2][1] = -1;
                        buttonBC.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCC(turnNum, grid)); //checks win
                    reset(winCheckRB(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });
        buttonBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(grid[2][2] == 0) {
                    if (turnNum % 2 != 0)
                    {
                        turnNum++;
                        grid[2][2] = 1;
                        buttonBR.setText("X");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        turnNum++;
                        grid[2][2] = -1;
                        buttonBR.setText("O");
//                        Toast.makeText(PlayActivity.this,
//                                grid[0][0] + " value inside grid", Toast.LENGTH_LONG).show();
                    }
                    currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                }
                else
                {
                    CharSequence text = "Spot's Taken";
                    Toast.makeText(PlayActivity.this,
                            text, Toast.LENGTH_LONG).show();
                }
                if(turnNum > 5) {
                    reset(winCheckCR(turnNum, grid)); //checks win
                    reset(winCheckDL(turnNum, grid)); //checks win
                    reset(winCheckRB(turnNum, grid)); //checks win
                }
                if(turnNum > 9)
                {
                    reset(7);
                }
            }
        });
    }

    //win check for digaonal l to r
    private int winCheckDL(int turns, int[][] nums)
    {
        return nums[0][0] + nums[1][1] + nums[2][2];
    }
    //win check for digaonal r to l
    private int winCheckDR(int turns, int[][] nums)
    {
        return nums[2][0] + nums[1][1] + nums[0][2];
    }
    //win check for column l
    private int winCheckCL(int turns, int[][] nums)
    {
        return nums[0][0] + nums[1][0]+ nums[2][0];
    }
    //win check for column c
    private int winCheckCC(int turns, int[][] nums)
    {
        return nums[0][1] + nums[1][1] + nums[2][1];
    }
    //win check for column r
    private int winCheckCR(int turns, int[][] nums)
    {
        return nums[0][2] + nums[1][2] + nums[2][2];
    }
    //win check for row t
    private int winCheckRT(int turns, int[][] nums)
    {
        return nums[0][0] + nums[0][1] + nums[0][2];
    }
    //win check for row m
    private int winCheckRM(int turns, int[][] nums)
    {
        return nums[1][0] + nums[1][1] + nums[1][2];
    }
    //win check for row b
    private int winCheckRB(int turns, int[][] nums)
    {
        return nums[2][0] + nums[2][1] + nums[2][2];
    }

    private void reset(int score)
    {
        if(score == 3)
        {
            turnNum = 1;
            resetButtons();
            currentPlayer.setText(turnNum % 2 == 0 ? "Player TWO START": "Player ONE START");
            for (int[] i : grid) {
                Arrays.fill(i, 0);
            }
            winsX++;
            CharSequence text = "Player 1: X Wins!";
            Toast.makeText(PlayActivity.this,
                    text, Toast.LENGTH_LONG).show();
            TextView textView = (TextView)findViewById(R.id.totalXWin);
            textView.setText(winsX + "");
        }
        else if(score == -3)
        {
            turnNum = 1;
            resetButtons();
            currentPlayer.setText(turnNum % 2 == 0 ? "Player TWO START": "Player ONE START");
            for (int[] i : grid) {
                Arrays.fill(i, 0);
            }
            winsO++;
            CharSequence text = "Player 2: O Wins!";
            Toast.makeText(PlayActivity.this,
                    text, Toast.LENGTH_LONG).show();
            TextView textView = (TextView)findViewById(R.id.totalOwin);
            textView.setText(winsO + "");
        }
        else if(score == 7)
        {
            turnNum = 1;
            currentPlayer.setText(turnNum % 2 == 0 ? "Player TWO START": "Player ONE START");
            resetButtons();
            for (int[] i : grid) {
                Arrays.fill(i, 0);
            }
            CharSequence text = "TIE GAME";
            Toast.makeText(PlayActivity.this,
                    text, Toast.LENGTH_LONG).show();
        }
    }

    private void resetButtons()
    {
        ArrayList<Button> btnAll = new ArrayList<Button>();
        btnAll.add(buttonTL);
        btnAll.add(buttonTC);
        btnAll.add(buttonTR);
        btnAll.add(buttonML);
        btnAll.add(buttonMC);
        btnAll.add(buttonMR);
        btnAll.add(buttonBL);
        btnAll.add(buttonBC);
        btnAll.add(buttonBR);
        for(Button btn: btnAll)
        {
            btn.setText("~");
        }
    }
}