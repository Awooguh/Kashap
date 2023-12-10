package com.example.kashap;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //animation
        setContentView(R.layout.mainpanel);
        TextView textView = findViewById(R.id.textView6);
        TextView textView1 = findViewById(R.id.textView7);
        EditText editext = findViewById(R.id.editTextText5);
        ObjectAnimator animation = ObjectAnimator.ofFloat(textView, "translationY", 0f, 100f);
        ObjectAnimator animation1 = ObjectAnimator.ofFloat(textView1, "translationY", 0f, 100f);
        ObjectAnimator animation2 = ObjectAnimator.ofFloat(editext, "alpha", 0f, 1f);

        animation.setDuration(1000);
        animation1.setDuration(2000);
        animation2.setDuration(5000);

        animation.start();
        animation1.start();
        animation2.start();
    }
}