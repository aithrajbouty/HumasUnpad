package com.example.humasunpad.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.humasunpad.OrganisasiActivity;
import com.example.humasunpad.R;
import com.example.humasunpad.SejarahActivity;
import com.example.humasunpad.TujuanActivity;
import com.example.humasunpad.VisimisiActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public CardView cardvisimisi, cardtujuan, cardsejarah, cardorganisasi;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        cardvisimisi = (CardView) view.findViewById(R.id.card_visimisi);
        cardtujuan = (CardView) view.findViewById(R.id.card_tujuan);
        cardsejarah = (CardView) view.findViewById(R.id.card_sejarah);
        cardorganisasi = (CardView) view.findViewById(R.id.card_organisasi);

        cardvisimisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), VisimisiActivity.class);
                startActivity(in);
            }
        });
        cardtujuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), TujuanActivity.class);
                startActivity(in);
            }
        });
        cardsejarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), SejarahActivity.class);
                startActivity(in);
            }
        });
        cardorganisasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), OrganisasiActivity.class);
                startActivity(in);
            }
        });

        return view;
    }
}