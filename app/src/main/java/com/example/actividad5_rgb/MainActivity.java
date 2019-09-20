package com.example.actividad5_rgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String colorHex = "#000000";
    SeekBar rColor, gColor, bColor;
    TextView rColorText, gColorText, bColorText, TextoHex;
    View cuadroColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View colorSample = findViewById(R.id.colorSample);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));

        rColor = findViewById(R.id.rColor);
        gColor = findViewById(R.id.gColor);
        bColor = findViewById(R.id.bColor);
        rColorText = findViewById(R.id.rColorText);
        gColorText = findViewById(R.id.gColorText);
        bColorText = findViewById(R.id.bColorText);
        cuadroColor = findViewById(R.id.colorSample);
        TextoHex = findViewById(R.id.TextoHex);



        rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                rColorText.setText("R: " + progress);
                TextoHex.setText(hex);
                cuadroColor.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                gColorText.setText("R: " + progress);
                TextoHex.setText(hex);
                cuadroColor.setBackgroundColor(Color.parseColor(hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String hex = "#" + ColorUtils.decimalToHex(rColor.getProgress()) + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress());
                bColorText.setText("R: " + progress);
                TextoHex.setText(hex);
                cuadroColor.setBackgroundColor(Color.parseColor(hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
