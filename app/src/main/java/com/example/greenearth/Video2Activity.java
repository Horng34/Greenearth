package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video2Activity extends AppCompatActivity {
    Button btnhome3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video2);
        btnhome3=findViewById(R.id.btnhome3);
        VideoView videoview = findViewById(R.id.videoview);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.detailofplanttree);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
        videoview.start();
        btnhome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Video2Activity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });
    }
}