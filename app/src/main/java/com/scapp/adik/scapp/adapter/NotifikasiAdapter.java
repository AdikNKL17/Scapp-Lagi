package com.scapp.adik.scapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scapp.adik.scapp.Notifikasi;
import com.scapp.adik.scapp.R;

import java.util.List;

public class NotifikasiAdapter extends RecyclerView.Adapter<NotifikasiAdapter.MyViewHolder> {

    private List<Notifikasi> notifikasiList;

    @NonNull
    @Override
    public NotifikasiAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notifikasi_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotifikasiAdapter.MyViewHolder holder, int position) {
        Notifikasi notifikasi = notifikasiList.get(position);

        holder.avatar.setImageResource(notifikasi.getImageUrl());
        holder.namaDosen.setText(notifikasi.getNamaDosen());
        holder.waktu.setText(notifikasi.getWaktu());
        holder.keterangan.setText(notifikasi.getKeterangan());

    }

    @Override
    public int getItemCount() {
        return notifikasiList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView namaDosen, waktu, keterangan;
        public ImageView avatar;
        public MyViewHolder(View itemView) {
            super(itemView);

            avatar = (ImageView)itemView.findViewById(R.id.avatar);
            namaDosen = (TextView)itemView.findViewById(R.id.nama_dosen);
            waktu = (TextView)itemView.findViewById(R.id.waktu);
            keterangan = (TextView)itemView.findViewById(R.id.quote);

        }
    }

    public NotifikasiAdapter(List<Notifikasi>notifikasiList){
        this.notifikasiList = notifikasiList;
    }
}
