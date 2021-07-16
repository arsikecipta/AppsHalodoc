package com.example.halodoc;

import androidx.annotation.NonNull;
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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Lihat_semua_dokter_spesialis extends AppCompatActivity {

    public CardView filter;
    public ImageView lanjut;
    private Adapter_lihat_semua_dokter_spesialis adapter_spesialisasi;
    private List<Model_list_dokter_spesialis> modelListDokter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_dokter_spesialis);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListDokterSpesialis();
       setUpRecyclerSpesialis();








        filter =(CardView) findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Filter_berdasarkan_spesialis();
            }

            private void Filter_berdasarkan_spesialis() {
                Intent intent= new Intent(Lihat_semua_dokter_spesialis.this, Filter_berdasarkan_spesialis.class);
                startActivity(intent);
            }
        });

        lanjut =(ImageView) findViewById(R.id.lanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Filter_berdasarkan_spesialis();
            }

            private void Filter_berdasarkan_spesialis() {
                Intent intent= new Intent(Lihat_semua_dokter_spesialis.this, Filter_berdasarkan_spesialis.class);
                startActivity(intent);

            }
        });

    }


    private void ListDokterSpesialis() {
        //receive data
        Intent intent =getIntent();
        String JudulKategori = intent.getExtras().getString("JudulKategori");
        getSupportActionBar().setTitle(JudulKategori);
        String NamaDokter1 = intent.getExtras().getString("NamaDokter1");
        String Kategori1 = intent.getExtras().getString("Kategori1");
        String Tahun1 = intent.getExtras().getString("Tahun1");
        String Suka1 = intent.getExtras().getString("Suka1");
        String HargaDokter1 = intent.getExtras().getString("HargaDokter1");
        int ImageDokter1 = intent.getExtras().getInt("ImageDokter1");
        String Alumni1 = intent.getExtras().getString("Alumni1");
        String Praktik1 = intent.getExtras().getString("Praktik1");
        String STR1= intent.getExtras().getString("STR1");


        String NamaDokter2 = intent.getExtras().getString("NamaDokter2");
        String Kategori2 = intent.getExtras().getString("Kategori2");
        String Tahun2 = intent.getExtras().getString("Tahun2");
        String Suka2 = intent.getExtras().getString("Suka2");
        String HargaDokter2 = intent.getExtras().getString("HargaDokter2");
        int ImageDokter2 = intent.getExtras().getInt("ImageDokter2");
        String Alumni2 = intent.getExtras().getString("Alumni2");
        String Praktik2 = intent.getExtras().getString("Praktik2");
        String STR2 = intent.getExtras().getString("STR2");

        String NamaDokter3 = intent.getExtras().getString("NamaDokter3");
        String Kategori3 = intent.getExtras().getString("Kategori3");
        String Tahun3 = intent.getExtras().getString("Tahun3");
        String Suka3 = intent.getExtras().getString("Suka3");
        String HargaDokter3 = intent.getExtras().getString("HargaDokter3");
        int ImageDokter3 = intent.getExtras().getInt("ImageDokter3");
        String Alumni3 = intent.getExtras().getString("Alumni3");
        String Praktik3 = intent.getExtras().getString("Praktik3");
        String STR3 = intent.getExtras().getString("STR3");

        String NamaDokter4 = intent.getExtras().getString("NamaDokter4");
        String Kategori4 = intent.getExtras().getString("Kategori4");
        String Tahun4 = intent.getExtras().getString("Tahun4");
        String Suka4 = intent.getExtras().getString("Suka4");
        String HargaDokter4 = intent.getExtras().getString("HargaDokter4");
        int ImageDokter4 = intent.getExtras().getInt("ImageDokter4");
        String Alumni4 = intent.getExtras().getString("Alumni4");
        String Praktik4 = intent.getExtras().getString("Praktik4");
        String STR4 = intent.getExtras().getString("STR4");

        String NamaDokter5 = intent.getExtras().getString("NamaDokter5");
        String Kategori5 = intent.getExtras().getString("Kategori5");
        String Tahun5 = intent.getExtras().getString("Tahun5");
        String Suka5 = intent.getExtras().getString("Suka5");
        String HargaDokter5 = intent.getExtras().getString("HargaDokter5");
        int ImageDokter5 = intent.getExtras().getInt("ImageDokter5");
        String Alumni5 = intent.getExtras().getString("Alumni5");
        String Praktik5 = intent.getExtras().getString("Praktik5");
        String STR5 = intent.getExtras().getString("STR5");

        String NamaDokter6 = intent.getExtras().getString("NamaDokter6");
        String Kategori6 = intent.getExtras().getString("Kategori6");
        String Tahun6 = intent.getExtras().getString("Tahun6");
        String Suka6 = intent.getExtras().getString("Suka6");
        String HargaDokter6 = intent.getExtras().getString("HargaDokter6");
        int ImageDokter6 = intent.getExtras().getInt("ImageDokter6");
        String Alumni6 = intent.getExtras().getString("Alumni6");
        String Praktik6 = intent.getExtras().getString("Praktik6");
        String STR6 = intent.getExtras().getString("STR6");

        modelListDokter = new ArrayList<>();
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter1, Kategori1, Tahun1, Suka1, HargaDokter1, "Universitas Indonesia", "Poliklinik Madya", "1202175642", ImageDokter1));
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter2, Kategori2, Tahun2, Suka2, HargaDokter2, "Universitas Brawijaya", "RS.Mayapada", "1202170987",  ImageDokter2));
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter3, Kategori3, Tahun3, Suka3, HargaDokter3, "Universitas Soedirman", "RS.Bhayangkari", "1202174523",  ImageDokter3));
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter4, Kategori4, Tahun4, Suka4, HargaDokter4, "Universitas Trisakti", "RS.Siloam", "1202178546",  ImageDokter4));
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter5, Kategori5, Tahun5, Suka5, HargaDokter5, "Universitas Tarumanegara", "RS.Qadr", "1202177321",  ImageDokter5));
        modelListDokter.add(new Model_list_dokter_spesialis(JudulKategori, NamaDokter6, Kategori6, Tahun6, Suka6, HargaDokter6, "Universitas Diponegoro", "Poliklinik Telkom", "1202173177",  ImageDokter6));



    }
    private void setUpRecyclerSpesialis() {
        RecyclerView recyclerView =findViewById(R.id.recyclerview_dokter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_spesialisasi = new Adapter_lihat_semua_dokter_spesialis (modelListDokter, Lihat_semua_dokter_spesialis.this);
        recyclerView.setAdapter(adapter_spesialisasi);
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
                adapter_spesialisasi.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
}