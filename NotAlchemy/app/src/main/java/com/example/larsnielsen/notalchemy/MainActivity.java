package com.example.larsnielsen.notalchemy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {
    static int statuscheck = 0;
    //Declaring element objects
    Elements water;
    Elements fire;
    Elements air;
    Elements earth;
    Elements steam;
    Elements cloud;
    Elements lava;
    Elements energy;
    Elements electricity;
    Elements dave;
    Elements dust;
    Elements mud;
    Elements stone;
    Elements metal;
    Elements computer;
    Elements obsidian;
    Elements life;
    Elements swamp;
    Elements gunpowder;
    Elements human;


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

        if(statuscheck > 2 || statuscheck < 2){
            Toast toast = Toast.makeText(getApplicationContext(), "Too many or too few elements selected", Toast.LENGTH_SHORT);
            toast.show();
        }
        else if(fire.activation==TRUE && water.activation==TRUE){
            Toast testing = Toast.makeText(getApplicationContext(), "IT FUCKING WORKS BOYS", Toast.LENGTH_SHORT);
            testing.show();
            ImageButton steamButton = (ImageButton) findViewById(R.id.steamButton);
            steamButton.setVisibility(View.VISIBLE);
            steam = new Elements (5, FALSE);
        }
        else if(fire.activation == TRUE && earth.activation==TRUE){
            ImageButton lavaButton = (ImageButton) findViewById(R.id.lavaButton);
            lavaButton.setVisibility(View.VISIBLE);
            Elements lava = new Elements (6, FALSE);
        }
        else if (air.activation == TRUE && steam.activation == TRUE){
            ImageButton cloudButton = (ImageButton) findViewById(R.id.cloudButton);
            cloudButton.setVisibility(View.VISIBLE);
            Elements cloud = new Elements (7, FALSE);
        }
    }

    public void buttonPress (View v){
            switch (v.getId()) {
                case R.id.fireButton:
                    fire.changestate(fire.getValue());
                    break;
                case R.id.waterButton:
                    water.changestate(water.getValue());
                    break;
                case R.id.earthButton:
                    earth.changestate(earth.getValue());
                    break;
                case R.id.airButton:
                    air.changestate(air.getValue());
                    break;
                case R.id.steamButton:
                    steam.changestate(steam.getValue());
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