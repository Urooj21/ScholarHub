package com.scholarshub.scholarhub.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.scholarshub.scholarhub.R;

import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter {
    ArrayList personNames;
    ArrayList personImages;
    Context context;
    public StudentListAdapter(Context context, ArrayList personNames, ArrayList personImages) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_view_students, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText((Integer) personNames.get(position));
        holder.image.setImageResource((Integer) personImages.get(position));
        // implement setOnClickListener event on item view.
        holder.recycler_view_students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, (Integer) personNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public View recycler_view_students;
        // init the item view's
        TextView name;
        ImageView image;
        public MyViewHolder(View recycler_view_students) {
            super(recycler_view_students);
            // get the reference of item view's
            name = (TextView) recycler_view_students.findViewById(R.id.name);
            image = (ImageView) recycler_view_students.findViewById(R.id.image);
        }
    }


}
