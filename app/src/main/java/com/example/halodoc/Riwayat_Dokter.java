package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Riwayat_Dokter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat_dokter);
        getSupportActionBar().setTitle("Riwayat Transaksi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}