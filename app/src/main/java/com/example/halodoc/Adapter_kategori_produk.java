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

public class Adapter_kategori_produk extends RecyclerView.Adapter<Adapter_kategori_produk.ViewHolder> {

    private Context context;
    ArrayList<Model_list_kategori_tokes> modelListObat;
    public Adapter_kategori_produk (ArrayList<Model_list_kategori_tokes> modelListObat,Kategori_Produk activity){
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
    public void onBindViewHolder(@NonNull Adapter_kategori_produk.ViewHolder holder, int position) {
        Model_list_kategori_tokes modelobat = modelListObat.get(position);

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
                intent.putExtra("Indikasi1", modelListObat.get(position).getIndikasi1());
                intent.putExtra("Frekuensi1",modelListObat.get(position).getFrekuensi1());
                intent.putExtra("Aturan1", modelListObat.get(position).getAturan1());
                intent.putExtra("NoRegist1", modelListObat.get(position).getNoregist1());


                intent.putExtra("ImageObat2", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat2",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis2", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat2", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi2", modelListObat.get(position).getIndikasi2());
                intent.putExtra("Frekuensi2",modelListObat.get(position).getFrekuensi2());
                intent.putExtra("Aturan2", modelListObat.get(position).getAturan2());
                intent.putExtra("NoRegist2", modelListObat.get(position).getNoregist2());


                intent.putExtra("ImageObat3", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat3",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis3", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat3", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi3", modelListObat.get(position).getIndikasi3());
                intent.putExtra("Frekuensi3",modelListObat.get(position).getFrekuensi3());
                intent.putExtra("Aturan3", modelListObat.get(position).getAturan3());
                intent.putExtra("NoRegist3", modelListObat.get(position).getNoregist3());


                intent.putExtra("ImageObat4", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat4",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis4", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat4", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi4", modelListObat.get(position).getIndikasi4());
                intent.putExtra("Frekuensi4",modelListObat.get(position).getFrekuensi4());
                intent.putExtra("Aturan4", modelListObat.get(position).getAturan4());
                intent.putExtra("NoRegist4", modelListObat.get(position).getNoregist4());


                intent.putExtra("ImageObat5", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat5",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis5", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat5", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi5", modelListObat.get(position).getIndikasi5());
                intent.putExtra("Frekuensi5",modelListObat.get(position).getFrekuensi5());
                intent.putExtra("Aturan5", modelListObat.get(position).getAturan5());
                intent.putExtra("NoRegist5", modelListObat.get(position).getNoregist5());

                intent.putExtra("ImageObat6", modelListObat.get(position).getImage_obat());
                intent.putExtra("NamaObat6",modelListObat.get(position).getNama_obat());
                intent.putExtra("Jenis6", modelListObat.get(position).getJenis());
                intent.putExtra("HargaObat6", modelListObat.get(position).getHarga_obat());
                intent.putExtra("Indikasi6", modelListObat.get(position).getIndikasi6());
                intent.putExtra("Frekuensi6",modelListObat.get(position).getFrekuensi6());
                intent.putExtra("Aturan6", modelListObat.get(position).getAturan6());
                intent.putExtra("NoRegist6", modelListObat.get(position).getNoregist6());

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