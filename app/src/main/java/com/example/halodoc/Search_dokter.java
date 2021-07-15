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

public class Search_dokter extends AppCompatActivity {

    public ImageView search;
    RecyclerView.Adapter adapter;
    RecyclerView recyclerview_dokter;
    private ArrayList<Model_list_dokter> modellistdokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dokter);
        recyclerview_dokter=findViewById(R.id.recyclerview_dokter);
        dokter_recycler();
        recyclerview_dokter.setHasFixedSize(true);
        recyclerview_dokter.setLayoutManager(new LinearLayoutManager(this));
        search = (ImageView) findViewById(R.id.back_dokter);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Search_dokter.this, chat_dengan_dokter.class);
                startActivity(intent);
            }
        });

    }
    private void dokter_recycler() {
        ArrayList <Model_list_dokter> modellistdokter = new ArrayList<>();
        modellistdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 25.000","Universitas Indonesia","RSCM Cipto M.","123456789", R.drawable.avadoctor3));
        Adapter_search_dokter adapter_dokter = new Adapter_search_dokter(modellistdokter,Search_dokter.this);
        recyclerview_dokter.setAdapter(adapter_dokter);

    }
}