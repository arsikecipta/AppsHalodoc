package com.example.halodoc;

import android.widget.ImageView;

public class model_all_layanan {
    String nama_layanan;
    int gambar_layanan;
    public model_all_layanan(String nama_layanan, int gambar_layanan){
        this.nama_layanan = nama_layanan;
        this.gambar_layanan=gambar_layanan;
    }

    public int getGambar_layanan() {
        return gambar_layanan;
    }

    public void setGambar_layanan(int gambar_layanan) {
        this.gambar_layanan = gambar_layanan;
    }

    public String getNama_layanan() {
        return nama_layanan;
    }

    public void setNama_layanan(String nama_layanan) {
        this.nama_layanan = nama_layanan;
    }
}
