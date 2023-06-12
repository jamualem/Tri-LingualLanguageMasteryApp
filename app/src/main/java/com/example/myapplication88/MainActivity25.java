package com.example.myapplication88;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main25);

        Button but1 = findViewById(R.id.button1);
        Button but2 = findViewById(R.id.button2);
        Button but3 = findViewById(R.id.button3);
        Button but4 = findViewById(R.id.button4);
        Button but5 = findViewById(R.id.button5);


        Animation animation = new RotateAnimation(5.0f, -5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);

        but1.startAnimation(animation);
        but2.startAnimation(animation);
        but3.startAnimation(animation);
        but4.startAnimation(animation);
        but5.startAnimation(animation);

        ConstraintLayout mLayout = findViewById(R.id.one);
        GifImageView gifImageView = new GifImageView(this);

        try {
            // Load the GIF file from the res/raw directory
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);

            // Set the GIF as the background of the layout
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acts1();
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acts2();
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acts3();
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acts4();
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acts5();
            }
        });


    }

   public void acts4() {
        Intent intent3 = new Intent(this, MainActivity31.class);
        startActivity(intent3);
    }

    public void acts5() {
       Intent intent4 = new Intent(this, MainActivity30.class);
       startActivity(intent4);
    }

    public void acts1() {
        Intent intent = new Intent(this, MainActivity26.class);
        startActivity(intent);
    }

    public void acts2() {
        Intent intent1 = new Intent(this, MainActivity27.class);
        startActivity(intent1);
    }

    public void acts3() {
        Intent intent2 = new Intent(this, MainActivity28.class);
        startActivity(intent2);
    }
}