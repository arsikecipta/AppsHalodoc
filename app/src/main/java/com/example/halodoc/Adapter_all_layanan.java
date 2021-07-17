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
import java.util.List;

public class Adapter_all_layanan extends RecyclerView.Adapter<Adapter_all_layanan.ViewHolder>  {
    private Context context;
    ArrayList<model_all_layanan> modelLayanans;

    public Adapter_all_layanan(List<model_all_layanan> modelLayanans, Context context) {
        this.modelLayanans = (ArrayList<model_all_layanan>) modelLayanans;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_all_layanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_all_layanan.ViewHolder holder, int position) {
        final model_all_layanan model_all_layanan_list = modelLayanans.get(position);
        holder.layanan_name.setText(model_all_layanan_list.getNama_layanan());
        holder.img_layanan.setImageResource(model_all_layanan_list.getGambar_layanan());
        holder.penjelasan_lay.setText(model_all_layanan_list.getPenjelasan_layanan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ListSemuaLayanan.class);
                intent.putExtra("NamaLayanan", modelLayanans.get(position).getNama_layanan());
                intent.putExtra("NamaLayanan2", modelLayanans.get(position).getNama_layanan2());
                intent.putExtra("NamaLayanan3", modelLayanans.get(position).getNama_layanan3());
                intent.putExtra("NamaLayanan4", modelLayanans.get(position).getNama_layanan4());
                intent.putExtra("GambarLayanan", modelLayanans.get(position).getGambar_layanan());
                intent.putExtra("GambarRS", modelLayanans.get(position).getGambar_rs());
                intent.putExtra("GambarRS2", modelLayanans.get(position).getGambar_rs2());
                intent.putExtra("GambarRS3", modelLayanans.get(position).getGambar_rs3());
                intent.putExtra("JenisLayanan", modelLayanans.get(position).getJenis_layanan());
                intent.putExtra("JenisLayanan2", modelLayanans.get(position).getJenis_layanan2());
                intent.putExtra("JenisLayanan3", modelLayanans.get(position).getJenis_layanan3());
                intent.putExtra("NamaRS", modelLayanans.get(position).getNama_rs());
                intent.putExtra("NamaRS2", modelLayanans.get(position).getNama_rs2());
                intent.putExtra("NamaRS3", modelLayanans.get(position).getNama_rs3());
                intent.putExtra("AlamatRS", modelLayanans.get(position).getAlamat_rs());
                intent.putExtra("AlamatRS2", modelLayanans.get(position).getAlamat_rs2());
                intent.putExtra("AlamatRS3", modelLayanans.get(position).getAlamat_rs3());
                intent.putExtra("HargaLayanan", modelLayanans.get(position).getHarga_layanan());
                intent.putExtra("HargaLayanan2", modelLayanans.get(position).getHarga_layanan2());
                intent.putExtra("HargaLayanan3", modelLayanans.get(position).getHarga_layanan3());
                intent.putExtra("PenjelasanLayanan", modelLayanans.get(position).getPenjelasan_layanan());
                intent.putExtra("NamaGone", modelLayanans.get(position).getNama_pasien());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelLayanans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_layanan;
        TextView layanan_name, penjelasan_lay;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layanan_name = itemView.findViewById(R.id.layanan_name);
            img_layanan = itemView.findViewById(R.id.gambar_layanan);
            penjelasan_lay=itemView.findViewById(R.id.penjelasanLayanan);
        }
    }
}
