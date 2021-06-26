package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class BuatJanjiRS extends AppCompatActivity {
    RecyclerView rs_recycler, layanan_recycler;
    RecyclerView.Adapter adapter;
    private ArrayList<model_all_layanan> model_all_layananArrayList;
    private ArrayList<model_rs> modelArrayList;
    public Button btn_all;
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
        rs_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        btn_all=(Button) findViewById(R.id.btn_lihatsemua);
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
    }

    private void layanan_recycler() {
        model_all_layananArrayList = new ArrayList<>();
        model_all_layanan layanan = new model_all_layanan( "Tes COVID-19",R.drawable.tescovid);
        model_all_layananArrayList.add(layanan);
        model_all_layanan layanan2 = new model_all_layanan( "Vaksinasi COVID-19",R.drawable.vaksin);
        model_all_layananArrayList.add(layanan2);
        model_all_layanan layanan3 = new model_all_layanan( "Poliklinik Penyakit Dalam",R.drawable.penyakitdalam);
        model_all_layananArrayList.add(layanan3);
        Adapter_all_layanan adapter_lay = new Adapter_all_layanan(model_all_layananArrayList,BuatJanjiRS.this);
        layanan_recycler.setAdapter(adapter_lay);
        layanan_recycler.addItemDecoration
                (new DividerItemDecoration
                        (getApplicationContext(), DividerItemDecoration.VERTICAL)
                );
    }

    private void rs_recycler() {
        ArrayList<model_rs> modelRs = new ArrayList<>();
        modelRs.add(new model_rs( R.drawable.siloam,
                "Siloam Hospital",
                "Rumah Sakit Umum",
                "Test Swab antigen","Vitamin","Rapid test antigen adalah pemeriksaan secara cepat untuk mendeteksi keberadaan antigen tertentu di dalam tubuh seseorang.", "Tes PCR (Polumerase chain reaction), digunakan untuk mendeteksi keberadaan material genetik dari sel, bakteri atau virus",
                "Tes Rapid","Rp190.000", R.drawable.tescovid,"Sumur Bandung, Jawa Barat","082213997564"));
        modelRs.add(new model_rs(  R.drawable.rsprimaya,
                "RS Primaya Tangerang",
                "Rumah Sakit Umum",
                "PCR Tes Covid-19","UGD", "wkkwkw", "HAHAH","Tes Online","Rp185.000", R.drawable.tescovid,"Kiaracondong","082213997569"));
        modelRs.add(new model_rs( R.drawable.mayapada,
                "Mayapada Clinic Tangerang",
                "Klinik",
                "Pemeriksaan luka","Cek mata","HUHUHU", "HIHHIHI","Bedah","Rp200.000",  R.drawable.cekhealth,"BEC Bandung","0822139975644"));
        modelRs.add(new model_rs( R.drawable.kimiafarma,
                "Klinik Kimia Farma Kelapa Dua",
                "Klinik", "Medical Checkup","Imun Booster","KAKAKA", "awokaow","Suntik","Rp90.000", R.drawable.cekhealth3,"Kota Bandung","082213997568"));
        modelRs.add(new model_rs( R.drawable.sariasih,
                "RS Sari Asih Karawaci",
                "Rumah sakit umum",
                "Poliklinik gigi","Behel", "AJAJSA", "ABbABAH","Bedah","Rp3.290.000", R.drawable.poligigi,"Tangerang","082213997566"));

        Adapter_rs adapter = new Adapter_rs(modelRs,BuatJanjiRS.this);
        rs_recycler.setAdapter(adapter);

    }



}