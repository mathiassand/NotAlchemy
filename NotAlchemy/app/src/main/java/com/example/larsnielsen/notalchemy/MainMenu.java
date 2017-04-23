package com.example.larsnielsen.notalchemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void StartGame (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void OpenList (View view) {
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }
}
