package example.com.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /** Adds 3 points to the team A */

    public void threePoints(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA( scoreTeamA ) ;
    }

    /** Adds 2 points to the team A */

    public void twoPoints(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA( scoreTeamA ) ;
    }

    /** Adds 1 point to the team A */
    public void freeThrow(View view)
    {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA( scoreTeamA ) ;
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /** Adds 3 points to the team B */

    public void threePointsB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB( scoreTeamB ); ;
    }

    /** Adds 2 points to the team B */

    public void twoPointsB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB( scoreTeamB ) ;
    }

    /** Adds 1 point to the team B */
    public void freeThrowB(View view)
    {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB( scoreTeamB ) ;
    }

    public void reset (View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
