package com.scapp.adik.scapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scapp.adik.scapp.Jadwal;
import com.scapp.adik.scapp.R;

import java.util.List;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.MyViewHolder> {
    private List<Jadwal> jadwalList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.jadwal_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Jadwal jadwal = jadwalList.get(position);
        holder.avatar.setImageResource(jadwal.getImageUrl());
        holder.makul.setText(jadwal.getMakul());
        holder.jam.setText(jadwal.getJam());
        holder.dosen.setText(jadwal.getDosen());

    }

    @Override
    public int getItemCount() {
        return jadwalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView makul, jam, dosen;
        public ImageView avatar;

        public MyViewHolder(View itemView) {
            super(itemView);
            avatar = (ImageView)itemView.findViewById(R.id.avatar);
            makul = (TextView)itemView.findViewById(R.id.makul);
            jam = (TextView)itemView.findViewById(R.id.jam);
            dosen = (TextView)itemView.findViewById(R.id.dosen);
        }
    }

    public JadwalAdapter(List<Jadwal>jadwalList){
        this.jadwalList = jadwalList;
    }


}
