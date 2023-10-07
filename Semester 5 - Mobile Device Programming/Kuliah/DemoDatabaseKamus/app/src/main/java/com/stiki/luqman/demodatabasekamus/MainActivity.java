package com.stiki.luqman.demodatabasekamus;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private SQLiteDatabase db = null;
    private Cursor kamusCursor = null;
    private EditText txtInggris;
    private EditText txtIndonesia;
    private DataKamus datakamus = null;
    public static final String INGGRIS = "inggris";
    public static final String INDONESIA = "indonesia";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datakamus = new DataKamus(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generateData(db);

        setContentView(R.layout.main);
        txtInggris = (EditText) findViewById(R.id.txtInggris);
        txtIndonesia = (EditText) findViewById(R.id.txtIndonesia);

    }

    public void getTerjemahan(View view) {
        String result = "";
        String englishword = txtInggris.getText().toString();
        kamusCursor = db.rawQuery("SELECT ID, INGGRIS, INDONESIA "
                + "FROM kamus where INGGRIS='" + englishword
                + "' ORDER BY INGGRIS", null);

        if (kamusCursor.moveToFirst()) {
            result = kamusCursor.getString(2);
            for (; !kamusCursor.isAfterLast(); kamusCursor.moveToNext()) {
                result = kamusCursor.getString(2);
            }

        }
        if (result.equals("")) {
            result = "Terjemahan Not Found";
        }
        txtIndonesia.setText(result);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        kamusCursor.close();
        db.close();
    }
}