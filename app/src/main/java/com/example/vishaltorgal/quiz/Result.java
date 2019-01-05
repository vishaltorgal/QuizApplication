package com.example.vishaltorgal.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tomer.fadingtextview.FadingTextView;

public class Result extends AppCompatActivity {

    TextView tv_result, tv_hs;
    ImageView iv_restart, iv_emoji;
    com.tomer.fadingtextview.FadingTextView fadingText_sad, fadingText_happy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle(Appconstants.name);
        setContentView(R.layout.result);

        tv_result = (TextView) findViewById(R.id.tv_result);
        iv_restart = (ImageView) findViewById(R.id.iv_restart);
        iv_emoji = (ImageView) findViewById(R.id.iv_emoji);
        fadingText_sad = (FadingTextView) findViewById(R.id.fadingText_sad);
        fadingText_happy = (FadingTextView) findViewById(R.id.fadingText_happy);


        float percent = ((Appconstants.correct_answer * 100f) / Appconstants.NUMBER_OF_QUESTIONS_TO_BE_ASKED);
        int per = (int) percent;
        tv_result.setText(per + " %");

        if (per > 50) {
            iv_emoji.setImageResource(R.drawable.ic_happy);
            fadingText_happy.setVisibility(View.VISIBLE);
        } else {
            iv_emoji.setImageResource(R.drawable.ic_sad);
            fadingText_sad.setVisibility(View.VISIBLE);
        }


        iv_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Appconstants.correct_answer = 0;
                Intent ii = new Intent(Result.this, Questions.class);
                finish();
                startActivity(ii);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Appconstants.correct_answer = 0;
        Intent ii = new Intent(Result.this, Questions.class);
        finish();
        startActivity(ii);

    }
}
