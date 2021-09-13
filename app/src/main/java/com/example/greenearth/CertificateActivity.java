package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CertificateActivity extends AppCompatActivity {
    TextView output,total,editText;
    Button btnhome4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
       output=findViewById(R.id.output);
       editText=findViewById(R.id.editText);
       btnhome4 = findViewById(R.id.btnhome4);
       String data_output = getIntent().getStringExtra("output_data");
       output.setText(data_output);
       //Total amount
        total = findViewById(R.id.total);

        String totalstr = getIntent().getStringExtra("PERCENTAGE");
        total.setText(totalstr);

        String username = getIntent().getStringExtra("USERNAME");
        editText.setText(username);
        btnhome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CertificateActivity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });


    }


}