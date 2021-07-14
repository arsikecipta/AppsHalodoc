package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Lihat_semua_artikel extends AppCompatActivity {
    private List<model_artikel> modelArtikels;
    private   Adapter_lihat_artikel adapter_lihatartikel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_artikel);
        setContentView(R.layout.activity_lihat_semua_artikel);
        getSupportActionBar().setTitle("Artikel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SemuaArtikel();
        setUpRecyclerView();
    }
    private void SemuaArtikel() {
        modelArtikels = new ArrayList<>();
        modelArtikels.add(new model_artikel(R.drawable.kecantikan,
                "Rangkaian Perawatan Wajah untuk Mencegah Jerawat",
                "Kecantikan","Dr. Fadhli Rizal Makarim", "“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. " +
                "Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, " +
                "dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.\n"+"Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. " +
                "Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. " +
                "Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih."));
        modelArtikels.add(new model_artikel(R.drawable.makanan,
                "Apa Manfaat Mengkonsumsi Yoghurt untuk Kesehatan?",
                "Makanan Sehat","Dr. Rizal Fadli","“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. " +
                "Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, " +
                "dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.\n”"+"Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. " +
                "Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. " +
                "Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih."));
        modelArtikels.add(new model_artikel(R.drawable.anak,
                "Bayi juga Bisa Insomnia, Benarkah?",
                "Pertumbuhan Anak","Dr. Rizal Fadli","“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. " +
                "Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, " +
                "dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.\n”"+"Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. " +
                "Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. " +
                "Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih."));
        modelArtikels.add(new model_artikel(R.drawable.parestesia,
                "Jenis Pemeriksaan yang dilakukan untuk Deteksi parestesia",
                "Parestesia","Dr. Gabriella Florencia","“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. " +
                "Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, " +
                "dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.\n”"+"Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. " +
                "Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. " +
                "Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih."));
        modelArtikels.add(new model_artikel(R.drawable.bayi,
                "7 Cara Merawat Bayi Baru Lahir Tanpa Stres",
                "Pertumbuhan bayi","Dr. Rizal Fadli","“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. " +
                "Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, " +
                "dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.\n”"+"Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. " +
                "Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. " +
                "Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih."));
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView_artikel = findViewById(R.id.recyclerview_artikel);
        recyclerView_artikel.setHasFixedSize(true);
        recyclerView_artikel.setLayoutManager(new LinearLayoutManager(this));

        adapter_lihatartikel = new Adapter_lihat_artikel(modelArtikels,Lihat_semua_artikel.this);
        recyclerView_artikel.setAdapter(adapter_lihatartikel);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
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

                adapter_lihatartikel.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}