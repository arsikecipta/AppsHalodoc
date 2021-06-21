package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Lihat_semua_artikel extends AppCompatActivity {
    private List<model_artikel> modelArtikels;
    Adapter_lihat_artikel adapter_lihatartikel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_artikel);
        setContentView(R.layout.activity_lihat_semua_artikel);
        getSupportActionBar().setTitle("Artikel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SemuaArtikel();
        setUpRecyclerView();
    }
    private void SemuaArtikel() {
        modelArtikels = new ArrayList<>();
        modelArtikels.add(new model_artikel(R.drawable.kecantikan,
                "Rangkaian Perawatan Wajah untuk Mencegah Jerawat",
                "Kecantikan","Dr. Fadhli Rizal Makarim"));
        modelArtikels.add(new model_artikel(R.drawable.makanan,
                "Apa Manfaat Mengkonsumsi Yoghurt untuk Kesehatan?",
                "Makanan Sehat","Dr. Rizal Fadli"));
        modelArtikels.add(new model_artikel(R.drawable.anak,
                "Bayi juga Bisa Insomnia, Benarkah?",
                "Pertumbuhan Anak","Dr. Rizal Fadli"));
        modelArtikels.add(new model_artikel(R.drawable.parestesia,
                "Jenis Pemeriksaan yang dilakukan untuk Deteksi parestesia",
                "Parestesia","Dr. Gabriella Florencia"));
        modelArtikels.add(new model_artikel(R.drawable.bayi,
                "7 Cara Merawat Bayi Baru Lahir Tanpa Stres",
                "Pertumbuhan bayi","Dr. Rizal Fadli"));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView_artikel = findViewById(R.id.recyclerview_artikel);
        recyclerView_artikel.setHasFixedSize(true);
        recyclerView_artikel.setLayoutManager(new LinearLayoutManager(this));

        Adapter_lihat_artikel adapter_lihatartikel = new Adapter_lihat_artikel(modelArtikels,this);
        recyclerView_artikel.setAdapter(adapter_lihatartikel);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
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

                adapter_lihatartikel.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}