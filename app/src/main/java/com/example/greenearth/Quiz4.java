package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz4 extends AppCompatActivity {
    //Object View
    TextView txtquestion4;
    Button btn2plant, btn5plant,btn10plant,btn3plant,btnnextquestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        //Link from Java to xml
        btn2plant = findViewById(R.id.btn2plant);
        btn5plant = findViewById(R.id.btn5plant);
        btn10plant = findViewById(R.id.btn10plant);
        btn3plant = findViewById(R.id.btn3plant);
        btnnextquestion4 = findViewById(R.id.btnnextquestion4);
        //to set on Click on Button
        btn2plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz4.this, " Plant is really good for earth. Please keep plant it as much as you can!", Toast.LENGTH_SHORT).show();
            }
        });
        btn3plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz4.this, " Plant is really good for earth. Please keep plant it as much as you can!", Toast.LENGTH_SHORT).show();
            }
        });
        btn10plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz4.this, "It really good that you have planted 10 plants a year. Plant is really for earth. Please keep plant it as much as you can!\"", Toast.LENGTH_SHORT).show();
            }
        });
        btn5plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz4.this, "It's good that you have planted 5 plants a year. Plant is really for earth. Please keep plant it as much as you can!", Toast.LENGTH_SHORT).show();
            }
        });
        btnnextquestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz4.this, Quiz5.class);
                startActivity(i);
                Toast.makeText(Quiz4.this, " Go to question number4  ", Toast.LENGTH_SHORT).show();
            }

        });

    }
}