package com.luqman.uts.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class CerpenActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> CerpenArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerpen);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(CerpenArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CerpenActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        CerpenArray = new ArrayList<>();
        CerpenArray.add(new DataBuku("9 dari Nadira", "Penulis\t\t: Leila S. Chudori",
                "Penerbit\t: KPG", "Harga\t\t\t: Rp49.500",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1464162954l/7049082._SX318_.jpg"));
        CerpenArray.add(new DataBuku("Karena Kita Tidak Kenal", "Penulis\t\t: Farida Susanty",
                "Penerbit\t: Grasindo", "Harga\t\t\t: Rp35.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1373277458l/18113208.jpg"));
        CerpenArray.add(new DataBuku("Robohnya Surau Kami", "Penulis\t\t: Robohnya Surau Kami",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp25.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1466437017l/1455480._SY475_.jpg"));
        CerpenArray.add(new DataBuku("Seribu Kunang-kunang di Manhattan", "Penulis\t\t: Umar Kayam",
                "Penerbit\t: Grafiti", "Harga\t\t\t: Rp53.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1466438661l/1680750._SY475_.jpg"));
        CerpenArray.add(new DataBuku("Perempuan Patah Hati yang Kembali Menemukan Cinta Melalui Mimpi", "Penulis\t\t: Eka Kurniawan",
                "Penerbit\t: Bentang Pustaka", "Harga\t\t\t: Rp30.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1464281082l/24636477._SY475_.jpg"));
        CerpenArray.add(new DataBuku("Orang-Orang Bloomington", "Penulis\t\t: Budi Darma",
                "Penerbit\t: Metafor Intermedia", "Harga\t\t\t: Rp60.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1417054904l/2236672.jpg"));
        CerpenArray.add(new DataBuku("Dilarang Menyanyi di Kamar Mandi", "Penulis\t\t: Seno Gumira Ajidarma",
                "Penerbit\t: Subentra Citra Pustaka", "Harga\t\t\t: Rp51.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1470152194l/1025843._SY475_.jpg"));
        CerpenArray.add(new DataBuku("Catatan Orang Gila", "Penulis\t\t: Han Gagas",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp40.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1412595863l/23312408.jpg"));

    }

}