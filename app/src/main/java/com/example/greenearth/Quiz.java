package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    //Object View
    TextView txtquestion,txtfeedback;
    Button btntarin, btnmotobike,btnbikeandwalk,btncar,btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //Link from Java to xml
        txtquestion = findViewById(R.id.txtquestion);
        btntarin = findViewById(R.id.btntrain);
        btnmotobike = findViewById(R.id.btnmotobike);
        btnbikeandwalk = findViewById(R.id.btnbikeandwalk);
        btncar = findViewById(R.id.btncar);
        btnnext = findViewById(R.id.btnnext);
        txtfeedback = findViewById(R.id.txtfeedback);
        //to set on Click on Button
        btntarin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's good that you use train. Train can make pollution gas but it's good than car");

            }
        });
        btnmotobike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("Motobike can make pollution gas. You should reduce it as much as possible or try to other transportatio");
            }
        });
        btnbikeandwalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's really good that you use bike to go to anywhere. Bike isn't make any pollution gas. And walk is really good choice ,too. It will clean our Earth");
            }
        });
        btncar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("Using car it's not good for our Earth. It's easy to go to anywhere, but it's really make our earth dirty because of its pollution");
            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Quiz.this, Quiz2.class);
                startActivity(i);
                Toast.makeText(Quiz.this, " Go to question number2  ", Toast.LENGTH_SHORT).show();
            }

        });
    }


    }