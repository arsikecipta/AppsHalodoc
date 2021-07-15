package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class lihat_semua_dokter extends AppCompatActivity {

    public CardView filter;
    public ImageView lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_dokter);

        getSupportActionBar().setTitle("Rekomendasi Dokter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        RecyclerView recyclerView =findViewById(R.id.recyclerview_dokter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Model_list_dokter> modelListdokter = new ArrayList<>();
        modelListdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 25.000","Universitas Indonesia","RSCM Cipto M.","123456789",R.drawable.avadoctor3));
        modelListdokter.add(new Model_list_dokter("dr Zarni Jamali","Dokter Umum", "20 Tahun", "99,0%", "Rp 30.000","Universitas Negeri Solo","RS Sari Asih","123456789", R.drawable.avadoctor1));
        modelListdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 10.000","Universitas Andalas","RS Siloam","123456789",R.drawable.avadoctor2));
        modelListdokter.add(new Model_list_dokter("dr Zarni Jamali","Dokter Umum", "20 Tahun", "99,0%", "Rp 30.000", "Universitas Dipnegoro","RS Fatmawati","123456789", R.drawable.avadoctor4));
        modelListdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 50.000","Universitas Gajah Mada","RS Harapan Kita","123456789",R.drawable.avadoctor3));
        modelListdokter.add(new Model_list_dokter("dr Zarni Jamali","Dokter Umum", "20 Tahun", "99,0%", "Rp 25.000","Universitas Tarumanegara","RS Siloam","123456789", R.drawable.avadoctor1));

        Adapter_lihat_semua_dokter adapter_dokter = new Adapter_lihat_semua_dokter (modelListdokter, lihat_semua_dokter.this);
        recyclerView.setAdapter(adapter_dokter);

        filter =(CardView) findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Filter_berdasarkan();
            }

            private void Filter_berdasarkan() {
                Intent intent= new Intent(lihat_semua_dokter.this, Filter_berdasarkan.class);
                startActivity(intent);
            }
        });

        lanjut =(ImageView) findViewById(R.id.lanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Filter_berdasarkan();
            }

            private void Filter_berdasarkan() {
                Intent intent= new Intent(lihat_semua_dokter.this, Filter_berdasarkan.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }
}