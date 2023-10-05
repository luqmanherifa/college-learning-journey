package com.luqman.uts.katalogstarfieldbuku;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class DenahActivity extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denah);

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