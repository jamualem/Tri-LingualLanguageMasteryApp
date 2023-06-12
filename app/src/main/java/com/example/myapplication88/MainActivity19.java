package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity19 extends AppCompatActivity {
    private RandomFragmentGenerator generator;
    TextView textachen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main19);

        textachen = findViewById(R.id.dinkworld);

                generator = new RandomFragmentGenerator();
                Button button = findViewById(R.id.alem);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Fragment nextFragment = generator.getNextFragment();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.world, nextFragment);
                        fragmentTransaction.commit();
                        textachen.setText("");
                    }
                });


        ConstraintLayout mLayout = findViewById(R.id.one);
        GifImageView gifImageView = new GifImageView(this);
        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }
            }


        }
