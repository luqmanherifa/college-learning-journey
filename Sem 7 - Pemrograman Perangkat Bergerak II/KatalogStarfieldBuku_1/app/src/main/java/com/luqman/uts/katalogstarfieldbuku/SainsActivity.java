package com.luqman.uts.katalogstarfieldbuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class SainsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DataBukuAdapter adapter;
    private ArrayList<DataBuku> SainsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sains);

        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new DataBukuAdapter(SainsArray);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SainsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData() {
        SainsArray = new ArrayList<>();
        SainsArray.add(new DataBuku("Kosmos", "Penulis\t\t: Carl Sagan",
                "Penerbit\t: KPG", "Harga\t\t\t: Rp117.000",
                "https://cdn.gramedia.com/uploads/items/9786024242244_kosmos_1__w414_hauto.jpg"));
        SainsArray.add(new DataBuku("The Selfish Gene", "Penulis\t\t: Richard Dawkins",
                "Penerbit\t: KPG", "Harga\t\t\t: Rp85.000",
                "https://www.parcelbuku.net/wp-content/uploads/2017/12/56435-the-selfish-gene-va_1-365x0.jpg"));
    }

}