package com.scapp.adik.scapp.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.scapp.adik.scapp.Jadwal;
import com.scapp.adik.scapp.R;
import com.scapp.adik.scapp.adapter.JadwalAdapter;

import java.util.ArrayList;
import java.util.List;

public class TodayFragment extends Fragment {

    List<Jadwal> jadwalList = new ArrayList<>();
    RecyclerView recyclerView;
    JadwalAdapter jadwalAdapter;
    TextView namaMakul;
    RelativeLayout status;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.today_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        jadwalAdapter = new JadwalAdapter(jadwalList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(jadwalAdapter);
        dataJadwal();

        /*namaMakul = view.findViewById(R.id.makul);
        status = view.findViewById(R.id.status);


        if (namaMakul.getText().toString().equals("Hari ini")){
            status.setBackgroundColor(Color.BLACK);
        }*/

        return view;

    }

    private void dataJadwal(){
        Jadwal jadwal = new Jadwal(R.drawable.unnamed, "Hari Ini", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.drawable.unnamed, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.drawable.unnamed, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.drawable.unnamed, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.drawable.unnamed, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);
        jadwal = new Jadwal(R.drawable.unnamed, "Algoritma", "07.00 - 08.40", "Barka");
        jadwalList.add(jadwal);

    }
}
