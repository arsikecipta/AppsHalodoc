package com.example.halodoc;

public class Model_list_dokter {

    private String nama_dokter, kategori_dokter, tahun, suka, harga, alumni, praktik, str;
    int image_dokter;

    public Model_list_dokter(String nama_dokter, String kategori_dokter, String tahun, String suka, String harga, String alumni, String praktik, String str, int image_dokter) {
        this.nama_dokter = nama_dokter;
        this.kategori_dokter = kategori_dokter;
        this.tahun = tahun;
        this.suka = suka;
        this.harga = harga;
        this.alumni =alumni;
        this.praktik = praktik;
        this.str = str;
        this.image_dokter = image_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getKategori_dokter() {
        return kategori_dokter;
    }

    public void setKategori_dokter(String kategori_dokter) {
        this.kategori_dokter = kategori_dokter;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getSuka() {
        return suka;
    }

    public void setSuka(String suka) {
        this.suka = suka;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getAlumni() {
        return alumni;
    }

    public void setAlumni(String alumni) {
        this.alumni = alumni;
    }

    public String getPraktik() {
        return praktik;
    }

    public void setPraktik(String praktik) {
        this.praktik = praktik;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getImage_dokter() {
        return image_dokter;
    }

    public void setImage_dokter(int image_dokter) {
        this.image_dokter = image_dokter;
    }
}
