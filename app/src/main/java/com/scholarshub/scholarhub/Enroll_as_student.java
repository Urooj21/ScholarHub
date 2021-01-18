package com.scholarshub.scholarhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enroll_as_student extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll_as_student);
        Button m= findViewById(R.id.Sdone);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                startActivity(new Intent(Enroll_as_student.this, Home.class));
            }


        });
    }
}
