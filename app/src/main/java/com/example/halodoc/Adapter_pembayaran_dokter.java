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

public class Adapter_pembayaran_dokter extends RecyclerView.Adapter<Adapter_pembayaran_dokter.ViewHolder> {

    private Context context;
    ArrayList<Model_list_dokter> modelListDokter;
    public Adapter_pembayaran_dokter(ArrayList<Model_list_dokter> modelListDokter,Pembayaran_dokter activity){
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
    public void onBindViewHolder(@NonNull Adapter_pembayaran_dokter.ViewHolder holder, int position) {
        Model_list_dokter modeldokter = modelListDokter.get(position);
        holder.nama_dokter.setText(modeldokter.getNama_dokter());
        holder.kategori_dokter.setText(modeldokter.getKategori_dokter());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Detail_dokter.class);
                intent.putExtra("NamaDokter",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("KategoriDokter", modelListDokter.get(position).getKategori_dokter());
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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_dokter = itemView.findViewById(R.id.nama_dokter);
            kategori_dokter =itemView.findViewById(R.id.kategori_dokter);
        }
    }
}