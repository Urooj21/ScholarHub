package com.scholarshub.scholarhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tutor_Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor__home);




        Button e= findViewById(R.id.edit_c1);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_Home.this, T_edit_coursee.class));
            }


        });

        Button f= findViewById(R.id.edit_c2);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_Home.this, T_edit_coursee.class));
            }


        });

        ImageView
                k= findViewById(R.id.profile);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_Home.this, Tutor_profile.class));
            }


        });

        ImageView
                l= findViewById(R.id.notification);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_Home.this, Tutor_notification.class));
            }


        });

        Button t= findViewById(R.id.std1);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_Home.this, My_Students.class));
            }


        });

    }
}
