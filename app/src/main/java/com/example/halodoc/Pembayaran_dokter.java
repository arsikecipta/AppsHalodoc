package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Pembayaran_dokter extends AppCompatActivity {
    private TextView tv_nama_dokter, tv_kategori_dokter;
    private Button btn_bayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_pembayaran_dokter);
        tv_nama_dokter= (TextView) findViewById(R.id.nama_dokter);
        tv_kategori_dokter=(TextView)findViewById(R.id.kategori_dokter);

//        btn_bayar = (Button) findViewById(R.id.btn_bayar);
//        btn_bayar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Filter_berdasarkan();
//            }
//
//            private void Filter_berdasarkan() {
//                Intent intent= new Intent(Pembayaran_dokter.this, chat_dengan_dokter.class);
//                startActivity(intent);
//            }
//        });

        //receive data
        Intent intent =getIntent();
        String NamaDokter = intent.getExtras().getString("NamaDokter");
        String KategoriDokter = intent.getExtras().getString("KategoriDokter");


        //setting values
        tv_nama_dokter.setText(NamaDokter);
        tv_kategori_dokter.setText(KategoriDokter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }
  }