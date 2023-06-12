package com.example.myapplication88;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BlankFragment34 extends Fragment {

    private MediaPlayer mediaPlayer;
    private TextView text;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button butt1 = view.findViewById(R.id.but1);
        Button butt2 = view.findViewById(R.id.but2);
        Button butt3 = view.findViewById(R.id.but3);
        Button butt4 = view.findViewById(R.id.but4);
        text=view.findViewById(R.id.kk1);
        ImageView imageView=view.findViewById(R.id.image);



        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(500);
                }

                butt1.setBackgroundColor(Color.RED);
                // Delay for a short period of time
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        butt1.setBackgroundResource(R.drawable.example);
                    }
                }, 100);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(500);
                }

                butt2.setBackgroundColor(Color.RED);
                // Delay for a short period of time
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        butt2.setBackgroundResource(R.drawable.example);
                    }
                }, 100);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(500);
                }

                butt4.setBackgroundColor(Color.RED);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        butt4.setBackgroundResource(R.drawable.example);
                    }
                }, 100);
            }
        });



        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setBackgroundResource(R.drawable.daakkiyye);
                text.setText("DAAKKIYYE");
                playAudio(R.raw.wordiid);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank34, container, false);
    }

    private void playAudio(int audioFile) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(requireContext(), audioFile);
        mediaPlayer.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }



}