package com.example.halodoc;

public class Model_search_tokes {

    private String nama_obat, jenis, harga_obat,indikasi,frekuensi, aturan, noregist;

    private int image_obat;

    public Model_search_tokes (String nama_obat, String jenis, String harga_obat, String indikasi, String frekuensi, String aturan, String noregist, int image_obat) {

        this.nama_obat = nama_obat;
        this.jenis = jenis;
        this.harga_obat = harga_obat;
        this.image_obat = image_obat;
        this.indikasi = indikasi;
        this.frekuensi = frekuensi;
        this.aturan = aturan;
        this.noregist = noregist;
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

    public int getImage_obat() {
        return image_obat;
    }

    public void setImage_obat(int image_obat) {
        this.image_obat = image_obat;
    }
}
