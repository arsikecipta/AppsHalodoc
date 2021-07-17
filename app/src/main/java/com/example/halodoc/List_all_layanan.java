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

import java.util.ArrayList;

public class List_all_layanan extends AppCompatActivity {
    private Adapter_lihat_all_layanan all_layanan;
    private ArrayList<model_all_layanan> modelAllLayanans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_layanan);
        getSupportActionBar().setTitle("Semua layanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListLayanan();
        setUpRecyclerView();
    }
    private void ListLayanan() {
        Intent intent = getIntent();
        String namalengkap =intent.getExtras().getString("NamaLengkap");
        modelAllLayanans = new ArrayList<>();
        model_all_layanan layanan = new model_all_layanan( "Tes COVID-19","Tes Swab Antigen","Rapid Basic","PCR Swab Test-Hasil 1 Hari Kerja",R.drawable.tescovid,"Tes Covid-19 adalah tes untuk mendeteksi virus corona yang menyerang sistem pernapasan",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Tes Swab Antigen","Tes Rapid","Tes PCR","Siloam Hospital Lippo Village","Klinik Kimia Farma Berigin",
                "Siloam Clinic Cyberbark","Kelapa Dua, Tangerang","Karawaci, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000",namalengkap);
        modelAllLayanans.add(layanan);
        model_all_layanan layanan2 = new model_all_layanan( "Poliklinik Penyakit Dalam","USG Abdomen","USG","USG",R.drawable.penyakitdalam,"Poliklinik Penyakit Dala berfokus pada penanganan berbagai macam penyakit yang berkaitan dengan masalah kesehatan pada organ tubuh bagian dalam yang diderita",
                R.drawable.usgabdomen,R.drawable.usgabdomen2, R.drawable.usgabdomen2,"Pemeriksaan Diagnostik","Pemeriksaan Diagnostik","Pemeriksaan Diagnostik","RS Tiara Bekasi","RS Khusus Bedah Mitra Ariva",
                "RS Citra Husada Pidie Aceh","Babelan, Kabupaten Bekasi","Ajibarang, Kabupaten Banyumas","Pidie, Kabupaten Pidie","Rp350.000",
                "Rp135.000","Rp250.000",namalengkap);
        modelAllLayanans.add(layanan2);
        model_all_layanan layanan3 = new model_all_layanan( "Medical Check Up","Medical Check Up Basic","Screening Jantung","Paket Diabetes Melitus",R.drawable.cekhealth3,"Medical check up adalah serangkaian uji kesehatan rutin yang dilakukan di rumah sakit untuk memeriksa kesehatan tubuh secara keseluruhan dan mengantisipasi risiko penyakit.",
                R.drawable.cekhealth,R.drawable.cekhantung, R.drawable.cekdiabetes,"Pemeriksaan diagnostik","Pemeriksaan diagnostik","Pemeriksaan diagnostik","RS Mayapada Tangerang","RS Mayapada Tangerang",
                "Biomedialab Cikupa","Tangerang","Tangerang","Cikupa, Kabupaten Tangerang","Rp640.000",
                "Rp1000.000","Rp335.000",namalengkap);
        modelAllLayanans.add(layanan3);
        model_all_layanan layanan4 = new model_all_layanan( "Poliklinik Jantung dan Pembuluh Darah","Screening ECG","Elektrokardiogram (EKG)","Treadmill",R.drawable.polijantung,"Poliklinik jantung dan pembuluh darah berkaitan dengan mencegah, mendiagnosis, dan melakukan pengobatan berbagai penyakit kardiovaskuler seperti tekanan darah tinggi sampao serangan jantung",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Pemeriksaan diagnostik","Pemeriksaan diagnostik","Pemeriksaan diagnostik","RS Mayapada Tangerang","RIS Hospital",
                "RS Hospital","Tangerang","Serpong, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000",namalengkap);
        modelAllLayanans.add(layanan4);
        model_all_layanan layanan5 = new model_all_layanan( "Poliklinik Kedokteran Fisik dan Rehabilitasi","Fisioterapi (Home Care)","Fisioterapi - Pain Muscolar Skeletal","Fisioterapi - Pain Spine Disorder",R.drawable.kedokteranfisik ,
                "Poliklinik Kedokteran Fisik dan Rehabilitasi berfokus pada mengupayakan pelayanan kesehatan terhadap fisik dan fungsional yang diakibatkan karena kondisi tertentu.",
                R.drawable.fisohomecare, R.drawable.fisospine, R.drawable.fisospine,"Home Care, Fisioterapi","Fisioterapi","Fisioterapi",
                "Klinik NK Health","Mandiri Center Brain & Spine Clinic Lebak Bulus","Mandiri Center Brain & Spine Clinic Lebak Bulus","Kebon Jeruk, Jakarta Barat","Cilandak, Jakarta Pusat","Cilandak, Jakarta Pusat",
                "Rp523.000","Rp242.000","Rp242.000",namalengkap);
        modelAllLayanans.add(layanan5);
        model_all_layanan layanan6 = new model_all_layanan( "Poliklinik Anak","Vaksinasi Anak Campak","Vaksinasi Anak DTP Hib Polio Hep B (Hexamim)","Vaksinasi Anak Hepatitis A (Havrix 720 Junior)",R.drawable.polianak ,
                "Poliklinik Anak berfokus pada kesehatan anak yang dimulai sejak mereka dilahirkan hingga 18 tahun, dan berfokus pada gangguan penyakit, kelainan, alergi dll yang dapati menganggu tumbuh kembang anak.",
                R.drawable.zap, R.drawable.zap, R.drawable.zap,"Vaksinasi Anak","Vaksinasi Anak","Vaksinasi Anak",
                "ZAP Premiere Gading Serpong","ZAP Premiere Gading Serpong","ZAP Premiere Gading Serpong","Kelapa Dua, Kabupaten Tangerang","Kelapa Dua, Kabupaten Tangerang","Kelapa Dua, Kabupaten Tangerang",
                "Rp350.000","Rp1.1000.000","Rp550.000",namalengkap);
        modelAllLayanans.add(layanan6);

    }
    private void setUpRecyclerView() {
        RecyclerView recyclerView =findViewById(R.id.recyclerview_list_all);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        all_layanan = new Adapter_lihat_all_layanan(modelAllLayanans,List_all_layanan.this);
        recyclerView.setAdapter(all_layanan);

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
                all_layanan.getFilter().filter(newText);
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