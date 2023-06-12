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

public class MainActivity26 extends AppCompatActivity implements View.OnClickListener{

    private TextView text;
    private MediaPlayer mediaPlayer;
    private int[] soundIds = {
            R.raw.oromicaa,
            R.raw.oromicb,
            R.raw.oromiccc,
            R.raw.oromicdd,
            R.raw.oromice,
            R.raw.oromicff,
            R.raw.oromicgg,
            R.raw.oromichh,
            R.raw.oromicii,
            R.raw.oromicjj,
            R.raw.oromickk,
            R.raw.oromicll,
            R.raw.oromicmm,
            R.raw.oromicnn,
            R.raw.oromicoo,
            R.raw.oromicpp,
            R.raw.oromicqq,
            R.raw.oromicrr,
            R.raw.oromicss,
            R.raw.oromictt,
            R.raw.oromicuu,
            R.raw.oromicvv,
            R.raw.oromicww,
            R.raw.oromicxx,
            R.raw.oromicyy,
            R.raw.oromiczz
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main26);

        text=findViewById(R.id.akasi);


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

                text.setText("Aa");
                text.setTextColor(Color.GREEN);

                break;

            case R.id.button2:
                playAudio(soundIds[1]);

                text.setText("Bb");
                text.setTextColor(Color.RED);
                break;


            case R.id.button3:
                playAudio(soundIds[2]);
                text.setText("Cc");
                text.setTextColor(Color.YELLOW);
                break;

            case R.id.button4:
                playAudio(soundIds[3]);
                text.setText("Dd");
                text.setTextColor(Color.BLUE);
                break;

            case R.id.button5:
                playAudio(soundIds[4]);
                text.setText("Ee");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button6:
                playAudio(soundIds[5]);
                text.setText("Ff");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button7:
                playAudio(soundIds[6]);
                text.setText("Gg");
                text.setTextColor(Color.RED);
                break;
            case R.id.button8:
                playAudio(soundIds[7]);
                text.setText("Hh");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button9:
                playAudio(soundIds[8]);
                text.setText("Ii");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button10:
                playAudio(soundIds[9]);
                text.setText("Jj");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button11:
                playAudio(soundIds[10]);
                text.setText("Kk");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button12:
                playAudio(soundIds[11]);
                text.setText("Ll");
                text.setTextColor(Color.RED);
                break;
            case R.id.button13:
                playAudio(soundIds[12]);
                text.setText("Mm");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button14:
                playAudio(soundIds[13]);
                text.setText("Nn");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button15:
                playAudio(soundIds[14]);
                text.setText("Oo");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button16:
                playAudio(soundIds[15]);
                text.setText("Pp");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button17:
                playAudio(soundIds[16]);
                text.setText("Qq");
                text.setTextColor(Color.RED);
                break;
            case R.id.button18:
                playAudio(soundIds[17]);
                text.setText("Rr");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button19:
                playAudio(soundIds[18]);
                text.setText("Ss");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button20:
                playAudio(soundIds[19]);
                text.setText("Tt");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button21:
                playAudio(soundIds[20]);
                text.setText("Uu");
                text.setTextColor(Color.GREEN);
                break;
            case R.id.button22:
                playAudio(soundIds[21]);
                text.setText("Vv");
                text.setTextColor(Color.RED);
                break;
            case R.id.button23:
                playAudio(soundIds[22]);
                text.setText("Ww");
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.button24:
                playAudio(soundIds[23]);
                text.setText("Xx");
                text.setTextColor(Color.BLUE);
                break;
            case R.id.button25:
                playAudio(soundIds[24]);
                text.setText("Yy");
                text.setTextColor(Color.CYAN);
                break;
            case R.id.button26:
                playAudio(soundIds[25]);
                text.setText("Zz");
                text.setTextColor(Color.GREEN);
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
