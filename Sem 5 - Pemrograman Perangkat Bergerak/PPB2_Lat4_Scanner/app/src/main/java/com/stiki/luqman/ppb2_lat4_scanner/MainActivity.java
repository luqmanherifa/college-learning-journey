package com.stiki.luqman.ppb2_lat4_scanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.json.JSONException;
import org.json.JSONObject;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        //View Objects
        private Button buttonScan;
        private TextView textViewName, textViewAddress;

        //qr code scanner object
        private IntentIntegrator qrScan;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View objects
        buttonScan = (Button) findViewById(R.id.buttonScan);
        textViewName = (TextView) findViewById(R.id.textViewName);

        //intializing scan object
        qrScan = new IntentIntegrator(this);

        //attaching onclick listener
        buttonScan.setOnClickListener(this);
}

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
                IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
                if (result != null) {
                        //if qrcode has nothing in it
                        if (result.getContents() == null) {
                                Toast.makeText(this, "Result Not Found", Toast.LENGTH_LONG).show();
                        } else {
                                textViewName.setText(result.getContents());
                        }
                } else {
                        super.onActivityResult(requestCode, resultCode, data);
                }
        }

        @Override
        public void onClick(View view) {
                qrScan.initiateScan();
        }
}