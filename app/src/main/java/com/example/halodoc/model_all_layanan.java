package com.example.halodoc;

import android.widget.ImageView;

public class model_all_layanan {
    String nama_layanan,nama_layanan2, nama_layanan3, nama_layanan4,
            penjelasan_layanan, jenis_layanan,jenis_layanan2, jenis_layanan3,
            nama_rs, nama_rs2, nama_rs3,alamat_rs,alamat_rs2,alamat_rs3,harga_layanan,harga_layanan2,harga_layanan3,nama_pasien ;
    int gambar_layanan, gambar_rs, gambar_rs2, gambar_rs3;
    public model_all_layanan(String nama_layanan,String nama_layanan2, String nama_layanan3, String nama_layanan4,
                             int gambar_layanan, String penjelasan_layanan, int gambar_rs, int gambar_rs2, int gambar_rs3,
                             String jenis_layanan, String jenis_layanan2, String jenis_layanan3, String nama_rs,  String nama_rs2,  String nama_rs3,
                             String alamat_rs, String alamat_rs2, String alamat_rs3, String harga_layanan, String harga_layanan2, String harga_layanan3,String nama_pasien){
        this.nama_layanan = nama_layanan;
        this.nama_layanan2 = nama_layanan2;
        this.nama_layanan3 = nama_layanan3;
        this.nama_layanan4 = nama_layanan4;
        this.gambar_layanan=gambar_layanan;
        this.penjelasan_layanan=penjelasan_layanan;
        this.gambar_rs=gambar_rs;
        this.gambar_rs2=gambar_rs2;
        this.gambar_rs3=gambar_rs3;
        this.jenis_layanan=jenis_layanan;
        this.jenis_layanan2=jenis_layanan2;
        this.jenis_layanan3=jenis_layanan3;
        this.nama_rs=nama_rs;
        this.nama_rs2=nama_rs2;
        this.nama_rs3=nama_rs3;
        this.alamat_rs=alamat_rs;
        this.alamat_rs2=alamat_rs2;
        this.alamat_rs3=alamat_rs3;
        this.harga_layanan=harga_layanan;
        this.harga_layanan2=harga_layanan2;
        this.harga_layanan3=harga_layanan3;
        this.nama_pasien=nama_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getNama_layanan2() {
        return nama_layanan2;
    }

    public void setNama_layanan2(String nama_layanan2) {
        this.nama_layanan2 = nama_layanan2;
    }

    public String getNama_layanan3() {
        return nama_layanan3;
    }

    public void setNama_layanan3(String nama_layanan3) {
        this.nama_layanan3 = nama_layanan3;
    }

    public String getNama_layanan4() {
        return nama_layanan4;
    }

    public void setNama_layanan4(String nama_layanan4) {
        this.nama_layanan4 = nama_layanan4;
    }

    public String getJenis_layanan2() {
        return jenis_layanan2;
    }

    public void setJenis_layanan2(String jenis_layanan2) {
        this.jenis_layanan2 = jenis_layanan2;
    }

    public String getJenis_layanan3() {
        return jenis_layanan3;
    }

    public void setJenis_layanan3(String jenis_layanan3) {
        this.jenis_layanan3 = jenis_layanan3;
    }

    public String getNama_rs2() {
        return nama_rs2;
    }

    public void setNama_rs2(String nama_rs2) {
        this.nama_rs2 = nama_rs2;
    }

    public String getNama_rs3() {
        return nama_rs3;
    }

    public void setNama_rs3(String nama_rs3) {
        this.nama_rs3 = nama_rs3;
    }

    public String getAlamat_rs2() {
        return alamat_rs2;
    }

    public void setAlamat_rs2(String alamat_rs2) {
        this.alamat_rs2 = alamat_rs2;
    }

    public String getAlamat_rs3() {
        return alamat_rs3;
    }

    public void setAlamat_rs3(String alamat_rs3) {
        this.alamat_rs3 = alamat_rs3;
    }

    public String getHarga_layanan2() {
        return harga_layanan2;
    }

    public void setHarga_layanan2(String harga_layanan2) {
        this.harga_layanan2 = harga_layanan2;
    }

    public String getHarga_layanan3() {
        return harga_layanan3;
    }

    public void setHarga_layanan3(String harga_layanan3) {
        this.harga_layanan3 = harga_layanan3;
    }

    public int getGambar_rs2() {
        return gambar_rs2;
    }

    public void setGambar_rs2(int gambar_rs2) {
        this.gambar_rs2 = gambar_rs2;
    }

    public int getGambar_rs3() {
        return gambar_rs3;
    }

    public void setGambar_rs3(int gambar_rs3) {
        this.gambar_rs3 = gambar_rs3;
    }

    public String getJenis_layanan() {
        return jenis_layanan;
    }

    public void setJenis_layanan(String jenis_layanan) {
        this.jenis_layanan = jenis_layanan;
    }

    public String getNama_rs() {
        return nama_rs;
    }

    public void setNama_rs(String nama_rs) {
        this.nama_rs = nama_rs;
    }

    public String getAlamat_rs() {
        return alamat_rs;
    }

    public void setAlamat_rs(String alamat_rs) {
        this.alamat_rs = alamat_rs;
    }

    public String getHarga_layanan() {
        return harga_layanan;
    }

    public void setHarga_layanan(String harga_layanan) {
        this.harga_layanan = harga_layanan;
    }

    public int getGambar_rs() {
        return gambar_rs;
    }

    public void setGambar_rs(int gambar_rs) {
        this.gambar_rs = gambar_rs;
    }

    public String getPenjelasan_layanan() {
        return penjelasan_layanan;
    }

    public void setPenjelasan_layanan(String penjelasan_layanan) {
        this.penjelasan_layanan = penjelasan_layanan;
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
