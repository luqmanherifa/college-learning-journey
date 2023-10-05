package com.stiki.beratbadanideal;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends Activity {
    Activity activity;
    private TextView aHasil;
    private EditText aNama;
    private EditText aUsia;
    private EditText aBerat;
    private EditText aTinggi;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        aNama = (EditText) findViewById(R.id.etNama);
        aUsia = (EditText) findViewById(R.id.etUsia);
        aBerat = (EditText) findViewById(R.id.etBeratBadan);
        aTinggi = (EditText) findViewById(R.id.etTinggiBadan);

        ImageButton aProses = (ImageButton) findViewById(R.id.btnProses);
        ImageButton aKeluar = (ImageButton) findViewById(R.id.btnKeluar);
        aHasil = (TextView) findViewById(R.id.tvHasil);

        aProses.setOnClickListener(new Hasil());
        aKeluar.setOnClickListener(new Exit());

    }

    class Hasil implements Button.OnClickListener {
        public void onClick (View v)
        {
            int usia;
            double hitung, bb, tb;
            String catatan1, catatan2, catatan3;
            usia = (Integer.parseInt(aUsia.getText().toString()));
            bb = (Integer.parseInt(aBerat.getText().toString()));
            tb = (Integer.parseInt(aTinggi.getText().toString()));
            hitung=(100*100*bb)/(tb*tb);

            if (hitung < 18.5) {
                catatan1 = "KURUS";
            } else if (hitung >= 18.5 && hitung <= 24.9){
                catatan1 = "NORMAL";
            } else if (hitung >= 25 && hitung <= 29.9){
                catatan1 = "OVERWEIGHT";
            } else{
                catatan1 = "OBESITAS";
            }

            if (hitung < 18.5) {
                catatan2 = "KURUS";
            } else if (hitung >= 18.5 && hitung <= 22.9) {
                catatan2 = "NORMAL";
            } else if (hitung >= 23 && hitung <= 24.9) {
                catatan2 = "OVERWEIGHT";
            } else {
                catatan2 = "OBESITAS";
            }

            catatan3 = hitung+"\n"+catatan1;

            //Toast.makeText(activity, catatan3, Toast.LENGTH_LONG).show();
            aHasil.setText("Nama\t: "+aNama.getText()+"\n"+
                    "Usia\t: "+aUsia.getText()+"\n"+
                    "Berat\t: "+aBerat.getText()+"\n"+
                    "Tinggi\t: "+aTinggi.getText()+"\n"+
                    "---\n"+
                    "BMI\t: "+hitung+"\n"+
                    "---\n"+
                    "WHO\t: "+catatan1+"\n"+
                    "ASIA PASIFIC: "+catatan2);
        }
    }

    class Exit implements Button.OnClickListener {
        public void onClick (View v)
        {
            finish();
        }
    }

}