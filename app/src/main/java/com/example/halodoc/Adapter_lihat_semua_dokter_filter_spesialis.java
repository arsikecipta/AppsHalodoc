package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter_lihat_semua_dokter_filter_spesialis extends RecyclerView.Adapter<Adapter_lihat_semua_dokter_filter_spesialis.ViewHolder> {

    private Context context;
    ArrayList<Model_list_dokter> modelListDokter;
    public Adapter_lihat_semua_dokter_filter_spesialis (ArrayList<Model_list_dokter> modelListDokter,Lihat_semua_dokter_filter_spesialis activity){
        this.modelListDokter = modelListDokter;
        this.context = activity;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dokter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_lihat_semua_dokter_filter_spesialis.ViewHolder holder, int position) {
        Model_list_dokter modeldokter = modelListDokter.get(position);
        holder.image_dokter.setImageResource(modeldokter.getImage_dokter());
        holder.nama_dokter.setText(modeldokter.getNama_dokter());
        holder.kategori_dokter.setText(modeldokter.getKategori_dokter());
        holder.tahun.setText(modeldokter.getTahun());
        holder.suka.setText(modeldokter.getSuka());
        holder.harga.setText(modeldokter.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Detail_dokter_spesialis_filter.class);
                intent.putExtra("ImageDokter1", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter1",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori1", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun1",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka1", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter1", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni1",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik1", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR1", modelListDokter.get(position).getStr());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return modelListDokter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama_dokter;
        TextView kategori_dokter;
        TextView tahun;
        TextView suka;
        TextView harga;
        ImageView image_dokter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_dokter = itemView.findViewById(R.id.image_dokter);
            nama_dokter = itemView.findViewById(R.id.nama_dokter);
            kategori_dokter =itemView.findViewById(R.id.kategori_dokter);
            tahun =itemView.findViewById(R.id.tahun);
            suka =itemView.findViewById(R.id.suka);
            harga =itemView.findViewById(R.id.harga);
        }
    }
}