package com.example.buttonandintent;

import androidx.annotation.NonNull;

public class Student {
    private String name;
    private int rollNo;
    private String joining;

    public Student(String name, int rollNo, String joining) {
        this.name = name;
        this.rollNo = rollNo;
        this.joining = joining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getJoining() {
        return joining;
    }

    public void setJoining(String joining) {
        this.joining = joining;
    }

    @NonNull
    public String toString()
    {
        return getRollNo()+": "+getName();
    }
}
