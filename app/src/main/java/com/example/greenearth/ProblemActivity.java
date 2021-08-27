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

public class ProblemActivity extends AppCompatActivity {
    String Tipname[]={"Global temperature is rise unusual ", "glacier and sea ice melting","Ecological collapse","Change in precipitation","Extreme weather ","More Acid Rain and Acidic Oceans."};
    int Tipimage[]={R.drawable.globalwarming,R.drawable.icemelting,R.drawable.ecological,R.drawable.precipitation,R.drawable.extreamweather,R.drawable.acid};

    ListView listView;
    Button btncause,btnproblem,btneffect,btnhome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cause);
        listView = (ListView) findViewById(R.id.customListView);
        btncause = (Button) findViewById(R.id.btncause);
        btneffect = (Button) findViewById(R.id.btneffect);
        btnproblem = (Button) findViewById(R.id.btnproblem);
        btnhome= (Button)findViewById(R.id.btnhome);
        CustonBaseAdapter custonBaseAdapter = new CustonBaseAdapter(getApplicationContext(),Tipname,Tipimage);
        listView.setAdapter(custonBaseAdapter);

        //item click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText(        " The Global temperature is rise unusual every day.\n" +
                            "+The global temperature record represents an average over the entire surface of the planet.\n" +
                            "+ According to an ongoing temperature analysis conducted by scientists at NASA’s Goddard Institute for Space Studies (GISS), the average global temperature on Earth has increased by a little more than 1° Celsius (2° Fahrenheit) since 1880. \n" +
                            "+It is the result of an increase greenhouse gas in the atmosphere.  When global warming it is increases evaporation on land which can worsen drought and create conditions more prone to wildfire and a longer wildfire season. It also increases in the air's capacity to hold moisture, too. It is really effect to our life on earth.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.globalwarming);

                }
                if (position==1)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText(         "glacier and sea ice melting:\n" +
                            " + Ice acts like a protective cover over the Earth and our oceans.\n" +
                            " +As we know that Sea ice forms and melts strictly in the ocean whereas glaciers are formed on land. \n" +
                            " +When it melting it affects both global ocean temperatures and the global movement of ocean waters. \n" +
                            " +Glaciers and ice sheets worldwide are melting and adding more water to Earth's oceans which casing sea level to rise.\n" +
                            " +If all glaciers and ice sheets melted, global sea level would rise by more than 195 feet (60 meters).\n" +
                            " +Now a day, Around 10% of the world’s land surface is currently covered by glaciers, which store around 70% of the Earth’s freshwater.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.icemelting);

                }
                if (position==2)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview);
                    txtview.setText("+Ecological collapse refers to a situation where an ecosystem suffers a drastic, possibly permanent, reduction in carrying capacity for all organisms, often resulting in mass extinction). \n" +
                                    "+For example, Lake Chad. The changes in Lake Chad have been called an ecological disaster that have not only destroyed livelihoods but also led to the loss of invaluable biodiversity.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.ecological);

                }
                if (position==3)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Change in precipitation\n" +
                            "+Changes in precipitation: increased runoff of freshwater, sediment, and land-based pollutants contribute to algal blooms and cause murky water conditions that reduce light.\n" +
                            "+Precipitation has increased in many regions of the world and decreased in others, with little or no net change in the total amount of precipitation. It also causes of drought and flood, too.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.precipitation);

                }
                if (position==4)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Extreme weather or extreme climate events includes unexpected, unusual, severe, or unseasonal weather.\n"+
                            "Some extreme weather and climate events have increased in recent decades, and new and stronger evidence confirms that some of these increases are related to human activities.)");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.extreamweather);

                }
                if (position==5)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("More Acid Rain and Acidic oceansn \n" +
                            "Acid rain, or acid deposition is a simple rain mixed with many toxic chemicals in it that can damage most things it touches. It is a broad term that includes any form of precipitation with acidic components, such as sulfuric or nitric acid that fall to the ground from the atmosphere in wet or dry forms. This also can include rain, snow, fog, hail or even dust that is acidic. \n" +
                            "Acid rain can erode objects, change pH level of water, harm animal and contaminated our drinking water.\n" +
                            "As we know that human activities release CO2 into the atmosphere, which leads to atmospheric warming and climate change. Around a third to a half of the CO2 released by human activities is absorbed into the oceans which cause acidic ocean. Ocean acidification is often expressed in terms of the pH of seawater. It really impacts to the underwater life.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.acid);

                }


            }
        });

        btnproblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProblemActivity.this,ProblemActivity.class);
                startActivity(i);
            }
        });
        btneffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProblemActivity.this,EffectActivity.class);
                startActivity(i);
            }
        });
        btncause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProblemActivity.this,Climatechangeactivity.class);
                startActivity(i);
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProblemActivity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });
    }
}