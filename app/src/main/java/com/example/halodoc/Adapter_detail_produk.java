package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Xfermode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter_detail_produk extends RecyclerView.Adapter<Adapter_detail_produk.ViewHolder> {

    private Context context;
    ArrayList<Model_detail_produk> modelListObat;
    public Adapter_detail_produk(ArrayList<Model_detail_produk> modelListObat,Detail_produk_tokes activity){
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
    public void onBindViewHolder(@NonNull Adapter_detail_produk.ViewHolder holder, int position) {
        Model_detail_produk modelobat = modelListObat.get(position);
        holder.image_obat.setImageResource(modelobat.getImage_obat());
        holder.nama_obat.setText(modelobat.getNama_obat());
        holder.jenis.setText(modelobat.getJenis());
        holder.harga_obat.setText(modelobat.getHarga_obat());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Keranjang_tokes.class);

                intent.putExtra("NamaObat1",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis1", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat1", modelListObat.get(position).getHarga_obat());


                intent.putExtra("NamaObat2",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis2", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat2", modelListObat.get(position).getHarga_obat());


                intent.putExtra("NamaObat3",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis3", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat3", modelListObat.get(position).getHarga_obat());


                intent.putExtra("NamaObat4",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis4", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat4", modelListObat.get(position).getHarga_obat());


                intent.putExtra("NamaObat5",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis5", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat5", modelListObat.get(position).getHarga_obat());


                intent.putExtra("NamaObat6",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis6", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat6", modelListObat.get(position).getHarga_obat());


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
        TextView indikasi;
        TextView frekuensi;
        TextView aturan;
        TextView noregist;
        ImageView image_obat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_obat = itemView.findViewById(R.id.gambar_dokter);
            nama_obat = itemView.findViewById(R.id.obat);
            jenis =itemView.findViewById(R.id.kategori);
            harga_obat =itemView.findViewById(R.id.hargakategori);
            indikasi = itemView.findViewById(R.id.indikasi);
            frekuensi =itemView.findViewById(R.id.frekuensi);
            aturan = itemView.findViewById(R.id.aturan);
            noregist =itemView.findViewById(R.id.noregist);

        }
    }
}