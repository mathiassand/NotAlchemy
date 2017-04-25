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

        String[] NameList = {"water", "fire", "air", "earth", "steam", "cloud", "lava", "energy", "electricity",
                             "dave", "dust", "mud", "stone", "metal", "computer", "obsidian", "life", "swamp", "gunpowder", "human"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1, NameList );

        getListView().setAdapter(adapter);

        Collections.sort(Arrays.asList(NameList), String.CASE_INSENSITIVE_ORDER);
    }




}
