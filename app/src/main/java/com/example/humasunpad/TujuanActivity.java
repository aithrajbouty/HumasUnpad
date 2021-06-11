package com.example.humasunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TujuanActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cardvisimisi, cardsejarah, cardprospek, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tujuan);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_tujuan);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("TUJUAN");

        cardvisimisi = (CardView) findViewById(R.id.card_visimisi);
        cardsejarah = (CardView) findViewById(R.id.card_sejarah);
        cardprospek = (CardView) findViewById(R.id.card_organisasi);
        cardback = (CardView) findViewById(R.id.card_back);

        cardvisimisi.setOnClickListener(this);
        cardsejarah.setOnClickListener(this);
        cardprospek.setOnClickListener(this);
        cardback.setOnClickListener(this);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card_visimisi :
                i = new Intent(this, VisimisiActivity.class);
                startActivity(i);
                break;

            case R.id.card_sejarah :
                i = new Intent(this, SejarahActivity.class);
                startActivity(i);
                break;

            case R.id.card_organisasi :
                i = new Intent(this, OrganisasiActivity.class);
                startActivity(i);
                break;

            case R.id.card_back :
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
        }
    }
}