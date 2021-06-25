package com.example.halodoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_lihat_rs extends RecyclerView.Adapter<Adapter_lihat_rs.ViewHolder> {
    private Context context;
    ArrayList<model_list_rs> modelListRs;
    public Adapter_lihat_rs(ArrayList<model_list_rs> modelListRs,LihatSemuaRS activity){
        this.modelListRs = modelListRs;
        this.context = activity;
    }
    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter_lihat_rs.ViewHolder holder, final int position) {
        final model_list_rs modelRslist= modelListRs.get(position);
        holder.txt_jenis_rs.setText(modelRslist.getJenis_rs());
        holder.txt_alamat_rs.setText(modelRslist.getAlamat_rs());
        holder.txt_nama_rs.setText(modelRslist.getName_rs());
        holder.rs_image.setImageResource(modelRslist.getImage_rs());
    }

    @Override
    public int getItemCount() {
        return modelListRs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView rs_image;
        TextView txt_nama_rs;
        TextView txt_alamat_rs;
        TextView txt_jenis_rs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rs_image = itemView.findViewById(R.id.imageview_rs);
            txt_nama_rs = itemView.findViewById(R.id.name_rs);
            txt_alamat_rs=itemView.findViewById(R.id.alamat_rs);
            txt_jenis_rs=itemView.findViewById(R.id.jenis_rs);
        }
    }
}