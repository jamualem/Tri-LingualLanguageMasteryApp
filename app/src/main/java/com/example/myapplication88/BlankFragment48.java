package com.example.myapplication88;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class BlankFragment48 extends Fragment implements View.OnClickListener {
    private MediaPlayer mediaPlayer;
    private int[] soundIds = {
            R.raw.veh,
            R.raw.voo,
            R.raw.vee,
            R.raw.va,
            R.raw.vae,
            R.raw.vih,
            R.raw.vo,
            R.raw.teh,
            R.raw.too,
            R.raw.tee,
            R.raw.ta,
            R.raw.tae,
            R.raw.tih,
            R.raw.to,
            R.raw.cheh,
            R.raw.choo,
            R.raw.chee,
            R.raw.cha,
            R.raw.chae,
            R.raw.chih,
            R.raw.cho,
            R.raw.ha,
            R.raw.hu,
            R.raw.hee,
            R.raw.ha,
            R.raw.hae,
            R.raw.heh,
            R.raw.ho,
            R.raw.neh,
            R.raw.noo,
            R.raw.nee,
            R.raw.na,
            R.raw.nae,
            R.raw.nih,
            R.raw.no
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank48, container, false);

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
            case R.id.button29:
                playAudio(soundIds[28]);
                break;
            case R.id.button30:
                playAudio(soundIds[29]);
                break;
            case R.id.button31:
                playAudio(soundIds[30]);
                break;
            case R.id.button32:
                playAudio(soundIds[31]);
                break;
            case R.id.button33:
                playAudio(soundIds[32]);
                break;
            case R.id.button34:
                playAudio(soundIds[33]);
                break;
            case R.id.button35:
                playAudio(soundIds[34]);
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