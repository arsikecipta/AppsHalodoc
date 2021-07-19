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

public class Adapter_filter_berdasarkan_spesialis extends RecyclerView.Adapter<Adapter_filter_berdasarkan_spesialis.ViewHolder> {

    private Context context;
    ArrayList<Model_list_dokter_spesialis> modelListDokter;
    public Adapter_filter_berdasarkan_spesialis(ArrayList<Model_list_dokter_spesialis> modelListDokter,Filter_berdasarkan_spesialis activity){
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
    public void onBindViewHolder(@NonNull Adapter_filter_berdasarkan_spesialis.ViewHolder holder, int position) {
        Model_list_dokter_spesialis modeldokter = modelListDokter.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Lihat_semua_dokter_filter_spesialis.class);
                intent.putExtra("JudulKategori",modelListDokter.get(position).getNama_dokter());
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
        }
    }
}