package com.scholarshub.scholarhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enroll_as_tutor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll_as_tutor);
        Button m= findViewById(R.id.Tdone);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                startActivity(new Intent(Enroll_as_tutor.this,Tutor_Home.class));
            }


        });
    }
}
