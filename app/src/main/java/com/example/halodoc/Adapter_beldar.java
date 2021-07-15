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

public class Adapter_beldar extends RecyclerView.Adapter<Adapter_beldar.ViewHolder> {

    private Context context;
    ArrayList<Model_beldar> modelListBeldar;
    public Adapter_beldar (ArrayList<Model_beldar> modelListBeldar,toko_kesehatan activity){
        this.modelListBeldar = modelListBeldar;
        this.context = activity;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layanan_tokes_utama, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_beldar.ViewHolder holder, int position) {
        Model_beldar modeltokes = modelListBeldar.get(position);
        holder.judul.setText(modeltokes.getJudul());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Kategori_produk_utama.class);
                intent.putExtra("JudulKategori", modelListBeldar.get(position).getJudul());

                intent.putExtra("ImageObat1",  modelListBeldar.get(position).getImage_obat1());
                intent.putExtra("NamaObat1", modelListBeldar.get(position).getNama_obat1());
                intent.putExtra("Jenis1",  modelListBeldar.get(position).getJenis1());
                intent.putExtra("HargaObat1", modelListBeldar.get(position).getHarga_obat1());

                intent.putExtra("ImageObat2",  modelListBeldar.get(position).getImage_obat2());
                intent.putExtra("NamaObat2",  modelListBeldar.get(position).getNama_obat2());
                intent.putExtra("Jenis2",  modelListBeldar.get(position).getJenis2());
                intent.putExtra("HargaObat2",  modelListBeldar.get(position).getHarga_obat2());

                intent.putExtra("ImageObat3",  modelListBeldar.get(position).getImage_obat3());
                intent.putExtra("NamaObat3", modelListBeldar.get(position).getNama_obat3());
                intent.putExtra("Jenis3",  modelListBeldar.get(position).getJenis3());
                intent.putExtra("HargaObat3",  modelListBeldar.get(position).getHarga_obat3());

                intent.putExtra("ImageObat4",  modelListBeldar.get(position).getImage_obat4());
                intent.putExtra("NamaObat4",  modelListBeldar.get(position).getNama_obat4());
                intent.putExtra("Jenis4",  modelListBeldar.get(position).getJenis4());
                intent.putExtra("HargaObat4",  modelListBeldar.get(position).getHarga_obat4());

                intent.putExtra("ImageObat5",  modelListBeldar.get(position).getImage_obat5());
                intent.putExtra("NamaObat5",  modelListBeldar.get(position).getNama_obat5());
                intent.putExtra("Jenis5",  modelListBeldar.get(position).getJenis5());
                intent.putExtra("HargaObat5",  modelListBeldar.get(position).getHarga_obat5());

                intent.putExtra("ImageObat6",  modelListBeldar.get(position).getImage_obat6());
                intent.putExtra("NamaObat6",  modelListBeldar.get(position).getNama_obat6());
                intent.putExtra("Jenis6",  modelListBeldar.get(position).getJenis6());
                intent.putExtra("HargaObat6",  modelListBeldar.get(position).getHarga_obat6());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return  modelListBeldar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView judul;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
        }
    }
}