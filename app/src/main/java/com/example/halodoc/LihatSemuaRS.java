package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class LihatSemuaRS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_rs);
        getSupportActionBar().setTitle("Rekomendasi RS");
        RecyclerView recyclerView =findViewById(R.id.recyclerview_rs);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<model_list_rs> modelListRs = new ArrayList<>();
        modelListRs.add(new model_list_rs("Siloam Hospital", "Rumah Sakit Umum", "Karawaci", R.drawable.siloam));
        modelListRs.add(new model_list_rs("RS Primaya Tangerang", "Rumah Sakit Umum", "Kelapa dua", R.drawable.rsprimaya));
        modelListRs.add(new model_list_rs("Mayapada Clinic Tangerang", "Klinik", "Tangerang", R.drawable.mayapada));
        modelListRs.add(new model_list_rs("Klinik Kimia Farma Kelapa Dua", "Klinik", "Kelapa dua", R.drawable.kimiafarma));
        modelListRs.add(new model_list_rs("RS Sari Asih Karawaci", "Rumah Sakit Umum", "Karawaci", R.drawable.sariasih));

        Adapter_lihat_rs adapter_rs_list = new Adapter_lihat_rs(modelListRs, LihatSemuaRS.this);
        recyclerView.setAdapter(adapter_rs_list);
    }
}