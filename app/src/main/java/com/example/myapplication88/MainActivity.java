package com.example.myapplication88;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {


    private TextView timerTextView;
    private Handler timerHandler = new Handler();
    private long startTime;
    MediaPlayer mediaPlayer;
    Button playButton;
    boolean isclicked = false;
    Drawable oldbackground,newbackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        timmer();

        Button but3=findViewById(R.id.button2);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act3();
            }
        });
        Button but4=findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act4();
            }
        });

        Button but1=findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                act1();
            }
        });
        Button but2=findViewById(R.id.button3);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                act2();
            }
        });


        but1.setBackgroundResource(R.drawable.button);

        Animation animation=new RotateAnimation(5.0f, -5.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);

        but1.startAnimation(animation);
        but2.startAnimation(animation);
        but3.startAnimation(animation);
        but4.startAnimation(animation);


       ConstraintLayout mLayout = findViewById(R.id.one);
        GifImageView gifImageView = new GifImageView(this);

        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }


        playButton =findViewById(R.id.soundbut);
        mediaPlayer = MediaPlayer.create(this,R.raw.littlefish);
        mediaPlayer.setVolume(0.06f, 0.06f);

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.start();
            }
        });

        oldbackground = playButton.getBackground();
        newbackground = getResources().getDrawable(R.drawable.ic_baseline_volume_off_24);

        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer.start();

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                }
                else{
                    mediaPlayer.start();
                }
                if(!isclicked) {
                    playButton.setBackground(newbackground);
                }
                else{
                    playButton.setBackground(oldbackground);
                }
                isclicked = !isclicked;
            }
        });
   }


    public void act1(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void act2(){
        Intent intent1=new Intent(this,MainActivity11.class);
        startActivity(intent1);
    }
    public void act3(){
        Intent intent2=new Intent(this,MainActivity25.class);
        startActivity(intent2);
    }
    public void act4(){
        Intent intent3=new Intent(this,MainActivity7.class);
        startActivity(intent3);
    }



    public void timmer(){
        timerTextView = findViewById(R.id.kk1);
        startTime = System.currentTimeMillis();
        timerHandler.postDelayed(timerRunnable,0);
    }


    private Runnable timerRunnable = new Runnable() {
        @Override
        public void run()
        {
            long millis = System.currentTimeMillis() - startTime;
            int seconds = (int) (millis / 1000);
            int minutes = seconds / 60;
            seconds = seconds % 60;
            timerTextView.setText(String.format("%02d:%02d", minutes, seconds));
            timerHandler.postDelayed(this, 500);
        }
    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
    }
