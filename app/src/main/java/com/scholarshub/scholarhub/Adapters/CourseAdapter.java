package com.scholarshub.scholarhub.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.scholarshub.scholarhub.Models.CourseModel;
import com.scholarshub.scholarhub.R;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {


    private final ArrayList<CourseModel> list;
    ArrayList<CourseModel> List;
    Context context;

    public CourseAdapter(ArrayList<CourseModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_courses, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CourseModel model = list.get(position);
       holder.imageView.setImageResource(model.getCourse_pic());
       holder.textView.setText(model.getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         imageView= itemView.findViewById(R.id.course_img);
         textView= itemView.findViewById(R.id.course_name);

        }
    }
}
