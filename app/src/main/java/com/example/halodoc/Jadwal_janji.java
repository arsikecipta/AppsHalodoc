package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class Jadwal_janji extends AppCompatActivity {
    private TextView namalay_rs, jenis_lay,alamatlay, namars_lay, hargalay;
    ImageView imglay;

    private int white, darkBlack,red;
    CardView layout_expand , layout_expand2,cardView_expand,cardView_expand2, cardView_btn1, cardView_btn2, cardView_btn3;
    Button btn_expand, btn_jadwal_janji, btn_expand2;
    private Button btn_7, btn_8, btn_9, btn_10,btn_11;
    private String selectedFilter="all";
    ArrayList<model_layanan> modelLayanan;
    TextView nama_gone;
    RadioGroup radioGroup, radioGroup_jam, radioGroup_jam_malam;
    RadioButton radioButton, radioButton_jam,radioButton_jam_malam;
    TextView textView_hari, textView_jam, txt_hari_bayar, txt_jam_bayar,txt_paket, txt_desc;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Jadwal Janji RS");
        setContentView(R.layout.activity_jadwal_janji);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        radioGroup=(RadioGroup)findViewById(R.id.tanggal_janji);
        radioGroup_jam=(RadioGroup)findViewById(R.id.jam_janji);


        txt_paket=findViewById(R.id.text_paket);
        txt_desc=findViewById(R.id.text_desc);

        nama_gone=findViewById(R.id.nama_gone);
//        radioGroup_jam_malam=findViewById(R.id.pilih_jam);
//        textView_hari=findViewById(R.id.hari_fix);
//        textView_jam=findViewById(R.id.txt_jam);
//        textView_hari=findViewById(R.id.hari_fix);
//        textView_jam=findViewById(R.id.txt_jam);
//        txt_hari_bayar=findViewById(R.id.pembayaran_hari);
//        txt_jam_bayar=findViewById(R.id.pembayaran_jam);

        namalay_rs = (TextView)findViewById(R.id.layanan_name);
        jenis_lay=(TextView)findViewById(R.id.jenis_layrs);
        namars_lay=(TextView)findViewById(R.id.nama_rs_lay);
        alamatlay=(TextView) findViewById(R.id.alamat_rs_lay);
        imglay=(ImageView)findViewById(R.id.foto_layanan);
        hargalay=(TextView) findViewById(R.id.hargalay);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 =(Button)findViewById(R.id.btn_8);
        btn_9 =(Button)findViewById(R.id.btn_9);
        btn_jadwal_janji=(Button)findViewById(R.id.btn_jadwal_janji) ;


        Intent intent =getIntent();
        String nama_rs_lay = intent.getExtras().getString("NamaLayanan");
//        String namalengkap =intent.getExtras().getString("NamaLengkap");

        getSupportActionBar().setTitle(nama_rs_lay);
        String jenis_rs_lay = intent.getExtras().getString("JenisLayanan");
        String nama_rs = intent.getExtras().getString("RumahSakitLayanan");
        String alamat_rs_lay =intent.getExtras().getString("AlamatLayanan");
        int image_rs_lay = intent.getExtras().getInt("GambarLayanan");
        String harga_lay = intent.getExtras().getString("BiayaLayanan");
        String penjelasan_lay =intent.getExtras().getString("PenjelasanLayanan");

        namalay_rs.setText(nama_rs_lay);
        jenis_lay.setText(jenis_rs_lay);
        namars_lay.setText(nama_rs);
        alamatlay.setText(alamat_rs_lay);
        imglay.setImageResource(image_rs_lay);
        hargalay.setText(harga_lay);
        txt_paket.setText(nama_rs_lay);
        txt_desc.setText(penjelasan_lay);
//        nama_gone.setText(namalengkap);

//        RecyclerView recyclerView = findViewById(R.id.recyclerview_jadwal);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cardView_expand= findViewById(R.id.card_expand);
        layout_expand = findViewById(R.id.layout_expand);
        btn_expand=findViewById(R.id.btn_expand);
        cardView_expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(layout_expand.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView_expand, new AutoTransition());
                    layout_expand.setVisibility(View.VISIBLE);
                    btn_expand.setBackgroundResource(R.drawable.ic_drop_up);
                }else{
                    TransitionManager.beginDelayedTransition(cardView_expand, new AutoTransition());
                    layout_expand.setVisibility(View.GONE);
                    btn_expand.setBackgroundResource(R.drawable.ic_arrow);
                }
                TransitionManager.beginDelayedTransition(cardView_expand2, new AutoTransition());
                layout_expand2.setVisibility(View.GONE);
                btn_expand2.setBackgroundResource(R.drawable.ic_arrow);
            }
        });
//        cardView_expand2= findViewById(R.id.card_expand2);
//        layout_expand2= findViewById(R.id.layout_expand_malam);
//        btn_expand2=findViewById(R.id.btn_expand2);
//        cardView_expand2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(layout_expand2.getVisibility()==View.GONE){
//                    TransitionManager.beginDelayedTransition(cardView_expand2, new AutoTransition());
//                    layout_expand2.setVisibility(View.VISIBLE);
//                    btn_expand2.setBackgroundResource(R.drawable.ic_drop_up);
//                }else{
//                    TransitionManager.beginDelayedTransition(cardView_expand2, new AutoTransition());
//                    layout_expand2.setVisibility(View.GONE);
//                    btn_expand2.setBackgroundResource(R.drawable.ic_arrow);
//                }
//                TransitionManager.beginDelayedTransition(cardView_expand, new AutoTransition());
//                layout_expand.setVisibility(View.GONE);
//                btn_expand.setBackgroundResource(R.drawable.ic_arrow);
//            }
//        });

        Button btn_date;
        final TextView tanggal_fix =(TextView) findViewById(R.id.tanggal_fix);
        Button button_tgl = (Button)findViewById(R.id.tanggal_picker);
        // Button btn_jadwal = (Button)findViewById(R.id.btn_jadwal_janji);
        Calendar calendar = Calendar.getInstance();
        final int day = calendar.get(Calendar.DAY_OF_MONTH);
        final int month = calendar.get(Calendar.MONTH);
        final int year = calendar.get(Calendar.YEAR);
        button_tgl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Jadwal_janji.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayofMonth) {
                        String date = dayofMonth+"/"+month+"/"+year;
                        tanggal_fix.setText(date);
                    }
                },year,month,day);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis()-1000);
                datePickerDialog.show();
            }
        });

        btn_jadwal_janji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                int radioId_jam = radioGroup_jam.getCheckedRadioButtonId();
                radioButton_jam = findViewById(radioId_jam);
                if(radioGroup.getCheckedRadioButtonId()==-1 )
                {

                    Toast.makeText(getApplicationContext(), "Mohon pilih tanggal dan waktu kunjungan!", Toast.LENGTH_SHORT).show();
                }else if(radioGroup_jam.getCheckedRadioButtonId()==-1 ) {

                    Toast.makeText(getApplicationContext(), "Mohon pilih tanggal dan waktu kunjungan!", Toast.LENGTH_SHORT).show();
                }else if(radioGroup.getCheckedRadioButtonId()==-1 && radioGroup_jam.getCheckedRadioButtonId()==-1){

                    Toast.makeText(getApplicationContext(), "Mohon pilih tanggal dan waktu kunjungan!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btn_jadwal_janji.setBackgroundResource(R.drawable.primary_button);
                    btn_jadwal_janji.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorWhite));
                    Intent i = new Intent(Jadwal_janji.this, Pilih_pasien.class);

//                if(radioButton.isChecked() && radioButton_jam.isChecked())  {
//                 btn_jadwal_janji.setEnabled(true);
//             }
                    //         btn_jadwal_janji.setEnabled(!radioButton.isChecked() && !radioButton_jam.isChecked());
//                    int radioId_jam_malam =radioGroup_jam_malam.getCheckedRadioButtonId();
//                    radioButton_jam_malam=findViewById(radioId_jam_malam);
                    i.putExtra("HariTgl", radioButton.getText());
                    i.putExtra("JamJanji", radioButton_jam.getText());
                    //i.putExtra("JamJanjiMalam",radioButton_jam_malam.getText());
                    i.putExtra("NamaLayanan", namalay_rs.getText());
                    i.putExtra("RumahSakitLayanan", namars_lay.getText());
                    i.putExtra("BiayaLayanan", hargalay.getText());
//                    i.putExtra("NamaLengkap", nama_gone.getText());
                    startActivity(i);

                }

            }});


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