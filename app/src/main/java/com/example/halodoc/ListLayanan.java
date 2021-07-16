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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListLayanan extends AppCompatActivity {
    private TextView tv_namalay, tv_jenislay, tv_namars, tv_alamatrs, tv_biayalay, tv_gambarlay, tv_penjelasan, txt_namalay;
    private ImageView imglay;
    TextView nama_gone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layanan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nama_gone=findViewById(R.id.nama_gone);
        tv_namalay=(TextView)findViewById(R.id.nama_list_layanan);
        tv_jenislay=(TextView)findViewById(R.id.jenis_list_layanan);
        tv_namars=(TextView)findViewById(R.id.layanan_list_rumahsakit);
        tv_alamatrs=(TextView)findViewById(R.id.layanan_list_alamat_rs);
        tv_biayalay=(TextView)findViewById(R.id.list_biaya_layanan);
        imglay=(ImageView)findViewById(R.id.imageview_list_layanan);
        tv_penjelasan=(TextView) findViewById(R.id.txt_penjelasanlay);
        txt_namalay=(TextView)findViewById(R.id.nama_layananrs);
        RecyclerView recyclerView_list_layanan =findViewById(R.id.recyclerview_list_layanan);
//        recyclerView_list_layanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(ListLayanan.this, Jadwal_janji.class);
//                intent.putExtra("NamaLengkap",nama_gone.getText());
//                startActivity(intent);
//            }
//        });
        recyclerView_list_layanan.setHasFixedSize(true);
        recyclerView_list_layanan.setLayoutManager(new LinearLayoutManager(this));

        //receive data
        Intent intent =getIntent();
        String namaLayanan = intent.getExtras().getString("NamaLayanan");
//        String namalengkap =intent.getExtras().getString("NamaLengkap");
//        nama_gone.setText(namalengkap);
        getSupportActionBar().setTitle(namaLayanan);
        String jenisLayanan = intent.getExtras().getString("JenisLayanan");
        String namaRS = intent.getExtras().getString("RumahSakitLayanan");
        String alamatRS = intent.getExtras().getString("AlamatLayanan");
        String biayaLayanan = intent.getExtras().getString("BiayaLayanan");
        int imageLayanan = intent.getExtras().getInt("GambarLayanan");
        String penjelasanlay = intent.getExtras().getString("PenjelasanLayanan");
        tv_penjelasan.setText(penjelasanlay);
        txt_namalay.setText(namaLayanan);

        ArrayList<model_layanan> modelListLayanan = new ArrayList<>();
        modelListLayanan.add(new model_layanan(namaLayanan, jenisLayanan,namaRS,alamatRS,biayaLayanan,imageLayanan,penjelasanlay));
        Adapter_list_layanan adapterListLayanan = new Adapter_list_layanan(modelListLayanan, ListLayanan.this);
        recyclerView_list_layanan.setAdapter(adapterListLayanan);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.share_button:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody="Your body Here!";
                String shareSubject ="Your subject here!";
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);
                intent.putExtra(Intent.EXTRA_SUBJECT,shareSubject);
                startActivity(Intent.createChooser(intent,"Share Using"));
                break;
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }
}