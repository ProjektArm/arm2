package com.example.arm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Pojedynek extends MainActivity

{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pojedynek);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView textZawodnik1 = (TextView) findViewById(R.id.btnTextZawodnik1);
        TextView textZawodnik2 = (TextView) findViewById(R.id.btnTextZawodnik2);
        if(runda==0)
        {
            if ((iterator==0)&&lZawodnicyPoLosowaniu.size()%2!=0)
            {
                textZawodnik1.setText(lZawodnicyPoLosowaniu.get(iterator+1));
                textZawodnik2.setText(lZawodnicyPoLosowaniu.get(iterator+2));
            }
            else
            {
                textZawodnik1.setText(lZawodnicyPoLosowaniu.get(iterator));
                textZawodnik2.setText(lZawodnicyPoLosowaniu.get(iterator+1));
            }
        }

        if(runda==1)
        {
            if(grupa==0)
            {
                if ((iterator==0)&&lGrupaA.size()%2!=0)
                {
                    textZawodnik1.setText(lGrupaA.get(iterator+1));
                    textZawodnik2.setText(lGrupaA.get(iterator+2));
                }
                else
                {
                    textZawodnik1.setText(lGrupaA.get(iterator));
                    textZawodnik2.setText(lGrupaA.get(iterator+1));
                }

            }
            if(grupa==1)
            {
                if ((iterator==0)&&lGrupaB.size()%2!=0)
                {
                    textZawodnik1.setText(lGrupaB.get(iterator+1));
                    textZawodnik2.setText(lGrupaB.get(iterator+2));
                }
                else
                {
                    textZawodnik1.setText(lGrupaB.get(iterator));
                    textZawodnik2.setText(lGrupaB.get(iterator+1));
                }
            }


        }
        if (runda==2)
        {

        }
    }

    public void kliknieciePojedynekEkran(View view)
    {
        TextView textPojedynekGorny = (TextView) findViewById(R.id.textPojedynek);
        TextView textZawodnik1 = (TextView) findViewById(R.id.btnTextZawodnik1);
        TextView textZawodnik2 = (TextView) findViewById(R.id.btnTextZawodnik2);
        TextView textPojedynekDolny = (TextView) findViewById(R.id.textPojedynek2);

        if(runda==0)
        {
            if ((iterator==0)&&lZawodnicyPoLosowaniu.size()%2!=0)
            {
                lGrupaA.add(lZawodnicyPoLosowaniu.get(iterator));
                iterator++;
            }

            switch (view.getId())
            {
                case R.id.btnTextZawodnik1:
                {
                    lGrupaA.add(lZawodnicyPoLosowaniu.get(iterator));
                    lGrupaB.add(lZawodnicyPoLosowaniu.get(iterator + 1));
                }
                break;
                case R.id.btnTextZawodnik2:
                {
                    lGrupaA.add(lZawodnicyPoLosowaniu.get(iterator + 1));
                    lGrupaB.add(lZawodnicyPoLosowaniu.get(iterator));
                }
                break;
            }
            iterator=iterator+2;

            if (lZawodnicyPoLosowaniu.size()>iterator)
            {
                textZawodnik1.setText(lZawodnicyPoLosowaniu.get(iterator));
                textZawodnik2.setText(lZawodnicyPoLosowaniu.get(iterator + 1));
            }
            if(((lZawodnicyPoLosowaniu.size()-1)==iterator)||((lZawodnicyPoLosowaniu.size()-2)==iterator))
            {
                runda=1;
                iterator=0;
            }

        }
        else if (runda==1)
        {
            if(grupa==0 && lGrupaA.size()>1)
            {
                if ((iterator==0)&&lGrupaA.size()%2!=0)
                {
                    lGrupaATmp.add(lGrupaA.get(iterator));
                    iterator++;
                }

                switch (view.getId())
                {
                    case R.id.btnTextZawodnik1:
                    {
                        lGrupaATmp.add(lGrupaA.get(iterator));
                        lGrupaBTmp.add(lGrupaA.get(iterator + 1));
                    }
                    break;
                    case R.id.btnTextZawodnik2:
                    {
                        lGrupaATmp.add(lGrupaA.get(iterator + 1));
                        lGrupaBTmp.add(lGrupaA.get(iterator));
                    }
                    break;
                }
                iterator=iterator+2;

                textZawodnik1.setText(lGrupaA.get(iterator));
                textZawodnik2.setText(lGrupaA.get(iterator+1));

                if(((lGrupaA.size()-1)==iterator)||((lGrupaA.size()-2)==iterator))
                {
                    iterator=0;
                    lGrupaA.clear();
                    for(int i=0; i<lGrupaATmp.size();i++)
                    {
                        lGrupaA.add(lGrupaATmp.get(i));
                    }
                    grupa=1;
                }
            }
            if(grupa==1 && lGrupaB.size()>1)
            {
                if ((iterator==0)&&lGrupaB.size()%2!=0)
                {
                    lGrupaBTmp.add(lGrupaB.get(iterator));
                    iterator++;
                }

                switch (view.getId())
                {
                    case R.id.btnTextZawodnik1:
                    {
                        lGrupaBTmp.add(lGrupaB.get(iterator));
                        lRanking.add(lGrupaB.get(iterator + 1));
                    }
                    break;
                    case R.id.btnTextZawodnik2:
                    {
                        lGrupaBTmp.add(lGrupaB.get(iterator + 1));
                        lRanking.add(lGrupaB.get(iterator));
                    }
                    break;
                }
                iterator=iterator+2;

                textZawodnik1.setText(lGrupaB.get(iterator));
                textZawodnik2.setText(lGrupaB.get(iterator+1));

                if(((lGrupaB.size()-1)==iterator)||((lGrupaB.size()-2)==iterator))
                {
                    iterator=0;
                    lGrupaB.clear();
                    for(int i=0; i<lGrupaBTmp.size();i++)
                    {
                        lGrupaB.add(lGrupaBTmp.get(i));
                    }
                    grupa=0;
                }

            }
            if(lGrupaA.size()==1&&lGrupaB.size()==1)
            {
                runda=2;
            }
        }
        else if (runda==2)
        {
            textPojedynekGorny.setText("Final");
        }
    }

}
