package com.scapp.adik.scapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.scapp.adik.scapp.Jadwal;
import com.scapp.adik.scapp.R;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Random;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.MyViewHolder> {
    private List<Jadwal> jadwalList;
    private Context context;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.jadwal_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Random r = new Random();
        int red=r.nextInt(255 - 0 + 1)+0;
        int green=r.nextInt(255 - 0 + 1)+0;
        int blue=r.nextInt(255 - 0 + 1)+0;
        GradientDrawable draw = new GradientDrawable();
        draw.setShape(GradientDrawable.RECTANGLE);
        draw.setColor(Color.rgb(red,green,blue));
        holder.status.setBackground(draw);
        /*holder.avatar.setBackground(draw);*/


        Jadwal jadwal = jadwalList.get(position);
        /*Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(jadwalList.get(position).getImageUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.avatar);
        Picasso.get().load(jadwalList.get(position).getImageUrl()).into(holder.avatar);*/
        Picasso.get()
                .load(jadwalList.get(position).getImageUrl())
                .placeholder(draw)
                .error(draw)
                .resize(600, 600)
                .centerCrop()
                .into(holder.avatar);



        /*holder.avatar.setImageResource(jadwal.getImageUrl());*/
        holder.makul.setText(jadwal.getMakul());
        holder.jam.setText(jadwal.getJam());
        holder.dosen.setText(jadwal.getDosen());
        holder.durasi.setText(Integer.toString(jadwal.getDurasi()));
    }

    @Override
    public int getItemCount() {
        return jadwalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView makul, jam, dosen, durasi;
        public ImageView avatar, status;

        public MyViewHolder(View itemView) {
            super(itemView);
            avatar = (ImageView)itemView.findViewById(R.id.avatar);
            makul = (TextView)itemView.findViewById(R.id.makul);
            jam = (TextView)itemView.findViewById(R.id.jam);
            dosen = (TextView)itemView.findViewById(R.id.dosen);
            durasi = (TextView)itemView.findViewById(R.id.durasi);
            status = (ImageView)itemView.findViewById(R.id.status);
        }
    }

    public JadwalAdapter(List<Jadwal>jadwalList){
        this.jadwalList = jadwalList;
    }


}
