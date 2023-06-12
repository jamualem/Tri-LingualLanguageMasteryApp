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

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private MediaPlayer mediaPlayer;
    private int[] soundIds = {
            R.raw.and,
            R.raw.hulet,
            R.raw.sost,
            R.raw.arat,
            R.raw.amst,
            R.raw.sdst,
            R.raw.sebat,
            R.raw.sement,
            R.raw.zetegn,
            R.raw.aser,
            R.raw.aseraand,
            R.raw.aserahulet,
            R.raw.aserasost,
            R.raw.aserarat,
            R.raw.asramst,
            R.raw.aserasidist,
            R.raw.aserasebat,
            R.raw.aserasement,
            R.raw.aserazetegn,
            R.raw.haya,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main3);
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

                text.setText("አንድ");
                text.setTextColor(Color.GREEN);

                break;

            case R.id.button2:
                playAudio(soundIds[1]);

                text.setText("ሁለት");
                text.setTextColor(Color.RED);
                break;


            case R.id.button3:
                playAudio(soundIds[2]);
                text.setText("ሶስት");
                text.setTextColor(Color.YELLOW);
                break;

            case R.id.button4:
                playAudio(soundIds[3]);
                text.setText("አራት");
                text.setTextColor(Color.BLUE);
                break;

            case R.id.button5:
                playAudio(soundIds[4]);
                text.setText("አምስት");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button6:
                playAudio(soundIds[5]);
                text.setText("ስድስት");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button7:
                playAudio(soundIds[6]);
                text.setText("ሰባት");
                text.setTextColor(Color.RED);
                break;
            case R.id.button8:
                playAudio(soundIds[7]);
                text.setText("ስምንት");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button9:
                playAudio(soundIds[8]);
                text.setText("ዘጠኝ");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button10:
                playAudio(soundIds[9]);
                text.setText("አስር");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button11:
                playAudio(soundIds[10]);
                text.setText("አስራአንድ");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button12:
                playAudio(soundIds[11]);
                text.setText("አስራሁለት");
                text.setTextColor(Color.RED);
                break;
            case R.id.button13:
                playAudio(soundIds[12]);
                text.setText("አስራሶስት");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button14:
                playAudio(soundIds[13]);
                text.setText("አስራአራት");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button15:
                playAudio(soundIds[14]);
                text.setText("አስራአምስት");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button16:
                playAudio(soundIds[15]);
                text.setText("አስራስድስት");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button17:
                playAudio(soundIds[16]);
                text.setText("አስራሰባት");
                text.setTextColor(Color.RED);
                break;
            case R.id.button18:
                playAudio(soundIds[17]);
                text.setText("አስራስምንት");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button19:
                playAudio(soundIds[18]);
                text.setText("አስራዘጠኝ");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button20:
                playAudio(soundIds[19]);
                text.setText("ሃያ");
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