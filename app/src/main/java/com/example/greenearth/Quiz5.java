package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz5 extends AppCompatActivity {
    //Object View
    TextView txtquestion5;
    Button btnthrow, btnrecycle,btnreuse,btnbin,btnfinish;

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
        //to set on Click on Button
        btnthrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz5.this, " It's really bad that you throw it away. You should thew it in the bin or recycle it", Toast.LENGTH_SHORT).show();
            }
        });
        btnrecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz5.this, " It's sound good that you can recycle the plastic. Please continue it and share it to your friend", Toast.LENGTH_SHORT).show();
            }
        });
        btnreuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz5.this, "It really good that you can reuse it. Please use it as much as you can before you throw it ", Toast.LENGTH_SHORT).show();
            }
        });
        btnbin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz5.this, "It's good that you thew it in the bin. But if you can recycle it or reuse it, please do it first before you thew it into the bin. ", Toast.LENGTH_SHORT).show();
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