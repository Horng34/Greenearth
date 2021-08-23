package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class TipActivity extends AppCompatActivity {
    String Tipname[]={"Green your community", "Shop responsibly","Energy efficiency","Stop deforestation","Use renewable energy source","Eat wisely","Plant tree"};
    int Tipimage[]={R.drawable.greencommunity,R.drawable.shop,R.drawable.energy,R.drawable.deforestation,R.drawable.renewable,R.drawable.eatwisely,R.drawable.tree};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
       listView = (ListView) findViewById(R.id.customListView);
       CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
      listView.setAdapter(custonBaseAdapter);
    }
}