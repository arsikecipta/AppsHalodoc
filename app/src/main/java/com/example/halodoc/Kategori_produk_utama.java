package com.example.halodoc;

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
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Kategori_produk_utama extends AppCompatActivity {

    private Adapter_kategori_produk_utama adapter_kategori_utama;
    private List<Model_list_kategori_tokes> modelListObat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_produk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ListObat();
        SetUpRecyclerObat();




    }

    private void ListObat() {
        //receive data
        Intent intent =getIntent();
        String JudulKategori = intent.getExtras().getString("JudulKategori");
        getSupportActionBar().setTitle(JudulKategori);
        String NamaObat1 = intent.getExtras().getString("NamaObat1");
        String Jenis1 = intent.getExtras().getString("Jenis1");
        String HargaObat1 = intent.getExtras().getString("HargaObat1");
        int ImageObat1 = intent.getExtras().getInt("ImageObat1");

        String NamaObat2 = intent.getExtras().getString("NamaObat2");
        String Jenis2 = intent.getExtras().getString("Jenis2");
        String HargaObat2 = intent.getExtras().getString("HargaObat2");
        int ImageObat2 = intent.getExtras().getInt("ImageObat2");

        String NamaObat3 = intent.getExtras().getString("NamaObat3");
        String Jenis3 = intent.getExtras().getString("Jenis3");
        String HargaObat3 = intent.getExtras().getString("HargaObat3");
        int ImageObat3 = intent.getExtras().getInt("ImageObat3");

        String NamaObat4 = intent.getExtras().getString("NamaObat4");
        String Jenis4 = intent.getExtras().getString("Jenis4");
        String HargaObat4 = intent.getExtras().getString("HargaObat4");
        int ImageObat4 = intent.getExtras().getInt("ImageObat4");

        String NamaObat5 = intent.getExtras().getString("NamaObat5");
        String Jenis5 = intent.getExtras().getString("Jenis5");
        String HargaObat5 = intent.getExtras().getString("HargaObat5");
        int ImageObat5 = intent.getExtras().getInt("ImageObat5");

        String NamaObat6 = intent.getExtras().getString("NamaObat6");
        String Jenis6 = intent.getExtras().getString("Jenis6");
        String HargaObat6 = intent.getExtras().getString("HargaObat6");
        int ImageObat6 = intent.getExtras().getInt("ImageObat6");


        modelListObat = new ArrayList<>();
        modelListObat.add(new Model_list_kategori_tokes (
                JudulKategori,
                NamaObat1,Jenis1,HargaObat1,ImageObat1,"Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));

        modelListObat.add(new Model_list_kategori_tokes(
                JudulKategori,
                NamaObat2,Jenis2,HargaObat2,ImageObat2,"Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));


        modelListObat.add(new Model_list_kategori_tokes(
                JudulKategori,
                NamaObat3,Jenis3,HargaObat3,ImageObat3, "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));


        modelListObat.add(new Model_list_kategori_tokes(
                JudulKategori,
                NamaObat4,Jenis4,HargaObat4,ImageObat4, "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));


        modelListObat.add(new Model_list_kategori_tokes(
                JudulKategori,
                NamaObat5,Jenis5,HargaObat5,ImageObat5, "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));


        modelListObat.add(new Model_list_kategori_tokes(
                JudulKategori,
                NamaObat6,Jenis6,HargaObat6,ImageObat6,"Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD202554171",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD837654326",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD212352781",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD211552801",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD161549731",
                "Meningkatkan sistem kekebalan tubuh, terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.","BPOM: SD111541821"));


    }

    private void SetUpRecyclerObat() {
        RecyclerView recyclerView =findViewById(R.id.recyclerview_produk);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter_kategori_utama = new Adapter_kategori_produk_utama (modelListObat, Kategori_produk_utama.this);
        recyclerView.setAdapter(adapter_kategori_utama);

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
                adapter_kategori_utama.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
}