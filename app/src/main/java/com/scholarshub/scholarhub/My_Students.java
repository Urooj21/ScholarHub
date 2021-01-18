package com.scholarshub.scholarhub;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scholarshub.scholarhub.Adapters.StudentListAdapter;

import java.util.ArrayList;
import java.util.Arrays;
public class My_Students extends AppCompatActivity {
    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7","Person 8", "Person 9", "Person 10", "Person 11", "Person 12", "Person 13", "Person 14"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.networking, R.drawable.chemistry, R.drawable.networking, R.drawable.chemistry, R.drawable.networking));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__students);
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        StudentListAdapter StudentListAdapter = new StudentListAdapter (My_Students.this, personNames,personImages);
        recyclerView.setAdapter(StudentListAdapter); // set the Adapter to RecyclerView
    }
}