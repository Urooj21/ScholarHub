package com.scholarshub.scholarhub;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.scholarshub.scholarhub.Adapters.CourseAdapter;
import com.scholarshub.scholarhub.Models.CourseModel;

import java.util.ArrayList;

public class Tutor_profile extends Activity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);
        Button f= findViewById(R.id.add_course);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tutor_profile.this, Add_new_course.class));
            }


        });

        recyclerView = findViewById(R.id.recyclerView_courses);
        ArrayList<CourseModel> list=new ArrayList<>();

        list.add(new CourseModel(R.drawable.networking,"Networking"));
        list.add(new CourseModel(R.drawable.networking,"Chemistry"));
        list.add(new CourseModel(R.drawable.networking,"English"));


        CourseAdapter adapter= new CourseAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }
}
