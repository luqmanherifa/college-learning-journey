package com.stiki.luqman.demoabouthelp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    final Context context = this;
    Button bAbout, bHelp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bAbout = (Button) findViewById(R.id.btn_about);
        Button bHelp = (Button) findViewById(R.id.btn_help);

        bAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.about);
                dialog.setTitle("Info Aplikasi");

                TextView tek1 = (TextView) dialog.findViewById(R.id.tek1);
                ImageView logo = (ImageView) dialog.findViewById(R.id.logo);
                TextView tek2 = (TextView) dialog.findViewById(R.id.tek2);
                TextView tek3 = (TextView) dialog.findViewById(R.id.tek3);
                TextView tek5 = (TextView) dialog.findViewById(R.id.tek5);
                tek5.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/"));
                        startActivity(intent);
                    }
                });
                TextView tek4 = (TextView) dialog.findViewById(R.id.tek4);
                tek4.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:subari@stiki.ac.id"));
                        startActivity(intent);
                    }
                });
                Button btok = (Button) dialog.findViewById(R.id.btok);
                btok.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        bHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.bantuan);
                dialog.setTitle("Info Bantuan");

                Button bthelp = (Button) dialog.findViewById(R.id.bthelp);
                bthelp.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Bantuan.class);
                        startActivity(intent);
                    }
                });

                Button btset = (Button) dialog.findViewById(R.id.btset);
                btset.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(intent);
                    }
                });

                Button btupd = (Button) dialog.findViewById(R.id.btupd);
                btupd.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Intent intent = new Intent(getApplicationContext(), TesUpdate.class);
                        //startActivity(intent);
                    }

                });
                dialog.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}