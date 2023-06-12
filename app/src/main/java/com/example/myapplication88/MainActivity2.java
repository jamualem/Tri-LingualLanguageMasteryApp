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

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main2);


        Button als=findViewById(R.id.button3);
        Button als1=findViewById(R.id.button1);
        Button als2=findViewById(R.id.button2);
        Button als3=findViewById(R.id.button4);
        Button als4=findViewById(R.id.button5);


        Animation animation=new RotateAnimation(5.0f, -5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);

        als.startAnimation(animation);
        als1.startAnimation(animation);
        als2.startAnimation(animation);
        als3.startAnimation(animation);
        als4.startAnimation(animation);

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


        als1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                project1();
            }
        });

        als.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                project();
            }
        });
        als2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                project2();
            }
        });
        als3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                project3();
            }
        });

        als4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                project4();
            }
        });


    }
    public void project(){
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void project1(){
        Intent intent1=new Intent(this,MainActivity4.class);
        startActivity(intent1);
    }
    public void project2(){
        Intent intent2=new Intent(this,MainActivity20.class);
        startActivity(intent2);
    }
    public void project3(){
        Intent intent3=new Intent(this,MainActivity22.class);
        startActivity(intent3);
    }
    public void project4(){
        Intent intent4=new Intent(this,MainActivity5.class);
        startActivity(intent4);
    }

}