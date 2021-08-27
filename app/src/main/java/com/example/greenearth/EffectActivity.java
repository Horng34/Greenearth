package com.example.greenearth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class EffectActivity extends AppCompatActivity {
    String Tipname[]={"Poverty", "Create climate refugee","Health risk","Lack of food","Lack of education ","Damage underwater life"};
    int Tipimage[]={R.drawable.poverty,R.drawable.refugee2,R.drawable.health,R.drawable.lackoffood,R.drawable.edu,R.drawable.underwater};

    ListView listView;
    Button btncause,btnproblem,btneffect,btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effect);
        listView = (ListView) findViewById(R.id.customListView);
        btncause = (Button) findViewById(R.id.btncause);
        btneffect = (Button) findViewById(R.id.btneffect);
        btnproblem = (Button) findViewById(R.id.btnproblem);
        btnhome = (Button) findViewById(R.id.btnhome);
        CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
        listView.setAdapter(custonBaseAdapter);

        //item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Poverty:\n" +
                            "+ Climate change threatens the cleanliness of our air, depletes our water sources and limits food supply. It disrupts livelihoods, forces families from their homes and pushes people into poverty. Without urgent action, climate change could push an additional 100 million people living in poverty by 2030, says the World Bank.\n" +
                            "+ The majority of people living in poverty rely on agriculture and natural resources to survive. For these people, the effects of climate change -shifting weather, limited water sources and increased competition for resources -are a real matter of life and death. These increase their risk of poverty and hunger.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.poverty2);

                }
                if (position==1)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Create climate refugee:\n" +
                            "+ Climate refugee is a person who has been forced to leave their home as a result of the effects of climate change on their environment.\n" +
                            "+ Rising sea levels, extreme weather events and prolonged drought force millions of people to lose or move away from their homes every year in search of food, water, shelter or jobs.\n" +
                            "+ A total of 55 million people were displaced in their home country at the beginning of 2021, according to a new report from the Internal Displacement Monitoring Centre (IDMC). Some 20 million of these were children under the age of 15.\n" +
                            "+ And if sea levels continue to rise without intervention, many of those living near the ocean about 40 percent of the world’s population — will be at risk of losing their homes.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.refugee);

                }
                if (position==2)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview);
                    txtview.setText("Health risk\n" +
                            "+Climate change increases the risk of illness through increasing temperature, more frequent heavy rains and runoff, and the effects of storms.\n" +
                            "+Climate change is quickly becoming climate crisis. Between 2030 and 2050, climate change is expected to cause approximately 250,000 extra deaths per year. That’s from malnutrition, malaria, diarrhea and heat stress alone, says the World Health Organization.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.health2);

                }
                if (position==3)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Lack of food:\n" +
                            "+ Climate change is a threat multiplier for hungry and undernourished people.\n" +
                            "+ Since the early 1990s, the number of extreme weather-related disasters has doubled. This has reduced the yields of major crops such as rice, maize, wheat and contributed to an increase in food prices and a decrease in income. \n" +
                            "+ According to climate change report Food and Land: 25-30% of our food is lost or waste globally.\n" +
                            "+ From 2010-2015, global food loss and waste accounted for 8-10% of total anthropogenic greenhouse gas emission. \n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.food);

                }
                if (position==4)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Lack of education:\n"+
                            "+ Children’s education can be affected by the impacts of climate change.  According to University of Maryland indicates, climate change can threaten schooling. The extreme heat and precipitation from climate change in tropical countries could affect children’s ability to finish high school.\n" +
                            "+ In 2016, 263 million school-aged children, one in five kids globally, remained out of school.\n" +
                            "+ Extreme weather can destroy or damage school buildings, or schools may be used to shelter people who have been displaced from their homes. \n" +
                            "+ As family resources disappear, children may be pulled from school and sent to work.\n" +
                            "+ Climate change is a contributing factor for the 152 million children under the age of 18 working around the world, says the International Labour Organization. And the loss of education is only one aspect of the tragedy.\n" +
                            "+ Some families may migrate in search of food, water, and employment, pulling their kids out of school.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.edu);

                }
                if (position==5)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Damage underwater life:\n" +
                            "+ Oceans are getting hotter. Changes in water temperature can affect the environments where fish, shellfish, and other marine species live. \n" +
                            "+ Oceans are becoming more acidic Carbon dioxide dissolves in water, changing seawater chemistry and decreasing pH (making seawater more acidic). The ocean’s increased acidity results in thinner shells and more shellfish die as they become easier for predators to eat.\n" +
                            "+ More severe storms and precipitation can pollute coastal waters.\n" +
                            "Coral bleaching: Coral bleaching happens when corals lose their vibrant colors and turn white. Due to warmer waters, they expel the algae in their tissue which causes them to lose all color and die.\n" );
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.underwater);

                }


            }
        });

        btnproblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EffectActivity.this,ProblemActivity.class);
                startActivity(i);
            }
        });
        btneffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EffectActivity.this,EffectActivity.class);
                startActivity(i);
            }
        });
        btncause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EffectActivity.this,Climatechangeactivity.class);
                startActivity(i);
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EffectActivity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });
    }
}