package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Quiz3 extends AppCompatActivity {
    //Object View
    TextView txtquestion,txtfeedback;
    Button btnsolar, btnhydro,btnwind,btnfossilfuel,btnnext;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        //Link from Java to xml
        txtquestion = findViewById(R.id.txtquestion);
        txtfeedback=findViewById(R.id.txtfeedback);
        btnsolar = findViewById(R.id.btnsolar);
        btnhydro = findViewById(R.id.btnhydro);
        btnwind = findViewById(R.id.btnwind);
        btnfossilfuel = findViewById(R.id.btnfossilfuel);
        btnnext = findViewById(R.id.btnnext);

        textToSpeech = new TextToSpeech(getApplicationContext()
                , new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!= TextToSpeech.ERROR){
                    //Selected Language:
                    textToSpeech.setLanguage(Locale.ENGLISH);

                }
            }
        });

        txtquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtquestion.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        txtfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtfeedback.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        //to set on Click on Button
        btnsolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's really good that you use Solar energy. Solar energy is renewable energy. It's the cheapest source. When you use Solar you have to make sure that your area have enough sunlight!");
                btnsolar.setBackgroundColor(Color.parseColor("#00FF00"));
            }
        });
        btnhydro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              txtfeedback.setText( " It's good that you use hydropower energy.  It is a renewable source of energy that generates power by using a dam or diversion structure to alter the natural flow of a river or other body of water.");
                btnhydro.setBackgroundColor(Color.parseColor("#FFA500"));
            }
        });
        btnwind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( "It's good that you use wind energy. Wind energy is renewable energy. If you live in windy area, so wind energy is the best choice for you!. ");
                btnwind.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
        });
        btnfossilfuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( " It's not good that you use this energy. It is nonrenewable energy and it also can damage earth. ");
                btnfossilfuel.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz3.this, Quiz4.class);
                startActivity(i);
                Toast.makeText(Quiz3.this, " Go to question number4  ", Toast.LENGTH_SHORT).show();
            }

        });



    }
}