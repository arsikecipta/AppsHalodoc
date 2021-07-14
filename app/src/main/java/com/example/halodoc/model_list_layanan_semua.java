package com.example.halodoc;

public class model_list_layanan_semua {
    String nama_layanan, jenis_layanan, nama_rs, alamat_rs, biaya_layanan, penjelasan_layanan;
    int image_layanan, image_layanan2;

    public model_list_layanan_semua(String nama_layanan, String jenis_layanan, String nama_rs, String alamat_rs, String biaya_layanan, int image_layanan,String penjelasan_layanan) {
        this.nama_layanan = nama_layanan;
        this.jenis_layanan = jenis_layanan;
        this.nama_rs = nama_rs;
        this.alamat_rs = alamat_rs;
        this.biaya_layanan = biaya_layanan;
        this.penjelasan_layanan=penjelasan_layanan;
        this.image_layanan = image_layanan;

    }



    public String getPenjelasan_layanan() {
        return penjelasan_layanan;
    }

    public void setPenjelasan_layanan(String penjelasan_layanan) {
        this.penjelasan_layanan = penjelasan_layanan;
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

    public String getBiaya_layanan() {
        return biaya_layanan;
    }

    public void setBiaya_layanan(String biaya_layanan) {
        this.biaya_layanan = biaya_layanan;
    }


    public String getNama_layanan() {
        return nama_layanan;
    }

    public void setNama_layanan(String nama_layanan) {
        this.nama_layanan = nama_layanan;
    }
    public Integer getImage_layanan() {
        return image_layanan;
    }

    public void setImage_layanan(Integer image_layanan) {
        this.image_layanan = image_layanan;
    }
}


