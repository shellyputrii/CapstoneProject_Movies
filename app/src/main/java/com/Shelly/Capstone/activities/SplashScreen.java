package com.Shelly.Capstone.activities;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;
import com.Shelly.Capstone.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends  AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }, 3000L);

    }
}
