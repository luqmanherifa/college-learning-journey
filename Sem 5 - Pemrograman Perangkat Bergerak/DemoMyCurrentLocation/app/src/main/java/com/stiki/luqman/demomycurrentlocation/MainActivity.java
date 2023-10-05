package com.stiki.luqman.demomycurrentlocation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button btnLocation;
    TextView txtLoc1, txtLoc2, txtLoc3, txtLoc4, txtLoc5;
    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                    getLocation();
                } else {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 44);
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
                        Geocoder geocoder = new Geocoder(MainActivity.this, Locale.getDefault());

                        //adress list
                        List<Address> addresses = geocoder.getFromLocation(location.getLatitude(),
                                location.getLongitude(), 1);

                        //set latitude on text view
                        txtLoc1.setText(Html.fromHtml("<font color='#6200EE'><b>Latitude :</b><br></font>"+
                                addresses.get(0).getLatitude()));

                        //set longitude on text view
                        txtLoc2.setText(Html.fromHtml("<font color='#6200EE'><b>Longitude :</b><br></font>"+
                                addresses.get(0).getLongitude()));

                        //set country name
                        txtLoc3.setText(Html.fromHtml("<font color='#6200EE'><b>Negara :</b><br></font>"+
                                addresses.get(0).getCountryName()));

                        //set locality
                        txtLoc4.setText(Html.fromHtml("<font color='#6200EE'><b>Locality :</b><br></font>"+
                                addresses.get(0).getLocality()));

                        //set address
                        txtLoc5.setText(Html.fromHtml("<font color='#6200EE'><b>Address :</b><br></font>"+
                                addresses.get(0).getAddressLine(0)));


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

}