package com.stiki.luqman.ppb2_tugas3_hic_camera;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button jepret;
    private TextView nmFile;
    private ImageView gbrDepan;
    private Uri gbrCaptureUri;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jepret = (Button) findViewById(R.id.btnProses);
        nmFile = (TextView) findViewById(R.id.txtFile);
        gbrDepan = (ImageView) findViewById(R.id.imgDepan);
        jepret.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                File file = null;
                try {
                    file = new File(Environment.getExternalStorageDirectory(), String.valueOf(System.currentTimeMillis())+".jpg");

                } catch (Exception e) {
                // TODO: handle exception
                }
                gbrCaptureUri = Uri.fromFile(file);
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                i.putExtra(MediaStore.EXTRA_OUTPUT, gbrCaptureUri);

                startActivityForResult(i, 1);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int
            resultCode, Intent returnIntent)
    {
        super.onActivityResult(requestCode, resultCode, returnIntent);
        switch(requestCode)
        {
            case 1:

                Uri selectedImage = null;
                selectedImage = gbrCaptureUri;
                ContentResolver cr = getContentResolver();
                try {
                    bitmap = android.provider.MediaStore.Images.Media.getBitmap(cr, selectedImage);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                if(bitmap == null){
                    Toast.makeText(MainActivity.this, "Image error, please try again", Toast.LENGTH_LONG).show();
                    break;
                }
                ByteArrayOutputStream bytes = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bytes);
                String nuFile = System.currentTimeMillis()+".jpg";

                //---buka ini untuk menyimpan di sdcard
                File files = new File(Environment.getExternalStorageDirectory()+File.separator+nuFile);
                //--atau buka ini --> default setting
                //File files = new File(nuFile);

                try {
                    files.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (files.exists()) {
                    FileOutputStream fo = null;
                    try {
                        fo = new FileOutputStream(files);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        fo.write(bytes.toByteArray());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                String fileFoto = files.toString();
                nmFile.setText(fileFoto);
                Toast.makeText(MainActivity.this, "path:"+fileFoto, Toast.LENGTH_LONG).show();

                Drawable picture = new BitmapDrawable(fileFoto);
                gbrDepan.setVisibility(ImageView.VISIBLE);
                gbrDepan.setImageDrawable(picture);
                bitmap.recycle();
                break;
        }
    }
}