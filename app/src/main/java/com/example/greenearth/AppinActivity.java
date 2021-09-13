package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AppinActivity extends AppCompatActivity {
    Button btnaboutus;
    TextView txtaboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appinfo);

        btnaboutus=findViewById(R.id.btnaboutus);
        txtaboutus = findViewById(R.id.txtaboutus);


        btnaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtaboutus.setText("\"Why we create this app?\n" +
                        "             We created this app to prevent to climate change action situation right now. Our purpose is want to inform people to get well understanding about  climate change action( about cause, problem, effect) and also give them some suggestion that they can take to apply in real life to combat climate change.\n" +
                        "             <Everyday earth is our day >\n" +
                        "                 Team Green Defender\n" +
                        "                 Mentor: Seungbin Oh\n" +
                        "                         TaeYoon Kim\n" +
                        "                         Kuong Socheata\n" +
                        "                         Ko Jae Won\n" +
                        "           Team member: Chhea Seangly\n" +
                        "                        Kao Menghorng\n" +
                        "                        Choi Seong-Rok\n" +
                        "                        Lee Sang-Hyeop\"");
            }
        });
    }
}