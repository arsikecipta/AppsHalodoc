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

public class Pembayaran_tokes extends AppCompatActivity {

    private TextView tv_harga;
    private Button btn_bayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_pembayaran_tokes);
        tv_harga =(TextView)findViewById(R.id.hartot_detail);

//        btn_bayar = (Button) findViewById(R.id.btn_bayar);
//        btn_bayar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Bayar();
//            }
//
//            private void Bayar() {
//                Intent intent= new Intent(Pembayaran_tokes.this, toko_kesehatan.class);
//                startActivity(intent);
//            }
//        });


        //receive data
        Intent intent =getIntent();
        String HargaObat = intent.getExtras().getString("HargaObat1");


        //setting values
        tv_harga.setText(HargaObat);
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