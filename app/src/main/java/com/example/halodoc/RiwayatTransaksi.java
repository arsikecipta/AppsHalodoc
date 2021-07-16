package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RiwayatTransaksi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_transaksi);
        getSupportActionBar().setTitle("Riwayat Transaksi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}