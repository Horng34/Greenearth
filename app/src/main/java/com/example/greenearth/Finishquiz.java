package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Finishquiz extends AppCompatActivity {
Button btnhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finishquiz);
        btnhome = findViewById(R.id.btnhome);

        //when click on button
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Finishquiz.this ,Greenearthscreen.class);
                startActivity(i);
            }
        });

    }

}