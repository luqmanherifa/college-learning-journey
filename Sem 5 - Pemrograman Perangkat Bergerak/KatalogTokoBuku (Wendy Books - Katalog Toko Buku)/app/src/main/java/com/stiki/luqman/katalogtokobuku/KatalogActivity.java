package com.stiki.luqman.katalogtokobuku;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class KatalogActivity extends MainActivity {
    ImageButton btnCerpen, btnNovel, btnSelfImprovement, btnPuisi, btnSains, btnSejarah;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);


        btnCerpen = (ImageButton) this.findViewById(R.id.cmdCerpen);
        btnCerpen.setOnClickListener(new klikcerpen());

        btnNovel = (ImageButton) this.findViewById(R.id.cmdNovel);
        btnNovel.setOnClickListener(new kliknovel());

        btnSelfImprovement = (ImageButton) this.findViewById(R.id.cmdSelfImprovement);
        btnSelfImprovement.setOnClickListener(new klikselfimprovement());

        btnPuisi = (ImageButton) this.findViewById(R.id.cmdPuisi);
        btnPuisi.setOnClickListener(new klikpuisi());

        btnSains = (ImageButton) this.findViewById(R.id.cmdSains);
        btnSains.setOnClickListener(new kliksains());

        btnSejarah = (ImageButton) this.findViewById(R.id.cmdSejarah);
        btnSejarah.setOnClickListener(new kliksejarah());


        Button btnBack = (Button) this.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new klik());
    }

    class klik implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            finish();
        }
    }



}