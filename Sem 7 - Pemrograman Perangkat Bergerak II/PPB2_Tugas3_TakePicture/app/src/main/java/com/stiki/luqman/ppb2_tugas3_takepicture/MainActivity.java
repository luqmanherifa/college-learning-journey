package com.stiki.luqman.ppb2_tugas3_takepicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.os.Environment.getExternalStoragePublicDirectory;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    String pathToFile;
    File photoFile = null;
    Intent takePic;
    Bitmap bitmap;
    TextView lokasiTv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lokasiTv = findViewById(R.id.path);
        imageView = findViewById(R.id.showimageView);
        button = findViewById(R.id.btnCaptureImage);

        if(Build.VERSION.SDK_INT >= 23){
            requestPermissions(new String[] {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 2);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchPicture();
            }
        });
    }

    //reduce bitmap
    public Bitmap getResizedBitmap(Bitmap image, int maxSize){
        int width = image.getWidth();
        int height = image.getHeight();

        float bitmapRatio = (float) width/height;
        if(bitmapRatio > 1){
            width = maxSize;
            height = (int) (width / bitmapRatio);
        }else{
            height = maxSize;
            width = (int) (height * bitmapRatio);
        }
        return Bitmap.createScaledBitmap(image, width, height, true);
    }

    public void alertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.choose_yes_or_no, null);
        // set title dialog
        alertDialogBuilder.setTitle("Simpan Foto");
        final ImageView imageAlert = dialogLayout.findViewById(R.id.alertImageView);

        bitmap = getResizedBitmap(BitmapFactory.decodeFile(pathToFile), 500);
        imageAlert.setImageBitmap(bitmap);
        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Apakah Anda ingin menyimpan gambar ini?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        lokasiTv.setText(pathToFile);
                        imageView.setImageBitmap(bitmap);
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });

        alertDialogBuilder.setView(dialogLayout);
        alertDialogBuilder.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                alertDialog();
            }
        }
    }

//    private void dispatchPicture() {
//        takePic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(takePic, 1);
//    }

    private void dispatchPicture() {
        takePic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePic.resolveActivity(getPackageManager()) != null) {
            photoFile = createPhotoFile();

            if (photoFile != null) {
                pathToFile = photoFile.getAbsolutePath();
                Uri photoURI = FileProvider.getUriForFile(MainActivity.this, "com.stiki.luqman.ppb2_tugas3_takepicture.fileprovider", photoFile);
                takePic.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(takePic, 1);
            }
        }
    }

    private File createPhotoFile() {
        String name = new SimpleDateFormat("yyyyMMdddd_HHmmss").format(new Date());
        File storage = getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File image = null;
        try {
            image = File.createTempFile(name, ".jpg", storage);
        } catch (IOException e) {
            Log.e("error create", "Excep"+e.toString());
        }

        return image;
    }
}