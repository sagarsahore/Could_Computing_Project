package com.example.mazahs.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mazahs.R;

public class SplashScreenActivity extends AppCompatActivity {
    private static int Limit=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        //will delay splash page and then go to main screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =  new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, Limit);
    }
}