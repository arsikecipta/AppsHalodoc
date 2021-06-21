package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_lihat_artikel extends RecyclerView.Adapter<Adapter_lihat_artikel.ViewHolder> implements Filterable {
    List<model_artikel> modelArtikels;
    List<model_artikel>modelArtikelsFull;
    //    model_artikel[] modelArtikels;
    List<String>artikelList;
    List<String>artikelListAll;
    private Context context;

    public Adapter_lihat_artikel( List<model_artikel>modelArtikels, Context context){
        this.modelArtikels=modelArtikels;
        this.context=context;
        modelArtikelsFull = new ArrayList<>(modelArtikels);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //   LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_artikel, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final   model_artikel lihat_artikel_list =modelArtikels.get(position);
        holder.txt_judul_artikel.setText(lihat_artikel_list.getTitle_artikel());
        holder.txt_topik_artikel.setText(lihat_artikel_list.getTopik_artikel());
        holder.image_artikel.setImageResource(lihat_artikel_list.getImage());
        holder.cardView_all_artikel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Artikel_detail.class);
                intent.putExtra("FotoArtikel", modelArtikels.get(position).getImage());
                intent.putExtra("JudulArtikel",modelArtikels.get(position).getTitle_artikel());
                intent.putExtra("TopikArtikel", modelArtikels.get(position).getTopik_artikel());
                intent.putExtra("DokterArtikel", modelArtikels.get(position).getDokter_artikel());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return modelArtikels.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    Filter exampleFilter = new Filter() {
        //run on background thread
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<model_artikel> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelArtikelsFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(model_artikel item : modelArtikelsFull){
                    if(item.getTopik_artikel().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values=filteredList;
            return  filterResults;
        }
        //run on a ui thread
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults results) {
            modelArtikels.clear();
            modelArtikels.addAll((List) results.values);
            notifyDataSetChanged();

        }
    };

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image_artikel;
        TextView txt_judul_artikel;
        TextView txt_topik_artikel, rowCountTextView;
        CardView cardView_all_artikel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_artikel=itemView.findViewById(R.id.gambar_artikel);
            txt_judul_artikel=itemView.findViewById(R.id.artikel_judul);
            txt_topik_artikel=itemView.findViewById(R.id.artikel_topik);
            cardView_all_artikel=itemView.findViewById(R.id.card_all_artikel);
        }
    }
}
