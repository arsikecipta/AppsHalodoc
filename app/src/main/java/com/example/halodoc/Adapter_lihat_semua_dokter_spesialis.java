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

public class Adapter_lihat_semua_dokter_spesialis extends RecyclerView.Adapter<Adapter_lihat_semua_dokter_spesialis.ViewHolder> {

    private Context context;
    private List<Model_list_dokter_spesialis> modelListDokterFull;
    private  List<Model_list_dokter_spesialis> modelListDokter;

    public Adapter_lihat_semua_dokter_spesialis (List<Model_list_dokter_spesialis> modelListDokter,Lihat_semua_dokter_spesialis activity){
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
    public void onBindViewHolder(@NonNull Adapter_lihat_semua_dokter_spesialis.ViewHolder holder, int position) {
        Model_list_dokter_spesialis modeldokter = modelListDokter.get(position);

        holder.image_dokter.setImageResource(modeldokter.getImage_dokter());
        holder.nama_dokter.setText(modeldokter.getNama_dokter());
        holder.kategori_dokter.setText(modeldokter.getKategori_dokter());
        holder.tahun.setText(modeldokter.getTahun());
        holder.suka.setText(modeldokter.getSuka());
        holder.harga.setText(modeldokter.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Detail_dokter_spesialis.class);
                intent.putExtra("JudulKategori", modelListDokter.get(position).getJudul());

                intent.putExtra("ImageDokter1", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter1",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori1", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun1",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka1", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter1", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni1",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik1", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR1", modelListDokter.get(position).getStr());


                intent.putExtra("ImageDokter2", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter2",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori2", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun2",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka2", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter2", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni2",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik2", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR2", modelListDokter.get(position).getStr());

                intent.putExtra("ImageDokter3", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter3",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori3", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun3",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka3", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter3", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni3",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik3", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR3", modelListDokter.get(position).getStr());

                intent.putExtra("ImageDokter4", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter4",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori4", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun4",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka4", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter4", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni4",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik4", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR4", modelListDokter.get(position).getStr());

                intent.putExtra("ImageDokter5", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter5",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori5", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun5",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka5", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter5", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni5",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik5", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR5", modelListDokter.get(position).getStr());

                intent.putExtra("ImageDokter6", modelListDokter.get(position).getImage_dokter());
                intent.putExtra("NamaDokter6",modelListDokter.get(position).getNama_dokter());
                intent.putExtra("Kategori6", modelListDokter.get(position).getKategori_dokter());
                intent.putExtra("Tahun6",modelListDokter.get(position).getTahun());
                intent.putExtra("Suka6", modelListDokter.get(position).getSuka());
                intent.putExtra("HargaDokter6", modelListDokter.get(position).getHarga());
                intent.putExtra("Alumni6",modelListDokter.get(position).getAlumni());
                intent.putExtra("Praktik6", modelListDokter.get(position).getPraktik());
                intent.putExtra("STR6", modelListDokter.get(position).getStr());

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
            List<Model_list_dokter_spesialis> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelListDokterFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(Model_list_dokter_spesialis item : modelListDokterFull){
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

        TextView judul;
        TextView nama_dokter;
        TextView kategori_dokter;
        TextView tahun;
        TextView suka;
        TextView harga;
        TextView alumni;
        TextView praktik;
        TextView str;
        TextView deskripsi_info;
        ImageView image_dokter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            deskripsi_info = itemView.findViewById(R.id.deskripsi_info);
            image_dokter = itemView.findViewById(R.id.image_dokter);
            nama_dokter = itemView.findViewById(R.id.nama_dokter);
            kategori_dokter =itemView.findViewById(R.id.kategori_dokter);
            tahun =itemView.findViewById(R.id.tahun);
            suka =itemView.findViewById(R.id.suka);
            harga =itemView.findViewById(R.id.harga);
            alumni =itemView.findViewById(R.id.alumni);
            praktik =itemView.findViewById(R.id.praktik);
            str =itemView.findViewById(R.id.str);
        }
    }
}