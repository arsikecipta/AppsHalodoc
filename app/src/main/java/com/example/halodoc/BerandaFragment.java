package com.example.halodoc;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class BerandaFragment extends Fragment {
    public CardView card1;
    public CardView card2;
    public CardView card3;
    private ViewPager viewPager;
    private ViewPager viewPager_topik;
    TextView et_namalengkap, masuk_daftar;
    private Button btn_lihat_artiel;
    private RelativeLayout relativeLayout_topik;
    private ArrayList<model_topik> modelTopiks;
    private ArrayList<model_artikel> modelArtikelArrayList;
    List<model_artikel>model_artikelList;
    private Context mContext;
    Integer[] colors =null;

    ArgbEvaluator argbEvaluator=new ArgbEvaluator();
   // Adapter_topik adapter_topik;

    private Button button1, button2, button3, button4,button5,button6, btn_see_all;
    private int white, darkGray,red;
    private RecyclerView recyclerViewArtikel;
    private String selectedFilter="all";
    ImageView img_acc;
    TextView textView_masuk;


    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beranda, container, false);

//        Intent intent = getActivity().getIntent();
//        String namalengkap =intent.getExtras().getString("NamaLengkap");
//        masuk_daftar.setText(namalengkap);
//

        img_acc=v.findViewById(R.id.icon_daftar);
        img_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), Login.class);
                startActivity(intent);
            }
        });
        masuk_daftar=v.findViewById(R.id.masuk_daftar);
        masuk_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), Login.class);
                startActivity(intent);
            }
        });
        btn_see_all= v.findViewById(R.id.button_artikel_seeall);
        btn_see_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), Lihat_semua_artikel.class);
                startActivity(intent);
            }
        });
        card1 = v.findViewById(R.id.card_chat_dokter);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(BerandaFragment.this.getActivity(), chat_dengan_dokter.class);
                startActivity(intent);
            }
        });
        card2 = v.findViewById(R.id.card_toko_kesehatan);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), toko_kesehatan.class);
                startActivity(intent);
            }
        });
        card3 = v.findViewById(R.id.card_buat_janji_rs);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), BuatJanjiRS.class);
                startActivity(intent);
            }
        });
        button1 = v.findViewById(R.id.but_1);
        button2 = v.findViewById(R.id.but_2);
        button3 = v.findViewById(R.id.but_3);
        button4 = v.findViewById(R.id.but_4);
        button5 = v.findViewById(R.id.but_5);
        button6= v.findViewById(R.id.but_6);
       // textView_masuk=v.findViewById(R.id.masuk_daftar);
        initcolors();
        lookSelected(button1);

        recyclerViewArtikel =v.findViewById(R.id.rec_artikel);
        recyclerViewArtikel.setHasFixedSize(true);
        recyclerViewArtikel.setLayoutManager(new LinearLayoutManager(BerandaFragment.this.getActivity()));
        modelArtikelArrayList = new ArrayList<>();
        model_artikel kecantikan = new model_artikel( R.drawable.kecantikan,
                "Rangkaian Perawatan Wajah untuk Mencegah Jerawat",
                "Kecantikan","Dr. Fadhli Rizal Makarim", "“Setelah membersihkan wajah, selalu gunakan pelembap yang tepat segera untuk merehidrasi kulit. Secara rutin membersihkan wajah dapat mencegah munculnya jerawat. Kulit menjadi lebih bersih, bebas minyak, dan pori-pori wajah pun tidak tersumbat oleh kotoran dan debu yang menempel usai beraktivitas.",
                "\n" +
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
        modelArtikelArrayList.add(kecantikan);

        model_artikel makanan = new model_artikel( R.drawable.makanan,
                "Apa Manfaat Mengkonsumsi Yoghurt untuk Kesehatan?",
                "Makanan Sehat","Dr. Rizal Fadli","Halodoc, Jakarta – Yoghurt adalah makanan yang merupakan fermentasi dari susu dan terkenal dapat menyehatkan karena kandungan probiotik yang tinggi. Namun, kebanyakan orang hanya tahu jika makanan ini dapat menyehatkan sistem pencernaan. Padahal, masih banyak manfaat lainnya yang dapat kamu rasakan dengan mengonsumsi yoghurt secara rutin. Berikut beberapa manfaatnya yang perlu kamu ketahui!",
                "\n" +
                "Manfaat Yoghurt Terhadap Kesehatan\n" +
                "Yoghurt merupakan produk susu yang dibuat dengan metode fermentasi. Makanan ini kaya akan kandungan protein dan kalsium, sehingga mampu meningkatkan bakteri baik yang ada di sistem pencernaan, terutama usus. Asam laktat dibutuhkan untuk menghasilkan yoghurt, agar protein susu dapat mengental dan memberikan rasa serta struktur yang unik. Apabila ditambahkan gula, beberapa produk susu ini menjadi tidak menyehatkan.\n" +
                "\n" +
                "Baca juga: Mitos atau Fakta, Konsumsi Yogurt Bikin Pencernaan Sehat\n" +
                "\n" +
                "Faktanya, masih banyak manfaat yang bisa dirasakan dengan mengonsumsi yoghurt secara rutin, meski tergantung pada jenis yang kamu konsumsi sehari-hari. Selain itu, makanan ini juga dapat menjadi pilihan seseorang yang tidak dapat mengonsumsi produk susu atau zat hewani akibat alergi atau intoleransi. Hal ini karena yoghurt mengandung lebih sedikit laktosa dibandingkan susu karena adanya proses fermentasi.\n" +
                "\n" +
                "Nah, kamu juga perlu tahu beberapa manfaat dari yogurt untuk kesehatan, antara lain:\n" +
                "\n" +
                "1. Meningkatkan Sistem Imunitas\n" +
                "Salah satu manfaat yoghurt untuk kesehatan adalah dapat meningkatkan sistem imunitas di dalam tubuh. Hal ini dapat terjadi ketika probiotik mengubah mikroflora usus dan mengurangi respons sistem kekebalan tubuh yang dapat memperburuk penyakit. Selain itu, kandungan tersebut juga dapat meningkatkan resistensi dan pemulihan dari infeksi. Penelitian menyebut jika durasi semua gangguan yang disebabkan oleh penyakit lebih pendek pada orang yang rutin mengonsumsi yoghurt, dibandingkan yang tidak.\n" +
                "\n" +
                "2. Mencegah Osteoporosis\n" +
                "Nutrisi yang cukup sangat berperan penting dalam pencegahan dan pengobatan osteoporosis, terutama kandungan kalsium dan vitamin D. Kedua kandungan ini terdapat dalam yogurt sehingga sangat baik untuk menjaga kepadatan tulang. Kalsium terbukti dapat meningkatkan massa tulang untuk semua orang tidak terpaku usia. Maka dari itu, pastikan untuk mengonsumsi yoghurt secara rutin setiap hari.\n" +
                "\n" +
                "Baca juga: Mengenal Lebih Jauh Mengenai Yogurt Kelapa\n" +
                "\n" +
                "Jika kamu ingin memastikan tingkat kepadatan tulang dan seberapa besar kebutuhan terhadap kalsium dan vitamin D setiap hari, pemeriksaan di rumah sakit yang bekerja sama dengan Halodoc dapat dilakukan. Cukup dengan download aplikasi Halodoc, kamu bisa melakukan pemesanan untuk pemeriksaan tersebut hanya dengan penggunaan smartphone. Unduh aplikasinya sekarang juga!\n" +
                "\n" +
                "3. Mengurangi Risiko Tekanan Darah Tinggi\n" +
                "Manfaat lainnya dari yogurt untuk kesehatan tubuh adalah mengurangi risiko dari tekanan darah tinggi. Dipercaya jika susu rendah lemak yang mirip dengan yoghurt dapat membuat tekanan darah menjadi normal jika dikonsumsi secara rutin. Disebutkan jika penurunan risiko terkena darah tinggi mencapai 50 persen pada seseorang yang mengonsumsi 2–3 porsi susu rendah lemak dalam sehari. Tidak ada salahnya untuk mengganti susu rendah lemak dengan yoghurt.\n" +
                "\n" +
                "4. Pilihan Baik saat Diet\n" +
                "Yoghurt juga dapat bermanfaat sebagai makanan yang sangat baik saat kamu sedang dalam program diet. Hasil fermentasi susu ini dipercaya dapat menjadi camilan yang tepat di jam-jam tertentu saat perut tiba-tiba lapar padahal jadwal makan selanjutnya masih lama. Memang telah terbukti jika makanan ini dapat membuat seseorang merasa kenyang dibandingkan camilan lainnya, serta mampu menyehatkan tubuh.\n" +
                "\n" +
                "Baca juga: Yogurt Kelapa Lebih Sehat dari yang Berbahan Hewani, Benarkah?\n" +
                "\n" +
                "Sekarang kamu tahu apa saja manfaat dari yoghurt untuk kesehatan tubuh, bukan hanya sistem pencernaan. Maka dari itu, ada baiknya kamu membiasakan diri untuk mengonsumsi makanan hasil fermentasi ini. Tentu kamu tidak ingin kan memiliki osteoporosis saat tua karena kepadatan tulang yang terus menurun akibat faktor usia? Biasakan hal baik ini sekarang juga!");
        modelArtikelArrayList.add(makanan);

        model_artikel anak = new model_artikel(R.drawable.anak,
                "4 Cara untuk Mencegah Anak Mengalami tantrum",
                "Pola Asuh Anak","Dr. Rizal Fadli", "Halodoc, Jakarta - Tantrum pada anak bisa menjadi masalah tersendiri bagi orangtua. Namun, sebenarnya tantrum adalah hal yang wajar terjadi pada Si Kecil karena adanya perkembangan pada kemampuan emosional dan sosialnya. Selain itu, tantrum juga dapat terjadi karena anak mengalami kesulitan dalam menunjukkan perasaannya.",
                "\n" +
                "Saat hal ini terjadi, sang buah hati pasti akan menangis meraung sambil berteriak, bahkan bisa saja mereka berguling atau terduduk di lantai karena apa yang diinginkan tidak dipenuhi oleh orangtua. Lalu, bagaimana cara mencegah terjadinya hal ini? Berikut pembahasannya!\n" +
                "\n" +
                "Baca juga: Inilah 6 Jenis Pola Asuh Anak yang Bisa Diterapkan Orangtua\n" +
                "\n" +
                "Sebenarnya, tantrum merupakan fase yang wajar terjadi pada setiap anak. Biasanya, kondisi ini dialami oleh anak yang berusia 1–3 tahun dengan durasi yang berbeda pada setiap anak. Jika tantrum terjadi di rumah, hal ini tentunya bukan menjadi masalah yang berarti bagi orangtua. Namun, bagaimana jika tantrum terjadi di tempat umum? Pasti sangat merepotkan, ya!\n" +
                "\n" +
                "Cara Mencegah Tantrum pada Anak\n" +
                "Lalu, bagaimana caranya supaya tantrum tidak terjadi, baik di rumah maupun di tempat umum? Berikut ini beberapa tips pola asuh anak yang bisa ibu lakukan:\n" +
                "\n" +
                "Tetaplah melakukan rutinitas seperti biasa, terlebih saat waktunya makan dan tidur. Hindari pergi jalan-jalan terlalu jauh atau menunda waktu makan dan tidur siang Si Kecil.\n" +
                "Alihkan perhatian sang buah hati dengan mainan favoritnya.\n" +
                "Tidak perlu marah, tetap tenang dan cobalah pahami anak. Ingatlah bahwa setiap anak memiliki kelebihan, kekurangan, dan keunikan masing-masing. Selalu tanamkan bahwa pada usianya, mereka belum mampu menyampaikan apa yang diinginkan dengan baik pada orangtuanya.\n" +
                "Bantu anak agar tidak mengalami rasa frustasi. Selalu persiapkan anak saat hendak mengalami perubahan baru dengan membicarakannya setiap hari sebelum terjadi. Jelaskan dengan baik dan perlahan pada anak aturan apa saja yang harus ia ketahui dan patuhi.\n" +
                "Baca juga: Mengenal Dampak Pola Asuh Orangtua ke Anak Lewat Film Shazam!\n" +
                "\n" +
                "Menghadapi Tantrum pada Anak\n" +
                "Tetap tenang saat anak mengalami tantrum adalah kunci penting yang perlu diingat oleh para orangtua. Jangan buat masalah menjadi lebih rumit dengan memarahi anak. Selalu ingat bahwa orangtua berperan dalam membantu anak menyampaikan apa yang mereka inginkan dengan baik.\n" +
                "\n" +
                "Tantrum ditangani dengan cara yang berbeda tergantung pada sebab anak marah. Terkadang, ibu perlu memberikan mereka penghiburan. Jika anak merasa lelah atau lapar, ajak ia beristirahat atau siapkan makanan untuknya. Aktivitas baru juga bisa membantu anak teralihkan dari rasa kesal.\n" +
                "\n" +
                "Jika tantrum terjadi karena anak butuh perhatian orangtua, ibu bisa mengurangi perilaku ini dengan mengabaikannya. Jika anak marah setelah ditolak, tetap tenang dan sebaiknya ibu tidak banyak menjelaskan alasan anak tidak mendapatkan keinginannya.\n" +
                "\n" +
                "Jika tantrum terjadi setelah ibu meminta anak melakukan sesuatu yang tidak ia inginkan, abaikan amukan tersebut dan pastikan ibu tetap memintanya menyelesaikan tugas setelah dirinya lebih tenang.\n" +
                "\n" +
                "Baca juga: Enggan Menikah tapi Bisa Punya Anak dengan Platonic Parenting\n" +
                "\n" +
                "Anak yang cenderung melukai diri sendiri atau orang lain selama mengalami tantrum harus segera dibawa ke tempat yang lebih aman serta tenang dan aman, agar ia bisa menenangkan diri. Apabila ibu butuh bantuan, tanyakan langsung pada dokter spesialis anak atau psikolog anak melalui aplikasi Halodoc. Memang, mengatasi tantrum mungkin tidak mudah bagi beberapa orangtua sehingga membutuhkan bantuan ahlinya. Jangan tunda untuk download aplikasi Halodoc, ya!\n" +
                "\n");
        modelArtikelArrayList.add(anak);

        model_artikel parestesia = new model_artikel(R.drawable.parestesia,
                "Jenis Pemeriksaan yang dilakukan untuk Deteksi parestesia",
                "Parestesia","Dr. Gabriella Florencia","Halodoc, Jakarta – Pernahkah kamu merasa beberapa bagian tubuh kamu mengalami kesemutan? Kesemutan atau dalam bahasa medis dikenal dengan istilah parestesia adalah kondisi yang terjadi ketika anggota tubuh mengalami sensasi panas. Tidak hanya sensasi panas, terkadang seseorang yang mengalami kondisi parestesia mengalami sensasi seperti tertusuk jarum di beberapa bagian tubuh serta mati rasa atau kebas.",
                "\n" +
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
                "Baca juga: Hati-hati, Kadar Gula Tinggi Dapat Sebabkan Parestesia" );
        modelArtikelArrayList.add(parestesia);

        model_artikel bayi = new model_artikel(R.drawable.bayi,
                "7 Cara Merawat Bayi Baru Lahir Tanpa Stres",
                "Pertumbuhan bayi","Dr. Rizal Fadli", "Halodoc, Jakarta - Selain persiapan persalinan, ada banyak hal yang tidak kalah penting untuk menyambut kedatangan buah hati. Salah satunya dengan mempersiapkan diri dalam merawat dan mengasuh bayi yang baru lahir.",
                "\n" +
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
        modelArtikelArrayList.add(bayi);

        Adapter_artikel adapterArtikel=new Adapter_artikel(modelArtikelArrayList,getActivity());
        recyclerViewArtikel.setAdapter(adapterArtikel);


//        btn_lihat_artiel= v.findViewById(R.id.btn_lihatsemua_artikel);
//        btn_lihat_artiel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                lihat_semua_rs();
//            }
//
//            private void lihat_semua_rs() {
//                Intent intent= new Intent(BerandaFragment.this.getActivity(), Lihat_semua_artikel.class);
//                startActivity(intent);
//
//            }
//        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Adapter_artikel adapterArtikel =new Adapter_artikel(modelArtikelArrayList, getActivity());
                recyclerViewArtikel.setAdapter(adapterArtikel);
                unSelectAllSortButtons();
                lookSelected(button1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterList("kecantikan");
                unSelectAllSortButtons();
                lookSelected(button2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterList("makanan");
                unSelectAllSortButtons();
                lookSelected(button3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterList("anak");
                unSelectAllSortButtons();
                lookSelected(button4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterList("parestesia");
                unSelectAllSortButtons();
                lookSelected(button5);
            }

        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filterList("bayi");
                unSelectAllSortButtons();
                lookSelected(button6);
            }

        });
//        textView_masuk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(BerandaFragment.this.getActivity(), Input_nomorTelp.class);
////                startActivity(intent);
////                Toast.makeText(BerandaFragment.this.getContext(), "you click!",Toast.LENGTH_SHORT).show();
//            }
//        });
        return v;

    }

    private void initcolors() {
        white= ContextCompat.getColor(getActivity().getApplicationContext(), R.color.colorWhite);
        red= ContextCompat.getColor(getActivity().getApplicationContext(), R.color.background_all);
        darkGray= ContextCompat.getColor(getActivity().getApplicationContext(), R.color.colorDivider);
    }
    private void unSelectAllSortButtons(){
        lookUnselected(button1);
        lookUnselected(button2);
        lookUnselected(button3);
        lookUnselected(button4);
        lookUnselected(button5);

    }
    private void lookSelected(Button parsedButton){
        parsedButton.setTextColor(white);
        parsedButton.setBackgroundResource(R.drawable.stroke3);
    }
    private void lookUnselected(Button parsedButton){
        parsedButton.setTextColor(red);
        parsedButton.setBackgroundResource(R.drawable.stroke);
    }
    private void filterList(String status){
        selectedFilter=status;
        ArrayList<model_artikel> model_artikels= new ArrayList<model_artikel>();
        for(model_artikel modelArtikel: modelArtikelArrayList){
            if(modelArtikel.getTopik_artikel().toLowerCase().contains(status)){
                model_artikels.add(modelArtikel);
            }
        }


        Adapter_artikel adapterArtikel=new Adapter_artikel(model_artikels,getActivity());
        recyclerViewArtikel.setAdapter(adapterArtikel);
    }


}
