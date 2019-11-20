package com.example.monumentosrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class laimagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laimagen);

        ImageView img = (ImageView) findViewById(R.id.imageView2);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            img.setImageResource(b.getInt("IMG"));
        }
    }
}
