package com.example.celenaflores.practice;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
import android.media.MediaPlayer;

/**
 * Created by celee on 3/7/18.
 */

public class GameActivity1 extends AppCompatActivity {

    //declare variables
    TextView lives_TextView, score_TextView;

    Button start_button;

    Random randomBunny;

    ImageView bunny1, bunny2, bunny3, bunny4, bunny5, bunny6, bunny7, bunny8, bunny9;

    int score = 0, fps = 1000, lives = 5, tempiflives = 0;

    int which = 0;

    int whichsave = 0;

    AnimationDrawable bunnyan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //initialize variables
        start_button = (Button) findViewById(R.id.start_button);

        final MediaPlayer whackBunny = MediaPlayer.create(this, R.raw.whack);

        randomBunny = new Random();

        lives_TextView = (TextView) findViewById(R.id.lives_tv);
        score_TextView = (TextView) findViewById(R.id.score_tv);

        bunny1 = (ImageView) findViewById(R.id.bunny1);
        bunny2 = (ImageView) findViewById(R.id.bunny2);
        bunny3 = (ImageView) findViewById(R.id.bunny3);

        bunny4 = (ImageView) findViewById(R.id.bunny4);
        bunny5 = (ImageView) findViewById(R.id.bunny5);
        bunny6 = (ImageView) findViewById(R.id.bunny6);

        bunny7 = (ImageView) findViewById(R.id.bunny7);
        bunny8 = (ImageView) findViewById(R.id.bunny8);
        bunny9 = (ImageView) findViewById(R.id.bunny9);

        //hide bunnies from user
        bunny1.setVisibility(View.INVISIBLE);
        bunny2.setVisibility(View.INVISIBLE);
        bunny3.setVisibility(View.INVISIBLE);
        bunny4.setVisibility(View.INVISIBLE);
        bunny5.setVisibility(View.INVISIBLE);
        bunny6.setVisibility(View.INVISIBLE);
        bunny7.setVisibility(View.INVISIBLE);
        bunny8.setVisibility(View.INVISIBLE);
        bunny9.setVisibility(View.INVISIBLE);

        //having a button will allow user when to start game
        //in case the user is not ready yet
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //initalize live count and display to screen
                lives = 5;
                lives_TextView.setText("Lives: " + lives);
                //initialize score count and display to screen
                score = 0;
                score_TextView.setText("Score: " + score);
                //create handler to start game action
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //call game action
                        //game action will have the code for the game
                        theGameActions();
                    }
                }, 1000);
                //set the button to not be able to be clicked
                //so that a user does not accidently start the game again
                start_button.setEnabled(false);
            }
        });

        //have onClickListeners for all the bunnies
        //if the bunny is clicked it will...
        //increase score
        //not remove a life
        //change image to a sad bunny because it was hit
        //not enable it after so a new bunny can pop up
        //play whack sound when bunny is hit

        bunny1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny1.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny1.setEnabled(false);
            }
        });

        bunny2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny2.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny2.setEnabled(false);
            }
        });

        bunny3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny3.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny3.setEnabled(false);
            }
        });

        bunny4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny4.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny4.setEnabled(false);
            }
        });

        bunny5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny5.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny5.setEnabled(false);
            }
        });

        bunny6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny6.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny6.setEnabled(false);
            }
        });

        bunny7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny7.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny7.setEnabled(false);
            }
        });

        bunny8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny8.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny8.setEnabled(false);
            }
        });

        bunny9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempiflives = 1;
                bunny9.setImageResource(R.drawable.p_hit);
                whackBunny.start();
                score = score + 1;
                score_TextView.setText("Score: " + score);
                bunny9.setEnabled(false);
            }
        });

    }

    //this function will do many things
    // 1. increase speed as score increase to increase difficulty of game
    // 2. set animation for each bunny
    // 3. code to determine the randomness of a bunny appearing to the screen
    // 4. decide what happens when lives count goes down
    private void theGameActions(){
        if(score < 10){
            fps = 1000;
        }
        else if(score >= 10 && score < 15){
            fps = 950;
        }
        else if(score >= 15 && score < 20){
            fps = 900;
        }
        else if(score >= 20 && score < 25){
            fps = 850;
        }
        else if(score >= 25 && score < 30){
            fps = 800;
        }
        else if(score >= 30 && score < 35){
            fps = 750;
        }
        else if(score >= 35 && score < 40){
            fps = 700;
        }
        else if(score >= 40 && score < 45){
            fps = 650;
        }
        else if(score >= 45 && score < 50){
            fps = 600;
        }
        else if(score >= 50 && score < 55){
            fps = 550;
        }
        else if(score >= 55 && score < 60){
            fps = 500;
        }
        else if(score >= 60 && score < 65){
            fps = 450;
        }
        else if(score >= 65 && score < 70){
            fps = 400;
        }
        else if(score >= 70 && score < 75){
            fps = 350;
        }
        else if(score >= 75){
            fps = 300;
        }

        bunnyan = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.bunny);

        do {
            which = randomBunny.nextInt(9) + 1;
        }
        while(whichsave == which);
        whichsave = which;

        if(which == 1){
            bunny1.setImageDrawable(bunnyan);
            bunny1.setVisibility(View.VISIBLE);
            bunny1.setEnabled(true);
        }
        else if(which == 2){
            bunny2.setImageDrawable(bunnyan);
            bunny2.setVisibility(View.VISIBLE);
            bunny2.setEnabled(true);
        }
        else if(which == 3){
            bunny3.setImageDrawable(bunnyan);
            bunny3.setVisibility(View.VISIBLE);
            bunny3.setEnabled(true);
        }
        else if(which == 4){
            bunny4.setImageDrawable(bunnyan);
            bunny4.setVisibility(View.VISIBLE);
            bunny4.setEnabled(true);
        }
        else if(which == 5){
            bunny5.setImageDrawable(bunnyan);
            bunny5.setVisibility(View.VISIBLE);
            bunny5.setEnabled(true);
        }
        else if(which == 6){
            bunny6.setImageDrawable(bunnyan);
            bunny6.setVisibility(View.VISIBLE);
            bunny6.setEnabled(true);
        }
        else if(which == 7){
            bunny7.setImageDrawable(bunnyan);
            bunny7.setVisibility(View.VISIBLE);
            bunny7.setEnabled(true);
        }
        else if(which == 8){
            bunny8.setImageDrawable(bunnyan);
            bunny8.setVisibility(View.VISIBLE);
            bunny8.setEnabled(true);
        }
        else if(which == 9){
            bunny9.setImageDrawable(bunnyan);
            bunny9.setVisibility(View.VISIBLE);
            bunny9.setEnabled(true);
        }

        bunnyan.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                bunny1.setVisibility(View.INVISIBLE);
                bunny2.setVisibility(View.INVISIBLE);
                bunny3.setVisibility(View.INVISIBLE);
                bunny4.setVisibility(View.INVISIBLE);
                bunny5.setVisibility(View.INVISIBLE);
                bunny6.setVisibility(View.INVISIBLE);
                bunny7.setVisibility(View.INVISIBLE);
                bunny8.setVisibility(View.INVISIBLE);
                bunny9.setVisibility(View.INVISIBLE);

                bunny1.setEnabled(false);
                bunny2.setEnabled(false);
                bunny3.setEnabled(false);
                bunny4.setEnabled(false);
                bunny5.setEnabled(false);
                bunny6.setEnabled(false);
                bunny7.setEnabled(false);
                bunny8.setEnabled(false);
                bunny9.setEnabled(false);

                if(tempiflives == 0){
                    lives = lives - 1;
                    lives_TextView.setText("Lives: " + lives);
                }
                else if(tempiflives == 1){
                    tempiflives = 0;
                }

                if(lives == 0){
                    onFinish();
                }
                else if(lives > 0){
                    theGameActions();
                }
            }
        }, fps);
    }

    //this function will do one simple thing
    // 1. create an intent for a new activity
    // 2. save the score value to display on the game over activity
    // 3. start new activity
    public void onFinish() {
        //create intent for game over activity
        Intent i = new Intent(GameActivity1.this, GameOverActivity.class);
        //place the score value in a key to be called in the game over activity
        i.putExtra("Score", "" + score);
        //start new activity
        startActivity(i);
    }
}
