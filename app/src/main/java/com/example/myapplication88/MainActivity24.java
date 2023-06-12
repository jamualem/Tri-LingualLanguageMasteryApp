package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main24);

        TextView textview=findViewById(R.id.kk11);

        int[] rgIds = {R.id.rgp, R.id.rgp1, R.id.rgp2, R.id.rgp3, R.id.rgp4, R.id.rgp5, R.id.rgp6, R.id.rgp7, R.id.rgp8, R.id.rgp9};
        RadioGroup[] rgs = new RadioGroup[rgIds.length];
        for (int i = 0; i < rgIds.length; i++) {
            rgs[i] = findViewById(rgIds[i]);
        }
        int[] rbid = {R.id.rbt,R.id.rbt1,R.id.rbt2,R.id.rbt3,R.id.rbt4,R.id.rbt5,R.id.rbt6,R.id.rbt7,R.id.rbt8,R.id.rbt9,R.id.rbt10,R.id.rbt11,R.id.rbt12,R.id.rbt13,
                R.id.rbt14,R.id.rbt15,R.id.rbt16,R.id.rbt17,R.id.rbt18,R.id.rbt19,R.id.rbt20,R.id.rbt21,R.id.rbt22,R.id.rbt23,R.id.rbt24,R.id.rbt25,
                R.id.rbt26,R.id.rbt27,R.id.rbt28,R.id.rbt29};

        RadioButton[] bts=new RadioButton[rbid.length];
        for(int j=0;j<rbid.length;j++){
            bts[j] = findViewById(rbid[j]);
        }



        Button butt1=findViewById(R.id.but1);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int k=0;
                int alem = rgs[0].getCheckedRadioButtonId();
                switch (alem) {
                    case R.id.rbt:
                        bts[1].setBackgroundColor(Color.GREEN);
                        bts[0].setBackgroundColor(Color.RED);
                        bts[1].setEnabled(false);
                        break;
                    case R.id.rbt1:
                        bts[1].setBackgroundColor(Color.GREEN);
                        bts[0].setEnabled(false);
                        k++;
                        break;
                }


                int alem1 = rgs[1].getCheckedRadioButtonId();
                switch (alem1) {
                    case R.id.rbt2:
                        bts[2].setBackgroundColor(Color.GREEN);
                        bts[3].setEnabled(false);
                        k++;
                        break;
                    case R.id.rbt3:
                        bts[2].setBackgroundColor(Color.GREEN);
                        bts[3].setBackgroundColor(Color.RED);
                        bts[2].setEnabled(false);
                        break;
                }

                int alem2 = rgs[2].getCheckedRadioButtonId();
                switch (alem2) {
                    case R.id.rbt4:
                        bts[4].setBackgroundColor(Color.GREEN);
                        bts[5].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt5:
                        bts[4].setBackgroundColor(Color.GREEN);
                        bts[5].setBackgroundColor(Color.RED);
                        bts[4].setEnabled(false);
                        break;
                }


                int alem3 = rgs[3].getCheckedRadioButtonId();
                switch (alem3) {
                    case R.id.rbt6:
                        bts[7].setBackgroundColor(Color.GREEN);
                        bts[6].setBackgroundColor(Color.RED);
                        bts[7].setEnabled(false);
                        break;

                    case R.id.rbt7:
                        bts[7].setBackgroundColor(Color.GREEN);
                        bts[6].setEnabled(false);
                        k++;
                        break;
                }

                int alem4 = rgs[4].getCheckedRadioButtonId();
                switch (alem4) {
                    case R.id.rbt8:
                        bts[9].setBackgroundColor(Color.GREEN);
                        bts[8].setBackgroundColor(Color.RED);
                        bts[9].setEnabled(false);
                        break;


                    case R.id.rbt9:
                        bts[9].setBackgroundColor(Color.GREEN);
                        bts[8].setEnabled(false);
                        k++;
                        break;
                }

                int alem5 = rgs[5].getCheckedRadioButtonId();
                switch (alem5) {
                    case R.id.rbt10:
                        bts[11].setBackgroundColor(Color.GREEN);
                        bts[10].setBackgroundColor(Color.RED);
                        bts[10].setEnabled(false);
                        bts[12].setEnabled(false);
                        bts[13].setEnabled(false);
                        break;

                    case R.id.rbt11:
                        bts[11].setBackgroundColor(Color.GREEN);
                        bts[10].setEnabled(false);
                        bts[12].setEnabled(false);
                        bts[13].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt12:
                        bts[11].setBackgroundColor(Color.GREEN);
                        bts[12].setBackgroundColor(Color.RED);
                        bts[10].setEnabled(false);
                        bts[11].setEnabled(false);
                        bts[13].setEnabled(false);
                        break;

                    case R.id.rbt13:
                        bts[11].setBackgroundColor(Color.GREEN);
                        bts[13].setBackgroundColor(Color.RED);
                        bts[10].setEnabled(false);
                        bts[12].setEnabled(false);
                        bts[11].setEnabled(false);
                        break;
                }


                int alem6 = rgs[6].getCheckedRadioButtonId();
                switch (alem6) {
                    case R.id.rbt14:
                        bts[15].setBackgroundColor(Color.GREEN);
                        bts[14].setBackgroundColor(Color.RED);
                        bts[15].setEnabled(false);
                        bts[16].setEnabled(false);
                        bts[17].setEnabled(false);
                        break;

                    case R.id.rbt15:
                        bts[15].setBackgroundColor(Color.GREEN);
                        bts[14].setEnabled(false);
                        bts[16].setEnabled(false);
                        bts[17].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt16:
                        bts[15].setBackgroundColor(Color.GREEN);
                        bts[16].setBackgroundColor(Color.RED);
                        bts[15].setEnabled(false);
                        bts[14].setEnabled(false);
                        bts[17].setEnabled(false);
                        break;

                    case R.id.rbt17:
                        bts[15].setBackgroundColor(Color.GREEN);
                        bts[17].setBackgroundColor(Color.RED);
                        bts[14].setEnabled(false);
                        bts[15].setEnabled(false);
                        bts[17].setEnabled(false);
                        break;
                }


                int alem7 = rgs[7].getCheckedRadioButtonId();
                switch (alem7) {
                    case R.id.rbt18:
                        bts[20].setBackgroundColor(Color.GREEN);
                        bts[18].setBackgroundColor(Color.RED);
                        bts[21].setEnabled(false);
                        bts[19].setEnabled(false);
                        bts[20].setEnabled(false);
                        break;

                    case R.id.rbt19:
                        bts[20].setBackgroundColor(Color.GREEN);
                        bts[19].setBackgroundColor(Color.RED);
                        bts[18].setEnabled(false);
                        bts[20].setEnabled(false);
                        bts[21].setEnabled(false);
                        break;

                    case R.id.rbt20:
                        bts[20].setBackgroundColor(Color.GREEN);
                        bts[18].setEnabled(false);
                        bts[19].setEnabled(false);
                        bts[21].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt21:
                        bts[20].setBackgroundColor(Color.GREEN);
                        bts[21].setBackgroundColor(Color.RED);
                        bts[18].setEnabled(false);
                        bts[19].setEnabled(false);
                        bts[20].setEnabled(false);
                        break;
                }



                int alem8 = rgs[8].getCheckedRadioButtonId();
                switch (alem8) {
                    case R.id.rbt22:
                        bts[24].setBackgroundColor(Color.GREEN);
                        bts[22].setBackgroundColor(Color.RED);
                        bts[23].setEnabled(false);
                        bts[24].setEnabled(false);
                        bts[25].setEnabled(false);
                        break;

                    case R.id.rbt23:
                        bts[24].setBackgroundColor(Color.GREEN);
                        bts[23].setBackgroundColor(Color.RED);
                        bts[22].setEnabled(false);
                        bts[24].setEnabled(false);
                        bts[25].setEnabled(false);
                        break;

                    case R.id.rbt24:
                        bts[24].setBackgroundColor(Color.GREEN);
                        bts[22].setEnabled(false);
                        bts[23].setEnabled(false);
                        bts[25].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt25:
                        bts[24].setBackgroundColor(Color.GREEN);
                        bts[25].setBackgroundColor(Color.RED);
                        bts[22].setEnabled(false);
                        bts[23].setEnabled(false);
                        bts[24].setEnabled(false);
                        break;
                }
                int alem9 = rgs[9].getCheckedRadioButtonId();
                switch (alem9) {
                    case R.id.rbt26:
                        bts[28].setBackgroundColor(Color.GREEN);
                        bts[26].setBackgroundColor(Color.RED);
                        bts[27].setEnabled(false);
                        bts[28].setEnabled(false);
                        bts[29].setEnabled(false);
                        break;

                    case R.id.rbt27:
                        bts[28].setBackgroundColor(Color.GREEN);
                        bts[27].setBackgroundColor(Color.RED);
                        bts[26].setEnabled(false);
                        bts[28].setEnabled(false);
                        bts[29].setEnabled(false);
                        break;

                    case R.id.rbt28:
                        bts[28].setBackgroundColor(Color.GREEN);
                        bts[26].setEnabled(false);
                        bts[27].setEnabled(false);
                        bts[29].setEnabled(false);
                        k++;
                        break;

                    case R.id.rbt29:
                        bts[28].setBackgroundColor(Color.GREEN);
                        bts[29].setBackgroundColor(Color.RED);
                        bts[26].setEnabled(false);
                        bts[27].setEnabled(false);
                        bts[28].setEnabled(false);
                        break;
                }

                textview.setText(String.valueOf(k));

            }
        });
    }
}