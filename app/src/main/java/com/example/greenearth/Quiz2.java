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

public class Quiz2 extends AppCompatActivity {
    //Object View
    TextView txtquestion2,txtfeedback;
    Button btnpaperbag, btnplastic,btnreusable,btncatton,btnnextquestion2;
    TextToSpeech textToSpeech;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
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

        //Link from Java to xml
        txtquestion2 = findViewById(R.id.txtquestion2);
        btnpaperbag = findViewById(R.id.btnpaperbag);
        btnplastic = findViewById(R.id.btnplastic);
        btnreusable = findViewById(R.id.btnreusable);
        btncatton = findViewById(R.id.btncatton);
        txtfeedback=findViewById(R.id.txtfeedback);
        btnnextquestion2 = findViewById(R.id.btnnextquestion2);

        txtquestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtquestion2.getText().toString();
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
        btnpaperbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's good that you use paper bag. But you should use it as many time as you can. Dont' use it only one time.Paper bag isn't like plastic.It is biodegradable.");
                btnpaperbag.setBackgroundColor(Color.parseColor("#FFA500"));


            }
        });
        btnplastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( " It's not good that you use plastic. Plastic is really bad for our environment.You should change to use other one.  ");
                btnplastic.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });
        btnreusable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's really good that you use reusable shopping bag. It's not damage our environment. You can reuse it later.");
                btnreusable.setBackgroundColor(Color.parseColor("#00FF00"));
            }
        });
        btncatton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( " It's really good that you use catton bag. It's not damage our environment. You can reuse it later.  ");
                btncatton.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
        });
        btnnextquestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz2.this, Quiz3.class);
                startActivity(i);
                Toast.makeText(Quiz2.this, " Go to question number3  ", Toast.LENGTH_SHORT).show();
            }

        });


    }
}