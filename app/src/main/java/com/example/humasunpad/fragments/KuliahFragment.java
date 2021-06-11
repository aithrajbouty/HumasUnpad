package com.example.humasunpad.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.humasunpad.DosenActivity;
import com.example.humasunpad.JurnalActivity;
import com.example.humasunpad.KurikulumActivity;
import com.example.humasunpad.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class KuliahFragment extends Fragment {

    public CardView carddosen, cardkurikulum, cardjurnal;

    public KuliahFragment() {
        // Required empty public constructor
//        Bundle bundle = new Bundle();
//        bundle=getArguments();
//        if(bundle!=null){
//            String value=bundle.getString("key");
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kuliah, container, false);

        carddosen = (CardView) view.findViewById(R.id.card_dosen);
        cardkurikulum = (CardView) view.findViewById(R.id.card_kurikulum);
        cardjurnal = (CardView) view.findViewById(R.id.card_jurnal);

        carddosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), DosenActivity.class);
                startActivity(in);
            }
        });
        cardkurikulum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), KurikulumActivity.class);
                startActivity(in);
            }
        });
        cardjurnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), JurnalActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}