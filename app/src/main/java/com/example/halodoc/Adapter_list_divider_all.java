package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_list_divider_all extends RecyclerView.Adapter<Adapter_list_divider_all.ViewHolder> {

    private Context context;
    ArrayList<Model_list_divider_all> modelListDokter;
    public Adapter_list_divider_all(ArrayList<Model_list_divider_all> modelList,chat_dengan_dokter activity){
        this.modelListDokter = modelList;
        this.context = activity;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_divider_all, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_list_divider_all.ViewHolder holder, int position) {
        Model_list_divider_all modellistdivider = modelListDokter.get(position);
        holder.judul.setText(modellistdivider.getJudul());
        holder.deskripsi.setText(modellistdivider.getDeskripsi());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Lihat_semua_dokter_spesialis.class);
                intent.putExtra("JudulKategori", modelListDokter.get(position).getJudul());

                intent.putExtra("ImageDokter1", modelListDokter.get(position).getImage_dokter1());
                intent.putExtra("NamaDokter1",modelListDokter.get(position).getNama_dokter1());
                intent.putExtra("Kategori1", modelListDokter.get(position).getKategori_dokter1());
                intent.putExtra("Tahun1",modelListDokter.get(position).getTahun1());
                intent.putExtra("Suka1", modelListDokter.get(position).getSuka1());
                intent.putExtra("HargaDokter1", modelListDokter.get(position).getHarga1());

                intent.putExtra("ImageDokter2", modelListDokter.get(position).getImage_dokter2());
                intent.putExtra("NamaDokter2",modelListDokter.get(position).getNama_dokter2());
                intent.putExtra("Kategori2", modelListDokter.get(position).getKategori_dokter2());
                intent.putExtra("Tahun2",modelListDokter.get(position).getTahun2());
                intent.putExtra("Suka2", modelListDokter.get(position).getSuka2());
                intent.putExtra("HargaDokter2", modelListDokter.get(position).getHarga2());

                intent.putExtra("ImageDokter3", modelListDokter.get(position).getImage_dokter3());
                intent.putExtra("NamaDokter3",modelListDokter.get(position).getNama_dokter3());
                intent.putExtra("Kategori3", modelListDokter.get(position).getKategori_dokter3());
                intent.putExtra("Tahun3",modelListDokter.get(position).getTahun3());
                intent.putExtra("Suka3", modelListDokter.get(position).getSuka3());
                intent.putExtra("HargaDokter3", modelListDokter.get(position).getHarga3());

                intent.putExtra("ImageDokter4", modelListDokter.get(position).getImage_dokter4());
                intent.putExtra("NamaDokter4",modelListDokter.get(position).getNama_dokter4());
                intent.putExtra("Kategori4", modelListDokter.get(position).getKategori_dokter4());
                intent.putExtra("Tahun4",modelListDokter.get(position).getTahun4());
                intent.putExtra("Suka4", modelListDokter.get(position).getSuka4());
                intent.putExtra("HargaDokter4", modelListDokter.get(position).getHarga4());

                intent.putExtra("ImageDokter5", modelListDokter.get(position).getImage_dokter5());
                intent.putExtra("NamaDokter5",modelListDokter.get(position).getNama_dokter5());
                intent.putExtra("Kategori5", modelListDokter.get(position).getKategori_dokter5());
                intent.putExtra("Tahun5",modelListDokter.get(position).getTahun5());
                intent.putExtra("Suka5", modelListDokter.get(position).getSuka5());
                intent.putExtra("HargaDokter5", modelListDokter.get(position).getHarga5());

                intent.putExtra("ImageDokter6", modelListDokter.get(position).getImage_dokter6());
                intent.putExtra("NamaDokter6",modelListDokter.get(position).getNama_dokter6());
                intent.putExtra("Kategori6", modelListDokter.get(position).getKategori_dokter6());
                intent.putExtra("Tahun6",modelListDokter.get(position).getTahun6());
                intent.putExtra("Suka6", modelListDokter.get(position).getSuka6());
                intent.putExtra("HargaDokter6", modelListDokter.get(position).getHarga6());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return modelListDokter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        TextView deskripsi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            deskripsi =itemView.findViewById(R.id.deskripsi);
        }
    }
}