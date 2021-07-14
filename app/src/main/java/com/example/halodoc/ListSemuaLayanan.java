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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListSemuaLayanan extends AppCompatActivity {
    private TextView tv_namalay, tv_jenislay, tv_namars, tv_alamatrs, tv_biayalay, tv_gambarlay, tv_penjelasan, txt_namalay;
    private ImageView imglay;
    private Adapter_list_layanan_semua lihat_list_layanan;
    private List<model_list_layanan_semua> modelListLayananSemuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_semua_layanan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListLayananSemua();
       setuprecyclerLayanan();


    }


    private void ListLayananSemua() {
        tv_namalay=(TextView)findViewById(R.id.nama_list_layanan);
        tv_jenislay=(TextView)findViewById(R.id.jenis_list_layanan);
        tv_namars=(TextView)findViewById(R.id.layanan_list_rumahsakit);
        tv_alamatrs=(TextView)findViewById(R.id.layanan_list_alamat_rs);
        tv_biayalay=(TextView)findViewById(R.id.list_biaya_layanan);
        imglay=(ImageView)findViewById(R.id.imageview_list_layanan);
        tv_penjelasan=(TextView) findViewById(R.id.txt_penjelasanlay_semua);
        txt_namalay=(TextView)findViewById(R.id.nama_layananrs_semua);

        //receive data
        Intent intent =getIntent();
        String namaLayanan = intent.getExtras().getString("NamaLayanan");
        getSupportActionBar().setTitle(namaLayanan);
        String namaLayanan2 = intent.getExtras().getString("NamaLayanan2");
        String namaLayanan3= intent.getExtras().getString("NamaLayanan3");
        String namaLayanan4 = intent.getExtras().getString("NamaLayanan4");

        int imageLayanan = intent.getExtras().getInt("GambarLayanan");

        int imageRS = intent.getExtras().getInt("GambarRS");
        int imageRS2 = intent.getExtras().getInt("GambarRS2");
        int imageRS3 = intent.getExtras().getInt("GambarRS3");

        String jenisLayanan = intent.getExtras().getString("JenisLayanan");
        String jenisLayanan2 = intent.getExtras().getString("JenisLayanan2");
        String jenisLayanan3 = intent.getExtras().getString("JenisLayanan3");

        String namaRS = intent.getExtras().getString("NamaRS");
        String namaRS2 = intent.getExtras().getString("NamaRS2");
        String namaRS3 = intent.getExtras().getString("NamaRS3");

        String alamatRS = intent.getExtras().getString("AlamatRS");
        String alamatRS2 = intent.getExtras().getString("AlamatRS2");
        String alamatRS3 = intent.getExtras().getString("AlamatRS3");

        String biayaLayanan = intent.getExtras().getString("HargaLayanan");
        String biayaLayanan2 = intent.getExtras().getString("HargaLayanan2");
        String biayaLayanan3 = intent.getExtras().getString("HargaLayanan3");

        String penjelasanlay = intent.getExtras().getString("PenjelasanLayanan");

        tv_penjelasan.setText(penjelasanlay);
        txt_namalay.setText(namaLayanan);

       modelListLayananSemuas = new ArrayList<>();
        modelListLayananSemuas.add(new model_list_layanan_semua(namaLayanan2, jenisLayanan,namaRS,alamatRS,biayaLayanan,imageRS,penjelasanlay));
        modelListLayananSemuas.add(new model_list_layanan_semua(namaLayanan3, jenisLayanan2,namaRS2,alamatRS2,biayaLayanan2,imageRS2,penjelasanlay));
        modelListLayananSemuas.add(new model_list_layanan_semua(namaLayanan4, jenisLayanan3,namaRS3,alamatRS3,biayaLayanan2,imageRS3,penjelasanlay));

    }
    private void setuprecyclerLayanan() {
        RecyclerView recyclerView_list_layanan =findViewById(R.id.rec_layanan);
        recyclerView_list_layanan.setHasFixedSize(true);
        recyclerView_list_layanan.setLayoutManager(new LinearLayoutManager(this));
        lihat_list_layanan= new Adapter_list_layanan_semua(modelListLayananSemuas, ListSemuaLayanan.this);
        recyclerView_list_layanan.setAdapter(lihat_list_layanan);
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
                lihat_list_layanan.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
}