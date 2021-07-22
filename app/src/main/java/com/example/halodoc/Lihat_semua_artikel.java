package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Lihat_semua_artikel extends AppCompatActivity {
    private List<model_artikel> modelArtikels;
    Adapter_lihat_artikel adapter_lihatartikel;
    private Button button1, button2, button3, button4, button5,button6, btn_see_all;
    private int white, darkGray, red;
    private RecyclerView recyclerView_artikel;
    private String selectedFilter = "all";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_semua_artikel);

        getSupportActionBar().setTitle("Artikel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SemuaArtikel();
        setUpRecyclerView();

        button1 = (Button) findViewById(R.id.but_01);
        button2 = (Button) findViewById(R.id.but_02);
        button3 = (Button) findViewById(R.id.but_03);
        button4 = (Button) findViewById(R.id.but_04);
        button5 = (Button) findViewById(R.id.but_05);
        button6 = (Button) findViewById(R.id.but_06);

        initcolors();
        lookSelected(button1);

    }

    private void setUpRecyclerView() {
         recyclerView_artikel = findViewById(R.id.recyclerview_artikel);
        recyclerView_artikel.setHasFixedSize(true);
        recyclerView_artikel.setLayoutManager(new LinearLayoutManager(this));

        adapter_lihatartikel = new Adapter_lihat_artikel(modelArtikels, Lihat_semua_artikel.this);
        recyclerView_artikel.setAdapter(adapter_lihatartikel);

    }
    private void SemuaArtikel() {
        modelArtikels = new ArrayList<>();
        model_artikel kecantikan = new model_artikel(R.drawable.kecantikan,
                "Rangkaian Perawatan Wajah untuk Mencegah Jerawat",
                "Kecantikan", "Dr. Fadhli Rizal Makarim", "“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.",

                        "Halodoc, Jakarta – Untuk kamu yang memiliki wajah berjerawat, perawatan wajah dengan produk yang tepat adalah hal yang cukup penting. Perawatan wajah ini dimaksudkan untuk menghilangkan minyak dan kotoran yang menyumbat pori-pori dan menampung bakteri. Membersihkan wajah juga perlu dilakukan pagi maupun malam hari, untuk mendapatkan wajah yang sehat dan bersih.\n" +
                        "\n" +
                        "Ingat, dengan membersihkan dan merawat wajah dengan benar akan memungkinkan kulit untuk melakukan regenerasi secara alami dan meminimalkan risiko pembentukan jerawat baru. Oleh karena itu, untuk kamu yang memiliki masalah jerawat, berikut adalah hal-hal yang perlu kamu lakukan!\n" +
                        "\n" +
                        "Baca juga: Cara Tepat Mengembalikan Kelembapan Kulit Kering\n" +
                        "\n" +
                        "Mencuci Wajah di Pagi Hari\n" +
                        "Saat tidur, sebum dan sel-sel kulit mati akan menumpuk di permukaan kulit. Mereka sangat berpotensi untuk menyumbat pori-pori, sehingga menciptakan lingkungan yang sempurna untuk pembentukan jerawat. Itulah mengapa langkah pertama dalam perawatan jerawat adalah mencuci wajah dengan lembut di pagi hari.\n" +
                        "\n" +
                        "Pembersih wajah dengan kandungan asam salisilat sangat tepat untuk kulit rentan berjerawat. Kamu bisa menggunakan Effaclar Micro Peeling Purifying Gel dari La Roche Posay yang mengandung Salicylic acid untuk membersihkan pori tersumbat, LHA micro exfoliating yang lembut dan tidak mengiritasi kulit serta zinc yang membersihkan dan mengurangi sebum berlebih.\n" +
                        "\n" +
                        "Mencuci Wajah sebelum Tidur\n" +
                        "Tak hanya di pagi hari saja, mencuci wajah sebelum tidur juga sama pentingnya, lho. Kalau kamu enggak membersihkan wajah dari minyak berlebih, riasan, dan kotoran lainnya, maka pori-pori wajah bisa tersumbat. Pori-pori yang tersumbat ini mendorong pertumbuhan jerawat.\n" +
                        "\n" +
                        "Nah, tentu saja hal ini akan menghambat regenerasi sel-sel kulit baru. Akibatnya, tanda-tanda penuaan kulit pun akan lebih cepat muncul. Jadi, pilihkan produk perawatan wajah yang sesuai untuk membantu proses regenerasi dan membuat wajah menjadi lebih bersih serta sehat.\n" +
                        "\n" +
                        "Baca juga: Intip Cara Tepat Eksfoliasi Kulit yang Mudah Berjerawat\n" +
                        "\n" +
                        "Cara Membersihkan Wajah yang Tepat\n" +
                        "Rutin membersihkan wajah di pagi dan malam hari akan mengurangi risiko munculnya jerawat. Membersihkan wajah di pagi hari dapat menghilangkan sebum dan sel-sel kulit mati, sedangkan pada malam hari untuk menghilangkan kotoran karena penggunaan makeup dan polusi.\n" +
                        "\n" +
                        "Untuk membersihkan wajah, langkah pertama yang bisa kamu lakukan adalah dengan menggunakan micellar water. Gunakan kapas untuk menghapus kotoran di wajah, setelah itu gunakan sabun pencuci wajah yang diformulasikan khusus kulit berminyak. Saat mencuSetelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit.ci wajah, jangan lupa menyapukan lembut ke kulit wajah pada zona-T, sekitar hidung, dan dagu selama sekitar 20-30 detik. Kemudian bilas dengan air hangat, dan keringkan dengan cara menepuk-nepuk wajah dengan lembut.\n" +
                        "\n" +
                        "Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. Jika kamu menggunakan krim untuk mengatasi gejala yang berhubungan dengan jerawat, oleskan krim tersebut setelah mencuci wajah dan pelembap, sehingga dapat bekerja dengan proses regenerasi alami kulit dan memberikan manfaat maksimal.\n" +
                        "\n" +
                        "Baca juga: Awas, Ini 3 Penyebab Jerawat yang Jarang Disadari\n" +
                        "\n" +
                        "Cara Memilih Pelembap yang Tepat untuk Kulit Rentan Berjerawat\n" +
                        "\n" +
                        "Pemilik wajah berjerawat dengan kulit berminyak harus memilih pelembap berbasis air untuk menghindari kondisi yang semakin parah. Namun, jika jenis kulit kamu normal atau kombinasi, pelembap berbahan dasar minyak boleh-boleh saja.\n" +
                        "\n" +
                        "Jika kamu memiliki kulit yang rentan jerawat, carilah pelembap dengan konsentrasi asam salisilat dan LHA yang sesuai. Sifat pengelupasan yang lembut dari bahan aktif ini akan membantu menjaga kulit tetap bersih.\n" +
                        "\n" +
                        "Kamu juga bisa memilih retinol yang merupakan bahan aktif lain yang cocok untuk mengatasi jerawat. Retinol akan bekerja secara keratolitik, yakni mengangkat sel-sel kulit mati dari permukaan kulit dan pori-pori. Dengan begini, pergantian sel akan mengalami peningkatan, yang membantu memerangi gejala jerawat.");
        modelArtikels.add(kecantikan);

        model_artikel coronavirus = new model_artikel(R.drawable.covid1,
                "COVID-19 Rentan pada Pengidap Diabetes dan Obesitas",
                "Coronavirus", "Dr. Fadhil Rizal Makarim", "COVID-19 Rentan pada Pengidap Diabetes dan Obesitas\n" +
                "“COVID-19 bisa menyerang siapa saja, sehingga kewaspadaan diri harus selalu dijaga. Meski bisa disembuhkan, pada beberapa orang, penyakit yang disebabkan oleh infeksi virus ini mungkin akan berbahaya. Ada beberapa orang yang lebih berisiko terinfeksi, siapa saja?”",
                "\n" +"Halodoc, Jakarta – COVID-19 bisa menyerang siapa saja yang terinfeksi virus corona. Namun, tahukah kamu? Ternyata risiko penyakit ini menjadi lebih tinggi pada kelompok orang tertentu, misalnya pengidap penyakit diabetes dan obesitas alias kelebihan berat badan. Bukan tanpa alasan, kedua kondisi tersebut diyakini bisa memengaruhi tubuh dan dapat menyebabkan sistem kekebalan atau imunitas tidak berfungsi maksimal dalam mencegah penyakit. \n" +
                        "\n" +
                        "Selain itu, ada faktor lain yang disebut bisa meningkatkan risiko infeksi pada pengidap diabetes dan obesitas. Maka dari itu, orang dengan kondisi kesehatan tertentu harus lebih waspada agar terhindar dari serangan penyakit. Lantas, mengapa pengidap penyakit diabetes dan kelebihan berat badan berisiko tinggi terserang COVID-19? Cari tahu jawabannya di artikel berikut!\n" +
                        "\n" +
                        "Baca juga: Bisakah COVID-19 Disembuhkan?\n" +
                        "\n" +
                        "Faktor Risiko Infeksi COVID-19 \n" +
                        "Virus corona bisa menyerang siapa saja dan menyebabkan infeksi. Namun, ada kelompok orang yang disebut lebih berisiko mengalami kondisi ini. Salah satu faktor yang disebut bisa meningkatkan risiko COVID-19 adalah kelebihan berat badan atau overweight. Bahkan, orang yang memiliki bobot tubuh berlebih disebut lebih berisiko mengalami gejala infeksi virus corona yang fatal, hingga menyebabkan komplikasi bahkan hilangnya nyawa. \n" +
                        "\n" +
                        "Sejumlah ahli meyakini bahwa hal ini terjadi karena tumpukan lemak di perut dapat mendorong diafragma. Semakin lama, dorongan tersebut membuat otot besar yang terletak di bawah rongga dada menekan paru-paru. Kondisi ini kemudian akan membatasi aliran udara yang diterima paru-paru. Penurunan volume udara bisa menyebabkan kolapsnya saluran udara lobus di bawah paru-paru. Hal ini bisa memperparah gejala penyakit dengan lebih cepat. \n" +
                        "\n" +
                        "Survei Kasus Infeksi Corona di Jakarta\n" +
                        "Melansir DetikHealth, kasus positif corona di DKI Jakarta ternyata berkaitan dengan indeks massa tubuh. Hasil itu didapat dari survei yang dilakukan oleh Dinas Kesehatan Provinsi DKI Jakarta bersama Tim Pandemi Fakultas Kesehatan Masyarakat Universitas Indonesia, Lembaga Eijkman, dan CDC Indonesia. Hasilnya sebagai berikut; \n" +
                        "\n" +
                        "Kurus (kurang dari 18,4 kg/m2) = 33,8 persen\n" +
                        "\n" +
                        "Normal (18,5 sampai 25,0 kg/m2) = 42,0 persen\n" +
                        "\n" +
                        "Overweight (25,1 sampai 27,0 kg/m2) = 52,9 persen\n" +
                        "\n" +
                        "Obesitas (lebih dari 27,0 kg/m2) = 51,6 persen. \n" +
                        "\n" +
                        "Baca juga: Ketahui Segala Hal Mengenai COVID-19\n" +
                        "\n" +
                        "Selain berat badan, risiko COVID-19 juga meningkat pada pengidap penyakit tertentu. Dari survei yang sama, diketahui bahwa pengidap gula darah tinggi alias obesitas masuk dalam kategori berisiko tinggi terinfeksi virus corona. Setidaknya ada 53 persen orang yang memiliki kadar gula darah puasa lebih dari 200 mg/dL diketahui mengalami gejala penyakit. Sementara untuk orang dengan kadar gula di bawah 200 mg/dL, angka penularan disebut mencapai 45,9 persen. \n" +
                        "\n" +
                        "Sementara itu, American Diabetes Association menyebut masih sedikit data yang menunjukkan pengidap diabetes lebih berisiko dibandingkan orang kebanyakan. Namun, hal nyata yang dihadapi adalah risiko tinggi terjadinya komplikasi. Diabetes menyebabkan sistem imunitas pengidapnya menurun, sehingga lebih mudah terserang penyakit. Komplikasi berbahaya dari infeksi virus corona juga dikhawatirkan meningkat pada orang dengan gula darah tinggi. \n" +
                        "\n" +
                        "Baca juga: Begini Kronologi Lengkap Virus Corona Masuk Indonesia\n" +
                        "\n" +
                        "Orang yang memiliki risiko tinggi terinfeksi virus harus sangat memperhatikan kondisi tubuh. Penting untuk selalu menerapkan protokol kesehatan, konsumsi makanan sehat, mengelola stres, mengenakan masker, serta menghindari kerumunan.");
        modelArtikels.add(coronavirus);

        model_artikel sakit_kepala = new model_artikel(R.drawable.lansia,
                "Lansia Kerap Alami Sakit Kepala, Waspadai Penyakit Ini",
                "Sakit Kepala", "Dr. Fadhil Rizal Makarim", "Halodoc, Jakarta – Sakit kepala adalah penyakit yang tidak memandang usia. Sakit kepala bisa dialami oleh siapa pun, baik orang dewasa dan anak-anak. Tetapi, lansia cenderung lebih sering atau lebih mudah mengalami sakit kepala daripada orang yang lebih muda.",

                        "Selain itu, sakit kepala yang dialami lansia juga bisa menjadi tanda penyakit tertentu. Penyakit bisa serius atau tidak, tergantung pada kondisi sakit kepala yang dialami. Dikutip dari WebMD, berikut ini sejumlah penyakit yang berisiko dialami lansia yang mengalami sakit kepala.\n" +
                                "\n" +
                                "Baca Juga: Ini 3 Beda Letak Sakit Kepala\n" +
                                "\n" +
                                "Penyakit Serebrovaskular\n" +
                                "Stroke adalah salah satu penyakit yang disertai dengan sakit kepala. Dikutip dari WebMD, penelitian terhadap 163 pasien yang mengalami stroke, 60 persen di antaranya mengalami sakit kepala. Sedangkan 46 persen di antaranya mengalami sakit kepala yang amat berat dan sisanya mengalami sakit kepala ringan, tetapi cukup menyakitkan. Sakit kepala kemungkinan datang secara tiba-tiba atau melambat.\n" +
                                "\n" +
                                "Trauma Kepala\n" +
                                "Sekitar 30 persen orang yang berusia 65 tahun ke atas mengalami jatuh setidaknya setahun sekali. Jatuh bisa menyebabkan hematoma subdural atau perdarahan pada otak akibat cedera kepala ringan. Trauma otak bisa mengancam jiwa atau hilang dengan sendirinya. Nah, kondisi ini ditandai dengan sakit kepala. Sakit kepala dapat berkisar dari ringan hingga parah, selang seling atau konstan, dan dapat terjadi pada satu atau kedua sisi kepala.\n" +
                                "\n" +
                                "Arteritis Temporal\n" +
                                "Sakit kepala adalah gejala umum dari arteritis temporal, yaitu penyakit yang menyebabkan arteri membengkak dan menyempit. Kondisi ini terjadi pada arteri temporal yang besar dan yang sedang membentang di kedua sisi kepala. Sel-sel arteri yang meradang ini terlihat besar jika dilihat di bawah mikroskop.\n" +
                                "\n" +
                                "Baca Juga: Inilah Perbedaan Pusing dan Sakit Kepala, Penyakit yang Dikira Sama\n" +
                                "\n" +
                                "Arteritis temporal sering terjadi pada lansia di atas 50 tahun. Sakit kepala biasanya dideskripsikan seperti berdenyut, dan selang seling atau konstan. Sakit kepala bisa terjadi pada satu atau kedua sisi kepala, biasanya di dekat pelipis, dahi atau belakang kepala. Pengidap arteritis temporal juga dapat mengalami sakit rahang saat mengunyah.\n" +
                                "\n" +
                                "Trigeminal Neuralgia\n" +
                                "Saraf trigeminal bekerja untuk mengontrol perasaan wajah. Ketika saraf mengalami gangguan, seseorang bisa mengalami rasa sakit yang luar biasa di bagian bawah wajah, di sekitar hidung, dan di atas mata. Trigeminal neuralgia dipicu dengan melakukan hal-hal biasa, seperti menyikat gigi, mengunyah, atau meniup hidung. Pada kasus lainnya, rasa sakit disebabkan oleh tumor yang menekan saraf trigeminal.\n" +
                                "\n" +
                                "Kondisi ini lebih umum dialami oleh lansia berusia di atas 50 dan lebih sering terjadi pada wanita daripada pria. Trigeminal neuralgia bisa disebabkan oleh hipertensi, multiple sclerosis atau diturunkan dalam keluarga. \n" +
                                "\n" +
                                "Baca Juga: Sakit Kepala Bisa Jadi Tanda Tumor Otak?\n" +
                                "\n" +
                                "Itulah kondisi yang ditandai dengan sakit kepala yang dialami oleh lansia. Kalau kamu sering mengalami sakit kepala tanpa penyebab yang jelas dan dibarengi dengan gejala tidak biasa lainnya, lebih baik periksakan ke dokter. Kini, lewat Halodoc kamu bisa membuat janji dengan dokter terlebih dahulu. Tinggal pilih dokter di rumah sakit yang tepat sesuai dengan kebutuhan lewat aplikasi.");
        modelArtikels.add(sakit_kepala);

        model_artikel parestesia = new model_artikel(R.drawable.parestesia,
                "Jenis Pemeriksaan yang dilakukan untuk Deteksi parestesia",
                "Parestesia", "Dr. Gabriella Florencia", "Halodoc, Jakarta – Pernahkah kamu merasa beberapa bagian tubuh kamu mengalami kesemutan? Kesemutan atau dalam bahasa medis dikenal dengan istilah parestesia adalah kondisi yang terjadi ketika anggota tubuh mengalami sensasi panas. Tidak hanya sensasi panas, terkadang seseorang yang mengalami kondisi parestesia mengalami sensasi seperti tertusuk jarum di beberapa bagian tubuh serta mati rasa atau kebas.",

                        "Baca juga: Sering Alami Kesemutan? Hati-hati Gejala dari Parestesia\n" +
                        "\n" +
                        "Kenali Jenis Parestesia\n" +
                        "Umumnya, kondisi parestesia terjadi temporer secara pada bagian tangan serta kaki. Kondisi parestesia terjadi secara tiba-tiba tanpa gejala apapun sebelumnya. Parestesia temporer terjadi ketika saraf tertekan dalam waktu yang cukup lama. Biasanya, parestesia temporer yang terjadi pada bagian kaki akibat pengidap parestesia terlalu lama duduk bersila sehingga menekan bagian kaki yang mengalami parestesia. Biasanya kondisi parestesia temporer tidak perlu dikhawatirkan, kondisi ini hilang dengan sendirinya ketika tidak ada bagian saraf yang tertekan.\n" +
                        "\n" +
                        "Sebaiknya waspada jika kamu merasakan kondisi kesemutan atau parestesia dalam jangka waktu yang cukup lama karena bisa saja kamu mengalami parestesia kronis. Parestesia yang bersifat kronis menjadi penanda adanya gangguan kesehatan pada tubuh, seperti kekurangan vitamin dan terdapat gangguan pada saraf.\n" +
                        "\n" +
                        "Gejala Umum Parestesia\n" +
                        "Kondisi parestesia akan menimbulkan beberapa gejala seperti mati rasa atau kebas pada bagian yang mengalami penekanan saraf. Tidak hanya itu, bagian yang mengalami kondisi parestesia merasa lemah hingga terkadang sulit untuk digerakkan. Rasa dingin juga muncul pada bagian anggota tubuh yang mengalami parestesia.\n" +
                        "\n" +
                        "Baca juga: Awas, 16 Hal Ini Bisa Sebabkan Parestesia pada Kulit\n" +
                        "\n" +
                        "Ketahui Penyebab Parestesia\n" +
                        "Sebaiknya ketahui penyebab parestesia untuk penanganan yang tepat. Meskipun tidak diketahui secara pasti, parestesia temporer disebabkan karena adanya penekanan saraf pada bagian tubuh sehingga membuat gangguan pada sirkulasi darah. Pada parestesia kronis, umumnya kondisi ini menjadi tanda adanya gangguan kesehatan pada tubuh.\n" +
                        "\n" +
                        "Pada kondisi parestesia kronis penyebab dapat digolongkan menjadi:\n" +
                        "\n" +
                        "1. Radikulopati\n" +
                        "\n" +
                        "Radikulopati terjadi ketika saraf mengalami iritasi atau peradangan. Kondisi ini disebabkan penyempitan saluran saraf pada tulang belakang dan adanya benjolan yang menyebabkan saraf tertekan.\n" +
                        "\n" +
                        "2. Neuropati\n" +
                        "\n" +
                        "Kondisi ini terjadi akibat adanya kerusakan saraf yang disebabkan oleh gula darah yang tinggi. Selain itu, ada beberapa kondisi lain seperti penyakit stroke, penyakit autoimun, diabetes, penyakit ginjal, penyakit hati serta tumor pada otak atau saraf.\n" +
                        "\n" +
                        "Lakukan Pemeriksaan untuk Mendeteksi Parestesia\n" +
                        "Tentu pengidap parestesia kronis membutuhkan pemeriksaan lebih lanjut untuk memastikan kondisi kesehatan. Ada beberapa pemeriksaan yang bisa dilakukan, seperti:\n" +
                        "\n" +
                        "1. Evaluasi Kesehatan Secara Umum\n" +
                        "\n" +
                        "Kondisi ini dilakukan untuk memastikan penyebab parestesia kronis yang dialami oleh pengidap parestesia. Dengan mengevaluasi kesehatan proses ini dapat dilakukan untuk memperkirakan pasien mengalami kerusakan saraf atau tidak.\n" +
                        "\n" +
                        "2. Pemeriksaan Fisik\n" +
                        "\n" +
                        "Pengidap parestesia juga melakukan pemeriksaan fisik secara menyeluruh, termasuk melakukan pemeriksaan neurologis.\n" +
                        "\n" +
                        "3. Pemeriksaan Laboratorium\n" +
                        "\n" +
                        "Pengidap parestesia melakukan pemeriksaan laboratorium yang meliputi pemeriksaan tes darah dan cairan serebrospinal.\n" +
                        "\n" +
                        "4. Pemindaian\n" +
                        "\n" +
                        "Proses pemeriksaan ini dilakukan jika pengidap parestesia dideteksi mengalami masalah pada bagian leher. Beberapa pemindaian bisa yang dilakukan seperti CT Scan, MRI dan foto rontgen.\n" +
                        "\n" +
                        "Tidak ada salahnya untuk melakukan pencegahan, salah satunya dengan rajin berkeliling secara berkala jika sudah duduk dalam waktu yang cukup lama. Gunakan aplikasi Halodoc untuk bertanya langsung pada dokter mengenai gangguan kesehatan yang kamu alami pada bagian saraf kamu. Yuk, download aplikasi Halodoc melalui App Store atau Google Play sekarang juga!\n" +
                        "\n" +
                        "Baca juga: Hati-hati, Kadar Gula Tinggi Dapat Sebabkan Parestesia");
        modelArtikels.add(parestesia);

        model_artikel bayi = new model_artikel(R.drawable.bayi,
                "7 Cara Merawat Bayi Baru Lahir Tanpa Stres",
                "Pertumbuhan bayi", "Dr. Rizal Fadli", "Halodoc, Jakarta - Selain persiapan persalinan, ada banyak hal yang tidak kalah penting untuk menyambut kedatangan buah hati. Salah satunya dengan mempersiapkan diri dalam merawat dan mengasuh bayi yang baru lahir.",

                        "Merawat bayi yang baru lahir memang akan menjadi pengalaman yang menyenangkan. Namun dibalik itu, kondisi ini dapat menyebabkan emosi yang naik turun dan kelelahan yang cukup panjang. Bahkan, jika tidak diatasi dengan baik, kondisi ini dapat meningkatkan risiko stres atau baby blues.\n" +
                        "\n" +
                        "Baca juga: Tips Perawatan untuk Bayi Baru Lahir\n" +
                        "\n" +
                        "Nah, untuk menghindari kondisi stres saat merawat bayi baru lahir, sebaiknya lakukan beberapa cara ini untuk persiapan yang lebih optimal.\n" +
                        "\n" +
                        "1.Buatlah Waktu Berkunjung\n" +
                        "\n" +
                        "Memiliki anggota keluarga baru tentunya membuat seluruh keluarga merasa bahagia. Hal ini membuat hampir semua keluarga ingin melihat Si Kecil. Namun, terlalu banyak keluarga yang berkunjung dapat mengurangi waktu istirahat ibu maupun bayi. Kondisi ini dapat menyebabkan ibu kelelahan dan bayi menjadi lebih rewel. Untuk menghindari kondisi ini, sebaiknya buatlah jadwal waktu berkunjung bagi keluarga yang ingin melihat Si Kecil. \n" +
                        "\n" +
                        "2.Penuhi Kebutuhan Istirahat\n" +
                        "\n" +
                        "Waktu tidur yang belum terjadwal dengan baik membuat bayi yang baru lahir akan terbangun di malam hari. Kondisi ini kerap membuat orangtua, khususnya ibu, merasa kelelahan. \n" +
                        "\n" +
                        "Kelelahan yang tidak diatasi dengan baik dapat meningkatkan risiko ibu mengalami stres. Tidak ada salahnya ibu juga beristirahat atau tidur saat bayi tertidur. Kondisi ini dapat membantu ibu untuk menurunkan risiko kelelahan maupun stres. \n" +
                        "\n" +
                        "3.Lakukan Hal yang Menyenangkan\n" +
                        "\n" +
                        "Saat bergantian menjaga Si Kecil dengan ayah, ibu juga bisa gunakan waktu yang ada untuk melakukan hal sederhana dan menyenangkan di rumah. Seperti membaca buku, mendengarkan musik, atau beristirahat sambil menonton film kesayangan. \n" +
                        "\n" +
                        "Baca juga: Wajib Tahu! 6 Cara Merawat Kulit Bayi Baru Lahir\n" +
                        "\n" +
                        "4.Jalani Gaya Hidup Sehat\n" +
                        "\n" +
                        "Ibu juga perlu melakukan gaya hidup sehat untuk mencegah stres saat menjaga bayi yang baru lahir. Konsumsi makanan sehat dan perbanyak konsumsi air putih setiap harinya untuk membantu produksi ASI. Tidak ada salahnya perbanyak mengonsumsi buah dan sayuran, agar kebutuhan vitamin dan nutrisi yang dibutuhkan dapat terpenuhi dengan baik.\n" +
                        "\n" +
                        "5.Berbagi Tugas dengan Ayah\n" +
                        "\n" +
                        "Hal lain yang bisa dilakukan adalah berbagai tugas dengan ayah. Hindari melakukan semua pekerjaan sendiri, baik pekerjaan rumah maupun mengurus buah hati. Mintalah ayah untuk mengerjakan pekerjaan rumah selagi ibu mengurus bayi. \n" +
                        "\n" +
                        "6.Siapkan Informasi Mengenai Newborn Sebelum Persalinan\n" +
                        "\n" +
                        "Selain membaca informasi mengenai metode persalinan yang akan dijalani, tidak ada salahnya untuk memperbanyak informasi mengenai cara merawat bayi yang baru lahir. Dengan begitu, ibu dapat lebih paham mengenai kondisi yang terjadi saat itu. Hal ini juga akan memudahkan ibu dalam mengatasi masalah yang umumnya dialami oleh bayi yang baru lahir.\n" +
                        "\n" +
                        "Ibu juga bisa bertanya langsung pada dokter anak melalui Halodoc jika mengalami masalah saat merawat bayi yang baru lahir. Tak perlu repot, ibu bisa download Halodoc melalui App Store atau Google Play sekarang juga!\n" +
                        "\n" +
                        "7.Lakukan Olahraga Ringan Secara Rutin\n" +
                        "\n" +
                        "Meskipun terlihat sulit dilakukan, tetapi tidak ada salahnya mencoba untuk berolahraga ringan setiap harinya agar kesehatan fisik maupun mental ibu dapat terjaga dengan baik. Ibu bisa melakukan jalan santai di rumah sambil menggendong Si Kecil untuk berjemur.\n" +
                        "\n" +
                        "Itulah beberapa tips saat merawat bayi yang baru lahir agar terhindar dari kondisi stres. Namun, jika ibu merasa kondisi stres berlanjut dan menyebabkan ibu menjadi lebih mudah marah, mudah gelisah, menangis tanpa alasan yang jelas, serta sulit berkonsentrasi, sebaiknya waspada ibu mengalami baby blues syndrome.\n" +
                        "\n" +
                        "Baca juga: Tips Mengasuh Anak Tanpa Babysitter");
        modelArtikels.add(bayi);


    }



    private void initcolors() {
        white = ContextCompat.getColor(getApplicationContext(), R.color.colorWhite);
        red = ContextCompat.getColor(getApplicationContext(), R.color.background_all);
        darkGray = ContextCompat.getColor(getApplicationContext(), R.color.colorDivider);
    }

    private void unSelectAllSortButtons() {
        lookUnselected(button1);
        lookUnselected(button2);
        lookUnselected(button3);
        lookUnselected(button4);
        lookUnselected(button5);
        lookUnselected(button6);


    }

    private void lookSelected(Button parsedButton) {
        parsedButton.setTextColor(white);
        parsedButton.setBackgroundResource(R.drawable.stroke3);
    }

    private void lookUnselected(Button parsedButton) {
        parsedButton.setTextColor(red);
        parsedButton.setBackgroundResource(R.drawable.stroke);
    }

    private void filterList(String status) {
        selectedFilter = status;
        ArrayList<model_artikel> modelLihatArtikels = new ArrayList<model_artikel>();
        for (model_artikel artikel : modelArtikels) {
            if (artikel.getTopik_artikel().toLowerCase().contains(status)) {
                modelLihatArtikels.add(artikel);
            }
        }
        Adapter_lihat_artikel adapter_lihatartikel = new Adapter_lihat_artikel(modelLihatArtikels, this);
        recyclerView_artikel.setAdapter(adapter_lihatartikel);
    }


    public void Button1(View view) {
        Adapter_lihat_artikel adapter_lihatartikel = new Adapter_lihat_artikel(modelArtikels, Lihat_semua_artikel.this);
        recyclerView_artikel.setAdapter(adapter_lihatartikel);
        unSelectAllSortButtons();
        lookSelected(button1);
    }

    public void Button2(View view) {
        filterList("kecantikan");
        unSelectAllSortButtons();
        lookSelected(button2);
    }

    public void Button3(View view) {
        filterList("coronavirus");
        unSelectAllSortButtons();
        lookSelected(button3);
    }

    public void Button4(View view) {
        filterList("sakit kepala");
        unSelectAllSortButtons();
        lookSelected(button4);
    }

    public void Button5(View view) {
        filterList("parestesia");
        unSelectAllSortButtons();
        lookSelected(button5);
    }
    public void Button6(View view) {
        filterList("bayi");
        unSelectAllSortButtons();
        lookSelected(button6);
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