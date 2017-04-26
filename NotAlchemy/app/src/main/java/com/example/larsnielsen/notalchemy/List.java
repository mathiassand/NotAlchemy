package com.example.larsnielsen.notalchemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.widget.ArrayAdapter;

import android.app.ListActivity;

import java.util.Arrays;
import java.util.Collections;

public class List extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(),
                android.R.layout.simple_list_item_1, MainActivity.getNameArray() );

        getListView().setAdapter(adapter);

        Collections.sort(Arrays.asList(MainActivity.getNameArray()), String.CASE_INSENSITIVE_ORDER);
    }
}
