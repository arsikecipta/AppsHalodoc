package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_lihat_all_layanan extends RecyclerView.Adapter<Adapter_lihat_all_layanan.ViewHolder> {
    private Context context;

    private List<model_all_layanan> modelAllLayanansFull;
    private  List<model_all_layanan> modelAllLayanans;
    public Adapter_lihat_all_layanan(List<model_all_layanan> modelAllLayanans,List_all_layanan activity){
        this.modelAllLayanans = modelAllLayanans;
        this.context = activity;
        modelAllLayanansFull=new ArrayList<>(modelAllLayanans);
    }
    @NonNull

    @Override
    public Adapter_lihat_all_layanan.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_all_layanan, parent, false);
        return new Adapter_lihat_all_layanan.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_lihat_all_layanan.ViewHolder holder, int position) {
        model_all_layanan model_all_layanan_list = modelAllLayanans.get(position);
        holder.layanan_name.setText(model_all_layanan_list.getNama_layanan());
        holder.img_layanan.setImageResource(model_all_layanan_list.getGambar_layanan());
        holder.penjelasan_lay.setText(model_all_layanan_list.getPenjelasan_layanan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ListSemuaLayanan.class);
                intent.putExtra("NamaLayanan", modelAllLayanans.get(position).getNama_layanan());
                intent.putExtra("NamaLayanan2", modelAllLayanans.get(position).getNama_layanan2());
                intent.putExtra("NamaLayanan3", modelAllLayanans.get(position).getNama_layanan3());
                intent.putExtra("NamaLayanan4", modelAllLayanans.get(position).getNama_layanan4());
                intent.putExtra("GambarLayanan", modelAllLayanans.get(position).getGambar_layanan());
                intent.putExtra("GambarRS", modelAllLayanans.get(position).getGambar_rs());
                intent.putExtra("GambarRS2", modelAllLayanans.get(position).getGambar_rs2());
                intent.putExtra("GambarRS3", modelAllLayanans.get(position).getGambar_rs3());
                intent.putExtra("JenisLayanan", modelAllLayanans.get(position).getJenis_layanan());
                intent.putExtra("JenisLayanan2", modelAllLayanans.get(position).getJenis_layanan2());
                intent.putExtra("JenisLayanan3", modelAllLayanans.get(position).getJenis_layanan3());
                intent.putExtra("NamaRS", modelAllLayanans.get(position).getNama_rs());
                intent.putExtra("NamaRS2", modelAllLayanans.get(position).getNama_rs2());
                intent.putExtra("NamaRS3", modelAllLayanans.get(position).getNama_rs3());
                intent.putExtra("AlamatRS", modelAllLayanans.get(position).getAlamat_rs());
                intent.putExtra("AlamatRS2", modelAllLayanans.get(position).getAlamat_rs2());
                intent.putExtra("AlamatRS3", modelAllLayanans.get(position).getAlamat_rs3());
                intent.putExtra("HargaLayanan", modelAllLayanans.get(position).getHarga_layanan());
                intent.putExtra("HargaLayanan2", modelAllLayanans.get(position).getHarga_layanan2());
                intent.putExtra("HargaLayanan3", modelAllLayanans.get(position).getHarga_layanan3());
                intent.putExtra("PenjelasanLayanan", modelAllLayanans.get(position).getPenjelasan_layanan());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelAllLayanans.size();
    }
    public Filter getFilter() {
        return exampleFilter;
    }
    Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<model_all_layanan> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelAllLayanansFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(model_all_layanan item : modelAllLayanansFull){
                    if(item.getNama_layanan().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values=filteredList;
            return  results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            modelAllLayanans.clear();
            modelAllLayanans.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_layanan;
        TextView layanan_name,penjelasan_lay;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layanan_name = itemView.findViewById(R.id.layanan_name);
            img_layanan = itemView.findViewById(R.id.gambar_layanan);
            penjelasan_lay=itemView.findViewById(R.id.penjelasanLayanan);
        }
    }
}
