package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btnScale;
    Button btnAlpha;
    Button btnTranslate;
    Button btnRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnScale = findViewById(R.id.btnScale);
        imageView = findViewById(R.id.imageView);

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                imageView.startAnimation(scale);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                imageView.startAnimation(rotate);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                imageView.startAnimation(alpha);
            }
        });
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation translate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);
                imageView.startAnimation(translate);
            }
        });
    }
}