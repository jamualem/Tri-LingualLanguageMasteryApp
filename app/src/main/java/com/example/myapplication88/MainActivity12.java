package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MainActivity12 extends AppCompatActivity implements View.OnClickListener{

    private TextView text;
    private MediaPlayer mediaPlayer;
    private int[] soundIds = {
            R.raw.n1,
            R.raw.n2,
            R.raw.n3,
            R.raw.n4,
            R.raw.n5,
            R.raw.n6,
            R.raw.n7,
            R.raw.n8,
            R.raw.n9,
            R.raw.n10,
            R.raw.n11,
            R.raw.n12,
            R.raw.n13,
            R.raw.n14,
            R.raw.n15,
            R.raw.n16,
            R.raw.n17,
            R.raw.n18,
            R.raw.n19,
            R.raw.n20,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main12);
        text=findViewById(R.id.worlds);

        ConstraintLayout mLayout = findViewById(R.id.one);
        GifImageView gifImageView = new GifImageView(this);

        try {
            GifDrawable gifDrawable = new GifDrawable(getResources(), R.drawable.bak);
            Drawable backgroundDrawable = gifDrawable;
            mLayout.setBackground(backgroundDrawable);
        } catch (Exception e) {
            e.printStackTrace();
        }


        for (int i = 0; i < soundIds.length; i++) {
            int buttonId = getResources().getIdentifier("button" + (i + 1), "id", getPackageName());
            Button button = findViewById(buttonId);
            button.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                playAudio(soundIds[0]);

                text.setText("one");
                text.setTextColor(Color.GREEN);

                break;

            case R.id.button2:
                playAudio(soundIds[1]);

                text.setText("two");
                text.setTextColor(Color.RED);
                break;


            case R.id.button3:
                playAudio(soundIds[2]);
                text.setText("three");
                text.setTextColor(Color.YELLOW);
                break;

            case R.id.button4:
                playAudio(soundIds[3]);
                text.setText("four");
                text.setTextColor(Color.BLUE);
                break;

            case R.id.button5:
                playAudio(soundIds[4]);
                text.setText("five");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button6:
                playAudio(soundIds[5]);
                text.setText("six");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button7:
                playAudio(soundIds[6]);
                text.setText("seven");
                text.setTextColor(Color.RED);
                break;
            case R.id.button8:
                playAudio(soundIds[7]);
                text.setText("eight");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button9:
                playAudio(soundIds[8]);
                text.setText("nine");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button10:
                playAudio(soundIds[9]);
                text.setText("ten");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button11:
                playAudio(soundIds[10]);
                text.setText("eleven");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button12:
                playAudio(soundIds[11]);
                text.setText("twelve");
                text.setTextColor(Color.RED);
                break;
            case R.id.button13:
                playAudio(soundIds[12]);
                text.setText("thirteen");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button14:
                playAudio(soundIds[13]);
                text.setText("fourteen");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button15:
                playAudio(soundIds[14]);
                text.setText("fifteen");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button16:
                playAudio(soundIds[15]);
                text.setText("sixteen");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button17:
                playAudio(soundIds[16]);
                text.setText("seventeen");
                text.setTextColor(Color.RED);
                break;
            case R.id.button18:
                playAudio(soundIds[17]);
                text.setText("eighteen");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button19:
                playAudio(soundIds[18]);
                text.setText("nineteen");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button20:
                playAudio(soundIds[19]);
                text.setText("twenty");
                text.setTextColor(Color.CYAN);
                break;

        }

    }

    private void playAudio(int audioFile) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(this, audioFile);
        mediaPlayer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}