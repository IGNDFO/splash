package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splash_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//BUAT HILANGIN JUDUL DAN WIFI DI ATAS
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Handler hdl= new Handler();
        hdl.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash_activity.this,MainActivity.class));
            finish();
            }
        }, 2000);
    }
}