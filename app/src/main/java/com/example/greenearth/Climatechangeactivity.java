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

public class Climatechangeactivity extends AppCompatActivity {
    String Tipname[]={"Deforestation", "Greenhouse gas emission","Carbon dioxide","Methane","Nitrous oxide","CFCs","Fossil fuels "};
    int Tipimage[]={R.drawable.deforestationcause,R.drawable.greenhousegas,R.drawable.co,R.drawable.ch4,R.drawable.no2,R.drawable.cfcs,R.drawable.fosiilfuel};

    ListView listView;
    Button btncause,btnproblem,btneffect,btnhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climatechangeactivity);
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
                    txtview.setText(        " Deforestation – because living trees absorb and store carbon dioxide (Deforestation refers to the decrease in forest areas across the world. The cause of deforestation included \n" +
                                            "1.agriculture (According to the FAO, agriculture causes around 80% of deforestation)\n" +
                                            "2.New Constructions (10% of deforestation can be attributed to new infrastructures that serve the current human lifestyle in four main ways: transportation, transformation and energy generation.) \n" +
                                            "3.Urbanization (The population shift that is leading people to move from rural areas to urban areas is also contributing to deforestation (5%, according to FAO)\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.deforestationcause);

                }
                if (position==1)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Greenhouse gas:\n" +
                            " A greenhouse gas is a gas that absorbs and emits radiant energy within the thermal infrared range, causing the greenhouse effect. It causes climate change by trapping heat, and they also contribute to respiratory disease from smog and air pollution. Carbon dioxide, Methane, Nitrous Oxide, CFCs are for example of greenhouse gas.  \n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.greenhousegas);

                }
                if (position==6)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview);
                    txtview.setText("Fossil Fuels:\n" +
                                    "Humanity’s increased use of fossil fuels – such as coal, oil and gas to generate electricity, run cars and other forms of transport, and power manufacturing and industry. By increased fossil fuels it’ll makes climate change action.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.fosiilfuel);

                }
                if (position==2)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Carbon dioxide (CO2): \n" +
                            "+Carbon dioxide enters the atmosphere through: \n" +
                            "-burning fossil fuels (coal, natural gas, and oil)\n" +
                            "-solid waste (paper, glass, biodegradable waste that includes rotten food, vegetable peel and mostly wet kitchen waste…)\n" +
                            "-Biological materials and also as a result of certain chemical reactions (e.g., manufacture of cement). \n" +
                            "-Overall it produced by human activities.\n" +
                            "+Carbon dioxide cause climate change by trapping heat. It heats up the planet, more water evaporates into the atmosphere, which in turn raises the temperature further.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.carbondioxide);

                }
                if (position==3)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Methane (CH4):\n" +
                            "-Methane is emitted during the production and transport of coal, natural gas, and oil. \n" +
                            "-Methane emissions also result from livestock and other agricultural practices, land use and by the decay of organic waste in municipal solid waste landfills.\n " +
                            "-It is produced in many combustion processes and also by anaerobic decomposition, for example, in flooded rice paddies, pig and cow stomachs, and pig manure ponds.\n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.methane);

                }
                if (position==4)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("Nitrous oxide (N2O): \n" +
                            "Nitrous oxide is emitted during agricultural, land use, industrial activities, combustion of fossil fuels and solid waste, as well as during treatment of wastewater.");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.nitrousoxide);

                }
                if (position==5)
                {
                    TextView txtview = (TextView) findViewById(R.id.txtview );
                    txtview.setText("CFCs(Chlorofluorocarbons)\n" +
                            "It has been responsible for depleting the ozone layer as they destroy ozone molecules. \n" +
                            "CFCs were used in aerosols, such as hairspray cans, fridges and in making foam plastics. \n");
                    ImageView imageview = (ImageView)findViewById(R.id.imageview);
                    imageview.setImageResource(R.drawable.cfcscause);

                }


            }
        });

        btnproblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Climatechangeactivity.this,ProblemActivity.class);
                startActivity(i);
            }
        });
       btneffect.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(Climatechangeactivity.this,EffectActivity.class);
               startActivity(i);
           }
       });
        btncause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Climatechangeactivity.this,Climatechangeactivity.class);
                startActivity(i);
            }
        });
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Climatechangeactivity.this,Greenearthscreen.class);
                startActivity(i);
            }
        });



    }
}



