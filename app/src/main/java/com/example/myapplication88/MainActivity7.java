package com.example.myapplication88;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import yuku.ambilwarna.AmbilWarnaDialog;

public class MainActivity7 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    //    private DrawingView drawingView;
    private DrawingView drawingView;
    TextView textview;
    int aka = 5;
    int cols = Color.BLACK;
    String[] eng={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[] amh={"ሀ","ለ","ሐ","መ","ሠ","ረ","ሰ","ሸ","ቀ","በ","ቨ","ተ","ቸ","ኅ","ነ","ኘ","አ","ከ","ኸ","ወ","ዐ","ዘ","ዠ","የ","ደ","ጀ","ገ","ጠ","ጨ","ጰ","ጸ","ፀ","ፈ","ፐ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        drawingView = findViewById(R.id.drawingView);
        Button but=findViewById(R.id.kk0);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorpicker();
            }
        });
        Button bksh=findViewById(R.id.kk2);
        bksh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawingView.clearDrawing();
            }
        });


        Spinner spinner=findViewById(R.id.spinner1);
        Spinner spinner2=findViewById(R.id.spinner2);
        SeekBar seekbar=findViewById(R.id.seekbar1);
        textview=findViewById(R.id.kk1);

        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                aka=progress;
                drawingView.init(aka,cols);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.english, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.AMHARIC, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        int selectedItemPosition = parent.getSelectedItemPosition();
        switch (parent.getId()) {
            case R.id.spinner1: {
                for (int i = 0; i < eng.length; i++) {
                    if (selectedItemPosition == i) {
                        textview.setText(eng[i]);
                        break;
                    }
                }
                break;
            }
            case R.id.spinner2:
                for(int k=0; k < amh.length; k++){
                    if(selectedItemPosition == k){
                        textview.setText(amh[k]);
                        break;
                    }
                }
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void colorpicker(){
        AmbilWarnaDialog warnaDialog=new AmbilWarnaDialog(this, Color.BLACK, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {
            }
            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                cols = color;
                drawingView.init(aka,cols);
            }
        });
        warnaDialog.show();
    }

}
