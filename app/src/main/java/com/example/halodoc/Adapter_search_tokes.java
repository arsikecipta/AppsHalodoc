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

public class Adapter_search_tokes extends RecyclerView.Adapter<Adapter_search_tokes.ViewHolder> {

    private Context context;
    ArrayList<Model_search_tokes> modelListObat;
    public Adapter_search_tokes (ArrayList<Model_search_tokes> modelListObat,Search_tokes activity){
        this.modelListObat = modelListObat;
        this.context = activity;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layanan_tokes_all, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_search_tokes.ViewHolder holder, int position) {
        Model_search_tokes modelobat = modelListObat.get(position);

        holder.image_obat.setImageResource(modelobat.getImage_obat());
        holder.nama_obat.setText(modelobat.getNama_obat());
        holder.jenis.setText(modelobat.getJenis());
        holder.harga_obat.setText(modelobat.getHarga_obat());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Detail_produk_tokes.class);
                intent.putExtra("ImageObat1", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat1",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis1", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat1", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi1", modelListObat.get(position).getIndikasi());
                intent.putExtra("Frekuensi1",modelListObat.get(position).getFrekuensi());
                intent.putExtra("Aturan1", modelListObat.get(position).getAturan());
                intent.putExtra("NoRegist1", modelListObat.get(position).getNoregist());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return modelListObat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama_obat;
        TextView jenis;
        TextView harga_obat;
        ImageView image_obat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_obat = itemView.findViewById(R.id.image_obat);
            nama_obat = itemView.findViewById(R.id.nama_obat);
            jenis =itemView.findViewById(R.id.jenis);
            harga_obat =itemView.findViewById(R.id.harga_obat);
        }
    }
}