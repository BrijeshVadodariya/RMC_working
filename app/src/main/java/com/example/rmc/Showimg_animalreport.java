package com.example.rmc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Showimg_animalreport extends AppCompatActivity {
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimg_toiletreport);
        imgv = findViewById(R.id.img);
        imgv.setImageBitmap(Injured_animalreport_main.bitmap);
    }
}
