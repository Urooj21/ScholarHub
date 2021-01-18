package com.scholarshub.scholarhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView e= findViewById(R.id.home);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Home.class));
            }


        });

        ImageView g= findViewById(R.id.notification);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Student_notification.class));
            }


        });

        ImageView k= findViewById(R.id.profile);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Student_profile.class));
            }


        });

        Button j= findViewById(R.id.course1);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, My_Tutors.class));
            }


        });

        Button m= findViewById(R.id.course2);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, My_Tutors.class));
            }


        });
    }
}
