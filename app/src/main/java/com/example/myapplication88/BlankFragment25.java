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

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class BlankFragment25 extends Fragment {
    private TextView text;
    private MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank25, container, false);
    }



                @Override
                public void onViewCreated(View view, Bundle savedInstanceState) {
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
                                vibrator.vibrate(500); // Vibrate for 500 milliseconds (0.5 seconds)
                            }

                            butt1.setBackgroundColor(Color.RED);
                            // Delay for a short period of time
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Change the background color back to its original color
                                    butt1.setBackgroundResource(R.drawable.example);
                                }
                            }, 100); // Delay time in milliseconds (0.1 seconds)
                        }
                    });

                    butt2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
                            if (vibrator.hasVibrator()) {
                                vibrator.vibrate(500); // Vibrate for 500 milliseconds (0.5 seconds)
                            }

                            butt2.setBackgroundColor(Color.RED);
                            // Delay for a short period of time
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Change the background color back to its original color
                                    butt2.setBackgroundResource(R.drawable.example);
                                }
                            }, 100); // Delay time in milliseconds (0.1 seconds)
                        }
                    });

                    butt3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
                            if (vibrator.hasVibrator()) {
                                vibrator.vibrate(500); // Vibrate for 500 milliseconds (0.5 seconds)
                            }

                            butt3.setBackgroundColor(Color.RED);
                            // Delay for a short period of time
                            new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    // Change the background color back to its original color
                                    butt3.setBackgroundResource(R.drawable.example);
                                }
                            }, 100); // Delay time in milliseconds (0.1 seconds)
                        }
                    });



                    butt4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            imageView.setBackgroundColor(R.drawable.brana);
                            Glide.with(BlankFragment25.this).asGif().load(R.drawable.animal_lion).into(imageView);
                text.setText("አንበሳ");
                playAudio(R.raw.anbesa);
            }
        });
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