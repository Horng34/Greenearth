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

public class Quiz4 extends AppCompatActivity {
    //Object View
    TextView txtquestion,txtfeedback;
    Button btn2plant, btn5plant,btn10plant,btn3plant,btnnext;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        //Link from Java to xml
        btn2plant = findViewById(R.id.btn2plant);
        btn5plant = findViewById(R.id.btn5plant);
        btn10plant = findViewById(R.id.btn10plant);
        btn3plant = findViewById(R.id.btn3plant);
        btnnext = findViewById(R.id.btnnext);
        txtfeedback=findViewById(R.id.txtfeedback);
        txtquestion=findViewById(R.id.txtquestion);
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
        btn2plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtfeedback.setText( " Plant is really good for earth. Please keep plant it as much as you can!");
                btn2plant.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });
        btn3plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( " Plant is really good for earth. Please keep plant it as much as you can!");
                btn3plant.setBackgroundColor(Color.parseColor("#FFA500"));
            }
        });
        btn10plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtfeedback.setText( "It really good that you have planted 10 plants a year. Plant is really for earth. Please keep plant it as much as you can!");
                btn10plant.setBackgroundColor(Color.parseColor("#00FF00"));
            }
        });
        btn5plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5plant.setBackgroundColor(Color.parseColor("#FFFF00"));
                txtfeedback.setText( "It's good that you have planted 5 plants a year. Plant is really for earth. Please keep plant it as much as you can!");

            }
        });
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz4.this, Quiz5.class);
                startActivity(i);
                Toast.makeText(Quiz4.this, " Go to question number4  ", Toast.LENGTH_SHORT).show();
            }

        });

    }
}