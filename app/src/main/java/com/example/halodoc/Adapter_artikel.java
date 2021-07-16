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
import java.util.List;

public class Adapter_artikel extends RecyclerView.Adapter<Adapter_artikel.ViewHolder>  {
    private Context context;
    ArrayList<model_artikel> model_artikels;
    private final int limit = 3;

    public Adapter_artikel(List<model_artikel> model_artikels, Context context){
        this.model_artikels= (ArrayList<model_artikel>) model_artikels;
        this.context=context;
    }
    @NonNull

    @Override
    public Adapter_artikel.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_artikel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter_artikel.ViewHolder holder, int position) {
        final model_artikel modelArtikel_list = model_artikels.get(position);
        holder.img_artikel.setImageResource(modelArtikel_list.getImage());
        holder.jdl_artikel.setText(modelArtikel_list.getTitle_artikel());
        holder.tpk_artikel.setText(modelArtikel_list.getTopik_artikel());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Artikel_detail.class);
                intent.putExtra("FotoArtikel", model_artikels.get(position).getImage());
                intent.putExtra("JudulArtikel",model_artikels.get(position).getTitle_artikel());
                intent.putExtra("TopikArtikel", model_artikels.get(position).getTopik_artikel());
                intent.putExtra("DokterArtikel", model_artikels.get(position).getDokter_artikel());
                intent.putExtra("IsiParagraph", model_artikels.get(position).getIsi_paragraph());
                intent.putExtra("IsiParagraph2", model_artikels.get(position).getIsi_paragraph2());
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        if(model_artikels.size() > limit){
            return limit;
        }
        else
        {
            return model_artikels.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_artikel;
        TextView jdl_artikel, tpk_artikel;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            img_artikel=itemView.findViewById(R.id.img_artikel);
            jdl_artikel=itemView.findViewById(R.id.title_artikel);
            tpk_artikel=itemView.findViewById(R.id.topic_artikel);
        }
    }
}
