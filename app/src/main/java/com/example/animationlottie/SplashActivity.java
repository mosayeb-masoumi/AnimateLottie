package com.example.animationlottie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {


    TextView txt;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

         //  https://www.youtube.com/watch?v=VcrzLcokvvc

        // goto https://lottiefiles.com/search?q=delivery&category=animations  and search for animation then get the json from this site and put it in raw folder


        txt = findViewById(R.id.txt);
        lottie = findViewById(R.id.lottie);


    }

    @Override
    protected void onResume() {
        super.onResume();


        txt.animate().translationY(-1400).setDuration(1000).setStartDelay(0);
        lottie.animate().translationX(2000).setDuration(1500).setStartDelay(2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        } ,5000);


    }
}