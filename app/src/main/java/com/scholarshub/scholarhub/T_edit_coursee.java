package com.scholarshub.scholarhub;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class T_edit_coursee extends AppCompatActivity {



        EditText time;
        TimePickerDialog timePickerDialog;
        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_t_edit_coursee);
            time=findViewById(R.id.time);
            time.setOnClickListener(new View.OnClickListener(){

                Calendar calendar= Calendar.getInstance();
                int hour=calendar.get(Calendar.HOUR);
                int minute=calendar.get(Calendar.MINUTE);
                @Override
                public void onClick(View view){
                    timePickerDialog = new TimePickerDialog(T_edit_coursee.this, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            String am_pm;
                            if (i < 12) {
                                am_pm = "AM";
                                time.setText(i + ":" + i1 + " " + am_pm);
                            } else if (i == 12) {
                                am_pm = "PM";
                                time.setText(i + ":" + i1 + " " + am_pm);
                            } else {
                                am_pm = "PM";
                                time.setText(i + ":" + i1 + " " + am_pm);
                            }
                        }

                    }, hour, minute, false);
                    timePickerDialog.show();
                }
            });


            Button n= findViewById(R.id.add_lessons);
            n.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(T_edit_coursee.this, Add_Lesson.class));
                }


            });
        }
        }





