package com.example.vishaltorgal.quiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Questions extends AppCompatActivity {

    TextView tv_questions,tv_count,tv_cat;
    Button bt_a1,bt_a2,bt_a3,bt_a4;
    Integer count=0;
    HashMap<String, String> obj;
    CardView cardview1,cardview2;
    ArrayList<Integer> numbers;
    LinearLayout ll_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle(Appconstants.name);
        setContentView(R.layout.questions);

        tv_questions =(TextView)findViewById(R.id.tv_questions);
        tv_cat =(TextView)findViewById(R.id.tv_cat);
        tv_count =(TextView)findViewById(R.id.tv_count);
        bt_a1 = (Button)findViewById(R.id.bt_a1);
        bt_a2 = (Button)findViewById(R.id.bt_a2);
        bt_a3 = (Button)findViewById(R.id.bt_a3);
        bt_a4 = (Button)findViewById(R.id.bt_a4);

        cardview1 = (CardView)findViewById(R.id.cardview1);
        cardview2 = (CardView)findViewById(R.id.cardview2);
        ll_main = (LinearLayout)findViewById(R.id.ll_main);


        Appconstants.correct_answer=0;

        numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < Appconstants.NUMBER_OF_QUESTIONS_TO_BE_ASKED) {

            int random = randomGenerator .nextInt(Appconstants.TOTAL_NUMBER_OF_QUESTIONS);
            if (!numbers.contains(random)) {
                numbers.add(random);
                Log.d("vt ","Nos. "+random);
            }
        }

        GetQuestions(); // First Question


        bt_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer("a1");
            }
        });

        bt_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer("a2");
            }
        });

        bt_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer("a3");
            }
        });

        bt_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckAnswer("a4");
            }
        });
    }

    public void GetQuestions(){

        Animation animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        ll_main.startAnimation(animFadeIn);
       // cardview2.startAnimation(animFadeIn);

           obj = Appconstants.arraylist.get(numbers.get(count));
           tv_cat.setText(obj.get("category"));
           tv_questions.setText(obj.get("q"));
           bt_a1.setText(obj.get("a1"));
           bt_a2.setText(obj.get("a2"));
           bt_a3.setText(obj.get("a3"));
           bt_a4.setText(obj.get("a4"));

        tv_count.setText((count+1) +" / "+Appconstants.NUMBER_OF_QUESTIONS_TO_BE_ASKED);
    }

    public void CheckAnswer(String r){

        if(r==obj.get("a")){
            Appconstants.correct_answer = Appconstants.correct_answer + 1;
        }

        if((count+1) != numbers.size()){
            count=count+1;
            GetQuestions();
        }else{
            Intent ii = new Intent(Questions.this,Result.class);
            finish();
            startActivity(ii);
        }
    }



}
