package com.stiki.demoradiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    TextView hasil;
    RadioGroup rg, rg2;
    RadioButton rb1, rb2, rbp1,rbp2,rbp3;
    Button pilih;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.rdoGroup1);
        rb1 = (RadioButton) findViewById(R.id.rdoJK1);
        rb2 = (RadioButton) findViewById(R.id.rdoJK2);

        rg2 = (RadioGroup) findViewById(R.id.rdoGroup2);
        rbp1 = (RadioButton) findViewById(R.id.rdoP1);
        rbp2 = (RadioButton) findViewById(R.id.rdoP2);
        rbp3 = (RadioButton) findViewById(R.id.rdoP3);

        hasil=(TextView) findViewById(R.id.txtTampil);
        pilih = (Button) findViewById(R.id.btnPilih);
        pilih.setOnClickListener(new klik());

    }

    class klik implements Button.OnClickListener
    {
        public void onClick(View v)
        {
            String hsl="";
            if (rb1.isChecked())
                hsl="Jenis Kelamin Anda Laki-laki";
            if (rb2.isChecked())
                hsl="Jenis Kelamin Anda Wanita";
            if (rbp1.isChecked())
                hasil.setText(hsl+"\nPendidikan Anda SD");
            if (rbp2.isChecked())
                hasil.setText(hsl+"\nPendidikan Anda SMP");
            if (rbp3.isChecked())
                hasil.setText(hsl+"\nPendidikan Anda SMA");
        }

    }
}