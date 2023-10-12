package com.example.tictactoe;

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

public class PlayActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView currentPlayer;
    private Button
            buttonTL, buttonTC, buttonTR,
            buttonML, buttonMC, buttonMR,
            buttonBL, buttonBC, buttonBR;
    private int[][] grid
          = new int[][]{
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };;
    private int turnNum = 1;
    private int winsX = 0;
    private int winsO = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
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
        //all onclicks
        buttonTL.setOnClickListener(this);
        buttonTC.setOnClickListener(this);
        buttonTR.setOnClickListener(this);
        buttonML.setOnClickListener(this);
        buttonMC.setOnClickListener(this);
        buttonMR.setOnClickListener(this);
        buttonBL.setOnClickListener(this);
        buttonBC.setOnClickListener(this);
        buttonBR.setOnClickListener(this);
        //current palyer declaration
        currentPlayer = (TextView)findViewById(R.id.currentPlayer);
    }
    public void openHome()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    } //starts the home page activity
    @Override
    public void onClick(View v) {
        int id = v.getId();
        int placement;
        if(id == R.id.btn0)
        {
            placement = editCheck(0,0);
            if(placement != 0) {
                buttonTL.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckDL());
                    reset(winCheckC(0));
                    reset(winCheckR(0));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn1)
        {
            placement = editCheck(0,1);
            if(placement != 0) {
                buttonTC.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckC(1));
                    reset(winCheckR(0));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn2)
        {
            placement = editCheck(0,2);
            if(placement != 0) {
                buttonTR.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckC(2));
                    reset(winCheckR(0));
                    reset(winCheckDR());
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn3)
        {
            placement = editCheck(1,0);
            if(placement != 0) {
                buttonML.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckR(1));
                    reset(winCheckC(0));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn4)
        {
            placement = editCheck(1,1);
            if(placement != 0) {
                buttonMC.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckR(1));
                    reset(winCheckC(1));
                    reset(winCheckDL());
                    reset(winCheckDR());
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn5)
        {
            placement = editCheck(1,2);
            if(placement != 0) {
                buttonMR.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckC(2));
                    reset(winCheckR(1));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn6)
        {
            placement = editCheck(2,0);
            if(placement != 0) {
                buttonBL.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckDR());
                    reset(winCheckR(2));
                    reset(winCheckC(0));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn7)
        {
            placement = editCheck(2,1);
            if(placement != 0) {
                buttonBC.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckR(2));
                    reset(winCheckC(1));
                }
            }
            if(turnNum > 9)
                reset(7);
        }
        if(id == R.id.btn8)
        {
            placement = editCheck(2,2);
            if(placement != 0) {
                buttonBR.setText(placement == 1 ? "X" : "O");
                currentPlayer.setText(turnNum %2 == 0 ? "Player TWO": "Player ONE");
                if(turnNum > 5) {
                    reset(winCheckR(2));
                    reset(winCheckC(2));
                    reset(winCheckDL());
                }
            }
            if(turnNum > 9)
                reset(7);
        }
    }
    private int editCheck(int r, int c)
    {
        if(grid[r][c] == 0) {
            if (turnNum % 2 != 0)
            {
                turnNum++;
                grid[r][c] = 1;
                return 1;
            }
            else
            {
                turnNum++;
                grid[r][c] = -1;
                return -1;
            }
        }
        else
        {
            CharSequence text = "Spot's Taken";
            Toast.makeText(PlayActivity.this,
                    text, Toast.LENGTH_LONG).show();
            return 0;
        }
    }
    //win check for digaonal l to r
    private int winCheckDL()
    {
        return grid[0][0] + grid[1][1] + grid[2][2];
    }
    //win check for digaonal r to l
    private int winCheckDR()
    {
        return grid[2][0] + grid[1][1] + grid[0][2];
    }
    private int winCheckC(int c)
    {
        return grid[0][c] + grid[1][c]+ grid[2][c];
    }
    private int winCheckR(int r)
    {
        return grid[r][0] + grid[r][1]+ grid[r][2];
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