package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class toko_kesehatan extends AppCompatActivity {
    RecyclerView.Adapter adapter;
    RecyclerView recyclerview_tokes;
    RecyclerView recyclerview_beldar;
    private ArrayList<Model_list_tokes_utama> modellisttokes;
    private ArrayList<Model_beldar> modellistbeldar;
    public Button generate_btn;
    public ImageView selanjutnya;
    public CardView search_tokes;
    FrameLayout frameLayout_loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toko_kesehatan);
        getSupportActionBar().setTitle("Toko Kesehatan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        frameLayout_loc=findViewById(R.id.frame_loc);
        frameLayout_loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        toko_kesehatan.this,R.style.ButtomSheetDialogTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.layout_bottom_sheet_alamat, (LinearLayout)findViewById(R.id.bottomSheetContainer)
                );
//                bottomSheetView.findViewById(R.id.batal).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent intent= new Intent(toko_kesehatan.this, toko_kesehatan.class);
//                        startActivity(intent);
//                    }
//                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();

            }
        });




        recyclerview_tokes = findViewById(R.id.recyclerview_tokes);
        recyclerview_beldar = findViewById(R.id.recyclerview_beldar);
        tokes_recycler();
        recyclerview_tokes.setHasFixedSize(true);
        recyclerview_tokes.setLayoutManager(new LinearLayoutManager(this));
        beldar_recycler();
        recyclerview_beldar.setHasFixedSize(true);
        recyclerview_beldar.setLayoutManager(new LinearLayoutManager(this));

        generate_btn = (Button) findViewById(R.id.generate_btn);
        generate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lihat_semua_tokes();
            }

            private void lihat_semua_tokes() {
                Intent intent = new Intent(toko_kesehatan.this, lihat_semua_tokes.class);
                startActivity(intent);

            }
        });
        search_tokes = (CardView) findViewById(R.id.search_tokes);
        search_tokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(toko_kesehatan.this, Search_tokes.class);
                startActivity(intent);
            }
        });
    }

    private void tokes_recycler() {

        ArrayList <Model_list_tokes> modellisttokes = new ArrayList<>();

        modellisttokes.add(new Model_list_tokes(
                "Covid-19",
                "Immune Booster Package (30 Hari)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Immune Booster Package (Economy)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Paket Isolasi Mandiri (Gold)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Paket Isolasi Mandiri (Silver)","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Multivitamns Package","Per-Paket","Rp 200.000",R.drawable.covidpackage,
                "Vitamin C Booster Package","Per-Paket","Rp 200.000",R.drawable.covidpackage));

        modellisttokes.add(new Model_list_tokes(
                "Batuk dan Flu",
                "Coldrexin","Per-Botol","Rp 30.000",R.drawable.batukflu1,
                "Plemex Forte","Per-Botol","Rp 45.000",R.drawable.batukflu2,
                "Ivy Leaf","Per-Botol","Rp 90.000",R.drawable.batukflu3,
                "AnaKonidin (OBH)","Per-Botol","Rp 20.000",R.drawable.batukflu4,
                "KomixHerbal","Per-Box","Rp 15.000",R.drawable.batukflu5,
                "OBH Combi","Per-Botol","Rp 35.000",R.drawable.batukflu6));

        modellisttokes.add(new Model_list_tokes(
                "Demam",
                "Bodrex","Per-box","Rp 15.000",R.drawable.demam1,
                "Paracetamol","Per-Box","Rp 50.000",R.drawable.demam2,
                "Pim-Tra-Kol","Per-Botol","Rp 30.000",R.drawable.demam3,
                "Saridon Triple Action","Per-Strip","Rp 10.000",R.drawable.demam4,
                "Febrol","Per-Botol","Rp 40.000",R.drawable.demam5,
                "Sumagesic","Per-Strip","Rp 7.000",R.drawable.demam6));

        modellisttokes.add(new Model_list_tokes(
                "Watsons Deals",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellisttokes.add(new Model_list_tokes(
                "Vitamin & Suplemen",
                "Propolis Red","Per-Botol","Rp 200.000",R.drawable.obathalodoc1,
                "Propolis Brown","Per-Botol","Rp 200.000",R.drawable.obathalodoc2,
                "Propolis Trio","Per-Botol","Rp 200.000",R.drawable.obathalodoc3,
                "Propolis Ultimate","Per-Botol","Rp 200.000",R.drawable.obathalodoc4,
                "Propolis Immune","Per-Botol","Rp 200.000",R.drawable.obathalodoc5,
                "Propolis Green","Per-Botol","Rp 200.000",R.drawable.obathalodoc6));
        Adapter_list_tokes adapter_dokter = new Adapter_list_tokes(modellisttokes,toko_kesehatan.this);
        recyclerview_tokes.setAdapter(adapter_dokter);

    }

    private void beldar_recycler() {

        ArrayList <Model_beldar> modellistbeldar = new ArrayList<>();

        modellistbeldar.add(new Model_beldar(
                "Nationwide",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Century",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Watsons",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Contact Lenses",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "VIVA",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Erha",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Natural Farm",
                "Propolis Red","Per-Botol","Rp 200.000",R.drawable.obathalodoc1,
                "Propolis Brown","Per-Botol","Rp 200.000",R.drawable.obathalodoc2,
                "Propolis Trio","Per-Botol","Rp 200.000",R.drawable.obathalodoc3,
                "Propolis Ultimate","Per-Botol","Rp 200.000",R.drawable.obathalodoc4,
                "Propolis Immune","Per-Botol","Rp 200.000",R.drawable.obathalodoc5,
                "Propolis Green","Per-Botol","Rp 200.000",R.drawable.obathalodoc6));

        modellistbeldar.add(new Model_beldar(
                "Kawi Jaya",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Optik Internasional",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        modellistbeldar.add(new Model_beldar(
                "Optik Melawai",
                "Pro-Liver","Per-Box","Rp 38.000",R.drawable.tekes1,
                "Redoxon","Per-Box","Rp 25.000",R.drawable.tekes2,
                "Lansoprazole","Per-Box","Rp 60.000",R.drawable.tekes3,
                "Prospan","Per-Botol","Rp 35.000",R.drawable.tekes4,
                "Gokshura","Per-Botol","Rp 200.000",R.drawable.tekes5,
                "Samtacid","Per-Box","Rp 40.000",R.drawable.tekes6));

        Adapter_beldar adapter_beldar = new Adapter_beldar (modellistbeldar,toko_kesehatan.this);
        recyclerview_beldar.setAdapter(adapter_beldar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_riwayat,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.button_riwayat:
                Intent intent= new Intent(toko_kesehatan.this, RiwayatTransaksi.class);
                startActivity(intent);
                break;
            case android.R.id.home:
                finish();
                return true;

        }
        return true;
    }
}