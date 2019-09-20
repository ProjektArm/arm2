package com.example.arm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GrupaA extends MainActivity
{
    ListView grupaALista;
    ArrayAdapter<String> listonosz;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupaa);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        grupaALista = (ListView) findViewById((R.id.grupaAView));
        listonosz = new ArrayAdapter<String>(this,R.layout.row,lGrupaA);
        grupaALista.setAdapter(listonosz);

    }

}
