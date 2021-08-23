package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pl.droidsonroids.gif.GifImageView;

public class GameActivity extends AppCompatActivity {
    Button btnshovel,btnplant,btncompost,btndirt,btnwater;
    GifImageView gifimageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        btnshovel = findViewById(R.id.btnshovel);

        btnplant = findViewById(R.id.btnplant);
        btncompost = findViewById(R.id.btncompost);
        btndirt = findViewById(R.id.btndirt);
        btnwater = findViewById(R.id.btnwater);
        gifimageview = findViewById(R.id.gifimageview);

        btnshovel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.digahole);
            }
        });



        btnplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.putplantinhole);
            }
        });
        btncompost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.addcompost);
            }
        });
        btndirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.dirtgif);
            }
        });
        btnwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.watertheplant);
            }
        });
    }
}