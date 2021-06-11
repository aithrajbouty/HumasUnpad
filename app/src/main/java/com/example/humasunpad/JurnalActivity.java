package com.example.humasunpad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JurnalActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView carddosen, cardkurikulum, cardback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurnal);

        Intent intent = getIntent();

        Toolbar toolbar = findViewById(R.id.toolbar_hmj);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setTitle("JURNAL PROFESI HUMAS");

        carddosen = (CardView) findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) findViewById(R.id.card_kurikulum);
        cardback = (CardView) findViewById(R.id.card_back);

        carddosen.setOnClickListener(this);
        cardkurikulum.setOnClickListener(this);
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

            case R.id.card_kurikulum :
                i = new Intent(this, KurikulumActivity.class);
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