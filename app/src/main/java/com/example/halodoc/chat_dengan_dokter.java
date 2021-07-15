package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class chat_dengan_dokter extends AppCompatActivity {
    RecyclerView.Adapter adapter;
    RecyclerView recyclerview_dokter;
    RecyclerView recyclerview_divider;
    private ArrayList <Model_list_dokter> modellistdokter;
    private ArrayList <Model_list_divider_all> modellist;
    public Button generate_btn;
    public Button generate_btn2;
    public CardView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dengan_dokter);
        getSupportActionBar().setTitle("Chat Dengan Dokter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerview_dokter=findViewById(R.id.recyclerview_dokter);
        recyclerview_divider=findViewById(R.id.recyclerview_divider);
        recyclerview_divider.setNestedScrollingEnabled(true);
        spesialisasi_recycler();
        recyclerview_divider.setHasFixedSize(true);
        recyclerview_divider.setLayoutManager(new LinearLayoutManager(this));
        dokter_recycler();
        recyclerview_dokter.setHasFixedSize(true);
        recyclerview_dokter.setLayoutManager(new LinearLayoutManager(this));
        generate_btn=(Button) findViewById(R.id.generate_btn);
        generate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lihat_semua_dokter();
            }

            private void lihat_semua_dokter() {
                Intent intent= new Intent(chat_dengan_dokter.this, lihat_semua_dokter.class);
                startActivity(intent);

            }
        });
        generate_btn2=(Button) findViewById(R.id.generate_btn2);
        generate_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Lihat_dokter_spesialisasi();
            }

            private void Lihat_dokter_spesialisasi() {
                Intent intent= new Intent(chat_dengan_dokter.this, Lihat_dokter_spesialisasi.class);
                startActivity(intent);

            }
        });
        search = (CardView) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(chat_dengan_dokter.this, Search_dokter.class);
                startActivity(intent);
            }
        });
    }

    private void spesialisasi_recycler() {

        ArrayList <Model_list_divider_all> modellist = new ArrayList<>();

        modellist.add(new Model_list_divider_all("Covid-19","Cegah di awal yuk..",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modellist.add(new Model_list_divider_all("Dokter Umum","Periksa kesehatanmu sekarang",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modellist.add(new Model_list_divider_all("Spesialis Kandungan","Periksa kandunganmu kapan aja",
                "dr Febbyola Ramanda","Spesialis Kandungan", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Spesialis Kandungan", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Spesialis Kandungan", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Spesialis Kandungan", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Spesialis Kandungan"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Spesialis Kandungan", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modellist.add(new Model_list_divider_all("Spesialis Kulit","Kesehatan kulit tubuh itu penting lho..",
                "dr Febbyola Ramanda","Spesialis Kulit", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Spesialis Kulit", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Spesialis Kulit", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Spesialis Kulit", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Spesialis Kulit"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Spesialis Kulit", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modellist.add(new Model_list_divider_all("Psikologi Klinis","Butuh curhat? yuk cerita sama kami",
                "dr Febbyola Ramanda","Psikologi Klinis", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Psikologi Klinis", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Psikologi Klinis", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Psikologi Klinis", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Psikologi Klinis"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Psikologi Klinis", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        Adapter_list_divider_all adapter_divider = new Adapter_list_divider_all(modellist,chat_dengan_dokter.this);
        recyclerview_divider.setAdapter(adapter_divider);

    }

    private void dokter_recycler() {
        ArrayList <Model_list_dokter> modellistdokter = new ArrayList<>();
        modellistdokter.add(new Model_list_dokter("dr Febbyola Ramanda","Dokter Umum","10 Tahun","99.0%","Rp 25.000","Universitas Indonesia","RSCM Cipto M.","123456789", R.drawable.avadoctor3));
        modellistdokter.add(new Model_list_dokter("dr Zarni Jamali","Dokter Umum", "20 Tahun", "99,0%", "Rp 30.000", "Universitas Negeri Solo","RS Sari Asih","123456789",R.drawable.avadoctor1));
        Adapter_chat_dengan_dokter adapter_dokter = new Adapter_chat_dengan_dokter(modellistdokter,chat_dengan_dokter.this);
        recyclerview_dokter.setAdapter(adapter_dokter);

    }

}