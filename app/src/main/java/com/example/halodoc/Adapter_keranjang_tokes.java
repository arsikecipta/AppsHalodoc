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

public class Adapter_keranjang_tokes extends RecyclerView.Adapter<Adapter_keranjang_tokes.ViewHolder> {

    private Context context;
    ArrayList<Model_detail_produk> modelListObat;
    public Adapter_keranjang_tokes(ArrayList<Model_detail_produk> modelListObat,Keranjang_tokes activity){
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
    public void onBindViewHolder(@NonNull Adapter_keranjang_tokes.ViewHolder holder, int position) {
        Model_detail_produk modelobat = modelListObat.get(position);
        holder.nama_obat.setText(modelobat.getNama_obat());
        holder.jenis.setText(modelobat.getJenis());
        holder.image_obat.setImageResource(modelobat.getImage_obat());
        holder.harga_obat.setText(modelobat.getHarga_obat());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Pembayaran_tokes.class);
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
        ImageView image_obat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama_obat = itemView.findViewById(R.id.nama_obat);
            jenis =itemView.findViewById(R.id.jenis);
            harga_obat =itemView.findViewById(R.id.harga_obat);
            image_obat =itemView.findViewById(R.id.image_obat);
        }
    }
}