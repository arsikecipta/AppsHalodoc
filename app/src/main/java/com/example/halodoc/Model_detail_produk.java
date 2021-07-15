package com.example.halodoc;

public class Model_detail_produk {

    private String indikasi, frekuensi, aturan, noregist,judul, nama_obat, jenis, harga_obat;

    int image_obat;

    public Model_detail_produk (String judul, String nama_obat, String jenis, String harga_obat, int image_obat, String indikasi, String frekuensi, String aturan, String noregist) {

        this.indikasi = indikasi;
        this.frekuensi = frekuensi;
        this.aturan = aturan;
        this.noregist = noregist;
        this.judul = judul;
        this.nama_obat = nama_obat;
        this.jenis = jenis;
        this.harga_obat = harga_obat;
        this.image_obat = image_obat;

    }

    public String getIndikasi() {
        return indikasi;
    }

    public void setIndikasi(String indikasi) {
        this.indikasi = indikasi;
    }

    public String getFrekuensi() {
        return frekuensi;
    }

    public void setFrekuensi(String frekuensi) {
        this.frekuensi = frekuensi;
    }

    public String getAturan() {
        return aturan;
    }

    public void setAturan(String aturan) {
        this.aturan = aturan;
    }

    public String getNoregist() {
        return noregist;
    }

    public void setNoregist(String noregist) {
        this.noregist = noregist;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga_obat() {
        return harga_obat;
    }

    public void setHarga_obat(String harga_obat) {
        this.harga_obat = harga_obat;
    }

    public int getImage_obat() {
        return image_obat;
    }

    public void setImage_obat(int image_obat) {
        this.image_obat = image_obat;
    }
}
