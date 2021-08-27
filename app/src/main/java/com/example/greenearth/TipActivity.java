package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class  TipActivity extends AppCompatActivity {

    String Tipname[]={"Green your community", "Shop responsibly","Energy efficiency","Stop deforestation","Use renewable energy source","Eat wisely","Plant tree"};
    int Tipimage[]={R.drawable.greencommunity,R.drawable.shop,R.drawable.energy,R.drawable.deforestation,R.drawable.renewable,R.drawable.eatwisely,R.drawable.tree};
    ListView listView;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tip);
       listView = (ListView) findViewById(R.id.customListView);
       btnback = (Button)findViewById(R.id.btnback);
       CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
      listView.setAdapter(custonBaseAdapter);
      //item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText(
                            " 1.Walk (Walk is the best way to green your community. It doesn’t make air pollution and give you a good health)\n" +
                            " 2.Use Carpool\n" +
                            " 3.Use public transport\n" +
                            " 4.Switch to an electric or hybrid vehicle\n" +
                            " 5.Use trip planner\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.greencommunity);

                }
                if (position==1)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("Shop responsibly\n" +
                            "Plastic makes our lives incredibly convenient, disposable, and easy, but most people rarely think about the effects it has on the environment. So to make our environment better you should:\n" +
                            "1.Avoid single use plastic\n" +
                            "2.Select product without any packaging or with biodegradable packaging\n" +
                            "3.Reduce and refuse plastic: The most effective way to reduce plastic pollution is to not create plastics in the first place. You should use it in case you really need it. Please try to reduce it as much as you can. Moreover, if you buy products in bulk it also helps to reduce plastic, too.\n" +
                            "4.Reuse plastic: Once the plastic is in your possession, it is your chance to be creative and find different usages for it. Reuse plastic produce bags for sandwiches, plastic grocery bags for small trash bags, and re-use your plastic silverware! Please try to reuse plastic as many time as you can before you throw it.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.plastic);

                }
                if (position==2)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("You can use less electricity is as easy as flicking a switch when you leave the room. Moreover, you can use LED light instead and use the device that reduce electricity. Especially you should wash clothes in cold water and air dry instead of dryer.");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.energy);

                }
                if (position==3)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("Stop deforestation\n" +
                            "We can stop deforestation by:\n" +
                            "1.planting tree\n" +
                            "2. use recycled products\n" +

                            "3.raise awareness (You can share your knowledge about deforestation to other people to let them know about its effect and also tell them to reduce and prevent it.)\n" +
                            "4.Use less paper (Globally, 40 percent of all timber is used to make paper products, and the demand for paper increases by two to three percent every year. So, please try to reduce your paper use when you can. You can use electronic mail instead of printing it out!).\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.deforestation);

                }
                if (position==4)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("renewable energy source \n" +
                                      "Renewable energy (Solar energy, wind energy, geothermal energy, bio fuels…) is useful energy that is collected from renewable resources, which are naturally replenished on a human timescale, including carbon neutral sources like sunlight, wind, rain, tides, waves, and geothermal heat. It’s clean energy and it doesn’t effect to our earth. So it really good if you can use renewable energy like solar system instead.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.renewable);

                }
                if (position==5)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("Eat wisely\n" +
                            "1.Reduce meat and dairy consumption (You should be eating less meat because a diet heavy in meat increases the risk of obesity, cancer and heart disease. Especially it t also makes the planet sick. So what you can do is Commit to reducing your meat and dairy consumption by a few meals per week, Make fresh fruits and vegetables a bigger part of your diet.)\n" +
                            "2.Buy sustainable or organic fresh produce whenever possible.\n" +
                            "3.Meal plan\n" +
                            "4.Compost your kitchen scraps and garden waste\n" +
                            "5.Grow your own vegetable and fruit.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.diet);

                }
                if (position==6)
                {
                    TextView txtsometip = (TextView) findViewById(R.id.txtsometip );
                    txtsometip.setText("Plant Tree\n" +
                                       "Plant tree is a really good way to combat climate change action. Tree absorb carbon dioxide (CO2), a major greenhouse gas in the atmosphere.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.tree);

                }


            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TipActivity.this,SuggestionActivity.class);
                startActivity(i);
            }
        });


    }
}