package com.example.halodoc;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    TextView et_namalengkap;
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
    TextView textView_masuk;


    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_beranda, container, false);
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
            Intent intent = new Intent(BerandaFragment.this.getActivity(), BuatJanjiRS.class);
                startActivity(intent);
            }
        });
        card2 = v.findViewById(R.id.card_toko_kesehatan);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), BuatJanjiRS.class);
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
                "Kecantikan","Dr. Fadhli Rizal Makarim");
        modelArtikelArrayList.add(kecantikan);

        model_artikel makanan = new model_artikel( R.drawable.makanan,
                "Apa Manfaat Mengkonsumsi Yoghurt untuk Kesehatan?",
                "Makanan Sehat","Dr. Rizal Fadli");
        modelArtikelArrayList.add(makanan);

        model_artikel anak = new model_artikel(R.drawable.anak,
                "4 Cara untuk Mencegah Anak Mengalami tantrum",
                "Pola Asuh Anak","Dr. Rizal Fadli");
        modelArtikelArrayList.add(anak);

        model_artikel parestesia = new model_artikel(R.drawable.parestesia,
                "Jenis Pemeriksaan yang dilakukan untuk Deteksi parestesia",
                "Parestesia","Dr. Gabriella Florencia");
        modelArtikelArrayList.add(parestesia);

        model_artikel bayi = new model_artikel(R.drawable.bayi,
                "7 Cara Merawat Bayi Baru Lahir Tanpa Stres",
                "Pertumbuhan bayi","Dr. Rizal Fadli");
        modelArtikelArrayList.add(bayi);

        Adapter_artikel adapterArtikel=new Adapter_artikel(modelArtikelArrayList,getActivity());
        recyclerViewArtikel.setAdapter(adapterArtikel);


        btn_lihat_artiel= v.findViewById(R.id.btn_lihatsemua_artikel);
        btn_lihat_artiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lihat_semua_rs();
            }

            private void lihat_semua_rs() {
                Intent intent= new Intent(BerandaFragment.this.getActivity(), Lihat_semua_artikel.class);
                startActivity(intent);

            }
        });
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
