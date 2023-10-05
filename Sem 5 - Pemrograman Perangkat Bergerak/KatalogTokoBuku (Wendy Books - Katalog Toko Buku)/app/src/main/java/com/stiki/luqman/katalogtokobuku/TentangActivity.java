package com.stiki.luqman.katalogtokobuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;

public class TentangActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

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

    public void hubwebsite(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://stiki.ac.id/en/home-page/")));
    }

}