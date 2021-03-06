package com.example.halodoc;

public class model_artikel {
    private int image;
    private String title_artikel, topik_artikel, dokter_artikel, isi_paragraph1, isi_paragraph2;

    public model_artikel(int image, String title_artikel, String topik_artikel,String dokter_artikel, String isi_paragraph1, String isi_paragraph2) {
        this.image = image;
        this.title_artikel = title_artikel;
        this.topik_artikel = topik_artikel;
        this.dokter_artikel=dokter_artikel;
        this.isi_paragraph1=isi_paragraph1;
        this.isi_paragraph2=isi_paragraph2;

    }

    public String getIsi_paragraph1() {
        return isi_paragraph1;
    }

    public void setIsi_paragraph1(String isi_paragraph1) {
        this.isi_paragraph1 = isi_paragraph1;
    }

    public String getIsi_paragraph2() {
        return isi_paragraph2;
    }

    public void setIsi_paragraph2(String isi_paragraph2) {
        this.isi_paragraph2 = isi_paragraph2;
    }

    public String getIsi_paragraph() {
        return isi_paragraph1;
    }

    public void setIsi_paragraph(String isi_paragraph) {
        this.isi_paragraph1 = isi_paragraph;
    }


    public String getDokter_artikel() {
        return dokter_artikel;
    }

    public void setDokter_artikel(String dokter_artikel) {
        this.dokter_artikel = dokter_artikel;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle_artikel(String title_artikel) {
        this.title_artikel = title_artikel;
    }

    public void setTopik_artikel(String topik_artikel) {
        this.topik_artikel = topik_artikel;
    }

    public int getImage() {
        return image;
    }

    public String getTitle_artikel() {
        return title_artikel;
    }

    public String getTopik_artikel() {
        return topik_artikel;
    }
}
