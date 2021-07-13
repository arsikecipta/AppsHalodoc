package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Pembayaran extends AppCompatActivity {
    TextView nama_lay, nam_rs, harga_lay, harga_medis, total_pembayaran, hari_pembayaran, jam_pembayaran, totalpembayaran_fix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
        getSupportActionBar().setTitle("Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nama_lay= findViewById(R.id.nama_layanan_bayar);
        nam_rs=findViewById(R.id.namars_bayar);
        harga_lay=findViewById(R.id.hargalay_bayar);
        harga_medis=findViewById(R.id.biayamedis);
        total_pembayaran=findViewById(R.id.totalpembayaran);
        hari_pembayaran=findViewById(R.id.pembayaran_hari);
        jam_pembayaran=findViewById(R.id.pembayaran_jam);
        totalpembayaran_fix= findViewById(R.id.totalpembayaran_fix);

        Intent intent =getIntent();
        String namlay = intent.getExtras().getString("NamaLayanan");
        String namRS= intent.getExtras().getString("RumahSakitLayanan");
        String hargalayanan = intent.getExtras().getString("BiayaLayanan");
        String harifix_bayar = intent.getExtras().getString("HariTgl");
        String jamfix_bayar = intent.getExtras().getString("JamJanji");


        nama_lay.setText(namlay);
        nam_rs.setText(namRS);
        harga_lay.setText(hargalayanan);
        harga_medis.setText(hargalayanan);
        total_pembayaran.setText(hargalayanan);
        hari_pembayaran.setText(harifix_bayar);
        jam_pembayaran.setText(jamfix_bayar);
        totalpembayaran_fix.setText(hargalayanan);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}