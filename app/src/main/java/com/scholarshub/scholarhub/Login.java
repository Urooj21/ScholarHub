package com.scholarshub.scholarhub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView d = findViewById(R.id.log_in);
        d.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View d) {
                startActivity(new Intent(Login.this,Home.class));

            }


        });


        TextView h = findViewById(R.id.forgot_pass);
        h.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View h) {
                startActivity(new Intent(Login.this,Forgotten_password.class));

            }


        });

    }
}
