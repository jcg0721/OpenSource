package com.example.turtle;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;
import android.widget.LinearLayout;

public class SplashActivity extends Activity {
    private LinearLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //mLayout = (LinearLayout) findViewById(R.id.splash);
        //mLayout.setBackgroundColor(Color.rgb(231,230,230));

        Handler hd = new Handler();
        hd.postDelayed(new splashHandler(), 3000);

    }

    private class splashHandler implements Runnable {
        public void run(){
            startActivity(new Intent(getApplication(), MainActivity.class));
            SplashActivity.this.finish();
        }
    }

    @Override
    public void onBackPressed() {

    }

}
