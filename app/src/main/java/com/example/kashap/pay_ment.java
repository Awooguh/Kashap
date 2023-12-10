package com.example.kashap;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

public class pay_ment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.payment);
        TextView textView = findViewById(R.id.textView12);

        // for animation big to smoll , smoll to big
        textView.setScaleX(2f);
        textView.setScaleY(2f);

        textView.setScaleX(1f);
        textView.setScaleY(1f);

    }
}