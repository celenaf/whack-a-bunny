package com.example.celenaflores.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by celee on 3/6/18.
 */

public class GameOverActivity extends AppCompatActivity{
    //define variables to user
    public TextView summary_tv;
    public Button try_again_btn, exit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        //Textview that tells user the score they achieved
        summary_tv=(TextView)findViewById(R.id.summary_tv);
        summary_tv.setText("Score: "+ getIntent().getExtras().getString("Score"));


        try_again_btn=(Button)findViewById(R.id.try_again_btn);
        try_again_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //create intent
                Intent i=new Intent(GameOverActivity.this, MainActivity.class);
                //go back to the beginning
                startActivity(i);
            }
        });


        exit_btn=(Button)findViewById(R.id.exit_btn);
        exit_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //processes to exit app and go to main page of device
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
}
