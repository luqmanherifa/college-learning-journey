package com.stiki.luqman.katalogtokobuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class SelfImprovementActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> SelfImprovementArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfimprovement);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(SelfImprovementArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SelfImprovementActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        SelfImprovementArray = new ArrayList<>();
        SelfImprovementArray.add(new DataBuku("Loving the Wounded Soul","Penulis\t\t: Regis Machdy",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp70.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1569808196l/50029689._SX318_SY475_.jpg"));
        SelfImprovementArray.add(new DataBuku("Tak Mungkin Membuat Semua Orang Senang","Penulis\t\t: Jeong Moon Jeong",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp69.000",
                "http://img.bukabuku.net/product/e/6/e60f2251dcc684c4cfb60404c43ce713.jpg"));
    }

}