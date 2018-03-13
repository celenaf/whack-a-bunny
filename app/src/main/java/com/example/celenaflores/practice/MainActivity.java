package com.example.celenaflores.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //will start the easy game activity
        Button easyPage = (Button) findViewById(R.id.easy_button);
        easyPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //create new intent
                Intent i=new Intent(MainActivity.this, GameActivity.class);
                //start easy activity
                startActivity(i);

            }

        });

        //will start the hard game activity
        Button hardPage = (Button) findViewById(R.id.hard_button);
        hardPage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //create new intent
                Intent i=new Intent(MainActivity.this, GameActivity1.class);
                //start hard activity
                startActivity(i);

            }

        });


    }
}
