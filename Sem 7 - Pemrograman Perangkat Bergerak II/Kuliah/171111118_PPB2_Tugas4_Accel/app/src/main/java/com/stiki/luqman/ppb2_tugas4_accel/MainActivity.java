package com.stiki.luqman.ppb2_tugas4_accel;

import android.os.Bundle;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private TextView textViewX, textViewY, textViewZ;
    private TextView textViewKiri, textViewKanan, textViewAtas, textViewBawah;
    private ImageView imageViewNavigasi;

    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        textViewX = findViewById(R.id.textViewX);
        textViewY = findViewById(R.id.textViewY);
        textViewZ = findViewById(R.id.textViewZ);

        textViewKiri = findViewById(R.id.textViewKiri);
        textViewKanan = findViewById(R.id.textViewKanan);
        textViewAtas = findViewById(R.id.textViewAtas);
        textViewBawah = findViewById(R.id.textViewBawah);

        imageViewNavigasi = findViewById(R.id.imageViewNavigasi);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];

        boolean left = false;
        boolean right = false;
        boolean up = false;
        boolean down = false;

        Log.e("x", String.valueOf(x));
        textViewX.setText("X: " + x);
        if (x > 0.5) {
            textViewKiri.setTextColor(Color.RED);
            textViewKanan.setTextColor(Color.GRAY);
            left = true;
            right = false;
        } else if (x < -0.5) {
            textViewKiri.setTextColor(Color.GRAY);
            textViewKanan.setTextColor(Color.RED);
            left = false;
            right = true;
        } else {
            textViewKiri.setTextColor(Color.GRAY);
            textViewKanan.setTextColor(Color.GRAY);
            left = false;
            right = false;
        }

        Log.e("y", String.valueOf(y));
        textViewY.setText("Y: " + y);
        if (y > 0.5) {
            textViewAtas.setTextColor(Color.RED);
            textViewBawah.setTextColor(Color.GRAY);
            up = true;
            down = false;
        } else if (y < -0.5) {
            textViewAtas.setTextColor(Color.GRAY);
            textViewBawah.setTextColor(Color.RED);
            up = false;
            down = true;
        } else {
            textViewAtas.setTextColor(Color.GRAY);
            textViewBawah.setTextColor(Color.GRAY);
            up = false;
            down = false;
        }

        if (up == true && right == false && down == false && left == false) {
            imageViewNavigasi.setImageResource(R.drawable.atas);
        } else if (up == false && right == true && down == false && left == false) {
            imageViewNavigasi.setImageResource(R.drawable.kanan);
        } else if (up == false && right == false && down == true && left == false) {
            imageViewNavigasi.setImageResource(R.drawable.bawah);
        } else if (up == false && right == false && down == false && left == true) {
            imageViewNavigasi.setImageResource(R.drawable.kiri);
        }  else {
            imageViewNavigasi.setImageResource(R.drawable.atas);
        }

        Log.e("z", String.valueOf(z));
        textViewZ.setText("Z: " + z);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }
}