package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity32 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        TextView textview=findViewById(R.id.kk);
        TextView textview1=findViewById(R.id.kk1);
        TextView textview2=findViewById(R.id.kk2);
        TextView textview3=findViewById(R.id.kk3);
        textview.setText("Bara durii harree fi saree mana namichaa tokko jirraatu turan. Sareen hojiin isaa halkan mana eguu dha ture. hareen immo xaafii baatee gabaa geessuu akkasumaas,waan bitame fuudhee galuu dha. haa ta'u malee harreenis sareenis hojii isaaniitin gammaddoo miti. Harree\"" +
                " ani guyyaa guttu ba'aa baachaa oolaa hamma dugdii koo naa luqqa'uttii hojjechaan oola jecha ba'anii lagaa keessa deemuutti ka'an. Harren marga isaa dheedaa bishaanis lagaa dhugaa, " +
                "sareen garuu waan nyaatu wanta hin argannef beela'aa oolan.harreen bayyee nyaatee waan quufeef \" Amma ani Alaakuun barbaada waan garaan koo guuteef yoon alaakee malee naattii, hin tolu\" jedhee sareenis waraabessi dhufee sii nyaata \" jedhee akeekkachiise.harren didee alaake. ");

        textview1.setText("Achii booda waraabessi sagalee harree dhaga'ee barbaacha lagaa keessa figuuttii ka'e. Ammas harreen margaa nyatee waan quufeef \" saree, ishee kana qofa anaaf heeyyamii nan alaakaa\" jedhe sareenis\" lakkii dhiisi ani sodaadheera hin alaakiin jedhee didee. Harreenis hima saree dhaga'uu dide alaakee yammuu inni ofirraa garagalu waraabessi, harree sagalee kee dhaga'ee sii barbaadaan turee edaa ati as jirtaa!\"");

    textview2.setText("Jedhee utaalee mormaa harree qabatee ajjeeseen. Waraabessi kun foon harree nyaatee quufee yammuu oljedhuu saree arge.\" Ati immo asii maal hoojjettaa? Jedhee. Sareenis harree wajjiin mana jiraatanii ba'aanii baduu isaanii fi hojiin isaas mana eeguu akka ture itti hime. Achii booda waraabessis\" mee kottu foon kana anaaf eegi deebi'een dhufaatii\" jedhee foon harree nyaatee isaa irraa hafe lakkaa'ee itti kennatee adeeme. ");

    textview3.setText("Xiqqoo turee, waraabessi foon isaa irraa fudhatee yammuu ilaalu sammuu harree keessa hin jiru. Waraabessi, eessa geessite sammuu harree kanaa?\" Jedhee dheekkamee gafate.sareenis\" obbo waraabesso, harreen kun sammuu qabaatee hin beeku durumaa jalqabee sammuu hin qabu. Utuu sammuu qabaate immoo silaa mana ana hin baasu ture! \" jedhee mana namichaattii deebi'ee..jedhama jedhanii");


    Button button=findViewById(R.id.newworld);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            } else {
                playAudio(R.raw.oromicteret);
            }
        }
    });
    }

    private void playAudio(int audioFile) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
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