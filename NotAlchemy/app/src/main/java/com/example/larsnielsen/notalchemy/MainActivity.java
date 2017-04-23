package com.example.larsnielsen.notalchemy;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.R.attr.bitmap;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {
    static int statuscheck = 0;
    //Declaring element objects
    //DO THIS USING AN ARRAY OF OBJECTS INSTEAD TO GAIN MASSIVE POINTS, but how to do so when each
    //have different names?!?! Processing book page 154.
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
    private int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initiating all of the elements. If this isn't done before the combine button is pressed,
        //the program can crash as it doesn't know whether an element is true or false when checking.
        Bitmap bitmap = getIntent().getParcelableExtra("steamButton");
        ImageButton imageView = (ImageButton) findViewById(R.id.steamButton);
        imageView.setImageBitmap(bitmap);

        if (savedInstanceState == null) {
            image = R.id.cloudButton;
        } else {
            // if there is a bundle, use the saved image resource (if one is there)
            image = savedInstanceState.getInt(String.valueOf(bitmap), R.id.cloudButton);
        }

        //Declaring objects. The objects declared are the elements that the player starts out with.
        water = new Elements(1, FALSE);
        fire = new Elements(2, FALSE);
        air = new Elements(3, FALSE);
        earth = new Elements(4, FALSE);
        steam = new Elements (5, FALSE);
        lava = new Elements (6, FALSE);
        cloud = new Elements (7, FALSE);
        stone = new Elements(8, FALSE);
        energy = new Elements (9, FALSE);
        metal = new Elements (10, FALSE);
        electricity = new Elements(11, FALSE);
        computer = new Elements(12, FALSE);
        life = new Elements(13, FALSE);
        human = new Elements (14, FALSE);
        swamp = new Elements (15, FALSE);
        mud = new Elements(16, FALSE);
        dave = new Elements(17, FALSE);
        obsidian = new Elements(18, FALSE);
        gunpowder = new Elements(19, FALSE);
        dust = new Elements(20, FALSE);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // Make sure you save the current image resource
        outState.putInt(String.valueOf(bitmap), image);
        super.onSaveInstanceState(outState);
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
            ImageButton steamButton = (ImageButton) findViewById(R.id.steamButton);
            steamButton.setVisibility(View.VISIBLE);
        }
        else if(fire.activation == TRUE && earth.activation==TRUE){
            ImageButton lavaButton = (ImageButton) findViewById(R.id.lavaButton);
            lavaButton.setVisibility(View.VISIBLE);
        }
        else if (air.activation == TRUE && steam.activation == TRUE){
            ImageButton cloudButton = (ImageButton) findViewById(R.id.cloudButton);
            cloudButton.setVisibility(View.VISIBLE);
        }
        else if (earth.activation == TRUE && water.activation == TRUE){
            ImageButton soilButton = (ImageButton) findViewById(R.id.soilButton);
            soilButton.setVisibility(View.VISIBLE);
        }
        else if (air.activation == TRUE && fire.activation==TRUE){
            ImageButton energyButton = (ImageButton) findViewById(R.id.energyButton);
            energyButton.setVisibility(View.VISIBLE);
        }
        else if(air.activation == TRUE && lava.activation == TRUE){
            ImageButton stoneButton = (ImageButton) findViewById(R.id.stoneButton);
            stoneButton.setVisibility(View.VISIBLE);
        }
        else if(stone.activation==TRUE && fire.activation==TRUE){
            ImageButton metalButton = (ImageButton) findViewById(R.id.metalButton);
            metalButton.setVisibility(View.VISIBLE);
        }
        else if (energy.activation==TRUE && metal.activation==TRUE){
            ImageButton electricityButton = (ImageButton) findViewById(R.id.electricityButton);
            electricityButton.setVisibility(View.VISIBLE);
        }
        else if (computer.activation == TRUE && human.activation== TRUE){
            ImageButton daveButton = (ImageButton) findViewById(R.id.daveButton);
            daveButton.setVisibility(View.VISIBLE);
        }
        else if (lava.activation==TRUE && water.activation==TRUE){
            ImageButton obsidianButton = (ImageButton) findViewById(R.id.obsidianButton);
            obsidianButton.setVisibility(View.VISIBLE);
        }
        else if (energy.activation==TRUE && swamp.activation == TRUE){
            ImageButton lifeButton = (ImageButton) findViewById(R.id.lifeButton);
            lifeButton.setVisibility(View.VISIBLE);
        }
        else if (mud.activation == TRUE && earth.activation==TRUE){
            ImageButton swampButton = (ImageButton) findViewById(R.id.swampButton);
            swampButton.setVisibility(View.VISIBLE);
        }
        else if (earth.activation==TRUE && air.activation==TRUE){
            ImageButton dustButton = (ImageButton) findViewById(R.id.dustButton);
            dustButton.setVisibility(View.VISIBLE);
        }
        else if (dust.activation==TRUE && fire.activation==TRUE){
            ImageButton gunpowderButton = (ImageButton) findViewById(R.id.gunpowderButton);
            gunpowderButton.setVisibility(View.VISIBLE);
        }
        else if (life.activation==TRUE && earth.activation==TRUE){
            ImageButton humanButton = (ImageButton) findViewById(R.id.humanButton);
            humanButton.setVisibility(View.VISIBLE);
        }
        else if (electricity.activation==TRUE && metal.activation==TRUE) {
            ImageButton computerButton = (ImageButton) findViewById(R.id.laptopButton);
            computerButton.setVisibility(View.VISIBLE);
        }
        else{
            Toast invalid = Toast.makeText(getApplicationContext(), "Invalid combination of elements", Toast.LENGTH_SHORT);
            invalid.show();
        }
        reset();
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
                case R.id.lavaButton:
                    lava.changestate(lava.getValue());
                    break;
                case R.id.stoneButton:
                     stone.changestate(stone.getValue());
                     break;
                case R.id.energyButton:
                    energy.changestate(energy.getValue());
                    break;
                case R.id.metalButton:
                    metal.changestate(metal.getValue());
                    break;
                case R.id.electricityButton:
                    electricity.changestate(electricity.getValue());
                    break;
                case R.id.laptopButton:
                    computer.changestate(computer.getValue());
                    break;
                case R.id.lifeButton:
                    life.changestate(life.getValue());
                    break;
                case R.id.humanButton:
                    human.changestate(human.getValue());
                    break;
                case R.id.swampButton:
                    swamp.changestate(swamp.getValue());
                    break;
                case R.id.soilButton:
                    mud.changestate(mud.getValue());
                    break;
                case R.id.daveButton:
                    dave.changestate(dave.getValue());
                    break;
                case R.id.obsidianButton:
                    obsidian.changestate(obsidian.getValue());
                    break;
                case R.id.gunpowderButton:
                    gunpowder.changestate(gunpowder.getValue());
                    break;
                case R.id.dustButton:
                    dust.changestate(dust.getValue());
                    break;
                case R.id.cloudButton:
                    cloud.changestate(cloud.getValue());
                    break;
            }
        }

    public void reset(){
        //Skriv her kode der ændrer alle objektor til false
        fire.activation = FALSE;
        water.activation = FALSE;
        earth.activation = FALSE;
        air.activation = FALSE;
        lava.activation = FALSE;
        stone.activation = FALSE;
        cloud.activation = FALSE;
        steam.activation = FALSE;
        life.activation = FALSE;
        mud.activation = FALSE;
        swamp.activation = FALSE;
        energy.activation = FALSE;
        electricity.activation = FALSE;
        metal.activation = FALSE;
        computer.activation = FALSE;
        human.activation = FALSE;
        dust.activation = FALSE;
        gunpowder.activation = FALSE;
        dave.activation = FALSE;
        obsidian.activation = FALSE;
        statuscheck = 0;
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