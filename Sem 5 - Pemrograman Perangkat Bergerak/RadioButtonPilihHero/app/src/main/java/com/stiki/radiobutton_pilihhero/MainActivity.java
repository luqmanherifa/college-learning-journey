package com.stiki.radiobutton_pilihhero;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    Activity activity;

    private EditText aNickID;

    RadioGroup rghero, rgkelas, rgitem;
    RadioButton rgh1, rgh2, rgh3, rgk1, rgk2, rgi1, rgi2, rgi3, rgi4;
    TextView hasil1, hasil2, rate;
    Button pilih;
    ImageView berubahgambar;
    String pilihkelas, kelashero, itemhero;
    int ratehero, ratekelas, rateitem, totalrate;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        aNickID = (EditText) findViewById(R.id.etNickID);

        rghero = (RadioGroup) findViewById(R.id.etRgHero);
        rgh1 = (RadioButton) findViewById(R.id.etRbHero1);
        rgh2 = (RadioButton) findViewById(R.id.etRbHero2);
        rgh3 = (RadioButton) findViewById(R.id.etRbHero3);

        rgkelas = (RadioGroup) findViewById(R.id.etRgKelas);
        rgk1 = (RadioButton) findViewById(R.id.etRbKelas1);
        rgk2 = (RadioButton) findViewById(R.id.etRbKelas2);

        rgitem = (RadioGroup) findViewById(R.id.etRgItem);
        rgi1 = (RadioButton) findViewById(R.id.etRbItem1);
        rgi2 = (RadioButton) findViewById(R.id.etRbItem2);
        rgi3 = (RadioButton) findViewById(R.id.etRbItem3);
        rgi4 = (RadioButton) findViewById(R.id.etRbItem4);

        rgh1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgh1.isChecked()) {
                    kelashero = "Warrior";
                    ratehero = 12000;
                    rgk1.setText("Champion");
                    rgk2.setText("Paladin");
                }
            }
        });

        rgh2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgh2.isChecked()) {
                    kelashero = "Warrior";
                    ratehero = 13000;
                    rgk1.setText("Hunter");
                    rgk2.setText("Sniper");
                }
            }
        });

        rgh3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgh3.isChecked()) {
                    kelashero = "Warrior";
                    ratehero = 10000;
                    rgk1.setText("Wizard");
                    rgk2.setText("Sorcerer");
                }
            }
        });

        rgk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgk1.isChecked()){
                    if(rgk1.getText().toString().equals("Champion")){
                        pilihkelas = "Champion";
                        berubahgambar.setImageResource(R.drawable.champion);
                        ratekelas = 5000;
                    } else if (rgk1.getText().toString().equals("Hunter")){
                        pilihkelas = "Hunter";
                        berubahgambar.setImageResource(R.drawable.hunter);
                        ratekelas = 4000;
                    } else if (rgk1.getText().toString().equals("Wizard")) {
                        pilihkelas = "Wizard";
                        berubahgambar.setImageResource(R.drawable.wizard);
                        ratekelas = 3500;
                    }
                }
            }
        });

        rgk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgk2.isChecked()){
                    if(rgk2.getText().toString().equals("Paladin")){
                        pilihkelas = "Paladin";
                        berubahgambar.setImageResource(R.drawable.paladin);
                        ratekelas = 7000;
                    } else if (rgk2.getText().toString().equals("Sniper")){
                        pilihkelas = "Sniper";
                        berubahgambar.setImageResource(R.drawable.sniper);
                        ratekelas = 6000;
                    } else if (rgk2.getText().toString().equals("Sorcerer")) {
                        pilihkelas = "Sorcerer";
                        berubahgambar.setImageResource(R.drawable.sorcerer);
                        ratekelas = 5000;
                    }
                }
            }
        });

        rgi1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgi1.isChecked()){
                    itemhero = "Attack Box";
                    rateitem = 10000;
                }
            }
        });

        rgi2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgi2.isChecked()){
                    itemhero = "Defense Box";
                    rateitem = 8000;
                }
            }
        });

        rgi3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgi3.isChecked()){
                    itemhero = "ASPD Box";
                    rateitem = 6000;
                }
            }
        });

        rgi4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rgi4.isChecked()){
                    itemhero = "HP Box";
                    rateitem = 15000;
                }
            }
        });


        hasil1 = (TextView) findViewById(R.id.txtTampil1);
        hasil2 = (TextView) findViewById(R.id.txtTampil2);
        berubahgambar = (ImageView) findViewById(R.id.etGambar);
        pilih = (Button) findViewById(R.id.btnPilih);
        pilih.setOnClickListener(new Terpilih());

    }

    class Terpilih implements Button.OnClickListener {
        public void onClick(View v) {
            totalrate = ratehero+ratekelas+rateitem;

            hasil1.setText(
                    "Nick Anda\t\t: "+aNickID.getText()+"\n"+
                    "------"+"\n"+
                    "Jenis Hero\t\t: "+kelashero+"\n"+
                    "Kelas Hero\t\t: "+pilihkelas+"\n"+
                    "Item Hero\t\t: "+itemhero+"\n"+
                    "------"+"\n"+
                    "Rate Hero\t\t: "+ratehero+"\n"+
                    "Rate Kelas\t\t: "+ratekelas+"\n"+
                    "Rate Item\t\t\t: "+rateitem+"\n"+
                    "------"+"\n"+
                    "Total Rate\t\t: "+totalrate);

        }
    }
}