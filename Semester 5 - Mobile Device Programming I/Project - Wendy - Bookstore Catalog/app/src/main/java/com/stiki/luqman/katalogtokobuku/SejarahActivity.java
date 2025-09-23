package com.stiki.luqman.katalogtokobuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class SejarahActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> SejarahArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(SejarahArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SejarahActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        SejarahArray = new ArrayList<>();
        SejarahArray.add(new DataBuku("Madilog", "Penulis\t\t: Tan Malaka",
                "Penerbit\t: NARASI", "Harga\t\t\t: Rp100.000",
                "https://cf.shopee.co.id/file/14f2837724d1a3659d34f8cbd3f7cc9b"));
        SejarahArray.add(new DataBuku("Bung Karno Penyambung Lidah Rakyat Indonesia", "Penulis\t\t: Cindy Adams",
                "Penerbit\t: Yayasan Bung Karno", "Harga\t\t\t: Rp120.000",
                "https://cdn.gramedia.com/uploads/items/9789799114518_Bung-Karno-Penyambung-Lidah-Rakyat-Indonesia-Edisi-Revisi__w600_hauto.jpg"));
    }

}