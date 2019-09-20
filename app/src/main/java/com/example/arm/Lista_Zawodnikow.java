package com.example.arm;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.ArrayAdapter;


public class Lista_Zawodnikow extends MainActivity
{

    ListView listaZawodnikow;
    ArrayAdapter<String> listonosz;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_zawodnikow);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        listaZawodnikow = (ListView) findViewById(R.id.listaZawodnikowView);
        listonosz = new ArrayAdapter<String>(this, R.layout.row,lZawodnicy);
        listaZawodnikow.setAdapter(listonosz);

    }
}
