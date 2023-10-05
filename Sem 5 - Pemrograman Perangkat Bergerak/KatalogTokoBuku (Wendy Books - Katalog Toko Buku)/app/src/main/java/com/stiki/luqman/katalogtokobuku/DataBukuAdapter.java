package com.stiki.luqman.katalogtokobuku;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */

public class DataBukuAdapter extends RecyclerView.Adapter<DataBukuAdapter.DataBukuViewHolder> {


    private ArrayList<DataBuku> dataList;

    public DataBukuAdapter(ArrayList<DataBuku> dataList) {
        this.dataList = dataList;
    }

    @Override
    public DataBukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_data_buku, parent, false);
        return new DataBukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataBukuViewHolder holder, int position) {
        holder.txtJudul.setText(dataList.get(position).getJudul());
        holder.txtPenulis.setText(dataList.get(position).getPenulis());
        holder.txtPenerbit.setText(dataList.get(position).getPenerbit());
        holder.txtHarga.setText(dataList.get(position).getHarga());
        Glide.with(holder.itemView)
                .load(dataList.get(position).getUrlgambar())
                .into(holder.imgUrl);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class DataBukuViewHolder extends RecyclerView.ViewHolder{
        private TextView txtJudul, txtPenulis, txtPenerbit, txtHarga;
        private ImageView imgUrl;

        public DataBukuViewHolder(View itemView) {
            super(itemView);
            txtJudul = (TextView) itemView.findViewById(R.id.txt_judul);
            txtPenulis = (TextView) itemView.findViewById(R.id.txt_penulis);
            txtPenerbit = (TextView) itemView.findViewById(R.id.txt_penerbit);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);
            imgUrl = (ImageView) itemView.findViewById(R.id.img_url);
        }
    }
}