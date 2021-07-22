package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Detail_produk_tokes extends AppCompatActivity {
    private TextView tv_nama_obat, tv_jenis, tv_harga_obat,
            tv_indikasi, tv_frekuensi, tv_aturan, tv_noregist, value;
    public ImageView image_obat;
    public Button btn_keranjang;

    int count= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_detail_produk);
        tv_nama_obat= (TextView) findViewById(R.id.obat);
        image_obat=(ImageView)findViewById(R.id.gambar_dokter);
        tv_jenis=(TextView)findViewById(R.id.kategori);
        tv_harga_obat=(TextView)findViewById(R.id.hargakategori);
        tv_indikasi=(TextView)findViewById(R.id.indikasi);
        tv_frekuensi=(TextView)findViewById(R.id.frekuensi);
        tv_aturan=(TextView)findViewById(R.id.aturan);
        tv_noregist=(TextView)findViewById(R.id.noregist);
        value = (TextView) findViewById(R.id.value);

        btn_keranjang =(Button) findViewById(R.id.btn_keranjang);
        btn_keranjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Keranjang_tokes();
            }

            private void Keranjang_tokes() {
                Intent intent= new Intent(Detail_produk_tokes.this, Keranjang_tokes.class);
                intent.putExtra("NamaObat1", tv_nama_obat.getText());
                intent.putExtra("Jenis1", tv_jenis.getText());
                intent.putExtra("HargaObat1", tv_harga_obat.getText());
                intent.putExtra("ImageObat1", image_obat.getImageAlpha());
                intent.putExtra("JumlahObat", value.getText());
                startActivity(intent);

            }
        });



        //receive data
        Intent intent =getIntent();
        String JudulKategori = intent.getExtras().getString("JudulKategori");
        String NamaObat1 = intent.getExtras().getString("NamaObat1");
        getSupportActionBar().setTitle(NamaObat1);
        int ImageObat1 = intent.getExtras().getInt("ImageObat1");
        String Jenis1 = intent.getExtras().getString("Jenis1");
        String HargaObat1 = intent.getExtras().getString("HargaObat1");
        String Indikasi1 = intent.getExtras().getString("Indikasi1");
        String Frekuensi1 = intent.getExtras().getString("Frekuensi1");
        String Aturan1 = intent.getExtras().getString("Aturan1");
        String NoRegist1= intent.getExtras().getString("NoRegist1");

//        String NamaObat2 = intent.getExtras().getString("NamaObat2");
//        int ImageObat2 = intent.getExtras().getInt("ImageObat2");
//        String Jenis2 = intent.getExtras().getString("Jenis2");
//        String HargaObat2 = intent.getExtras().getString("HargaObat2");
//        String Indikasi2 = intent.getExtras().getString("Indikasi2");
//        String Frekuensi2 = intent.getExtras().getString("Frekuensi2");
//        String Aturan2 = intent.getExtras().getString("Aturan2");
//        String NoRegist2 = intent.getExtras().getString("NoRegist2");
//
//        String NamaObat3 = intent.getExtras().getString("NamaObat3");
//        int ImageObat3 = intent.getExtras().getInt("ImageObat3");
//        String Jenis3 = intent.getExtras().getString("Jenis3");
//        String HargaObat3 = intent.getExtras().getString("HargaObat3");
//        String Indikasi3 = intent.getExtras().getString("Indikasi3");
//        String Frekuensi3 = intent.getExtras().getString("Frekuensi3");
//        String Aturan3 = intent.getExtras().getString("Aturan3");
//        String NoRegist3 = intent.getExtras().getString("NoRegist3");
//
//        String NamaObat4 = intent.getExtras().getString("NamaObat4");
//        int ImageObat4 = intent.getExtras().getInt("ImageObat4");
//        String Jenis4 = intent.getExtras().getString("Jenis4");
//        String HargaObat4 = intent.getExtras().getString("HargaObat4");
//        String Indikasi4 = intent.getExtras().getString("Indikasi4");
//        String Frekuensi4 = intent.getExtras().getString("Frekuensi4");
//        String Aturan4 = intent.getExtras().getString("Aturan4");
//        String NoRegist4 = intent.getExtras().getString("NoRegist4");
//
//        String NamaObat5 = intent.getExtras().getString("NamaObat5");
//        int ImageObat5 = intent.getExtras().getInt("ImageObat5");
//        String Jenis5 = intent.getExtras().getString("Jenis5");
//        String HargaObat5 = intent.getExtras().getString("HargaObat5");
//        String Indikasi5 = intent.getExtras().getString("Indikasi5");
//        String Frekuensi5 = intent.getExtras().getString("Frekuensi5");
//        String Aturan5 = intent.getExtras().getString("Aturan5");
//        String NoRegist5 = intent.getExtras().getString("NoRegist5");
//
//        String NamaObat6 = intent.getExtras().getString("NamaObat6");
//        int ImageObat6 = intent.getExtras().getInt("ImageObat6");
//        String Jenis6 = intent.getExtras().getString("Jenis6");
//        String HargaObat6 = intent.getExtras().getString("HargaObat6");
//        String Indikasi6 = intent.getExtras().getString("Indikasi6");
//        String Frekuensi6 = intent.getExtras().getString("Frekuensi6");
//        String Aturan6 = intent.getExtras().getString("Aturan6");
//        String NoRegist6 = intent.getExtras().getString("NoRegist6");



        //setting values
        tv_nama_obat.setText(NamaObat1);
        image_obat.setImageResource(ImageObat1);
        tv_jenis.setText(Jenis1);
        tv_harga_obat.setText(HargaObat1);
        tv_indikasi.setText(Indikasi1);
        tv_frekuensi.setText(Frekuensi1);
        tv_aturan.setText(Aturan1);
        tv_noregist.setText(NoRegist1);


//        tv_nama_obat.setText(NamaObat2);
//        image_obat.setImageResource(ImageObat2);
//        tv_jenis.setText(Jenis2);
//        tv_harga_obat.setText(HargaObat2);
//        tv_indikasi.setText(Indikasi2);
//        tv_frekuensi.setText(Frekuensi2);
//        tv_aturan.setText(Aturan2);
//        tv_noregist.setText(NoRegist2);
//
//        tv_nama_obat.setText(NamaObat3);
//        image_obat.setImageResource(ImageObat3);
//        tv_jenis.setText(Jenis3);
//        tv_harga_obat.setText(HargaObat3);
//        tv_indikasi.setText(Indikasi3);
//        tv_frekuensi.setText(Frekuensi3);
//        tv_aturan.setText(Aturan3);
//        tv_noregist.setText(NoRegist3);
//
//
//        tv_nama_obat.setText(NamaObat4);
//        image_obat.setImageResource(ImageObat4);
//        tv_jenis.setText(Jenis4);
//        tv_harga_obat.setText(HargaObat4);
//        tv_indikasi.setText(Indikasi4);
//        tv_frekuensi.setText(Frekuensi4);
//        tv_aturan.setText(Aturan4);
//        tv_noregist.setText(NoRegist4);
//
//
//        tv_nama_obat.setText(NamaObat5);
//        image_obat.setImageResource(ImageObat5);
//        tv_jenis.setText(Jenis5);
//        tv_harga_obat.setText(HargaObat5);
//        tv_indikasi.setText(Indikasi5);
//        tv_frekuensi.setText(Frekuensi5);
//        tv_aturan.setText(Aturan5);
//        tv_noregist.setText(NoRegist5);
//
//
//        tv_nama_obat.setText(NamaObat6);
//        image_obat.setImageResource(ImageObat6);
//        tv_jenis.setText(Jenis6);
//        tv_harga_obat.setText(HargaObat6);
//        tv_indikasi.setText(Indikasi6);
//        tv_frekuensi.setText(Frekuensi6);
//        tv_aturan.setText(Aturan6);
//        tv_noregist.setText(NoRegist6);


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

    public void increament(View view) {
        count++;
        value.setText(""+count);
    }

    public void decreament(View view) {
        if (count <=0) count = 0;
        else
        count--;
        value.setText(""+count);
    }
}