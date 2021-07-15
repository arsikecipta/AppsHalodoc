package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Search_tokes extends AppCompatActivity {

    public ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_tokes);
        search = (ImageView) findViewById(R.id.back_tokes);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Search_tokes.this, toko_kesehatan.class);
                startActivity(intent);
            }
        });
        RecyclerView recyclerView =findViewById(R.id.recyclerview_tokes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Model_search_tokes> modellistokes = new ArrayList<>();
        modellistokes.add(new Model_search_tokes(
                "Propolis Red","Per-Botol","Rp 200.000","Meningkatkan sistem kekebalan tubuh", "terutama pada orang yang rentan terhadap penyakit.","Dewasa: 1 tablet sebanyak 2 kali/hari.","Sebaiknya dikonsumsi saat perut kosong atau 30 menit sebelum makan.",R.drawable.obathalodoc1));
        Adapter_search_tokes adapter_divider = new Adapter_search_tokes (modellistokes, Search_tokes.this);
        recyclerView.setAdapter(adapter_divider);

    }
}