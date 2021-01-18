package com.scholarshub.scholarhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
                                      // Using handler with postDelayed called runnable run method
                                      @Override
                                      public void run() {
                                          Intent i = new Intent(Splash_screen.this, MainActivity.class);
                                          startActivity(i);
// close this activity
                                          finish();
                                      }
                                  },
                5*1000); // wait for 5 seconds
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

