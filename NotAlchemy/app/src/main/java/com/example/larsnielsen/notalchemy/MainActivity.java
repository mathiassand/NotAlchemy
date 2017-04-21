package com.example.larsnielsen.notalchemy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void buttonPress (View v){
            switch (v.getId()) {
                case R.id.imageButton:
                    ImageButton buttonOne = (ImageButton) findViewById(R.id.imageButton);
                    buttonOne.setVisibility(View.GONE);
                    break;
                case R.id.imageButton2:
                    ImageButton buttonFive = (ImageButton) findViewById(R.id.imageButton3);
                    buttonFive.setVisibility(View.VISIBLE);
                    break;

            }
        }

}





/*
playButton = (Button) findViewById(R.id.play);
        playButton.setVisibility(1);
        playButton.setOnClickListener(new OnClickListener() {
@Override
public void onClick(View v) {
        //when play is clicked show stop button and hide play button
        playButton.setVisibility(View.GONE);
        stopButton.setVisibility(View.VISIBLE);
        }
        });
*/