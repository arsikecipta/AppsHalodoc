package com.example.halodoc;

public class model_list_rs {
    private String name_rs, jenis_rs, alamat_rs;
    private  Integer image_rs;

    public model_list_rs(String name_rs, String jenis_rs, String alamat_rs, Integer image_rs) {
        this.name_rs = name_rs;
        this.jenis_rs = jenis_rs;
        this.alamat_rs = alamat_rs;
        this.image_rs=image_rs;
    }

    public String getName_rs() {
        return name_rs;
    }

    public void setName_rs(String name_rs) {
        this.name_rs = name_rs;
    }

    public String getJenis_rs() {
        return jenis_rs;
    }

    public void setJenis_rs(String jenis_rs) {
        this.jenis_rs = jenis_rs;
    }

    public String getAlamat_rs() {
        return alamat_rs;
    }

    public void setAlamat_rs(String alamat_rs) {
        this.alamat_rs = alamat_rs;
    }

    public Integer getImage_rs() {
        return image_rs;
    }

    public void setImage_rs(Integer image_rs) {
        this.image_rs = image_rs;
    }
}