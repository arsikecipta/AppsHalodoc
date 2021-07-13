package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class BuatJanjiRS extends AppCompatActivity {
    RecyclerView rs_recycler, layanan_recycler;
    RecyclerView.Adapter adapter;
    private ArrayList<model_all_layanan> model_all_layananArrayList;
    private ArrayList<model_rs> modelArrayList;
    public Button btn_all;
    public Button btn_all_layanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_janji_rs);
        getSupportActionBar().setTitle("Janji RS");
        rs_recycler=findViewById(R.id.recyclerview_rs);
        layanan_recycler=findViewById(R.id.rec_all_layanan);
        layanan_recycler();
        layanan_recycler.setHasFixedSize(true);
        layanan_recycler.setLayoutManager(new LinearLayoutManager(this));
        rs_recycler();
        rs_recycler.setHasFixedSize(true);
        rs_recycler.setLayoutManager(new LinearLayoutManager(this));
               btn_all=(Button) findViewById(R.id.btn_lihatsemua);

//        Intent intent =getIntent();
//        String namapasien = intent.getExtras().getString("NamaLengkap");


        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lihat_semua_rs();
            }

            private void lihat_semua_rs() {
                Intent intent= new Intent(BuatJanjiRS.this, LihatSemuaRS.class);
                startActivity(intent);

            }
        });
        btn_all_layanan=(Button)findViewById(R.id.btn_all_layanan);
        btn_all_layanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BuatJanjiRS.this, all_layanan.class);
                startActivity(intent);
            }
        });
    }


    private void layanan_recycler() {
        model_all_layananArrayList = new ArrayList<>();
        model_all_layanan layanan = new model_all_layanan( "Tes COVID-19","Tes Swab Antigen","Rapid Basic","PCR Swab Test-Hasil 1 Hari Kerja",R.drawable.tescovid,"Tes Covid-19 adalah tes untuk mendeteksi virus corona yang menyerang sistem pernapasan",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Tes Swab Antigen","Tes Rapid","Tes PCR","Siloam Hospital Lippo Village","Klinik Kimia Farma Berigin",
                "Siloam Clinic Cyberbark","Kelapa Dua, Tangerang","Karawaci, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000");
        model_all_layananArrayList.add(layanan);

        model_all_layanan layanan2 = new model_all_layanan( "Poliklinik Penyakit Dalam","Tes Swab Antigen","Rapid Basic","PCR Swab Test-Hasil 1 Hari Kerja",R.drawable.penyakitdalam,"Poliklinik Penyakit Dala berfokus pada penanganan berbagai macam penyakit yang berkaitan dengan masalah kesehatan pada organ tubuh bagian dalam yang diderita",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Tes Swab Antigen","Tes Rapid","Tes PCR","Siloam Hospital Lippo Village","Klinik Kimia Farma Berigin",
                "Siloam Clinic Cyberbark","Kelapa Dua, Tangerang","Karawaci, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000");
        model_all_layananArrayList.add(layanan2);
        model_all_layanan layanan3 = new model_all_layanan( "Medical Check Up","Medical Check Up Basic","Screening Jantung","Paket Diabetes Melitus",R.drawable.cekhealth3,"Medical check up adalah serangkaian uji kesehatan rutin yang dilakukan di rumah sakit untuk memeriksa kesehatan tubuh secara keseluruhan dan mengantisipasi risiko penyakit.",
                R.drawable.cekhealth,R.drawable.cekhantung, R.drawable.cekdiabetes,"Pemeriksaan diagnostik","Pemeriksaan diagnostik","Pemeriksaan diagnostik","RS Mayapada Tangerang","RS Mayapada Tangerang",
                "Biomedialab Cikupa","Tangerang","Tangerang","Cikupa, Kabupaten Tangerang","Rp640.000",
                "Rp1000.000","Rp335.000");
        model_all_layananArrayList.add(layanan3);
        Adapter_all_layanan adapter_lay = new Adapter_all_layanan(model_all_layananArrayList,BuatJanjiRS.this);
        layanan_recycler.setAdapter(adapter_lay);
//        layanan_recycler.addItemDecoration
//                (new DividerItemDecoration
//                        (getApplicationContext(), DividerItemDecoration.VERTICAL)
//                );
    }
    private void rs_recycler() {
        ArrayList<model_rs> modelRs = new ArrayList<>();
        modelRs.add(new model_rs( R.drawable.siloam,
                "Siloam Hospital",
                "Rumah Sakit Umum",
                "Tes Swab Antigen","Tes Rapid","Swab tes antigen atau rapid tes antigen adalah tes imun yang bisa digunakan untuk mengidentifikasi COVID-19 dengan cara mendeteksi keberadaan virus tersebut", "Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.",
                "Tes Swab Antigen","Tes Rapid","Rp199.000","Rp.99.000", R.drawable.tescovid,R.drawable.swab,"Kelapa dua,Tangerang","Siloam Hospital Lippo Village adalah Rumah Sakit yang terletak di Kelapa Dua, Tangerang yang berada dibawah naungan Siloam Hospital Group."));
        modelRs.add(new model_rs( R.drawable.sariasih,
                "RS Sari Asih",
                "Rumah sakit umum",
                "Tes GeNose","PCR Drive Thru", "GeNose adalah sebuah alat pendeteksi virus corona yang diciptakan oleh para ahli dari Universitas Gadjah MAda (UGM).", "Tes PCR (Polymerase Chain Reaction) akan dilakukan melalui kendaraan, pasien tidak perlu turun dari kendaraan untuk tes.",
                "Tes GeNose","PCR Drive Thru, Tes PCR","Rp30.000","Rp650.000", R.drawable.genose,R.drawable.drivethru,"Karawaci,Tangerang","Rumah Sakit Sari Asih Karawaci beroperasi sejak tahun 1981 di daerah Karawaci. Rumah sakit ini terus berkembang hingga menjadi Rumah Sakit besar dengan manajemen dan perlengkapan medis modern."));

        modelRs.add(new model_rs(  R.drawable.axeldental,
                "Axel Dental Tangerang",
                "Klinik", "Bleeching gigi","Scalling ","Bleaching gigi merupakan prosedur pemutih gigi menggunakan bahan kimia untuk pemulihan kembali gigi", "Scaling merupakan sebuah tindakan non-operasi yang dilakukan untuk menghilangkan plak dan karang pada gigi",
                "Bleaching gigi","Scalling","Rp5.000.000", "Rp300.000", R.drawable.poligigi,R.drawable.siloam,"Pinang, Tangerang","Axel Dental merupakan klinik yang berada dibawah naungan CV Tri Anugra dan didirikan untuk memberikan pelayanan terbaik untuk kesehatan gigi bagi keluarga indonesia dengan berkerja sama dengan para dokter gigi profesional."));
        modelRs.add(new model_rs(R.drawable.kimiafarmaberingin,
                "Kimia Farma Beringin",
                "Klinik", "Tes rapid","Rapid basic","Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.", "Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.",
                "Tes Rapid, Rapid Basic","Tes Rapid, Rapid Basic","Rp150.000","Rp150.000", R.drawable.tescovid,R.drawable.tescovid,"Karawaci, Tangerang","Unit bisnis Laboratorium Klinik Kimia Far,a donila sekal tahun 2003 dibawah PT. Kimia Farma (persero) Tbk. sebagai Healthcare company."));

        Adapter_rs adapter = new Adapter_rs(modelRs,BuatJanjiRS.this);
        rs_recycler.setAdapter(adapter);
    }
}