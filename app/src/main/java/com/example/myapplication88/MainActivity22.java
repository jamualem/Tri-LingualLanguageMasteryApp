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

public class MainActivity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Button but1=findViewById(R.id.button1);
        Button but2=findViewById(R.id.button2);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proj1();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proj2();
            }
        });

        Animation animation=new RotateAnimation(5.0f, -5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);

        but1.startAnimation(animation);
        but2.startAnimation(animation);


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
    }
    public void proj1(){
        Intent intent=new Intent(this,MainActivity23.class);
        startActivity(intent);
    }
    public void proj2(){
        Intent intent1=new Intent(this,MainActivity24.class);
        startActivity(intent1);
    }

}