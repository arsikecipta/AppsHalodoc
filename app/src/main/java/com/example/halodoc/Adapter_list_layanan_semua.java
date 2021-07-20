package com.example.halodoc;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_list_layanan_semua extends RecyclerView.Adapter<Adapter_list_layanan_semua.ViewHolder> {

    private Context context;
    private List<model_list_layanan_semua> modelListLayananSemuaFull;
    private List<model_list_layanan_semua> modelListLayananSemuas;

    public Adapter_list_layanan_semua(List<model_list_layanan_semua> modelListLayananSemuas,ListSemuaLayanan activity){
        this.modelListLayananSemuas = modelListLayananSemuas;
        this.context = activity;
        modelListLayananSemuaFull=new ArrayList<>(modelListLayananSemuas);
    }
    @NonNull

    @Override
    public Adapter_list_layanan_semua.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layanan, parent, false);
        return new Adapter_list_layanan_semua.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_list_layanan_semua.ViewHolder holder, int position) {
        final model_list_layanan_semua modelLayananlist= modelListLayananSemuas.get(position);
        holder.txt_nama_layanan.setText(modelLayananlist.getNama_layanan());
        holder.txt_nama_rs.setText(modelLayananlist.getNama_rs());
        holder.txt_alamat_rs.setText(modelLayananlist.getAlamat_rs());
        holder.txt_jenis_layanan.setText(modelLayananlist.getJenis_layanan());
        holder.txt_biaya_layanan.setText(modelLayananlist.getBiaya_layanan());
        holder.image_layanan.setImageResource(modelLayananlist.getImage_layanan());
        holder.button_janji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Jadwal_janji.class);
                //passing data to detail
                intent.putExtra("NamaLayanan", modelListLayananSemuas.get(position).getNama_layanan());
                intent.putExtra("JenisLayanan", modelListLayananSemuas.get(position).getJenis_layanan());
                intent.putExtra("RumahSakitLayanan", modelListLayananSemuas.get(position).getNama_rs());
                intent.putExtra("AlamatLayanan", modelListLayananSemuas.get(position).getAlamat_rs());
                intent.putExtra("BiayaLayanan", modelListLayananSemuas.get(position).getBiaya_layanan());
                intent.putExtra("GambarLayanan", modelListLayananSemuas.get(position).getImage_layanan());
                intent.putExtra("PenjelasanLayanan", modelListLayananSemuas.get(position).getPenjelasan_layanan());
                intent.putExtra("NamaGone",modelListLayananSemuas.get(position).getNama_pasien());
                context.startActivity(intent);
            }
        });
//        holder.cardView_list.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =  new Intent(context, Jadwal_janji.class);
//                //passing data to detail
//                intent.putExtra("NamaLayanan", modelListLayananSemuas.get(position).getNama_layanan());
//                intent.putExtra("JenisLayanan", modelListLayananSemuas.get(position).getJenis_layanan());
//                intent.putExtra("RumahSakitLayanan", modelListLayananSemuas.get(position).getNama_rs());
//                intent.putExtra("AlamatLayanan", modelListLayananSemuas.get(position).getAlamat_rs());
//                intent.putExtra("BiayaLayanan", modelListLayananSemuas.get(position).getBiaya_layanan());
//                intent.putExtra("GambarLayanan", modelListLayananSemuas.get(position).getImage_layanan());
//                intent.putExtra("PenjelasanLayanan", modelListLayananSemuas.get(position).getPenjelasan_layanan());
//                intent.putExtra("NamaGone",modelListLayananSemuas.get(position).getNama_pasien());
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
      return  modelListLayananSemuas.size();
    }
    public Filter getFilter() {
        return exampleFilter;
    }
    Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<model_list_layanan_semua> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelListLayananSemuaFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(model_list_layanan_semua item : modelListLayananSemuaFull){
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
            modelListLayananSemuas.clear();
            modelListLayananSemuas.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image_layanan;
        TextView txt_nama_layanan;
        TextView txt_nama_rs;
        TextView txt_alamat_rs;
        TextView txt_jenis_layanan;
        TextView txt_biaya_layanan;
        Button button_janji;
        CardView cardView_list;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            image_layanan = itemView.findViewById(R.id.imageview_list_layanan);
            txt_nama_layanan = itemView.findViewById(R.id.nama_list_layanan);
            txt_nama_rs = itemView.findViewById(R.id.layanan_list_rumahsakit);
            txt_alamat_rs = itemView.findViewById(R.id.layanan_list_alamat_rs);
            txt_jenis_layanan = itemView.findViewById(R.id.jenis_list_layanan);
            txt_biaya_layanan = itemView.findViewById(R.id.list_biaya_layanan);
            button_janji = itemView.findViewById(R.id.btn_janji);
            cardView_list = itemView.findViewById(R.id.card_list_layanan);
        }
    }
}
