package com.scholarshub.scholarhub.Models;

public class CourseModel {
    int course_pic;
    String text;

    public CourseModel(int course_pic, String text) {
        this.course_pic = course_pic;
        this.text = text;
    }

    public int getCourse_pic() {
        return course_pic;
    }

    public void setCourse_pic(int course_pic) {
        this.course_pic = course_pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

