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

public class Detail_dokter_spesialis extends AppCompatActivity {

    private TextView tv_nama_dokter, tv_kategori_dokter, tv_tahun, tv_suka, tv_harga, tv_alumni, tv_pratik, tv_str;
    public ImageView img_dokter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Detail Dokter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_detail_dokter_spesialis);
        tv_nama_dokter= (TextView) findViewById(R.id.nama);
        img_dokter=(ImageView)findViewById(R.id.gambar_dokter);
        tv_kategori_dokter=(TextView)findViewById(R.id.kategori);
        tv_tahun=(TextView)findViewById(R.id.tahun_detail);
        tv_suka=(TextView)findViewById(R.id.suka_detail);
        tv_harga=(TextView)findViewById(R.id.harga_detail);
        tv_alumni=(TextView)findViewById(R.id.alumni);
        tv_pratik=(TextView)findViewById(R.id.praktik);
        tv_str=(TextView)findViewById(R.id.str);


        //receive data
        Intent intent =getIntent();
        String NamaDokter = intent.getExtras().getString("NamaDokter1");
        int imageDokter = intent.getExtras().getInt("ImageDokter1");
        String KategoriDokter = intent.getExtras().getString("Kategori1");
        String Tahun = intent.getExtras().getString("Tahun1");
        String Suka = intent.getExtras().getString("Suka1");
        String Harga = intent.getExtras().getString("HargaDokter1");
        String Alumni = intent.getExtras().getString("Alumni1");
        String Praktik = intent.getExtras().getString("Praktik1");
        String STR = intent.getExtras().getString("STR1");




        //setting values
        tv_nama_dokter.setText(NamaDokter);
        img_dokter.setImageResource(imageDokter);
        tv_kategori_dokter.setText(KategoriDokter);
        tv_tahun.setText(Tahun);
        tv_suka.setText(Suka);
        tv_harga.setText(Harga);
        tv_alumni.setText(Alumni);
        tv_pratik.setText(Praktik);
        tv_str.setText(STR);
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
}
