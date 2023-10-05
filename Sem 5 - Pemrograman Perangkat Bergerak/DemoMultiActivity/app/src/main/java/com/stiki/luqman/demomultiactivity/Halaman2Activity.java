package com.stiki.luqman.demomultiactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class Halaman2Activity extends MainActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

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