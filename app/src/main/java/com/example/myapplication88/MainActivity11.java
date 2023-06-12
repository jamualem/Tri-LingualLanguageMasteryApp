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

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main11);





        ConstraintLayout mLayout = findViewById(R.id.one);
        GifImageView gifImageView = new GifImageView(this);

        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }


        Button bt=findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm();
            }
        });
        Button bt1=findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm1();
            }
        });
        Button btn4=findViewById(R.id.button2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm4();
            }
        });
        Button bt2=findViewById(R.id.button6);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm2();
            }
        });
        Button bt3=findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm3();
            }
        });
        Button bt4=findViewById(R.id.button5);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alm5();
            }
        });

        Animation animation=new RotateAnimation(5.0f, -5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);

        bt.startAnimation(animation);
       bt1.startAnimation(animation);
        bt2.startAnimation(animation);
        bt3.startAnimation(animation);
       bt4.startAnimation(animation);
       btn4.startAnimation(animation);
    }
    public void alm(){
        Intent intent=new Intent(this,MainActivity12.class);
        startActivity(intent);
    }
    public void alm1(){
        Intent intent1=new Intent(this,MainActivity13.class);
        startActivity(intent1);
    }
    public void alm2()
    {
        Intent intent2=new Intent(this,MainActivity14.class);
        startActivity(intent2);
    }
    public void alm3()
    {
        Intent intent3=new Intent(this,MainActivity15.class);
        startActivity(intent3);
    }
    public void alm4(){
        Intent intent4=new Intent(this,MainActivity19.class);
        startActivity(intent4);
    }
    public void alm5(){
        Intent intent5=new Intent(this,MainActivity17.class);
        startActivity(intent5);
    }

}