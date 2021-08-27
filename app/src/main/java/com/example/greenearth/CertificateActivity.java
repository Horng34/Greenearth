package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CertificateActivity extends AppCompatActivity {
    TextView output,total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
       output=findViewById(R.id.output);
       String data_output = getIntent().getStringExtra("output_data");
       output.setText(data_output);
       //Total amount
        total = findViewById(R.id.total);

        String totalstr = getIntent().getStringExtra("PERCENTAGE");
        total.setText(totalstr);


    }


}