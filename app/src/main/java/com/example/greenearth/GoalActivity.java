package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class GoalActivity extends AppCompatActivity {
    Button btnnextgoal;
    CheckBox chbox1, chbox2, chbox3, chbox4;
    EditText etgoal,etname;
    TextView output,outputname;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        //from xml to Java
        btnnextgoal = findViewById(R.id.btnnextgoal);
        chbox1 = findViewById(R.id.chbox1);
        chbox2 = findViewById(R.id.chbox2);
        chbox3 = findViewById(R.id.chbox3);
        chbox4 = findViewById(R.id.chbox4);
        etgoal = findViewById(R.id.etgoal);
        etname = findViewById(R.id.etname);
        output = findViewById(R.id.output);
        outputname = findViewById(R.id.outputname);
        btnnextgoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder output = new StringBuilder();
                output.append(etgoal.getText().toString() + "\n");
                if (chbox1.isChecked()) {
                    output.append(" I will plant 5 trees in this year.\n");
                }
                if (chbox2.isChecked()) {
                    output.append(" I use public transportation more than my own car.\n");
                }
                if (chbox3.isChecked()) {
                    output.append(" I will try to reduce plastic and use another things instead.\n");
                }
                if (chbox4.isChecked()) {
                    output.append(" I will try to make my community green.\n");
                }
                Intent intent=new Intent(GoalActivity.this,CertificateActivity.class);
                intent.putExtra("output_data",output.toString());
                startActivity(intent);


                Intent i =new Intent(GoalActivity.this,CertificateActivity.class);
                name=etname.getText().toString().trim();
                i.putExtra(CertificateActivity.Name,name);
                startActivity(i);



            }
        });





    }



}

