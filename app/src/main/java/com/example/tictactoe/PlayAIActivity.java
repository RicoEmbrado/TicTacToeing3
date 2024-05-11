package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlayAIActivity extends AppCompatActivity
{
    private Button backToHomeScreen;
//    private final List<Button> BUTTONS = new ArrayList<>();
//    private final int[] grid = new int[9];
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_ai);

        backToHomeScreen = findViewById(R.id.backHome);
//        Log.d("TAG", "Static call to check column " + PlayActivity.checkColumnSum(0));
//        BUTTONS.addAll(Arrays.asList());
//        for (Button button : BUTTONS)
//            button.setOnClickListener(this);
    }

    public void goHome(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        this.startActivity(intent);
    }
}