package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener
{
    private int winsX = 0;
    private int winsO = 0;
    private TextView currentPlayer;
    private Button buttonTL, buttonTC, buttonTR, buttonML, buttonMC, buttonMR, buttonBL, buttonBC, buttonBR;
    private List<Button> buttons = new ArrayList<Button>();
    private int[] grid = new int[9];
    int turnNum = 0;
/*    private boolean xTurn = true;
      boolean alt representation of turns
      using "xTurn ^= true;" to swap */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        currentPlayer = (TextView)findViewById(R.id.currentPlayer);
        buttonTL = (Button)findViewById(R.id.btn0); //TopLeft
        buttonTC = (Button) findViewById(R.id.btn1); //TopCenter
        buttonTR = (Button) findViewById(R.id.btn2); //TopRight
        buttonML = (Button) findViewById(R.id.btn3); //MidLeft
        buttonMC = (Button) findViewById(R.id.btn4); //MidCenter
        buttonMR = (Button) findViewById(R.id.btn5); //MidRight
        buttonBL = (Button) findViewById(R.id.btn6); //BotLeft
        buttonBC = (Button) findViewById(R.id.btn7); //BotCenter
        buttonBR = (Button) findViewById(R.id.btn8); //BotRight

        buttons.addAll(Arrays.asList(buttonTL, buttonTC, buttonTR, buttonML, buttonMC, buttonMR, buttonBL, buttonBC, buttonBR));
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v)
    {
        int clickedBtn = v.getId();
        int index = -1; // Default to -1 if not found
        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).getId() == clickedBtn) {
                index = i;
                break;
            }
        }
        if(grid[index] == 0) { //set the "grid" to -1 (for O's) or 1 (for X's)
            grid[index] = turnNum%2 == 0 ? 1: -1;
            buttons.get(index).setText(grid[index] == 1 ? "X": "O");
            turnNum++;
            if(turnNum > 4) {

            }
        }
        else { //toast message indicating you cannot place there
            CharSequence text = "Spot's Taken";
            Toast.makeText(PlayActivity.this, text, Toast.LENGTH_LONG).show();
        }
    }
    private void winCheck(int sum)
    {
        if(Math.abs(sum) == 3) {
            resetButtons();
            CharSequence text = "Player ";
            if(sum < 0) {
                text+= "2 Wins!";
                winsO++;
            }
            else {
                text+= "1 Wins!";
                winsX++;
            }
            Toast.makeText(PlayActivity.this, text, Toast.LENGTH_LONG).show();
        }
    }
    private int checkDiagonalSum(int gid) //grid index
    {
        return 0;
    }
    private int checkColumnSum(int gid) //grid index
    {
        int winSum = 0;
        int startIndex = gid %3;
        for(int i = startIndex; i < startIndex+7; i+=3)
        {
            winSum += grid[i];
        }
        return winSum;
    }
    private int checkRowSum(int gid) //grid index
    {
        int winSum = 0;
        int startIndex = gid%3 * 3;
        for(int i = startIndex; i < startIndex+4; i++)
        {
            winSum += grid[i];
        }
        return winSum;
    }

    private void resetButtons()
    {
        for(Button btn: buttons)
        {
            btn.setText("~");
        }
    }
    public void openHome(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    } //starts the home page activity
}
