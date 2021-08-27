package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuggestionActivity extends AppCompatActivity {
    //Object View
    Button btntip,btngame,btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestionactivityscreen);
        //Link from xml to Java
        btntip= findViewById(R.id.btntip);
        btngame = findViewById(R.id.btngame);
        btnhome=findViewById(R.id.btnhome);



        btngame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( SuggestionActivity.this, VideoActivity.class);
                startActivity(i);
            }
        });
        btntip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SuggestionActivity.this,TipActivity.class);
                startActivity(i);
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SuggestionActivity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });



    }
}