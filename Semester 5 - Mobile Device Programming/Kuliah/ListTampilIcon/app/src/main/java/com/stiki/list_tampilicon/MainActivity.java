package com.stiki.list_tampilicon;

import android.os.Bundle;

import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] menuutama = new String[] {
                "Game",
                "Genre Film",
                "Jenis Musik",
                "Mobil",
                "Motor",
                "Makanan",
                "Keluar"};

        String[] game = new String[] {
                "Dota 2",
                "Counter Strike",
                "Mobile Legend",
                "PlayerUnknown BattleGrounds",
                "Aura Kingdom",
                "Call of Duty",
                "Keluar"};

        String[] genrefilm = new String[] {
                "Romance",
                "Gore",
                "Thriller",
                "Mystery",
                "Horror",
                "Comedy",
                "Keluar"};

        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menuutama));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Object o = this.getListAdapter().getItem(position);
        String pilih = o.toString();

        if (pilih.equals("Game")) {
            this.setListAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, game));
        } else if (pilih.equals("Genre Film")) {
            this.setListAdapter(new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, genrefilm));
        }
    }

}