package com.siddhant.courseApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private int id;
    private String courseName;
    private String courseDesc;
    public Course() {
    }
    public Course(int id, String courseName, String courseDesc) {
        this.id = id;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
