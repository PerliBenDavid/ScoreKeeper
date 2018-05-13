package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    TextView scoreViewA;
    TextView scoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = findViewById(R.id.team_a_score);
        scoreViewB = findViewById(R.id.team_b_score);
    }

    private void updateScoreA(int value){
        scoreTeamA += value;
        scoreViewA.setText(String.valueOf(scoreTeamA));
    }

    public void addOnePointToTeamA(View view) {
        updateScoreA(1);
    }

    public void addTwoPointToTeamA(View view) {
        updateScoreA(2);
    }

    public void addThreePointToTeamA(View view) {
        updateScoreA(3);
    }

    public void addSixPointToTeamA(View view) {
        updateScoreA(6);
    }

    private void updateScoreB(int value){
        scoreTeamB += value;
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }

    public void addOnePointToTeamB(View view) {
        updateScoreB(1);
    }

    public void addTwoPointToTeamB(View view) {
        updateScoreB(2);
    }

    public void addThreePointToTeamB(View view) {
        updateScoreB(3);
    }

    public void addSixPointToTeamB(View view) {
        updateScoreB(6);
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreViewA.setText(String.valueOf(scoreTeamA));
        scoreViewB.setText(String.valueOf(scoreTeamB));
    }
}
