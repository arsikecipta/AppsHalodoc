package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class lihat_semua_tokes extends AppCompatActivity {
    private Adapter_lihat_semua_tokes adapter_tokes;
    private List<Model_list_tokes> modelListTokes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_tokes);

        getSupportActionBar().setTitle("Produk kesehatan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       ListTokes();
        setUpRecyclerViewTokes();




//        modellistokes.add(new Model_list_tokes("Saluran Pencernaan","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Anti Nyeri","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Alergi","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Anti Inflamasi","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Mulut dan Tenggorokan","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Mata","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Herbal","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Alat Kesehatan","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Otot, Tulang, dan Sendi","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Diabetes","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Asma","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Jantung","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Hipertensi","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Saluran Kemih & Prostat","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Kontrasepsi & Hormon","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Produk Susu","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Ibu dan Anak","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Perawatan Kecantikan","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Minyak Angin & Balsam","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Perawatan Diri","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Diet","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Lensa Kontak","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Makanan & Minuman","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("P3K","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Antiseptik","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Antibiotik & Anti Jamur","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Anti Virus","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Pearwatan Hewan","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Alat Bantu Dengar","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));
//        modellistokes.add(new Model_list_tokes("Lainya","Propolis","Per-Botol","Rp 200.000",R.drawable.indonesia));


    }

    private void ListTokes() {

        modelListTokes = new ArrayList<>();
        modelListTokes.add(new Model_list_tokes(
                "Covid-19",
                "Immune Booster Package (30 Hari)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Immune Booster Package (Economy)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Paket Isolasi Mandiri (Gold)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Paket Isolasi Mandiri (Silver)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Multivitamns Package","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Vitamin C Booster Package","Per-Paket","Rp 200.000",R.drawable.covidpackage));



        modelListTokes.add(new Model_list_tokes("Batuk dan Flu",
                "Coldrexin","Per-Botol","Rp 30.000",R.drawable.batukflu1,
                "Plemex Forte","Per-Botol","Rp 45.000",R.drawable.batukflu2,
                "Ivy Leaf","Per-Botol","Rp 90.000",R.drawable.batukflu3,
                "AnaKonidin (OBH)","Per-Botol","Rp 20.000",R.drawable.batukflu4,
                "KomixHerbal","Per-Box","Rp 15.000",R.drawable.batukflu5,
                "OBH Combi","Per-Botol","Rp 35.000",R.drawable.batukflu6));


        modelListTokes.add(new Model_list_tokes("Demam",
                "Bodrex","Per-box","Rp 15.000",R.drawable.demam1,
                "Paracetamol","Per-Box","Rp 50.000",R.drawable.demam2,
                "Pim-Tra-Kol","Per-Botol","Rp 30.000",R.drawable.demam3,
                "Saridon Triple Action","Per-Strip","Rp 10.000",R.drawable.demam4,
                "Febrol","Per-Botol","Rp 40.000",R.drawable.demam5,
                "Sumagesic","Per-Strip","Rp 7.000",R.drawable.demam6));

        modelListTokes.add(new Model_list_tokes("Watsons Deals",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modelListTokes.add(new Model_list_tokes("Vitamin & Suplemen",
                "Propolis Red","Per-Botol","Rp 200.000",R.drawable.obathalodoc1,
                "Propolis Brown","Per-Botol","Rp 200.000",R.drawable.obathalodoc2,
                "Propolis Trio","Per-Botol","Rp 200.000",R.drawable.obathalodoc3,
                "Propolis Ultimate","Per-Botol","Rp 200.000",R.drawable.obathalodoc4,
                "Propolis Immune","Per-Botol","Rp 200.000",R.drawable.obathalodoc5,
                "Propolis Green","Per-Botol","Rp 200.000",R.drawable.obathalodoc6));


        modelListTokes.add(new Model_list_tokes("Diabetes",
                "Melilea","Per-Botol","Rp 200.000",R.drawable.diabet1,
                "Spanish Bee Pollen","Per-Botol","Rp 200.000",R.drawable.diabet2,
                "Mellabic","Per-Botol","Rp 200.000",R.drawable.diabet3,
                "Cystone","Per-Botol","Rp 200.000",R.drawable.diabet4,
                "Yacona","Per-Botol","Rp 200.000",R.drawable.diabet5,
                "Diabetrix","Per-Box","Rp 200.000",R.drawable.diabet6));

        modelListTokes.add(new Model_list_tokes("Saluran Pencernaan",
                "Diapet NR","Per-Box","Rp 30.000",R.drawable.cerna1,
                "Diapet","Per-Strip","Rp 7.000",R.drawable.cerna2,
                "Diatabs","Per-Strip","Rp 7.000",R.drawable.cerna3,
                "Promag","Per-Box","Rp 28.000",R.drawable.cerna4,
                "Mylanta","Per-Botol","Rp 38.000",R.drawable.cerna5,
                "Polysilane","Per-Botol","Rp 85.000",R.drawable.cerna6));

        modelListTokes.add(new Model_list_tokes("Hipertensi",
                "Hipertency","Per-Botol","Rp 160.000",R.drawable.hiper1,
                "Captopril","Per-Box","Rp 80.000",R.drawable.hiper2,
                "Swanson","Per-Botol","Rp 200.000",R.drawable.hiper3,
                "Gravistro","Per-Botol","Rp 200.000",R.drawable.hiper4,
                "Amlopin","Per-Box","Rp 120.000",R.drawable.hiper5,
                "Concor 2.5","Per-Box","Rp 95.000",R.drawable.hiper6));

        modelListTokes.add(new Model_list_tokes("Minyak Angin & Balsam",
                "Minyak Angin (Cap Kapak)","Per-Botol","Rp 20.000",R.drawable.obathalodoc1,
                "Essential Embrocation","Per-Botol","Rp 40.000",R.drawable.obathalodoc2,
                "Medicated Oil","Per-Botol","Rp 35.000",R.drawable.obathalodoc3,
                "Minyak Kayu Putih","Per-Botol","Rp 25.000",R.drawable.obathalodoc4,
                "Balsem Otot Geliga","Per-Botol","Rp 18.000",R.drawable.obathalodoc5,
                "Parcok (Minyak Urut)","Per-Botol","Rp 28.000",R.drawable.obathalodoc6));

        modelListTokes.add(new Model_list_tokes("Alat Bantu Dengar",
                "Abdi Baterai (Orange)","Per-Pack","Rp 200.000",R.drawable.alban1,
                "PowerMax HearRite","Per-Pack","Rp 200.000",R.drawable.alban2,
                "Power One","Per-Pack","Rp 200.000",R.drawable.alban3,
                "Abdi Baterai (Kuning)","Per-Pack","Rp 200.000",R.drawable.alban4,
                "Amplifon","Per-Pack","Rp 200.000",R.drawable.alban5,
                "Panasonic PR-10","Per-Pack","Rp 200.000",R.drawable.alban6));

        modelListTokes.add(new Model_list_tokes("Lainya",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

    }

    private void setUpRecyclerViewTokes() {
        RecyclerView recyclerView =findViewById(R.id.recyclerview_tokes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_tokes = new Adapter_lihat_semua_tokes (modelListTokes, lihat_semua_tokes.this);
        recyclerView.setAdapter(adapter_tokes);

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
                adapter_tokes.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
}