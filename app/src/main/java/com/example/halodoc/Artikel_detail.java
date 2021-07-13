package com.example.halodoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Artikel_detail extends AppCompatActivity {
    private TextView tv_judul_artikel, tv_topik_artikel, tv_dokter_artikel, tv_paragraph1, tv_paragraph2, tv_paragraph3;
    private ImageView img_artikel_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_detail_artikel);
        tv_judul_artikel= (TextView) findViewById(R.id.judul_artikel_detail);
        img_artikel_detail=(ImageView)findViewById(R.id.image_artikel_detail);
        tv_topik_artikel=(TextView)findViewById(R.id.artikel_topik_detail);
        tv_dokter_artikel=(TextView)findViewById(R.id.nama_dokter_penulis);
        tv_paragraph1=(TextView)findViewById(R.id.paragraph1);


        //receive data
        Intent intent =getIntent();
        String judulArtikel = intent.getExtras().getString("JudulArtikel");
        int imageArtikel = intent.getExtras().getInt("FotoArtikel");
        String topikArtikel = intent.getExtras().getString("TopikArtikel");
        getSupportActionBar().setTitle(topikArtikel);
        String dokterArtikel = intent.getExtras().getString("DokterArtikel");
        String isiArtikel = intent.getExtras().getString("IsiParagraph");




        //setting values
        tv_judul_artikel.setText(judulArtikel);
        img_artikel_detail.setImageResource(imageArtikel);
        tv_topik_artikel.setText(topikArtikel);
        tv_dokter_artikel.setText(dokterArtikel);
        tv_paragraph1.setText(isiArtikel);

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