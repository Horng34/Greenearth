package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CertificateActivity extends AppCompatActivity {
    public static final  String Name = "Name";
    TextView output,outputname;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);
       output=findViewById(R.id.output);
       outputname=findViewById(R.id.outputname);

       Intent i = getIntent();
       name= i.getStringExtra(Name);
       outputname.setText(name);



       String data_output = getIntent().getStringExtra("output_data");
       output.setText(data_output);


    }


}