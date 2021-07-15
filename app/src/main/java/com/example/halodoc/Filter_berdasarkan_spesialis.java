package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class Filter_berdasarkan_spesialis extends AppCompatActivity {
    RecyclerView.Adapter adapter;
    RecyclerView recyclerview_dokter;
    private ArrayList <Model_list_dokter> modellistdokter;
    public Button btn_terapkan;
    public Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_berdasarkan_spesialis);
        getSupportActionBar().setTitle("Filter Berdasarkan");

        btn_terapkan=(Button) findViewById(R.id.btn_terapkan);
        btn_terapkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lihat_semua_dokter_filter_spesialis();
            }

            private void Lihat_semua_dokter_filter_spesialis() {
                Intent intent= new Intent(Filter_berdasarkan_spesialis.this, Lihat_semua_dokter_filter_spesialis.class);
                startActivity(intent);

            }
        });

        btn_kembali=(Button) findViewById(R.id.btn_kembali);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lihat_semua_dokter_spesialis();
            }

            private void Lihat_semua_dokter_spesialis() {
                Intent intent= new Intent(Filter_berdasarkan_spesialis.this, Lihat_semua_dokter_spesialis.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
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