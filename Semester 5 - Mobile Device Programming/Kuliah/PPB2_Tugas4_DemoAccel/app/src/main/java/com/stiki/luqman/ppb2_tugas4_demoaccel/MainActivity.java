package com.stiki.luqman.ppb2_tugas4_demoaccel;

import android.app.Activity;
import android.os.Bundle;
import android.hardware.Sensor; // funsi API sensor
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;
    TextView xCoor; // X axis object
    TextView yCoor; // Y axis object
    TextView zCoor; // Z axis object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xCoor=(TextView)findViewById(R.id.xcoor);
        yCoor=(TextView)findViewById(R.id.ycoor);
        zCoor=(TextView)findViewById(R.id.zcoor);

        sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);

        // menambahkan listener.
        sensorManager.registerListener(this,
                sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        // fungsi api yang dipakai untuk perubahan screen orientation
    }

    public void onAccuracyChanged(Sensor sensor,int accuracy){
    }

    public void onSensorChanged(SensorEvent event){
        // cek jenis sensor
        if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER){
            // assign directions
            float x=event.values[0];
            float y=event.values[1];
            float z=event.values[2];
            xCoor.setText("X: "+x);
            yCoor.setText("Y: "+y);
            zCoor.setText("Z: "+z);
        }
    }
}