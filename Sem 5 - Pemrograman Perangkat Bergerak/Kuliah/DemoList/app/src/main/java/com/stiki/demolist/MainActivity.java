package com.stiki.demolist;

import android.os.Bundle;

import android.app.ListActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    /** Called when the activity is first created. */

    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        // Create an array of Strings,
        // that will be put to our ListActivity
        String[] bangundatar = new String[] {
                "Belajar Android",
                "Belajar iPhone",
                "Belajar Blackberry",
                "Belajar Brew",
                "Belajar WinPhone 7",
                "Belajar GPS",
                "hasil 2+5 adalah",
                "Lirik YUI - CHE.R.RY ",
                "Lirik YUI - es.car",
                "Lirik YUI - LIFE",
                "Lirik YUI - Love & Truth",
                "Lirik YUI - Again",
                "Lirik YUI - Tomorrow Way",
                "Lirik YUI - Summer Song",
                "Lirik YUI - Winter Hot Music",
                "Lirik YUI - to Mother",
                "Lirik YUI - Thank you my teens",
                "Lirik YUI - Goodbye Days"};
        // Create an ArrayAdapter,
        // that will actually make the Strings above
        // appear in the ListView
        // Menset nilai array ke dalam list
        // adapater sehingga data pd array akan dimunculkan dlm list

        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, bangundatar));
    }

    @Override
    protected void onListItemClick(ListView l, View v,
                                   int position, long id) {
        super.onListItemClick(l, v, position, id);
        // Get the item that was clicked
        //Menangkap nilai text yang dklik
        Object o = this.getListAdapter().getItem(position);
        String keyword = o.toString();
        if (position==7)
            Toast.makeText(this, "Hasilnya = " + (2+5),
                    Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Anda Memilih: " + keyword,
                    Toast.LENGTH_LONG).show();

    }
}