package com.luqman.uts.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class NovelActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> NovelArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(NovelArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(NovelActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        NovelArray = new ArrayList<>();
        NovelArray.add(new DataBuku("Seperti Dendam, Rindu Harus Dibayar Tuntas", "Penulis\t\t: Eka Kurniawan",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp70.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1559015446l/46029376._SY475_.jpg"));
        NovelArray.add(new DataBuku("Cantik Itu Luka", "Penulis\t\t: Eka Kurniawan",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp125.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1512961607l/37365703._SY475_.jpg"));
        NovelArray.add(new DataBuku("Perempuan Di Titik Nol", "Penulis\t\t: Nawal El Saadawi",
                "Penerbit\t: Yayasan Obor", "Harga\t\t\t: Rp44.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1478753558l/1341023._SY475_.jpg"));
        NovelArray.add(new DataBuku("Hidup Ini Brengsek, dan Aku Dipaksa Menikmatinya", "Penulis\t\t: Puthut EA",
                "Penerbit\t: Shira Media", "Harga\t\t\t: Rp60.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1577708768l/49977287._SY475_.jpg"));
        NovelArray.add(new DataBuku("Merasa Pintar, Bodoh Saja Tak Punya", "Penulis\t\t: Rusdi Mathari",
                "Penerbit\t: Buku Mojok", "Harga\t\t\t: Rp70.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1564381886l/47351065._SX318_.jpg"));
        NovelArray.add(new DataBuku("Nanti Kita Cerita Tentang Hari Ini", "Penulis\t\t: Marchella FP",
                "Penerbit\t: POP", "Harga\t\t\t: Rp.110.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1540464252l/42435393._SX318_.jpg"));
        NovelArray.add(new DataBuku("Nanti Kita Sambat Tentang Hari Ini", "Penulis\t\t: Mas Aik",
                "Penerbit\t: Buku Mojok", "Harga\t\t\t: Rp96.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1556973439l/45451068._SX318_.jpg"));
        NovelArray.add(new DataBuku("Shadow and Bone", "Penulis\t\t: Leigh Bardugo",
                "Penerbit\t: POP", "Harga\t\t\t: Rp60.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1546204239l/35384793.jpg"));
        NovelArray.add(new DataBuku("Sherlock Holmes: A Study in Scarlet", "Penulis\t\t: Arthur Conan Doyle",
                "Penerbit\t: Gramedia Pustaka Utama", "Harga\t\t\t: Rp60.000",
                "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1564105835l/47197738.jpg"));

    }

}