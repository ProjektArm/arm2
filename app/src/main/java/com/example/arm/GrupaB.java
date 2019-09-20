package com.example.arm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GrupaB extends MainActivity
{
    ListView grupaBLista;
    ArrayAdapter<String> listonosz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupab);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        grupaBLista = (ListView) findViewById((R.id.grupaBView));
        listonosz = new ArrayAdapter<String>(this,R.layout.row,lGrupaB);
        grupaBLista.setAdapter(listonosz);
    }

}
