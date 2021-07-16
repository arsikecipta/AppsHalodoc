package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Lihat_dokter_spesialisasi extends AppCompatActivity {
    private Adapter_list_divider_spesialisasi adapter_divider;
    private List<Model_list_divider_all> modelListDokter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_dokter_spesialisasi);

        getSupportActionBar().setTitle("Chat Dengan Dokter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Lihat_judul_spesialisasi();
        setUpRecyclerSpesialis();




//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Anak","Jangan khawatir bun.. yukk chat kami"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Penyakit dalam","Pantau kesehatanmu sekarang"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis THT","Pantau kesehatanmu sekarang"));
//        modellistspesialisasi.add(new Model_list_divider_all("Dokter Gigi","Kesehatan gigi itu penting loh.."));
//        modellistspesialisasi.add(new Model_list_divider_all("Kedokteran Jiwa","Tenang.. kami siap membantumu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Seksologi","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis bedah","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Saraf","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Dokter Hewan","Kesehatan peliharaanmu penting loh.."));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Jantung","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Laktasi","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Program Hamil","Jangan khawatir.. kami siap bantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Mata","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Kesehatan Paru","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialis Gizi Klinik","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Hukum Kesehatan","Yuk chat.. kami siap membantu"));
//        modellistspesialisasi.add(new Model_list_divider_all("Spesialisasi lainya","Yuk chat.. kami siap membantu"));


    }

    private void Lihat_judul_spesialisasi() {

        modelListDokter = new ArrayList<>();

        modelListDokter.add(new Model_list_divider_all("Covid-19","Cegah di awal yuk..",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor2));

        modelListDokter.add(new Model_list_divider_all("Dokter Umum","Periksa kesehatanmu sekarang",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Kandungan","Periksa kandunganmu kapan aja",
                "dr Febbyola Ramanda","Spesialis Kandungan", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Spesialis Kandungan", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Spesialis Kandungan", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Spesialis Kandungan", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Spesialis Kandungan"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Spesialis Kandungan", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Kulit","Kesehatan kulit tubuh itu penting lho..",
                "dr Febbyola Ramanda","Spesialis Kulit", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Spesialis Kulit", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Spesialis Kulit", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Spesialis Kulit", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Spesialis Kulit"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Spesialis Kulit", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Psikologi Klinis","Butuh curhat? yuk cerita sama kami",
                "dr Febbyola Ramanda","Psikologi Klinis", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Psikologi Klinis", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Psikologi Klinis", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Psikologi Klinis", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Psikologi Klinis"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Psikologi Klinis", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

    }
    private void setUpRecyclerSpesialis() {
        RecyclerView recyclerView =findViewById(R.id.recyclerview_spesialisasi);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       adapter_divider = new Adapter_list_divider_spesialisasi (modelListDokter, Lihat_dokter_spesialisasi.this);
        recyclerView.setAdapter(adapter_divider);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter_divider.getFilter().filter(newText);
                return false;
            }
        });
        return  true;
    }
}