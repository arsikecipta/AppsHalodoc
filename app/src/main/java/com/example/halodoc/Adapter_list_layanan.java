package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_list_layanan  extends RecyclerView.Adapter<Adapter_list_layanan.ViewHolder> {
    private Context context;
    ArrayList<model_layanan> modelListLayanan;
    public Adapter_list_layanan(ArrayList<model_layanan> modelListLayanan,ListLayanan activity){
        this.modelListLayanan = modelListLayanan;
        this.context = activity;
    }
    @NonNull

    @Override
    public Adapter_list_layanan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter_list_layanan.ViewHolder holder, int position) {
        final model_layanan modelLayananlist= modelListLayanan.get(position);
        holder.txt_nama_layanan.setText(modelLayananlist.getNama_layanan());
        holder.txt_nama_rs.setText(modelLayananlist.getNama_rs());
        holder.txt_alamat_rs.setText(modelLayananlist.getAlamat_rs());
        holder.txt_jenis_layanan.setText(modelLayananlist.getJenis_layanan());
        holder.txt_biaya_layanan.setText(modelLayananlist.getBiaya_layanan());
        holder.image_layanan.setImageResource(modelLayananlist.getImage_layanan());
        holder.button_janji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Jadwal_janji.class);
                //passing data to detail
                intent.putExtra("NamaLayanan", modelListLayanan.get(position).getNama_layanan());
                intent.putExtra("JenisLayanan", modelListLayanan.get(position).getJenis_layanan());
                intent.putExtra("RumahSakitLayanan", modelListLayanan.get(position).getNama_rs());
                intent.putExtra("AlamatLayanan", modelListLayanan.get(position).getAlamat_rs());
                intent.putExtra("BiayaLayanan", modelListLayanan.get(position).getBiaya_layanan());
                intent.putExtra("GambarLayanan", modelListLayanan.get(position).getImage_layanan());
                intent.putExtra("PenjelasanLayanan", modelListLayanan.get(position).getPenjelasan_layanan());

                context.startActivity(intent);
            }
        });
        holder.cardView_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Jadwal_janji.class);
                //passing data to detail
                intent.putExtra("NamaLayanan", modelListLayanan.get(position).getNama_layanan());
                intent.putExtra("JenisLayanan", modelListLayanan.get(position).getJenis_layanan());
                intent.putExtra("RumahSakitLayanan", modelListLayanan.get(position).getNama_rs());
                intent.putExtra("AlamatLayanan", modelListLayanan.get(position).getAlamat_rs());
                intent.putExtra("BiayaLayanan", modelListLayanan.get(position).getBiaya_layanan());
                intent.putExtra("GambarLayanan", modelListLayanan.get(position).getImage_layanan());
                intent.putExtra("PenjelasanLayanan", modelListLayanan.get(position).getPenjelasan_layanan());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelListLayanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_layanan;
        TextView txt_nama_layanan;
        TextView txt_nama_rs;
        TextView txt_alamat_rs;
        TextView txt_jenis_layanan;
        TextView txt_biaya_layanan;
        Button button_janji;
        CardView cardView_list;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_layanan = itemView.findViewById(R.id.imageview_list_layanan);
            txt_nama_layanan = itemView.findViewById(R.id.nama_list_layanan);
            txt_nama_rs=itemView.findViewById(R.id.layanan_list_rumahsakit);
            txt_alamat_rs=itemView.findViewById(R.id.layanan_list_alamat_rs);
            txt_jenis_layanan=itemView.findViewById(R.id.jenis_list_layanan);
            txt_biaya_layanan=itemView.findViewById(R.id.list_biaya_layanan);
            button_janji=itemView.findViewById(R.id.btn_janji);
            cardView_list=itemView.findViewById(R.id.card_list_layanan);
        }
    }
}
