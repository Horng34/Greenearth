package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz3 extends AppCompatActivity {
    //Object View
    TextView txtquestion3;
    Button btnsolar, btnhydro,btnwind,btnfossilfuel,btnnextquestion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        //Link from Java to xml
        txtquestion3 = findViewById(R.id.txtquestion2);
        btnsolar = findViewById(R.id.btnsolar);
        btnhydro = findViewById(R.id.btnhydro);
        btnwind = findViewById(R.id.btnwind);
        btnfossilfuel = findViewById(R.id.btnfossilfuel);
        btnnextquestion3 = findViewById(R.id.btnnextquestion3);
        //to set on Click on Button
        btnsolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz3.this, "It's good that you use Solar energy. Solar energy is renewable energy", Toast.LENGTH_SHORT).show();
            }
        });
        btnhydro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz3.this, " It's good that you use hydropower energy. Solar energy is renewable energy", Toast.LENGTH_SHORT).show();
            }
        });
        btnwind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz3.this, "t's good that you use Solar energy. Solar energy is renewable energy.", Toast.LENGTH_SHORT).show();
            }
        });
        btnfossilfuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz3.this, " It's not good that you use this energy. It is nonrenewable energy and it also can damage earth. ", Toast.LENGTH_SHORT).show();
            }
        });
        btnnextquestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( Quiz3.this, Quiz4.class);
                startActivity(i);
                Toast.makeText(Quiz3.this, " Go to question number4  ", Toast.LENGTH_SHORT).show();
            }

        });



    }
}