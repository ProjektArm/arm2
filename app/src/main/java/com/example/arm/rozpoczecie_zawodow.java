package com.example.arm;

import android.content.Intent;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class rozpoczecie_zawodow extends MainActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozpoczecie_zawodow);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void klikniecieRozpoczecieZawodowEkran(View view)
    {
        Intent nowyEkran;
        switch (view.getId())
        {
            case R.id.btnPojedynek:
            {
                nowyEkran = new Intent(rozpoczecie_zawodow.this, Pojedynek.class);
                startActivity(nowyEkran);
            }
            break;
            case R.id.btnRanking:
            {
                nowyEkran = new Intent(rozpoczecie_zawodow.this, Ranking.class);
                startActivity(nowyEkran);
            }
            break;
            case R.id.btnGrupaA:
            {
                nowyEkran = new Intent(rozpoczecie_zawodow.this, GrupaA.class);
                startActivity(nowyEkran);
            }
            break;
            case R.id.btnGrupaB:
            {
                nowyEkran = new Intent(rozpoczecie_zawodow.this, GrupaB.class);
                startActivity(nowyEkran);
            }
            break;
        }

    }

}
