package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class all_layanan extends AppCompatActivity {
    RecyclerView rs_recycler,layanan_recyclerview;
    private ArrayList<model_all_layanan> model_all_layananArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_layanan);
        getSupportActionBar().setTitle("Semua layanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setup_rec_semua_ayanan();
        layanan_recyclerview=findViewById(R.id.recyclerview_all_layanan);
        layanan_recyclerview();
        layanan_recyclerview.setHasFixedSize(true);
        layanan_recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }





    private void layanan_recyclerview() {
        Intent intent = getIntent();
        String namalengkap =intent.getExtras().getString("NamaLengkap");
        model_all_layananArrayList = new ArrayList<>();
        model_all_layanan layanan = new model_all_layanan( "Tes COVID-19","Tes Swab Antigen","Rapid Basic","PCR Swab Test-Hasil 1 Hari Kerja",R.drawable.tescovid,"Tes Covid-19 adalah tes untuk mendeteksi virus corona yang menyerang sistem pernapasan",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Tes Swab Antigen","Tes Rapid","Tes PCR","Siloam Hospital Lippo Village","Klinik Kimia Farma Berigin",
                "Siloam Clinic Cyberbark","Kelapa Dua, Tangerang","Karawaci, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000",namalengkap);
        model_all_layananArrayList.add(layanan);

        model_all_layanan layanan2 = new model_all_layanan( "Poliklinik Penyakit Dalam","Tes Swab Antigen","Rapid Basic","PCR Swab Test-Hasil 1 Hari Kerja",R.drawable.penyakitdalam,"Poliklinik Penyakit Dala berfokus pada penanganan berbagai macam penyakit yang berkaitan dengan masalah kesehatan pada organ tubuh bagian dalam yang diderita",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Tes Swab Antigen","Tes Rapid","Tes PCR","Siloam Hospital Lippo Village","Klinik Kimia Farma Berigin",
                "Siloam Clinic Cyberbark","Kelapa Dua, Tangerang","Karawaci, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000",namalengkap);
        model_all_layananArrayList.add(layanan2);
        model_all_layanan layanan3 = new model_all_layanan( "Medical Check Up","Medical Check Up Basic","Screening Jantung","Paket Diabetes Melitus",R.drawable.cekhealth3,"Medical check up adalah serangkaian uji kesehatan rutin yang dilakukan di rumah sakit untuk memeriksa kesehatan tubuh secara keseluruhan dan mengantisipasi risiko penyakit.",
                R.drawable.cekhealth,R.drawable.cekhantung, R.drawable.cekdiabetes,"Pemeriksaan diagnostik","Pemeriksaan diagnostik","Pemeriksaan diagnostik","RS Mayapada Tangerang","RS Mayapada Tangerang",
                "Biomedialab Cikupa","Tangerang","Tangerang","Cikupa, Kabupaten Tangerang","Rp640.000",
                "Rp1000.000","Rp335.000",namalengkap);
        model_all_layananArrayList.add(layanan3);
        model_all_layanan layanan4 = new model_all_layanan( "Poliklinik Jantung dan Pembuluh Darah","Screening ECG","Elektrokardiogram (EKG)","Treadmill",R.drawable.polijantung,"Poliklinik jantung dan pembuluh darah berkaitan dengan mencegah, mendiagnosis, dan melakukan pengobatan berbagai penyakit kardiovaskuler seperti tekanan darah tinggi sampao serangan jantung",
                R.drawable.siloam,R.drawable.kimiafarmaberingin, R.drawable.siloamclinic,"Pemeriksaan diagnostik","Pemeriksaan diagnostik","Pemeriksaan diagnostik","RS Mayapada Tangerang","RIS Hospital",
                "RS Hospital","Tangerang","Serpong, Tangerang","Curug, Kabupaten Tangerang","Rp199.000",
                "Rp150.000","Rp1.700.000",namalengkap);
        model_all_layananArrayList.add(layanan4);
        model_all_layanan layanan5 = new model_all_layanan( "Poliklinik Kedokteran Fisik dan Rehabilitasi","Fisioterapi (Home Care)","Fisioterapi - Pain Muscolar Skeletal","Fisioterapi - Pain Spine Disorder",R.drawable.kedokteranfisik ,
                "Poliklinik Kedokteran Fisik dan Rehabilitasi berfokus pada mengupayakan pelayanan kesehatan terhadap fisik dan fungsional yang diakibatkan karena kondisi tertentu.",
                R.drawable.fisohomecare, R.drawable.fisospine, R.drawable.fisospine,"Home Care, Fisioterapi","Fisioterapi","Fisioterapi",
                "Klinik NK Health","Mandiri Center Brain & Spine Clinic Lebak Bulus","Mandiri Center Brain & Spine Clinic Lebak Bulus","Kebon Jeruk, Jakarta Barat","Cilandak, Jakarta Pusat","Cilandak, Jakarta Pusat",
                "Rp523.000","Rp242.000","Rp242.000",namalengkap);
        model_all_layananArrayList.add(layanan5);

        Adapter_all_layanan adapter_lay = new Adapter_all_layanan(model_all_layananArrayList,all_layanan.this);
        layanan_recyclerview.setAdapter(adapter_lay);
    }
    private void setup_rec_semua_ayanan() {
    }
}