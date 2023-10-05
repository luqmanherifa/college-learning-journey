package com.stiki.luqman.demomultiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Button;

public class MainActivity extends Activity {
    private Activity activity = this;
    ImageButton btnOpen;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnOpen = (ImageButton) this.findViewById(R.id.cmdOpen);
        btnOpen.setOnClickListener(new klik());


    }
    class klik implements Button.OnClickListener
    {
        public void onClick (View v)
        {
            Intent i = new Intent(activity, Halaman2Activity.class );
            startActivity(i);
        }
    }
}