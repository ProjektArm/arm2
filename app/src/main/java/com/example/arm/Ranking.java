package com.example.arm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ranking extends MainActivity {

    ListView ranking;
    ArrayAdapter<String> listonosz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ranking = (ListView) findViewById((R.id.rankingView));
        listonosz = new ArrayAdapter<String>(this,R.layout.row,lRanking);
        ranking.setAdapter(listonosz);

    }

}



