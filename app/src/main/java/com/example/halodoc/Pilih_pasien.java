package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pilih_pasien extends AppCompatActivity {
    ImageView img_ceklis;
    TextView nama_lay, nam_rs, day_1, txt_jam,harga_lay, jam_fix, nama_pasien;
    Button next_detail;
    RadioGroup rg_pasien;
    RadioButton rb_pribadi, rb_keluarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_pasien);
        getSupportActionBar().setTitle("Pilih pasien");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        next_detail = findViewById(R.id.next_detail_pasien);
        next_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Pilih_pasien.this,Detail_pasien.class);
                intent.putExtra("NamaLayanan", nama_lay.getText());
                intent.putExtra("RumahSakitLayanan",nam_rs.getText() );
                intent.putExtra("BiayaLayanan",harga_lay.getText() );
                intent.putExtra("HariTgl",day_1.getText() );
                intent.putExtra("JamJanji",txt_jam.getText() );
                startActivity(intent);
            }
        });

        nama_lay= findViewById(R.id.layanan_name);
        nam_rs=findViewById(R.id.nama_rumahsakit);
        day_1 =findViewById(R.id.hari_fix);
        txt_jam=findViewById(R.id.txt_jam);
        nama_pasien=findViewById(R.id.nama_pasien_regis);

        harga_lay=findViewById(R.id.harga_lay);
        Intent intent =getIntent();
        String namlay = intent.getExtras().getString("NamaLayanan");
        String namRS= intent.getExtras().getString("RumahSakitLayanan");
        String hargalayanan = intent.getExtras().getString("BiayaLayanan");
        String harifix = intent.getExtras().getString("HariTgl");
        String jam_fix = intent.getExtras().getString("JamJanji");
//        String namalengkap = intent.getExtras().getString("NamaLengkap");
        // String JamJanjiMalam=intent.getExtras().getString("JamJanjiMalam");


        nama_lay.setText(namlay);
        nam_rs.setText(namRS);
        harga_lay.setText(hargalayanan);
        day_1.setText(harifix);
//        txt_jam.setText(jam_fix);
//        nama_pasien.setText(namalengkap);
        // txt_jam.setText(JamJanjiMalam);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}