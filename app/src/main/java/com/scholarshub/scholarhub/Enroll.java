package com.scholarshub.scholarhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enroll extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        Button e= findViewById(R.id.enroll_as_std);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Enroll.this, Enroll_as_student.class));
            }


        });
        Button f= findViewById(R.id.enroll_as_tutor);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Enroll.this, Enroll_as_tutor.class));
            }


        });
    }
}
