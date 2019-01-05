package com.example.vishaltorgal.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    Button bt_name;
    EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Appconstants.arraylist = new ArrayList<HashMap<String, String>>();

        bt_name = (Button) findViewById(R.id.bt_name);
        et_name = (EditText) findViewById(R.id.et_name);


        bt_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Appconstants.name = et_name.getText().toString().toUpperCase();

                if (Appconstants.name.length() > 3) {
                    Intent i = new Intent(MainActivity.this, Questions.class);
                    startActivity(i);
                } else {

                    Snackbar snackbar = Snackbar
                            .make(v, "Enter Valid Name", Snackbar.LENGTH_LONG);
                    snackbar.show();


                }

            }
        });


        //1
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "Which planet is nearest the sun?");
        Appconstants.map.put("a1", "Venus");
        Appconstants.map.put("a2", "Earth");
        Appconstants.map.put("a3", "Mercury");
        Appconstants.map.put("a4", "Mars");
        Appconstants.map.put("a", "a3");
        Appconstants.map.put("category", "Universe");
        Appconstants.arraylist.add(Appconstants.map);
        //2
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "Who invented the barometer?");
        Appconstants.map.put("a1", "Torricelli");
        Appconstants.map.put("a2", "Smith");
        Appconstants.map.put("a3", "Taylor");
        Appconstants.map.put("a4", "David");
        Appconstants.map.put("a", "a1");
        Appconstants.map.put("category", "Science");
        Appconstants.arraylist.add(Appconstants.map);
        //3
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "In Jungle Book what kind of animal is Baloo?");
        Appconstants.map.put("a1", "Tiger");
        Appconstants.map.put("a2", "Bear");
        Appconstants.map.put("a3", "Monkey");
        Appconstants.map.put("a4", "Snake");
        Appconstants.map.put("a", "a2");
        Appconstants.map.put("category", "Kids");
        Appconstants.arraylist.add(Appconstants.map);
        //4
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "In which city was the Titanic built?");
        Appconstants.map.put("a1", "Prontera");
        Appconstants.map.put("a2", "Morocco");
        Appconstants.map.put("a3", "Alberta");
        Appconstants.map.put("a4", "Belfast");
        Appconstants.map.put("a", "a4");
        Appconstants.map.put("category", "Places");
        Appconstants.arraylist.add(Appconstants.map);
        //5
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "What is the top colour in a rainbow?");
        Appconstants.map.put("a1", "Red");
        Appconstants.map.put("a2", "Blue");
        Appconstants.map.put("a3", "Green");
        Appconstants.map.put("a4", "Yellow");
        Appconstants.map.put("a", "a1");
        Appconstants.map.put("category", "Nature");
        Appconstants.arraylist.add(Appconstants.map);
        //6
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "Which U.S. President is Barack Obama?");
        Appconstants.map.put("a1", "48th");
        Appconstants.map.put("a2", "40th");
        Appconstants.map.put("a3", "44th");
        Appconstants.map.put("a4", "34th");
        Appconstants.map.put("a", "a3");
        Appconstants.map.put("category", "Country");
        Appconstants.arraylist.add(Appconstants.map);
        //7
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "Which country is home to the kangaroo?");
        Appconstants.map.put("a1", "Russia");
        Appconstants.map.put("a2", "Australia");
        Appconstants.map.put("a3", "India");
        Appconstants.map.put("a4", "Japan");
        Appconstants.map.put("a", "a2");
        Appconstants.map.put("category", "Places");
        Appconstants.arraylist.add(Appconstants.map);
        //8
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "What percentage of our body weight is water?");
        Appconstants.map.put("a1", "40 %");
        Appconstants.map.put("a2", "30 %");
        Appconstants.map.put("a3", "10 %");
        Appconstants.map.put("a4", "60 %");
        Appconstants.map.put("a", "a4");
        Appconstants.map.put("category", "Biology");
        Appconstants.arraylist.add(Appconstants.map);
        //9
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "How many years are there in a millennium?");
        Appconstants.map.put("a1", "100");
        Appconstants.map.put("a2", "1000");
        Appconstants.map.put("a3", "10000");
        Appconstants.map.put("a4", "10");
        Appconstants.map.put("a", "a2");
        Appconstants.map.put("category", "G.K.");
        Appconstants.arraylist.add(Appconstants.map);
        //10
        Appconstants.map = new HashMap<String, String>();
        Appconstants.map.put("q", "How many minutes is a rugby match?");
        Appconstants.map.put("a1", "80 Minutes");
        Appconstants.map.put("a2", "70 Minutes");
        Appconstants.map.put("a3", "90 Minutes");
        Appconstants.map.put("a4", "120 Minutes");
        Appconstants.map.put("a", "a1");
        Appconstants.map.put("category", "Sports");
        Appconstants.arraylist.add(Appconstants.map);

    }
}