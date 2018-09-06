package com.scapp.adik.scapp;

public class Jadwal {
    private String makul, jam, dosen;
    private int imageUrl;

    public Jadwal(){

    }

    public Jadwal (int imageUrl, String makul, String jam, String dosen){
        this.imageUrl = imageUrl;
        this.makul = makul;
        this.jam = jam;
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

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
