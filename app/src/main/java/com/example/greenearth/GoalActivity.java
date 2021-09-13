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
    Button btnnextgoal,buttonbackgoal;
    CheckBox chbox1, chbox2, chbox3, chbox4;
    EditText etgoal,etname;
    TextView output;
    int percentage;

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
        output = findViewById(R.id.output);
        etgoal =findViewById(R.id.etgoal);
        etname =findViewById(R.id.etname);
        buttonbackgoal = findViewById(R.id.buttonbackgoal);




        btnnextgoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etname.getText().toString();


                StringBuilder output = new StringBuilder();
                output.append(etgoal.getText().toString() + "\n");


                if (chbox1.isChecked()) {
                    percentage+=25;

                    output.append(" I will plant 5 trees in this year.\n");

                }
                if (chbox2.isChecked()) {
                    output.append(" I use public transportation more than my own car.\n");
                    percentage+=25;
                }
                if (chbox3.isChecked()) {
                    output.append(" I will try to reduce plastic and use another things instead.\n");
                    percentage+=25;
                }
                if (chbox4.isChecked()) {
                    output.append(" I will try to make my community green.\n");
                    percentage+=25;
                }




                Intent intent=new Intent(GoalActivity.this,CertificateActivity.class);
                intent.putExtra("PERCENTAGE",String.valueOf(percentage) +"/"+"100%"+"of goal!");
                intent.putExtra("USERNAME",username);

                intent.putExtra("output_data",output.toString());
                startActivity(intent);










            }
        });

        buttonbackgoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(GoalActivity.this,Greenearthscreen.class);
                startActivity(ii);
            }
        });





    }



}

