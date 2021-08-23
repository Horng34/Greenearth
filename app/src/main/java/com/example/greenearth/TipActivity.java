package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class TipActivity extends AppCompatActivity {
    ImageView imageview1;
    TextView txtsometip;
    String Tipname[]={"Green your community", "Shop responsibly","Energy efficiency","Stop deforestation","Use renewable energy source","Eat wisely","Plant tree"};
    int Tipimage[]={R.drawable.greencommunity,R.drawable.shop,R.drawable.energy,R.drawable.deforestation,R.drawable.renewable,R.drawable.eatwisely,R.drawable.tree};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageview1 = findViewById(R.id.imageview1);
        txtsometip = findViewById(R.id.txtsometip);
        setContentView(R.layout.activity_tip);
       listView = (ListView) findViewById(R.id.customListView);
       CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
      listView.setAdapter(custonBaseAdapter);
      //item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String paragraph="Hi";
                if (position==0)
                {

                }
            }
        });


    }
}