package com.stiki.luqman.katalogtokobuku;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Activity activity = this;
    final Context context = this;
    ImageButton btnRumah, btnDenah, btnBuku;
    Button bAbout, bHelp;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRumah = (ImageButton) this.findViewById(R.id.cmdRumah);
        btnRumah.setOnClickListener(new klik1());

        btnDenah = (ImageButton) this.findViewById(R.id.cmdDenah);
        btnDenah.setOnClickListener(new klik2());

        btnBuku = (ImageButton) this.findViewById(R.id.cmdBuku);
        btnBuku.setOnClickListener(new klik3());

        bAbout = (Button) findViewById(R.id.btnAbout);
        bHelp = (Button) findViewById(R.id.btnHelp);

        bAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.activity_tentang);
                dialog.setTitle("Info Aplikasi");

                TextView tek1 = (TextView) dialog.findViewById(R.id.tek1);
                ImageView logo = (ImageView) dialog.findViewById(R.id.logo);
                TextView tek2 = (TextView) dialog.findViewById(R.id.tek2);
                TextView tek3 = (TextView) dialog.findViewById(R.id.tek3);
                TextView tek5 = (TextView) dialog.findViewById(R.id.tek5);
                tek5.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/"));
                        startActivity(intent);
                    }
                });
                TextView tek4 = (TextView) dialog.findViewById(R.id.tek4);
                tek4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:171111118@mhs.stiki.com"));
                        startActivity(intent);
                    }
                });
                Button btok = (Button) dialog.findViewById(R.id.btok);
                btok.setOnClickListener(new View.OnClickListener() {
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
                bthelp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), Bantuan.class);
                        startActivity(intent);
                    }
                });

                Button btset = (Button) dialog.findViewById(R.id.btset);
                btset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(intent);
                    }
                });

                Button btupd = (Button) dialog.findViewById(R.id.btupd);
                btupd.setOnClickListener(new View.OnClickListener() {
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

    class klik1 implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, BerandaActivity.class );
            startActivity(i);
        }
    }

    class klik2 implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, DenahActivity.class );
            startActivity(i);
        }
    }

    class klik3 implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, KatalogActivity.class );
            startActivity(i);
        }
    }

    class klikGoogleMaps implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, MapsActivity.class );
            startActivity(i);
        }
    }

    class klikcerpen implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, CerpenActivity.class );
            startActivity(i);
        }
    }

    class kliknovel implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, NovelActivity.class );
            startActivity(i);
        }
    }

    class klikselfimprovement implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, SelfImprovementActivity.class );
            startActivity(i);
        }
    }

    class klikpuisi implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, PuisiActivity.class );
            startActivity(i);
        }
    }

    class kliksains implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, SainsActivity.class );
            startActivity(i);
        }
    }

    class kliksejarah implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, SejarahActivity.class );
            startActivity(i);
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Keluar");
            //alertDialog.setIcon(R.drawable.appicon);
            alertDialog.setMessage("Apakah Anda yakin akan menutup aplikasi?");
            alertDialog.setButton("Ya", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    return;
                } });
            alertDialog.setButton2("Tidak", new DialogInterface.OnClickListener() {
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
