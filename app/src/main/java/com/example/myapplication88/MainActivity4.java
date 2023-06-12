package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity4 extends AppCompatActivity {
      TextView texts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main4);
        texts=findViewById(R.id.asgeramiworld);

        FrameLayout centerContainer = findViewById(R.id.world);
//        Button buts = findViewById(R.id.image1);
//        buts.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                BlankFragment46 fragment = new BlankFragment46();
////                FragmentManager fragmentManager = getSupportFragmentManager();
////                FragmentTransaction transaction = fragmentManager.beginTransaction();
////                transaction.replace(centerContainer.getId(), fragment);
////                transaction.commit();
//
//            }
//        });

        ConstraintLayout mLayout = findViewById(R.id.bassa);
        GifImageView gifImageView = new GifImageView(this);
        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Button but1=findViewById(R.id.image1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment46();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();
                texts.setText("");
            }
        });

        Button buts1=findViewById(R.id.image2);
        buts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment47();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();

            }
        });
        Button buts2=findViewById(R.id.image3);
        buts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment48();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();

            }
        });
        Button buts3=findViewById(R.id.image4);
        buts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment49();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();



            }
        });
        Button buts4=findViewById(R.id.image5);
        buts4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment50();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();

            }
        });
        Button but5=findViewById(R.id.image6);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment51();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();

            }
        });

        Button but6=findViewById(R.id.image7);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = new BlankFragment52();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(centerContainer.getId(), nextFragment);
                fragmentTransaction.commit();

            }
        });




    }
}