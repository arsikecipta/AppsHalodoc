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
import android.widget.TextView;

import java.util.ArrayList;

public class Lihat_semua_dokter_filter_spesialis extends AppCompatActivity {

    public TextView hapus_filter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_dokter_filter_spesialis);

        getSupportActionBar().setTitle("Dokter Spesialis");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView =findViewById(R.id.recyclerview_dokter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Model_list_dokter> modelListdokter = new ArrayList<>();
        modelListdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 25.000","Universitas Indonesia","RSCM Cipto M.","1202173177",R.drawable.nodoctor3));
        modelListdokter.add(new Model_list_dokter("dr Zarni Jamali","Dokter Umum", "20 Tahun", "99,0%", "Rp 30.000","Universitas Negeri Solo","RS Sari Asih","123456789", R.drawable.nodoctor1));
        modelListdokter.add(new Model_list_dokter("dr Vania Rinosaputri","Dokter Umum","10 Tahun","99.0%","Rp 10.000","Universitas Andalas","RS Siloam","123456789",R.drawable.nodoctor3));
        modelListdokter.add(new Model_list_dokter("dr Marsha Ayudia","Dokter Umum", "20 Tahun", "99,0%", "Rp 30.000", "Universitas Dipnegoro","RS Fatmawati","123456789", R.drawable.nodoctor1));
        modelListdokter.add(new Model_list_dokter("dr Annisa Permata","Dokter Umum","10 Tahun","99.0%","Rp 50.000","Universitas Gajah Mada","RS Harapan Kita","123456789",R.drawable.nodoctor3));
        modelListdokter.add(new Model_list_dokter("dr Nabila Atsila","Dokter Umum", "20 Tahun", "99,0%", "Rp 25.000","Universitas Tarumanegara","RS Siloam","123456789", R.drawable.nodoctor1));

        Adapter_lihat_semua_dokter_filter_spesialis adapter_dokter = new Adapter_lihat_semua_dokter_filter_spesialis (modelListdokter, Lihat_semua_dokter_filter_spesialis.this);
        recyclerView.setAdapter(adapter_dokter);

        hapus_filter=(TextView) findViewById(R.id.hapus_filter);
        hapus_filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lihat_semua_dokter_filter_spesialis();
            }

            private void Lihat_semua_dokter_filter_spesialis() {
                Intent intent= new Intent(Lihat_semua_dokter_filter_spesialis.this, Lihat_semua_dokter_spesialis.class);
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