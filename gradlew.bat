<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background_pic"
    tools:context=".EnrollAsStudent">

    <TextView
        android:id="@+id/student_title"
        android:layout_width="258dp"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="90dp"
        android:layout_marginLeft="90dp"
        android:layout_marginEnd="63dp"
        android:layout_marginRight="63dp"
        android:layout_marginBottom="483dp"
        android:text="Enroll as Student"
        android:textColor="@color/colorWhite"
        android:textSize="30dp" />

    <ImageView
        android:id="@+id/logo"
        android:layout_width="wrap_content"
        android:layout_height="214dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"

        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="93dp"
        android:layout_marginLeft="93dp"
        android:layout_marginEnd="93dp"
        android:layout_marginRight="93dp"
        android:layout_marginBottom="517dp"
        android:contentDescription="TODO"
        android:src="@drawable/logo" />

    <EditText
        android:id="@+id/firstname"
        android:inputType="text"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentEnd="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="16dp"
        and