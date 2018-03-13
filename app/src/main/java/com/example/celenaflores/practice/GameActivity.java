package com.example.celenaflores.practice;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;

import android.content.Intent;


/**
 * Created by celee on 3/6/18.
 */

public class GameActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView text1, text2;
    public int score;
    public Button[]buttons=new Button[9];
    public boolean[]on_off=new boolean[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        init();

        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                text2.setText("Time: " + millisUntilFinished / 1000);
                text1.setText("Score: " + score);

                for (int i = 0; i <on_off.length;i++){
                    if(on_off[i]==true)
                        buttons[i].setBackgroundResource(R.drawable.o);
                    else
                        buttons[i].setBackgroundResource(R.drawable.hidden);
                }

            }
            public void onFinish() {
                text2.setText("End Game");

                Intent i=new Intent(GameActivity.this, GameOverActivity.class);;
                i.putExtra("Score",""+score);
                startActivity(i);


            }
        }.start();

        new CountDownTimer(30000, 3000) {

            public void onTick(long millisUntilFinished) {
                game();
            }

            public void onFinish() {
                text2.setText("End Game");
            }
        }.start();


    }

    public void init(){
        score=0;
        text1=(TextView)findViewById(R.id.Text1);
        text2=(TextView)findViewById(R.id.Text2);
        buttons[0]=(Button)findViewById(R.id.Button1);
        buttons[1]=(Button)findViewById(R.id.Button2);
        buttons[2]=(Button)findViewById(R.id.Button3);
        buttons[3]=(Button)findViewById(R.id.Button4);
        buttons[4]=(Button)findViewById(R.id.Button5);
        buttons[5]=(Button)findViewById(R.id.Button6);
        buttons[6]=(Button)findViewById(R.id.Button7);
        buttons[7]=(Button)findViewById(R.id.Button8);
        buttons[8]=(Button)findViewById(R.id.Button9);

        for(int i=0; i<buttons.length;i++) {
            buttons[i].setOnClickListener(this);
        }

    }


    public void onClick (View view){
        switch (view.getId()) {
            case R.id.Button1:
                if(on_off[0]==true) {
                    on_off[0] = false;
                    score++;
                }
                break;
            case R.id.Button2:
                if(on_off[1]==true) {
                    on_off[1] = false;
                    score++;
                }
                break;
            case R.id.Button3:
                if(on_off[2]==true) {
                    on_off[2] = false;
                    score++;
                }
                break;
            case R.id.Button4:
                if(on_off[3]==true) {
                    on_off[3] = false;
                    score++;
                }
                break;
            case R.id.Button5:
                if(on_off[4]==true) {
                    on_off[4] = false;
                    score++;
                }
                break;
            case R.id.Button6:
                if(on_off[5]==true) {
                    on_off[5] = false;
                    score++;
                }
                break;
            case R.id.Button7:
                if(on_off[6]==true) {
                    on_off[6] = false;
                    score++;
                }
                break;
            case R.id.Button8:
                if(on_off[7]==true) {
                    on_off[7] = false;
                    score++;
                }
                break;
            case R.id.Button9:
                if(on_off[8]==true) {
                    on_off[8] = false;
                    score++;
                }
                break;

        }
    }

    public void game() {
        int first = (int) (Math.random() * 10);
        int second=(int) (Math.random() * 10);
        while(second==first)
            second=(int) (Math.random() * 10);
        int third= (int) (Math.random()*10);
        while(third!=second && third!=first)
            third=(int)(Math.random()*10);
        int[]num=new int[]{first,second,third};
        for(int i=0;i<num.length;i++) {
            switch (num[i]) {
                case 0:
                    on_off[0] = true;
                    break;
                case 1:
                    on_off[1] = true;
                    break;
                case 2:
                    on_off[2] = true;
                    break;
                case 3:
                    on_off[3] = true;
                    break;
                case 4:
                    on_off[4] = true;
                    break;
                case 5:
                    on_off[5] = true;
                    break;
                case 6:
                    on_off[6] = true;
                    break;
                case 7:
                    on_off[7] = true;
                    break;
                case 8:
                    on_off[8] = true;
                    break;
            }
        }

    }

}
