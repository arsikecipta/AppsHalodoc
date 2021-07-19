package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Keranjang_tokes extends AppCompatActivity {

    public TextView tv_nama_obat, tv_jenis, tv_harga_obat;
    private ImageView tv_image;
    private Button btn_bayar, btn_ubah;
    private ImageView tv_additem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Keranjang");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_keranjang_tokes);
        tv_nama_obat = (TextView) findViewById(R.id.nama_obat);
        tv_jenis = (TextView) findViewById(R.id.jenis);
        tv_harga_obat =(TextView)findViewById(R.id.harga_obat);
        tv_image = (ImageView) findViewById(R.id.image_obat);

        btn_ubah=(Button)findViewById(R.id.btn_ubah);
        btn_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        Keranjang_tokes.this,R.style.ButtomSheetDialogTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext()).inflate(
                        R.layout.activity_address_tokes, (LinearLayout)findViewById(R.id.bottomSheetContainer)
                );
//                bottomSheetView.findViewById(R.id.batal).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Intent intent= new Intent(Keranjang_tokes.this, Keranjang_tokes.class);
//                        startActivity(intent);
//                    }
//                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();

            }
        });

        //receive data
        Intent intent =getIntent();
        String NamaObat1 = intent.getExtras().getString("NamaObat1");
        String Jenis1 = intent.getExtras().getString("Jenis1");
        String HargaObat1 = intent.getExtras().getString("HargaObat1");
        int ImageObat1 = intent.getExtras().getInt("ImageObat1");

        //setting values
        tv_nama_obat.setText(NamaObat1);
        tv_jenis.setText(Jenis1);
        tv_harga_obat.setText(HargaObat1);
        tv_image.setImageAlpha(ImageObat1);

        btn_bayar =(Button) findViewById(R.id.btn_bayar);
        btn_bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pembayaran_tokes();
            }

            private void Pembayaran_tokes() {
                Intent intent= new Intent(Keranjang_tokes.this, Pembayaran_tokes.class);
                intent.putExtra("HargaObat1", tv_harga_obat.getText());
                startActivity(intent);

            }
        });

        tv_additem = (ImageView) findViewById(R.id.additem);
        tv_additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toko_kesehatan();
            }

            private void toko_kesehatan() {
                Intent intent= new Intent(Keranjang_tokes.this, toko_kesehatan.class);
                startActivity(intent);

            }
        });


//        int ImageObat1 = intent.getExtras().getInt("ImageObat1");

//        String NamaObat2 = intent.getExtras().getString("NamaObat2");
//        String Jenis2 = intent.getExtras().getString("Jenis2");
//        String HargaObat2 = intent.getExtras().getString("HargaObat2");
//
//        String NamaObat3 = intent.getExtras().getString("NamaObat3");
//        String Jenis3 = intent.getExtras().getString("Jenis3");
//        String HargaObat3 = intent.getExtras().getString("HargaObat3");
//
//        String NamaObat4 = intent.getExtras().getString("NamaObat4");
//        String Jenis4 = intent.getExtras().getString("Jenis4");
//        String HargaObat4 = intent.getExtras().getString("HargaObat4");
//
//        String NamaObat5 = intent.getExtras().getString("NamaObat5");
//        String Jenis5 = intent.getExtras().getString("Jenis5");
//        String HargaObat5 = intent.getExtras().getString("HargaObat5");
//
//        String NamaObat6 = intent.getExtras().getString("NamaObat6");
//        String Jenis6 = intent.getExtras().getString("Jenis6");
//        String HargaObat6 = intent.getExtras().getString("HargaObat6");



//        tv_image.setImageResource(ImageObat1);

//        tv_nama_obat.setText(NamaObat2);
//        tv_jenis.setText(Jenis2);
//        tv_harga_obat.setText(HargaObat2);
//
//        tv_nama_obat.setText(NamaObat3);
//        tv_jenis.setText(Jenis3);
//        tv_harga_obat.setText(HargaObat3);
//
//        tv_nama_obat.setText(NamaObat4);
//        tv_jenis.setText(Jenis4);
//        tv_harga_obat.setText(HargaObat4);
//
//        tv_nama_obat.setText(NamaObat5);
//        tv_jenis.setText(Jenis5);
//        tv_harga_obat.setText(HargaObat5);
//
//        tv_nama_obat.setText(NamaObat6);
//        tv_jenis.setText(Jenis6);
//        tv_harga_obat.setText(HargaObat6);

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