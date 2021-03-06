package com.scapp.adik.scapp;

public class Jadwal {
    private String makul, jam, dosen, imageUrl;
    private int  durasi;

    public Jadwal(){

    }

    public Jadwal (String imageUrl, String makul, String jam, int durasi, String dosen){
        this.imageUrl = imageUrl;
        this.makul = makul;
        this.jam = jam;
        this.durasi = durasi;
        this.dosen = dosen;
    }

    public String getMakul() {
        return makul;
    }

    public void setMakul(String makul) {
        this.makul = makul;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
}
