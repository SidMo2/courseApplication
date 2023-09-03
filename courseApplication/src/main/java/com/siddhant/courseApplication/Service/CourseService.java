package com.siddhant.courseApplication.Service;

import com.siddhant.courseApplication.model.Course;
import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourseById(int id);

    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);

}
