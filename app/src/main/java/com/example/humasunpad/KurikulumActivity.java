package com.example.humasunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KurikulumActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView carddosen, cardhmj, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurikulum);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_kurikulum);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("KURIKULUM");

        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardhmj = (CardView) findViewById(R.id.card_hmj);
        cardback = (CardView) findViewById(R.id.card_back);

        carddosen.setOnClickListener(this);
        cardhmj.setOnClickListener(this);
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
            case R.id.card_dosen :
                i = new Intent(this, DosenActivity.class);
                startActivity(i);
                break;

            case R.id.card_hmj :
                i = new Intent(this, JurnalActivity.class);
                startActivity(i);
                break;

            case R.id.card_back :
                i = new Intent(this, MainActivity.class);
                i.putExtra("key", "value");
                startActivity(i);
                break;
        }
    }
}