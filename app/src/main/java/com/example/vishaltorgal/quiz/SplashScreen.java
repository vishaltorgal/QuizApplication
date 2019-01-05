package com.example.vishaltorgal.quiz;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class SplashScreen extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    RippleBackground rippleBackground;
    ImageView imageView;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.splashscreen);



        rippleBackground=(RippleBackground)findViewById(R.id.content);
        imageView =(ImageView)findViewById(R.id.centerImage);


        rippleBackground.startRippleAnimation();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                finish();
                rippleBackground.stopRippleAnimation();
                startActivity(mainIntent);

            }

        }, SPLASH_DISPLAY_LENGTH);


    }

}
