package com.scapp.adik.scapp;

public class Notifikasi {

    private String namaDosen, waktu, keterangan;

    public Notifikasi(){

    }

    public Notifikasi(int imageUrl, String namaDosen, String waktu, String keterangan){
        this.imageUrl = imageUrl;
        this.namaDosen = namaDosen;
        this.waktu = waktu;
        this.keterangan = keterangan;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    private int imageUrl;

}
