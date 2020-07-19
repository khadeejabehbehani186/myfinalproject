package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TME_OUT = 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler(getMainLooper());
        final Runnable r = new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(in);
            }
        };
        handler.postDelayed(r,2700);}
    }
