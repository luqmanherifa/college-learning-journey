package com.luqman.uts.katalogstarfieldbuku;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class BerandaActivity extends MainActivity {
    ImageButton btnGoogleMaps;
    Button btnLocation;
    TextView txtLoc1, txtLoc2, txtLoc3, txtLoc4, txtLoc5;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        btnGoogleMaps = (ImageButton) this.findViewById(R.id.openGoogleMaps);
        btnGoogleMaps.setOnClickListener(new klikGoogleMaps());

        Button btnBack = (Button) this.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new klik());

        btnLocation = findViewById(R.id.buttonLocation);
        txtLoc1 = findViewById(R.id.textLoc1);
        txtLoc2 = findViewById(R.id.textLoc2);
        txtLoc3 = findViewById(R.id.textLoc3);
        txtLoc4 = findViewById(R.id.textLoc4);
        txtLoc5 = findViewById(R.id.textLoc5);

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        btnLocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ActivityCompat.checkSelfPermission(BerandaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    getLocation();
                } else {
                    ActivityCompat.requestPermissions(BerandaActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);
                }
            }
        });
    }

    private void getLocation(){
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location location = task.getResult();
                if(location != null) {
                    try {
                        //geocoder
                        Geocoder geocoder = new Geocoder(BerandaActivity.this, Locale.getDefault());

                        //adress list
                        List<Address> addresses = geocoder.getFromLocation(location.getLatitude(),
                                location.getLongitude(), 1);

                        //set latitude on text view
                        txtLoc1.setText(Html.fromHtml("<font color='#000000'><b>Latitude :</b><br></font>"+
                                addresses.get(0).getLatitude()));

                        //set longitude on text view
                        txtLoc2.setText(Html.fromHtml("<font color='#000000'><b>Longitude :</b><br></font>"+
                                addresses.get(0).getLongitude()));

                        //set country name
                        txtLoc3.setText(Html.fromHtml("<font color='#000000'><b>Negara :</b><br></font>"+
                                addresses.get(0).getCountryName()));

                        //set locality
                        txtLoc4.setText(Html.fromHtml("<font color='#000000'><b>Locality :</b><br></font>"+
                                addresses.get(0).getLocality()));

                        //set address
                        txtLoc5.setText(Html.fromHtml("<font color='#000000'><b>Address :</b><br></font>"+
                                addresses.get(0).getAddressLine(0)));


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    class klik implements Button.OnClickListener
    {
        public void onClick (View v)
        {

            finish();
        }
    }

    public void hublokasi(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Togamas+Dieng/@-7.9735977,112.611397,17z/data=!3m1!4b1!4m5!3m4!1s0x2e78829b5912e81d:0x9cdde4039177212b!8m2!3d-7.973603!4d112.613591?hl=id")));
    }

    public void hubtelpon(View view){
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085236199696")));
    }

}