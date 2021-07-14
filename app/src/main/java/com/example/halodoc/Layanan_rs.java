package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Layanan_rs extends AppCompatActivity {
    private TextView tv_namars, tv_descriprs,tv_jenisrs, txt_layanan, txt_alamatRS, txt_infoRs, txt_penjelasan1, txt_penjelasan2;
    private ImageView img, imageView_layanan, imageView_layanan2;
    private ArrayList<model_layanan> ArrayListModel;
    CardView cardView_lay;
    RecyclerView layanan_recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan_rs);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        layanan_recycler = findViewById(R.id.recyclerview_layanan);
        layanan_recycler.setHasFixedSize(true);
        layanan_recycler.setLayoutManager(new LinearLayoutManager(this));

        tv_namars = (TextView) findViewById(R.id.nama_rs);
        tv_jenisrs = (TextView) findViewById(R.id.jenisrs);
        img = (ImageView) findViewById(R.id.foto_rs);
        txt_alamatRS = (TextView) findViewById(R.id.alamatrs);
        txt_infoRs = (TextView) findViewById(R.id.info_rs);
        imageView_layanan = (ImageView) findViewById(R.id.imageview_layanan);
        txt_layanan = (TextView) findViewById(R.id.nama_lay);
        txt_penjelasan1=(TextView)findViewById(R.id.penjelasan_layanan);


        //receive data
        Intent intent = getIntent();
        String nama_rs = intent.getExtras().getString("NamaRS");
        getSupportActionBar().setTitle(nama_rs);

        String jenis_rs = intent.getExtras().getString("JenisRS");
        String alamat_rs = intent.getExtras().getString("AlamatRS");
        String info_rs = intent.getExtras().getString("InfoRS");
        int image_rs = intent.getExtras().getInt("FotoRS");
        int img_lay = intent.getExtras().getInt("FotoLayanan");
        int img_layanan2 = intent.getExtras().getInt("FotoLayanan2");
        String txt_layanan1 = intent.getExtras().getString("NamaLayanan");
        String txt_layanan2 = intent.getExtras().getString("NamaLayanan2");
        String txt_penjelasan1=intent.getExtras().getString("Penjelasan1");
        String txt_penjelasan2=intent.getExtras().getString("Penjelasan2");
        String txt_jenislay=intent.getExtras().getString("Jenislayanan");
        String txt_jenislay2=intent.getExtras().getString("Jenislayanan2");
        String txt_hargalay=intent.getExtras().getString("Hargalayanan");
        String txt_hargalay2=intent.getExtras().getString("Hargalayanan2");
        //setting values
        tv_namars.setText(nama_rs);
        tv_jenisrs.setText(jenis_rs);
        img.setImageResource(image_rs);
        txt_alamatRS.setText(alamat_rs);
        txt_infoRs.setText(info_rs);



        ArrayList<model_layanan> modelLayanan = new ArrayList<>();
        modelLayanan.add(new model_layanan(txt_layanan1, txt_jenislay,nama_rs,alamat_rs,txt_hargalay,img_lay,txt_penjelasan1));
        modelLayanan.add(new model_layanan(txt_layanan2, txt_jenislay2,nama_rs,alamat_rs,txt_hargalay2,img_layanan2,txt_penjelasan2));

        Adapter_layanan adapterLayanan=new Adapter_layanan(modelLayanan,Layanan_rs.this);
        layanan_recycler.setAdapter(adapterLayanan);

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