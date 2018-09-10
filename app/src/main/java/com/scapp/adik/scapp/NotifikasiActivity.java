package com.scapp.adik.scapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.scapp.adik.scapp.adapter.NotifikasiAdapter;

import java.util.ArrayList;
import java.util.List;


public class NotifikasiActivity extends AppCompatActivity {

    List<Notifikasi> notifikasiList = new ArrayList<>();
    RecyclerView recyclerView;
    NotifikasiAdapter notifikasiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        recyclerView =(RecyclerView)findViewById(R.id.recycler);

        notifikasiAdapter = new NotifikasiAdapter(notifikasiList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(notifikasiAdapter);
        recyclerView.addItemDecoration(new Divider(this, LinearLayoutManager.VERTICAL));
        dataNotifikasi();

    }

    private void dataNotifikasi() {

        Notifikasi notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
        notifikasi = new Notifikasi(R.drawable.unnamed, "Barka Setya", "07.00", "Jadwal Matakuliah Algoritma Hari ini dikosongkan, terima kasih lorem ipsum dolor sit amet");
        notifikasiList.add(notifikasi);
    }
}
