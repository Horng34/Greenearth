package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Climatechangeactivity extends AppCompatActivity {
    String Tipname[]={"Deforestation", "Greenhouse gas emission","Carbon dioxide","Methane","Nitrous oxide","CFCs","Fossil fuels "};
    int Tipimage[]={R.drawable.deforestationcause,R.drawable.greenhousegas,R.drawable.co,R.drawable.ch4,R.drawable.no2,R.drawable.cfcs,R.drawable.fosiilfuel};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climatechangeactivity);
        listView = (ListView) findViewById(R.id.customListView);
        CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
        listView.setAdapter(custonBaseAdapter);
    }
}



