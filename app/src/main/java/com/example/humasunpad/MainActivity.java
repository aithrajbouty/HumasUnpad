package com.example.humasunpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.humasunpad.fragments.HomeFragment;
import com.example.humasunpad.fragments.KontakFragment;
import com.example.humasunpad.fragments.KuliahFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setIcon(getDrawable(R.drawable.logo));
        getSupportActionBar().setTitle("PRODI JURNALISTIK ");
        getSupportActionBar().setSubtitle("Fakultas Ilmu Komunikasi Unpad");

        //BOTTOM NAVIGATION
        bottomNavigationView=findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();

        Intent intent = getIntent();
        String op = intent.getStringExtra("key");
        if (op != null){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new KuliahFragment()).addToBackStack(null).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod=new
    BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;

            switch (item.getItemId()){
                case R.id.kuliah:
                    fragment = new KuliahFragment();
                    break;

                case R.id.home:
                    fragment = new HomeFragment();
                    break;

                case R.id.kontak:
                    fragment = new KontakFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

            return true;
        }
    };
}