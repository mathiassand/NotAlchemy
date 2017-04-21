package com.example.larsnielsen.notalchemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View v) {
        switch (v.getId()) {
            case R.id.button:
                // do something
                break;
            case R.id.button2:
                // do something else
                break;
            case R.id.button3:
                // i'm lazy, do nothing
                break;
        }
    }
}
