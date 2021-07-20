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

public class Adapter_lihat_rs extends RecyclerView.Adapter<Adapter_lihat_rs.ViewHolder> {
    private Context context;

    private List<model_list_rs> modelListRsFull;
    private  List<model_list_rs> modelListRs;
    public Adapter_lihat_rs(List<model_list_rs> modelListRs,LihatSemuaRS activity){
        this.modelListRs = modelListRs;
        this.context = activity;
        modelListRsFull=new ArrayList<>(modelListRs);
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
        holder.txt_jenis_rs.setText(modelRslist.getJenis());
        holder.txt_alamat_rs.setText(modelRslist.getAlamat_rs());
        holder.txt_nama_rs.setText(modelRslist.getTitle());
        holder.rs_image.setImageResource(modelRslist.getImage());
        holder.btn_rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(context, Layanan_rs.class);
                intent.putExtra("NamaRS", modelListRs.get(position).getTitle());
                intent.putExtra("FotoRS", modelListRs.get(position).getImage());
                intent.putExtra("JenisRS", modelListRs.get(position).getJenis());
                intent.putExtra("NamaLayanan", modelListRs.get(position).getLayanan());
                intent.putExtra("NamaLayanan2", modelListRs.get(position).getLayanan2());
                intent.putExtra("FotoLayanan",modelListRs.get(position).getFoto_layanan());
                intent.putExtra("FotoLayanan2",modelListRs.get(position).getFoto_layanan2());
                intent.putExtra("AlamatRS",modelListRs.get(position).getAlamat_rs());
                intent.putExtra("InfoRS",modelListRs.get(position).getInfo_rs());
                intent.putExtra("Penjelasan1",modelListRs.get(position).getPenjelasan1());
                intent.putExtra("Penjelasan2",modelListRs.get(position).getPenjelasan2());
                intent.putExtra("Jenislayanan",modelListRs.get(position).getJenis_layanan());
                intent.putExtra("Jenislayanan2",modelListRs.get(position).getJenis_layanan2());
                intent.putExtra("Hargalayanan",modelListRs.get(position).getHarga_layanan());
                intent.putExtra("Hargalayanan2",modelListRs.get(position).getHarga_layanan2());
                intent.putExtra("NamaGone",modelListRs.get(position).getNama_pasien());

                context.startActivity(intent);
            }
        });
//        holder.cardView_rs_semua.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent =  new Intent(context, Layanan_rs.class);
//                intent.putExtra("NamaRS", modelListRs.get(position).getTitle());
//                intent.putExtra("FotoRS", modelListRs.get(position).getImage());
//                intent.putExtra("JenisRS", modelListRs.get(position).getJenis());
//                intent.putExtra("NamaLayanan", modelListRs.get(position).getLayanan());
//                intent.putExtra("NamaLayanan2", modelListRs.get(position).getLayanan2());
//                intent.putExtra("FotoLayanan",modelListRs.get(position).getFoto_layanan());
//                intent.putExtra("FotoLayanan2",modelListRs.get(position).getFoto_layanan2());
//                intent.putExtra("AlamatRS",modelListRs.get(position).getAlamat_rs());
//                intent.putExtra("InfoRS",modelListRs.get(position).getInfo_rs());
//                intent.putExtra("Penjelasan1",modelListRs.get(position).getPenjelasan1());
//                intent.putExtra("Penjelasan2",modelListRs.get(position).getPenjelasan2());
//                intent.putExtra("Jenislayanan",modelListRs.get(position).getJenis_layanan());
//                intent.putExtra("Jenislayanan2",modelListRs.get(position).getJenis_layanan2());
//                intent.putExtra("Hargalayanan",modelListRs.get(position).getHarga_layanan());
//                intent.putExtra("Hargalayanan2",modelListRs.get(position).getHarga_layanan2());
//                intent.putExtra("NamaGone",modelListRs.get(position).getNama_pasien());
//
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return modelListRs.size();
    }

    public Filter getFilter() {
        return exampleFilter;
    }
    Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<model_list_rs> filteredList =new ArrayList<>();
            if(charSequence ==null || charSequence.length() == 0){
                filteredList.addAll(modelListRsFull);

            }else{
                String filterPattern = charSequence.toString().toLowerCase().trim();
                for(model_list_rs item : modelListRsFull){
                    if(item.getTitle().toLowerCase().contains(filterPattern)){
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
            modelListRs.clear();
            modelListRs.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView rs_image;
        TextView txt_nama_rs;
        TextView txt_alamat_rs;
        TextView txt_jenis_rs;
        CardView cardView_rs_semua;
        Button btn_rs;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rs_image = itemView.findViewById(R.id.imageview_rs);
            txt_nama_rs = itemView.findViewById(R.id.name_rs);
            txt_alamat_rs=itemView.findViewById(R.id.alamat_rs);
            txt_jenis_rs=itemView.findViewById(R.id.jenis_rs);
            cardView_rs_semua=itemView.findViewById(R.id.cardview_rs_semua);
            btn_rs=itemView.findViewById(R.id.btn_janji_rs);
        }
    }
}