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

public class Adapter_lihat_semua_dokter extends RecyclerView.Adapter<Adapter_lihat_semua_dokter.ViewHolder> {

    private Context context;
    private List<Model_list_dokter> modelListDokterFull;
    private  List<Model_list_dokter> modelListDokter;

    public Adapter_lihat_semua_dokter(List<Model_list_dokter> modelListDokter,lihat_semua_dokter activity){
        this.modelListDokter = modelListDokter;
        this.context = activity;
        modelListDokterFull=new ArrayList<>(modelListDokter);
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dokter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_lihat_semua_dokter.ViewHolder holder, int position) {
        Model_list_dokter modeldokter = modelListDokter.get(position);
        holder.image_dokter.setImageResource(modeldokter.getImage_dokter());
        holder.nama_dokter.setText(modeldokter.getNama_dokter());
        holder.kategori_dokter.setText(modeldokter.getKategori_dokter());
        holder.tahun.setText(modeldokter.getTahun());
        holder.suka.setText(modeldokter.getSuka());
        holder.harga.setText(modeldokter.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Detail_dokter.class);
                intent.putExtra("FotoDokter", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("KategoriDokter", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun", modelListDokter.get(position).getTahun());
                intent.putExtra("Suka", modelListDokter.get(position).getSuka());
                intent.putExtra("Harga", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni", modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR", modelListDokter.get(position).getStr());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return modelListDokter.size();
    }
    public Filter getFilter() {
        return exampleFilter;
    }
    Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<Model_list_dokter> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelListDokterFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(Model_list_dokter item : modelListDokterFull){
                    if(item.getNama_dokter().toLowerCase().contains(filterPattern)){
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
            modelListDokter.clear();
            modelListDokter.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama_dokter;
        TextView kategori_dokter;
        TextView tahun;
        TextView suka;
        TextView harga;
        ImageView image_dokter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_dokter = itemView.findViewById(R.id.image_dokter);
            nama_dokter = itemView.findViewById(R.id.nama_dokter);
            kategori_dokter =itemView.findViewById(R.id.kategori_dokter);
            tahun =itemView.findViewById(R.id.tahun);
            suka =itemView.findViewById(R.id.suka);
            harga =itemView.findViewById(R.id.harga);
        }
    }
}