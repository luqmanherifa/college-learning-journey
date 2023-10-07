package com.stiki.luqman.demodesktopmenu;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.KeyEvent;
import android.app.AlertDialog;


public class MainActivity extends Activity {
    final Context context = this;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Creating all buttons instances
         * */

        ImageView hdr = (ImageView) findViewById(R.id.hdr);

        TextView ftr = (TextView) findViewById(R.id.ftr);

        Button btn_malang = (Button) findViewById(R.id.btn_malang);

        Button btn_tlpenting = (Button) findViewById(R.id.btn_tlpenting);

        Button btn_tmpenting = (Button) findViewById(R.id.btn_tmpenting);

        Button btn_rsakit = (Button) findViewById(R.id.btn_rsakit);

        Button btn_pwisata = (Button) findViewById(R.id.btn_pwisata);

        Button btn_ptinggi = (Button) findViewById(R.id.btn_ptinggi);

        Button btn_tmusik = (Button) findViewById(R.id.btn_tmusik);

        Button btn_kpemerintah = (Button) findViewById(R.id.btn_kpemerintah);

        hdr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi jika header di click
            }
        });


        btn_malang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol Malang
            }
        });

        btn_tmpenting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol tempat penting
            }
        });

        btn_tlpenting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol telp penting
            }
        });

        btn_rsakit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol RS
            }
        });

        btn_pwisata.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol Pariwisata
            }
        });

        btn_ptinggi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol PT
            }
        });

        btn_tmusik.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol TM
            }
        });

        btn_kpemerintah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi tombol KP
            }
        });

        ftr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //--aksi jika header di click
            }
        });
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("exit");
            //alertDialog.setIcon(R.drawable.appicon);

            alertDialog.setMessage("Do you really want to exit?");
            alertDialog.setButton("Yes", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    return;
                } });
            alertDialog.setButton2("No", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                    return;
                }});
            alertDialog.show();

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}