package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class GameActivity extends AppCompatActivity {
    Button btnshovel,btnplant,btncompost,btndirt,btnwater,btnvideoview;
    GifImageView gifimageview;
    TextView txtview1;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        btnshovel = findViewById(R.id.btnshovel);
        btnvideoview=findViewById(R.id.btnvideoview);

        btnplant = findViewById(R.id.btnplant);
        btncompost = findViewById(R.id.btncompost);
        btndirt = findViewById(R.id.btndirt);
        btnwater = findViewById(R.id.btnwater);
        gifimageview = findViewById(R.id.gifimageview);
        txtview1 = findViewById(R.id.txtview1);

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
        btnvideoview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameActivity.this,Video2Activity.class);
                startActivity(i);
            }
        });

        btnshovel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.digahole);
                txtview1.setText(" You have dug a hole already. Now let's click on tree button ");

                String s = txtview1.getText().toString();
              textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });



        btnplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.puttheplant);
                txtview1.setText("Now You have put the tree in the hole already! So right now let's click on compost button. ");
                String s = txtview1.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
        btncompost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.compost);
                txtview1.setText("Now You have added  compost to the tree already! That's good. Compost is  an Organic Fertilizer. So right now let's click on dirt button.");
                String s = txtview1.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        btndirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.dirtwithplant);
                txtview1.setText("Now you have done 4step! So let's go to the final step by clicking on water button.");
                String s = txtview1.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
        btnwater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gifimageview.setImageResource(R.drawable.water_the_plant);
                txtview1.setText("Congratulations! Now you have planted a tree. Please continue to plant tree at your home! ");
                String s = txtview1.getText().toString();
                textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}