package com.example.arm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity
{

    public  List<String> lZawodnicy = new ArrayList<String>();
    public  List<String> lZawodnicyPoLosowaniu = new ArrayList<String>();
    public  List<String> lRanking = new ArrayList<String>();
    public  List<String> lGrupaA = new ArrayList<String>();
    public  List<String> lGrupaB = new ArrayList<String>();
    public  List<String> lGrupaATmp = new ArrayList<String>();
    public  List<String> lGrupaBTmp = new ArrayList<String>();
    public int liczbaWylosowana;
    public int runda =0;
    public int iterator=0;
    public int grupa=0;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void klikniecieNaGlownymEkranie(View view)
    {
        TextView wpisany = (TextView) findViewById(R.id.textDodajZawodnika);

        Intent nowyEkran;
        switch (view.getId())
        {
            case R.id.btnDodajZawodnika:
            {
                //ToDo zabezpieczenie przed pustym znakiem
                lZawodnicy.add(wpisany.getText().toString());
                wpisany.setText("");
            }
            break;
            case R.id.btnListaZawodnikow:
            {
                nowyEkran = new Intent(MainActivity.this, Lista_Zawodnikow.class);
                startActivity(nowyEkran);
            }
            break;
            case R.id.btnRozpocznijZaowdy:
            {
                // TODO: zrobić losowanie, klikniecie w ten przycisk kasuje rozpoczete zawody, i rozpoczyna tak jakby nowe
                lZawodnicyPoLosowaniu.clear();
                lRanking.clear();
                lGrupaA.clear();
                lGrupaB.clear();
                lGrupaATmp.clear();
                lGrupaBTmp.clear();
                runda =0;
                iterator=0;
                grupa=0;

                for(int i=0; i<lZawodnicy.size();i++)
                {
                    lZawodnicyPoLosowaniu.add(lZawodnicy.get(i));
                }

                nowyEkran = new Intent(MainActivity.this, rozpoczecie_zawodow.class);
                startActivity(nowyEkran);
            }
            break;
        }

    }


}
