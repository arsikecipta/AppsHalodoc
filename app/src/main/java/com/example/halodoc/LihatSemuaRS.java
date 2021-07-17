package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LihatSemuaRS extends AppCompatActivity {
    private Adapter_lihat_rs lihat_rs;
    private List<model_list_rs> modelListRs;
    TextView nama_gone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_rs);
        getSupportActionBar().setTitle("Lihat semua rs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListRs();
        setUpRecyclerView();
        //NAMA GONE

        nama_gone=findViewById(R.id.nama_gone);

//        Intent intent = getIntent();
//        String namalengkap =intent.getExtras().getString("NamaLengkap");
//        nama_gone.setText(namalengkap);

    }

    private void ListRs() {
        Intent intent = getIntent();
        String namalengkap =intent.getExtras().getString("NamaLengkap");
        modelListRs = new ArrayList<>();
        modelListRs.add(new model_list_rs( R.drawable.siloam,
                "Siloam Hospital",
                "Rumah Sakit Umum",
                "Tes Swab Antigen","Tes Rapid","Swab tes antigen atau rapid tes antigen adalah tes imun yang bisa digunakan untuk mengidentifikasi COVID-19 dengan cara mendeteksi keberadaan virus tersebut", "Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.",
                "Tes Swab Antigen","Tes Rapid","Rp199.000","Rp.99.000", R.drawable.tescovid,R.drawable.swab,"Kelapa dua,Tangerang","Siloam Hospital Lippo Village adalah Rumah Sakit yang terletak di Kelapa Dua, Tangerang yang berada dibawah naungan Siloam Hospital Group.", namalengkap));
        modelListRs.add(new model_list_rs(R.drawable.sariasih,
                "RS Sari Asih",
                "Rumah sakit umum",
                "Tes GeNose","PCR Drive Thru", "GeNose adalah sebuah alat pendeteksi virus corona yang diciptakan oleh para ahli dari Universitas Gadjah MAda (UGM).", "es PCR (Polymerase Chain Reaction) akan dilakukan melalui kendaraan, pasien tidak perlu turun dari kendaraan untuk tes.",
                "Tes GeNose","PCR Drive Thru, Tes PCR","Rp30.000","Rp650.000", R.drawable.genose,R.drawable.drivethru,"Karawaci,Tangerang","Rumah Sakit Sari Asih Karawaci beroperasi sejak tahun 1981 di daerah Karawaci. Rumah sakit ini terus berkembang hingga menjadi Rumah Sakit besar dengan manajemen dan perlengkapan medis modern.",namalengkap));

        modelListRs.add(new model_list_rs(R.drawable.axeldental,
                "Axel Dental Tangerang",
                "Klinik", "Bleeching gigi","Scalling ","Bleaching gigi merupakan prosedur pemutih gigi menggunakan bahan kimia untuk pemulihan kembali gigi", "Scaling merupakan sebuah tindakan non-operasi yang dilakukan untuk menghilangkan plak dan karang pada gigi",
                "Bleaching gigi","Scalling","Rp5000.000", "Rp300.000", R.drawable.poligigi,R.drawable.scalling,"Pinang, Tangerang","Axel Dental merupakan klinik yang berada dibawah naungan CV Tri Anugra dan didirikan untuk memberikan pelayanan terbaik untuk kesehatan gigi bagi keluarga indonesia dengan berkerja sama dengan para dokter gigi profesional.",namalengkap));;

        modelListRs.add(new model_list_rs(R.drawable.kimiafarmaberingin,
                "Kimia Farma Beringin",
                "Klinik", "Tes rapid","Rapid basic","Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.", "Rapid tes adalah tes untuk mendeteksi COVID-19 dengan menggunakan sampel darah.",
                "Tes Rapid, Rapid Basic","Tes Rapid, Rapid Basic","Rp150.000","Rp150.000", R.drawable.tescovid,R.drawable.tescovid,"Karawaci, Tangerang","Unit bisnis Laboratorium Klinik Kimia Far,a donila sekal tahun 2003 dibawah PT. Kimia Farma (persero) Tbk. sebagai Healthcare company.",namalengkap));

        modelListRs.add(new model_list_rs(R.drawable.rsprimaya,
                "RS Primaya Tangerang",
                "Rumah Sakit Umum", "PCR Drive Thru","Tes PCR","Tes PCR (Polymerase Chain Reaction) akan dilakukan melalui kendaraan, pasien tidak perlu turun dari kendaraan untuk tes.", "Tes PCR (Polymerase Chain Reaction) digunakan untu mendeteksi keberadaan material genetik dari sel, bakteri atau virus.",
                "PCR Drive Thru","Tes Rapid, Rapid Basic","Rp950.000","Rp950.000", R.drawable.drivethru,R.drawable.swab,"Pinang, Tangerang","Unit bisnis Laboratorium Klinik Kimia Far,a donila sekal tahun 2003 dibawah PT. Kimia Farma (persero) Tbk. sebagai Healthcare company.",namalengkap));



    }

    private void setUpRecyclerView(){
        RecyclerView recyclerView =findViewById(R.id.recyclerview_rs);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        lihat_rs = new Adapter_lihat_rs(modelListRs,LihatSemuaRS.this);
        recyclerView.setAdapter(lihat_rs);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                lihat_rs.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }
}