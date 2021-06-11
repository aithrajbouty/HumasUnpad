package com.example.humasunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VisimisiActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cardtujuan, cardsejarah, cardprospek, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visimisi);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_visimisi);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("VISI MISI");

        cardtujuan = (CardView) findViewById(R.id.card_tujuan);
        cardsejarah = (CardView) findViewById(R.id.card_sejarah);
        cardprospek = (CardView) findViewById(R.id.card_organisasi);
        cardback = (CardView) findViewById(R.id.card_back);

        cardtujuan.setOnClickListener(this);
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
            case R.id.card_tujuan :
                i = new Intent(this, TujuanActivity.class);
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