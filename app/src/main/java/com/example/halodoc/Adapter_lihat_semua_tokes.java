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

public class Adapter_lihat_semua_tokes extends RecyclerView.Adapter<Adapter_lihat_semua_tokes.ViewHolder> {

    private Context context;
    ArrayList<Model_list_tokes> modelListTokes;
    public Adapter_lihat_semua_tokes (ArrayList<Model_list_tokes> modelListTokes,lihat_semua_tokes activity){
        this.modelListTokes = modelListTokes;
        this.context = activity;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layanan_tokes_utama, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_lihat_semua_tokes.ViewHolder holder, int position) {
        Model_list_tokes modeltokes = modelListTokes.get(position);
        holder.judul.setText(modeltokes.getJudul());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Kategori_Produk.class);
                intent.putExtra("JudulKategori", modelListTokes.get(position).getJudul());

                intent.putExtra("ImageObat1", modelListTokes.get(position).getImage_obat1());
                intent.putExtra("NamaObat1",modelListTokes.get(position).getNama_obat1());
                intent.putExtra("Jenis1", modelListTokes.get(position).getJenis1());
                intent.putExtra("HargaObat1", modelListTokes.get(position).getHarga_obat1());

                intent.putExtra("ImageObat2", modelListTokes.get(position).getImage_obat2());
                intent.putExtra("NamaObat2",modelListTokes.get(position).getNama_obat2());
                intent.putExtra("Jenis2", modelListTokes.get(position).getJenis2());
                intent.putExtra("HargaObat2", modelListTokes.get(position).getHarga_obat2());

                intent.putExtra("ImageObat3", modelListTokes.get(position).getImage_obat3());
                intent.putExtra("NamaObat3",modelListTokes.get(position).getNama_obat3());
                intent.putExtra("Jenis3", modelListTokes.get(position).getJenis3());
                intent.putExtra("HargaObat3", modelListTokes.get(position).getHarga_obat3());

                intent.putExtra("ImageObat4", modelListTokes.get(position).getImage_obat4());
                intent.putExtra("NamaObat4",modelListTokes.get(position).getNama_obat4());
                intent.putExtra("Jenis4", modelListTokes.get(position).getJenis4());
                intent.putExtra("HargaObat4", modelListTokes.get(position).getHarga_obat4());

                intent.putExtra("ImageObat5", modelListTokes.get(position).getImage_obat5());
                intent.putExtra("NamaObat5",modelListTokes.get(position).getNama_obat5());
                intent.putExtra("Jenis5", modelListTokes.get(position).getJenis5());
                intent.putExtra("HargaObat5", modelListTokes.get(position).getHarga_obat5());

                intent.putExtra("ImageObat6", modelListTokes.get(position).getImage_obat6());
                intent.putExtra("NamaObat6",modelListTokes.get(position).getNama_obat6());
                intent.putExtra("Jenis6", modelListTokes.get(position).getJenis6());
                intent.putExtra("HargaObat6", modelListTokes.get(position).getHarga_obat6());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return modelListTokes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView judul;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
        }
    }
}