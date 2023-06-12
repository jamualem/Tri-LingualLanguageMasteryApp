package com.example.myapplication88;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class BlankFragment52 extends Fragment implements View.OnClickListener {
    private MediaPlayer mediaPlayer;
    private int[] soundIds = {
            R.raw.tse,
            R.raw.tsoo,
            R.raw.tsee,
            R.raw.tsaa,
            R.raw.tsae,
            R.raw.tsih,
            R.raw.tso,
            R.raw.tse,
            R.raw.tsoo,
            R.raw.tsee,
            R.raw.tsaa,
            R.raw.tsae,
            R.raw.tsih,
            R.raw.tso,
            R.raw.fuh,
            R.raw.foo,
            R.raw.fee,
            R.raw.faa,
            R.raw.fae,
            R.raw.fih,
            R.raw.fo,
            R.raw.peh,
            R.raw.poo,
            R.raw.pee,
            R.raw.paa,
            R.raw.pae,
            R.raw.pih,
            R.raw.po,
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank52, container, false);

        for (int i = 0; i < soundIds.length; i++) {
            int buttonId = getResources().getIdentifier("button" + (i + 1), "id", getActivity().getPackageName());
            Button button = rootView.findViewById(buttonId);
            button.setOnClickListener(this);
        }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                playAudio(soundIds[0]);
                break;

            case R.id.button2:
                playAudio(soundIds[1]);
                break;


            case R.id.button3:
                playAudio(soundIds[2]);
                break;

            case R.id.button4:
                playAudio(soundIds[3]);
                break;

            case R.id.button5:
                playAudio(soundIds[4]);
                break;
            case R.id.button6:
                playAudio(soundIds[5]);
                break;
            case R.id.button7:
                playAudio(soundIds[6]);
                break;
            case R.id.button8:
                playAudio(soundIds[7]);
                break;
            case R.id.button9:
                playAudio(soundIds[8]);
                break;
            case R.id.button10:
                playAudio(soundIds[9]);
                break;
            case R.id.button11:
                playAudio(soundIds[10]);
                break;
            case R.id.button12:
                playAudio(soundIds[11]);
                break;
            case R.id.button13:
                playAudio(soundIds[12]);
                break;
            case R.id.button14:
                playAudio(soundIds[13]);
                break;
            case R.id.button15:
                playAudio(soundIds[14]);
                break;
            case R.id.button16:
                playAudio(soundIds[15]);
                break;
            case R.id.button17:
                playAudio(soundIds[16]);
                break;
            case R.id.button18:
                playAudio(soundIds[17]);
                break;
            case R.id.button19:
                playAudio(soundIds[18]);
                break;
            case R.id.button20:
                playAudio(soundIds[19]);
                break;
            case R.id.button21:
                playAudio(soundIds[20]);
                break;
            case R.id.button22:
                playAudio(soundIds[21]);
                break;
            case R.id.button23:
                playAudio(soundIds[22]);
                break;
            case R.id.button24:
                playAudio(soundIds[23]);
                break;
            case R.id.button25:
                playAudio(soundIds[24]);
                break;
            case R.id.button26:
                playAudio(soundIds[25]);
                break;
            case R.id.button27:
                playAudio(soundIds[26]);
                break;
            case R.id.button28:
                playAudio(soundIds[27]);
                break;
        }
    }

    private void playAudio(int audioFile) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(getActivity(), audioFile);
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