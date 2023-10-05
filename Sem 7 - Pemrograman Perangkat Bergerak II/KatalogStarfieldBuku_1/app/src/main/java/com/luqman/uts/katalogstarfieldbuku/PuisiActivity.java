package com.luqman.uts.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class PuisiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> PuisiArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puisi);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(PuisiArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PuisiActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        PuisiArray = new ArrayList<>();
        PuisiArray.add(new DataBuku("Hujan Bulan Juni", "Penulis\t\t: Sapardi Djoko Damono",
                "Penerbit\t: Grasindo", "Harga\t\t\t: Rp65.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1464443303l/1441445._SX318_.jpg"));
        PuisiArray.add(new DataBuku("Melihat Api Bekerja", "Penulis\t\t: M Aan Mansyur",
                "Penerbit\t: Gramedia", "Harga\t\t\t: Rp85.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1428553025l/25325367.jpg"));
    }

}