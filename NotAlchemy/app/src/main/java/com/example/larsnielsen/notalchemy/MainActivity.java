package com.example.larsnielsen.notalchemy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {
    int selector = 0;
    Elements water;
    Elements fire;
    Elements air;
    Elements earth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaring objects. The objects declared are the elements that the player starts out with.
        water = new Elements(1, FALSE);
        fire = new Elements(2, FALSE);
        air = new Elements(3, FALSE);
        earth = new Elements(4, FALSE);

    }


    /*
    ImageButton buttonGrid[][] = new ImageButton[5][10];

    public void buttonPress(View v) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                String btnID = "R.id.";
                switch (i) {
                    case 0:
                        btnID.concat("one"); break;
                }
                switch (j) {

                }
                buttonGrid[i][j] = (ImageButton) findViewById(Integer.parseInt(btnID));
            }
        }

    }
    */




    /*

    Vi burde overveje at tilføje billederne i MainActivity i stedet for i xml filen, da der kommer
    til at være en del billeder. Man kunne evt. lave en array som holder billederne i sig eller
    noget.. Eller noget som hedder en LayoutInflater/ViewInflater

    */
    //How to declare new elements and assign values to them:
    //Elements test = new Elements(5, TRUE);




    public void combineButton (View v){

        if(water.activation==FALSE){
            Toast toast = Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(fire.activation==TRUE && water.activation==TRUE){
            Toast testing = Toast.makeText(getApplicationContext(), "IT FUCKING WORKS BOYS", Toast.LENGTH_SHORT);
            testing.show();
        }


    }


    public void buttonPress (View v){
            switch (v.getId()) {
                case R.id.fireButton:
                    Elements.changestate(fire.isActivation());


                case R.id.waterButton: {
                    ImageButton steamButton = (ImageButton) findViewById(R.id.steamButton);
                    steamButton.setVisibility(View.VISIBLE);
                    water.activation = TRUE;
                    break;
                }

                case R.id.steamButton:
                    ImageButton steamButton = (ImageButton) findViewById(R.id.steamButton);
                    steamButton.setVisibility(View.GONE);



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