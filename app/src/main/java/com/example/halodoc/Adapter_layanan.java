package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_layanan extends RecyclerView.Adapter<Adapter_layanan.ViewHolder>{
    private Context context;
    ArrayList<model_layanan> modelLayanan;


    public Adapter_layanan(ArrayList<model_layanan> modelLayanan,Layanan_rs activity){
        this.modelLayanan = modelLayanan;
        this.context = activity;
    }
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_layanan.ViewHolder holder, final int position) {
        final model_layanan modelLayanan_list = modelLayanan.get(position);
        holder.image_lay.setImageResource(modelLayanan_list.getImage_layanan());
        holder.nama_lay.setText(modelLayanan_list.getNama_layanan());
        holder.penjelasan_lay.setText(modelLayanan_list.getPenjelasan_layanan());
        holder.cardView_lay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, ListLayanan.class);
                //passing data
                intent.putExtra("NamaLayanan", modelLayanan.get(position).getNama_layanan());
                intent.putExtra("JenisLayanan", modelLayanan.get(position).getJenis_layanan());
                intent.putExtra("RumahSakitLayanan", modelLayanan.get(position).getNama_rs());
                intent.putExtra("AlamatLayanan", modelLayanan.get(position).getAlamat_rs());
                intent.putExtra("BiayaLayanan", modelLayanan.get(position).getBiaya_layanan());
                intent.putExtra("GambarLayanan", modelLayanan.get(position).getImage_layanan());
                intent.putExtra("PenjelasanLayanan", modelLayanan.get(position).getPenjelasan_layanan());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelLayanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_lay;
        TextView nama_lay, penjelasan_lay, alamat_lay;
        CardView cardView_lay;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            image_lay=itemView.findViewById(R.id.imageview_layanan);
            nama_lay=itemView.findViewById(R.id.nama_lay);
            penjelasan_lay=itemView.findViewById(R.id.penjelasan_layanan);
            cardView_lay=itemView.findViewById(R.id.card_layanan);
        }
    }
}
