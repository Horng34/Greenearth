package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz2 extends AppCompatActivity {
    //Object View
    TextView txtquestion2;
    Button btnpaperbag, btnplastic,btnreusable,btncatton,btnnextquestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        //Link from Java to xml
        txtquestion2 = findViewById(R.id.txtquestion2);
        btnpaperbag = findViewById(R.id.btnpaperbag);
        btnplastic = findViewById(R.id.btnplastic);
        btnreusable = findViewById(R.id.btnreusable);
        btncatton = findViewById(R.id.btncatton);
        btnnextquestion2 = findViewById(R.id.btnnextquestion2);
        //to set on Click on Button
        btnpaperbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz2.this, "It's good that you use paper bag. Paper bag isn't like plastic.It is biodegradable.", Toast.LENGTH_SHORT).show();
            }
        });
        btnplastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz2.this, " It's not good that you use plastic. Plastic is really bad for our environment.You should change to use other one.  ", Toast.LENGTH_SHORT).show();
            }
        });
        btnreusable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz2.this, "It's really good that you use reusable shopping bag. It's not damage our environment. You can reuse it later.", Toast.LENGTH_SHORT).show();
            }
        });
        btncatton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz2.this, " It's really good that you use catton bag. It's not damage our environment. You can reuse it later.  ", Toast.LENGTH_SHORT).show();
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