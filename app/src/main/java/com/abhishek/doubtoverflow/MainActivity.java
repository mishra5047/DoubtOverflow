package com.abhishek.doubtoverflow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageSettings;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        imageSettings = findViewById(R.id.imageView2);

        imageSettings.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Item Clicked", Toast.LENGTH_SHORT).show();
        });

        // using toolbar as ActionBar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
//        // Display application icon in the toolbar
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        getSupportActionBar().setLogo(R.drawable.icon_sample);
//        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
}