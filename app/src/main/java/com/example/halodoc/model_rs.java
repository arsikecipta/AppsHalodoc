package com.example.halodoc;

public class model_rs {
    private int image, foto_layanan;
    private String title, desc, jenis, layanan, layanan2, alamat_rs, notelp_rs,penjelasan1,penjelasan2, jenis_layanan, harga_layanan;
    public model_rs(int image, String title, String jenis, String layanan, String layanan2, String penjelasan1, String penjelasan2, String jenis_layanan, String harga_layanan, int foto_layanan, String alamat_rs,String notelp_rs) {
        this.image = image;
        this.title = title;
        this.jenis=jenis;
        this.layanan=layanan;
        this.layanan2=layanan2;
        this.foto_layanan=foto_layanan;
        this.alamat_rs=alamat_rs;
        this.notelp_rs=notelp_rs;
        this.penjelasan1=penjelasan1;
        this.penjelasan2=penjelasan2;
        this.harga_layanan=harga_layanan;
        this.jenis_layanan=jenis_layanan;
        this.harga_layanan=harga_layanan;

    }

    public String getJenis_layanan() {
        return jenis_layanan;
    }

    public void setJenis_layanan(String jenis_layanan) {
        this.jenis_layanan = jenis_layanan;
    }

    public String getHarga_layanan() {
        return harga_layanan;
    }

    public void setHarga_layanan(String harga_layanan) {
        this.harga_layanan = harga_layanan;
    }

    public String getPenjelasan1() {
        return penjelasan1;
    }

    public void setPenjelasan1(String penjelasan1) {
        this.penjelasan1 = penjelasan1;
    }

    public String getPenjelasan2() {
        return penjelasan2;
    }

    public void setPenjelasan2(String penjelasan2) {
        this.penjelasan2 = penjelasan2;
    }

    public String getAlamat_rs() {
        return alamat_rs;
    }

    public void setAlamat_rs(String alamat_rs) {
        this.alamat_rs = alamat_rs;
    }

    public String getNotelp_rs() {
        return notelp_rs;
    }

    public void setNotelp_rs(String notelp_rs) {
        this.notelp_rs = notelp_rs;
    }

    public String getLayanan2() {
        return layanan2;
    }

    public void setLayanan2(String layanan2) {
        this.layanan2 = layanan2;
    }

    public int getFoto_layanan() {
        return foto_layanan;
    }

    public void setFoto_layanan(int foto_layanan) {
        this.foto_layanan = foto_layanan;
    }

    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
