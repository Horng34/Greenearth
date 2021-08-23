package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Greenearthscreen extends AppCompatActivity {
    //Object View
    Button btnclimatechange, btnsuggestion, btnreflection,btngoal,btnappinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greenearthscreen);
        //Like from xml to Java
        btnclimatechange = findViewById(R.id.btnclimatechange);
        btnsuggestion=findViewById(R.id.btnsuggestion);
        btnreflection = findViewById(R.id.btnreflection);
        btngoal = findViewById(R.id.btngoal);
        btnappinfo = findViewById(R.id.btnappinfo);


        btnclimatechange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Greenearthscreen.this, Climatechangeactivity.class);
                startActivity(i);
            }
        });
        btnsuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Greenearthscreen.this, SuggestionActivity.class);
                startActivity(i);
            }
        });
        btnreflection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Greenearthscreen.this, Question.class);
                startActivity(i);
            }
        });
        btngoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Greenearthscreen.this, GoalActivity.class);
                startActivity(i);
            }
        });
        btnappinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Greenearthscreen.this,AppinActivity.class);
                startActivity(i);
            }
        });
    }
}