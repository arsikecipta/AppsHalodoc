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

    }

    private void Lihat_judul_spesialisasi() {

        modelListDokter = new ArrayList<>();

        modelListDokter.add(new Model_list_divider_all("Covid-19","Cegah di awal yuk..", "Layanan ini dikhusukan bagi kamu yang ingin berkonsultasi seputar Covid-19",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor2));

        modelListDokter.add(new Model_list_divider_all("Dokter Umum","Periksa kesehatanmu sekarang", "Memberikan diagnosis awal, serta merujuk ke dokter spesialis jika diperlukan",
                "dr Febbyola Ramanda","Dokter umum", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Jamali", "Dokter Umum", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Jamali", "Dokter Umum", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Ditto","Dokter Umum", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafathar Malik", "Dokter Umum"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Reza Rahardian", "Dokter Umum", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Kandungan","Periksa kandunganmu kapan aja", "Menangani persalinan serta seluruh kesehatan organ reproduksi wanita",
                "dr Yunizam Supardi","Spesialis Kandungan", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Jamali Raeza", "Spesialis Kandungan", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Riska Yuanita", "Spesialis Kandungan", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Zaki Ramadhan","Spesialis Kandungan", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Iqbal Kamal", "Spesialis Kandungan"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Dico Argan", "Spesialis Kandungan", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Kulit","Kesehatan kulit itu penting lho..","Menangani berbagai keluhan dan masalah kesehatan yang terkait kulit dan kelamin",
                "dr Vannesa Angel","Spesialis Kulit", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Shena Diyahun", "Spesialis Kulit", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Arum Sekar", "Spesialis Kulit", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Riziq Abdullah","Spesialis Kulit", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Riyan Narturna", "Spesialis Kulit"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Andhika Jamiluf", "Spesialis Kulit", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Psikologi Klinis","Butuh curhat? yuk cerita sama kami","Melakukan terapi psikologi, konseling, tes psikologi",
                "dr Monica Silvi","Psikologi Klinis", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Sherly Bianca", "Psikologi Klinis", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Maudy Yundafira", "Psikologi Klinis", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Umay Khilban","Psikologi Klinis", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Zidan Karomah", "Psikologi Klinis"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Iman Karim", "Psikologi Klinis", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Anak","Jangan khawatir bun.. yukk chat kami","Menangani pada kesehatan fisik, mental, emosional, dan sosial anak-anak",
                "dr Mauren Shihab","Spesialis Anak", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Sheila Anandira", "Spesialis Anak", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Dira Fauziyah", "Spesialis Anak", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Angga Girgundi","Spesialis Anak", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Fildan Munawar", "Spesialis Anak"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Fico Xanderman", "Spesialis Anak", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Penyakit dalam","Pantau kesehatanmu sekarang","Menangani berbagai masalah kesehatan terkait hampir seluruh sistem organ dalam tubuh",
                "dr Shuli Dorgan","Spesialis Penyakit dalam", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Kanila Nurbi", "Spesialis Penyakit dalam", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Latira Onalar", "Spesialis Penyakit dalam", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Denio orgenta","Spesialis Penyakit dalam", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Lafarel Frigo", "Spesialis Penyakit dalam"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Durhein Muzik", "Spesialis Penyakit dalam", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis THT","Pantau kesehatanmu sekarang","Menangani penyakit yang berkaitan dengan telinga, hidung, tenggorokan, kepala dan leher",
                "dr Fayola Urban","Spesialis THT", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Gita Spesial", "Spesialis THT", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Gurena Misdah", "Spesialis THT", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Bonrew Alogfir","Spesialis THT", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Erman Indigos", "Spesialis THT"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Junor Binyahil", "Spesialis THT", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Dokter Gigi","Kesehatan gigi itu penting loh..","Menangani berbagai masalah kesehatan gigi, gusi, dan mulut",
                "dr Bila Gregifa","Dokter Gigi", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Seyuni Arkaina", "Dokter Gigi", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Dareni Mawar", "Dokter Gigi", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Xavero Kiyar","Dokter Gigi", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Olaho Biornij", "Dokter Gigi"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Alpha Strayon", "Dokter Gigi", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Kedokteran Jiwa","Tenang.. kami siap membantumu","Mendiagnosis dan menangani gangguan mental pada pasien",
                "dr Buruni Olaferes","Kedokteran Jiwa", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Tiara Serokaru", "Kedokteran Jiwa", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Andini Peruhin", "Kedokteran Jiwa", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Beta Gimandi","Kedokteran Jiwa", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Alil Karyonx", "Kedokteran Jiwa"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Fattah Jikuhxon", "Kedokteran Jiwa", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Seksologi","Yuk chat.. kami siap membantu","Menangani kepentingan seksual manusia, perilaku, dan fungsi",
                "dr Fratista Diana","Seksologi", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Sherly Margareth", "Seksologi", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Sadira Velova", "Seksologi", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Nurdinham Xaxokin","Seksologi", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Fawalur Alqiban", "Seksologi"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Praize Alutirno", "Seksologi", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis bedah","Yuk chat.. kami siap membantu","Menangani perawatan sebelum operasi, operasi dan penatalaksanaan sesudah operasi",
                "dr Jihan Pagi","Spesialis bedah", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Sore Senjani", "Spesialis bedah", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Aesthi Cavilna", "Spesialis bedah", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Kevin Kugoni","Spesialis bedah", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Jasper Sibunor", "Spesialis bedah"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Kalvin Diorgani", "Spesialis bedah", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Saraf","Yuk chat.. kami siap membantu","Menangani berbagai permasalahan terkait sistem saraf",
                "dr Fayuni Azzahra","Spesialis Saraf", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Shila Arkahirin", "Spesialis Saraf", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zahra Shereniva", "Spesialis Saraf", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Aon Miller","Spesialis Saraf", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Polox Xinahio", "Spesialis Saraf"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Bara Turgoseh", "Spesialis Saraf", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Dokter Hewan","kesehatan peliharaanmu itu penting loh..","Menangani hewan dan penyakit-penyakitnya",
                "dr Unatari Rina","Dokter Hewan", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nosela Ujahirin", "Dokter Hewan", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Ayudia Ferosiva", "Dokter Hewan", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Noir Fachri","Dokter Hewan", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Gilang Varixon", "Dokter Hewan"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Mala Syarexza", "Dokter Hewan", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Jantung","Yuk chat.. kami siap membantu","Menangani penyakit yang berkaitan dengan jantung dan pembuluh darah, atau kardiovaskuler",
                "dr Diana Jira","Spesialis Jantung", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Miro Drioida", "Spesialis Jantung", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Jisu Dersiraf", "Spesialis Jantung", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Jennie Kim","Spesialis Jantung", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rosey Whitari", "Spesialis Jantung"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Lisa Falmbera", "Spesialis Jantung", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Laktasi","Yuk chat.. kami siap membantu","Menangani masalah menyusui pada ibu dan membantu meningkatkan pemberian ASI eksklusif",
                "dr Biana Hajira","Laktasi", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Gita Gutawa", "Laktasi", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Maudy Ayunda", "Laktasi", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Dimas Agil","Laktasi", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Raffi Ahdani", "Laktasi"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Dhani Sigarus", "Laktasi", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Program Hamil","Jangan khawatir.. kami siap bantu","Menangani prosedur pemeriksaan yang dilakukan sebelum pasien menjalani masa kehamilan",
                "dr Ilarsen Kulon","Program Hamil", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Cantik Jelita", "Program Hamil", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Momo Ginathyi", "Program Hamil", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Taorin Ahamdya","Program Hamil", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Felix Cerron", "Program Hamil"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Rezza Daniorsa", "Program Hamil", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Mata","Yuk chat.. kami siap membantu","Memberikan pemeriksaan yang berhubungan dengan penyakit mata dan gangguan penglihatan",
                "dr Ayunda Shinta","Spesialis Mata", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Tya Chintia", "Spesialis Mata", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Syalisa Intan", "Spesialis Mata", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ditto Yirgain","Spesialis Mata", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Poliron Ahmad", "Spesialis Mata"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Rahardian Malik", "Spesialis Mata", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Kesehatan Paru","Yuk chat.. kami siap membantu","Menangani masalah saluran pernapasan bagian bawah termasuk trakea, bronkus, dan paru-paru",
                "dr Dealova Feraz","Kesehatan Paru", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Heartis Myfila", "Kesehatan Paru", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Bunga Zainal", "Kesehatan Paru", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Dimas Brian","Kesehatan Paru", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Qorwira Fatoni", "Kesehatan Paru"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Alshad Firman", "Kesehatan Paru", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialis Gizi Klinik","Yuk chat.. kami siap membantu","Memberikan pengaturan diet sehari-hari baik saat sehat maupun saat sakit, sesuai kebutuhan individu",
                "dr Ferove Hilda","Spesialis Gizi Klinik", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Haisyah Mirna", "Spesialis Gizi Klinik", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Perma Indah", "Spesialis Gizi Klinik", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Zarondi Ervan","Spesialis Gizi Klinik", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Arkhairan Bondan", "Spesialis Gizi Klinik"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Nazar Gamalpha", "Spesialis Gizi Klinik", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Hukum Kesehatan","Yuk chat.. kami siap membantu","Memberikan pelayanan semua ketentuan hukum yang berhubungan langsung dengan pemeliharaan pelayanan kesehatan",
                "dr Febbyola Sherin","Hukum Kesehatan", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Nelmi Cantika", "Hukum Kesehatan", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Zarni Judith", "Hukum Kesehatan", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Ajil Reondix","Hukum Kesehatan", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Rafa Juniar", "Hukum Kesehatan"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Jaguar Verof", "Hukum Kesehatan", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));

        modelListDokter.add(new Model_list_divider_all("Spesialisasi lainya","Yuk chat.. kami siap membantu","Memberikan pelayanan dan menangani masalah kesehatan khusus lainya",
                "dr Hasna Nadhiro","Spesialis Kedokteran Olahraga", "5 Tahun", "99 %", "Rp 25.000","Universitas Indonesia","RSCM Cipto","1202173177",R.drawable.nodoctor3,
                "dr Melly Asilvi", "Spesialisasi Patologi Klinik", "20 tahun", " 99 %", "Rp 25.000", "Universitas Andalas","RS.Siloam","1202173377",R.drawable.nodoctor1,
                "dr Glowira Ines", "Spesialisasi Patologi Anatomi", "28 Tahun","99 %", "Rp 25.000", " Universitas Padjajaran", "RS.Sari Asih", "1202173456", R.drawable.nodoctor1,
                "dr Denny Gufdiro","Tenaga Gizi", "5 Tahun", "99 %","Rp 25.000", "Universitas Gajah Mada", "RS.Pelita Harapan", "1202174323",R.drawable.nodoctor2,
                "dr Valdis Kuntoji", "Spesialisasi Mikrobiologi Klinik"," 7 Tahun", "99 %", "Rp 25.000", " Universitas Soedirman", "RS. Harapan kita", "1202176589", R.drawable.nodoctor2,
                "dr Gagah Dittoir", "Spesialisasi Radiologi", "15 Tahun", "99 %", "Rp 25.000", "Universitas Diponegoro", "RS.Kencana", "1202174345",R.drawable.nodoctor4));
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