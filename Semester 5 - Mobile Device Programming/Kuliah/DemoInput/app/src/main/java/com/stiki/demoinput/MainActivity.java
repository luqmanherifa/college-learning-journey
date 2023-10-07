package com.stiki.demoinput;

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
    private TextView cHasil;
    private EditText cNama;
    private EditText cNilaiUTS;
    private EditText cNilaiTUGAS;
    private EditText cNilaiUAS;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        cNama = (EditText) findViewById(R.id.etNama);
        cNilaiUTS = (EditText) findViewById(R.id.etNilaiUTS);
        cNilaiTUGAS = (EditText) findViewById(R.id.etNilaiTUGAS);
        cNilaiUAS = (EditText) findViewById(R.id.etNilaiUAS);

        ImageButton cProses = (ImageButton) findViewById(R.id.btnProses);
        ImageButton cExit = (ImageButton) findViewById(R.id.btnExit);
        cHasil = (TextView) findViewById(R.id.tvHasil);

        cProses.setOnClickListener(new ViewHasil());
        cExit.setOnClickListener(new Keluar());

    }

    class ViewHasil implements Button.OnClickListener {
        public void onClick (View v)
        {
            int uts, tug, uas;
            double tmp;
            String catatan;
            uts = (Integer.parseInt(cNilaiUTS.getText().toString()));
            tug = (Integer.parseInt(cNilaiTUGAS.getText().toString()));
            uas = (Integer.parseInt(cNilaiUAS.getText().toString()));
            tmp=(uts*0.3)+(tug*0.1)+(uas*0.6);
            if(tmp>=60){
                catatan="LULUS";
            } else {
                catatan="GAGAL";
            }
            Toast.makeText(activity, catatan, Toast.LENGTH_LONG).show();
            cHasil.setText("Haiii.. "+cNama.getText()+"\n"+
                    "Kamu mendapat nilai \n"+
                    "- UTS   : "+cNilaiUTS.getText()+"\n"+
                    "- Tugas : "+cNilaiTUGAS.getText()+"\n"+
                    "- UAS   : "+cNilaiUAS.getText()+"\n"+
                    "-----------------------\n"+
                    "Nilai Akhir     = "+tmp+"\n"+
                    "Anda dinyatakan = "+catatan);

        }
    }
    class Keluar implements Button.OnClickListener {
        public void onClick (View v)
        {
            finish();
        }
    }

}