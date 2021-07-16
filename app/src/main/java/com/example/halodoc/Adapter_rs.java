package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_rs extends RecyclerView.Adapter<Adapter_rs.ViewHolder> {
    private Context context;
    ArrayList<model_rs> modelRs;
    private final int limit = 3;
    //final private ListItemClickListener mOnClickListener;

    public Adapter_rs(ArrayList<model_rs> modelRs,BuatJanjiRS activity){
        this.modelRs = modelRs;
        this.context = activity;
    }
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rs, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_rs.ViewHolder holder, final int position) {
        model_rs modelRs_list = modelRs.get(position);
        holder.image_rs.setImageResource(modelRs_list.getImage());
        holder.nama_rs.setText(modelRs_list.getTitle());
        holder.jenis_rs.setText(modelRs_list.getJenis());
        holder.alamat_rs.setText(modelRs_list.getAlamat_rs());
        holder.cardView_rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Layanan_rs.class);
                intent.putExtra("NamaRS", modelRs.get(position).getTitle());
                intent.putExtra("FotoRS", modelRs.get(position).getImage());
                intent.putExtra("JenisRS", modelRs.get(position).getJenis());
                intent.putExtra("NamaLayanan", modelRs.get(position).getLayanan());
                intent.putExtra("NamaLayanan2", modelRs.get(position).getLayanan2());
                intent.putExtra("FotoLayanan",modelRs.get(position).getFoto_layanan());
                intent.putExtra("FotoLayanan2",modelRs.get(position).getFoto_layanan2());
                intent.putExtra("AlamatRS",modelRs.get(position).getAlamat_rs());
                intent.putExtra("InfoRS",modelRs.get(position).getInfo_rs());
                intent.putExtra("Penjelasan1",modelRs.get(position).getPenjelasan1());
                intent.putExtra("Penjelasan2",modelRs.get(position).getPenjelasan2());
                intent.putExtra("Jenislayanan",modelRs.get(position).getJenis_layanan());
                intent.putExtra("Jenislayanan2",modelRs.get(position).getJenis_layanan2());
                intent.putExtra("Hargalayanan",modelRs.get(position).getHarga_layanan());
                intent.putExtra("Hargalayanan2",modelRs.get(position).getHarga_layanan2());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        if(modelRs.size() > limit){
            return limit;
        }
        else
        {
            return modelRs.size();
        }
    }
    public interface ListItemClickListener {
        void onRsListClick(int clickedItemIndex);
    }
    public class ViewHolder extends RecyclerView.ViewHolder   {
        ImageView image_rs;
        TextView nama_rs, jenis_rs, desc_rs,alamat_rs;
        CardView cardView_rs;
        Button btn_lihat;
        RecyclerView rc_rs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image_rs = itemView.findViewById(R.id.image_rs);
            nama_rs = itemView.findViewById(R.id.txt_namars);
            jenis_rs = itemView.findViewById(R.id.txt_jenis);
            alamat_rs = itemView.findViewById(R.id.txt_alamat);
            cardView_rs=itemView.findViewById(R.id.card_rs);
            btn_lihat=itemView.findViewById(R.id.btn_lihatsemua);
            rc_rs =itemView.findViewById(R.id.recyclerview_rs);


        }


    }
}
