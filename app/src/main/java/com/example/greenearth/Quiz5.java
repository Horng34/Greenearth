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

public class Quiz5 extends AppCompatActivity {
    //Object View
    TextView txtquestion,txtfeedback;
    Button btnthrow, btnrecycle,btnreuse,btnbin,btnfinish;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        //Link from Java to xml
        btnthrow = findViewById(R.id.btnthrow);
        btnrecycle = findViewById(R.id.btnrecycle);
        btnreuse = findViewById(R.id.btnreuse);
        btnbin = findViewById(R.id.btnbin);
        btnfinish = findViewById(R.id.btnfinish);
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
        btnthrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( " It's really bad that you throw it away. You should thew it in the bin or recycle it");
                btnthrow.setBackgroundColor(Color.parseColor("#ff0000"));
            }
        });
        btnrecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText(" It's sound good that you can recycle the plastic. Please continue it and share it to your friend");
                btnrecycle.setBackgroundColor(Color.parseColor("#FFFF00"));
            }
        });
        btnreuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText( "It really good that you can reuse it. Please use it as much as you can before you throw it ");
                btnreuse.setBackgroundColor(Color.parseColor("#00FF00"));
            }
        });
        btnbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtfeedback.setText("It's good that you thew it in the bin. But if you can recycle it or reuse it, please do it first before you thew it into the bin. ");
                btnbin.setBackgroundColor(Color.parseColor("#FFA500"));
            }
        });
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz5.this, Finishquiz.class);
                startActivity(i);
                Toast.makeText(Quiz5.this, " welldone ", Toast.LENGTH_SHORT).show();
            }

        });
    }
}