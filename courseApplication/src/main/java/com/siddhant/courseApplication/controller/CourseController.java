package com.siddhant.courseApplication.controller;

import com.siddhant.courseApplication.Service.CourseService;
import com.siddhant.courseApplication.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/home")
    public String getHome(){
        return "This is homepage";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCoursesById(@PathVariable int id){
        return courseService.getCourseById(id);
    }

    @PostMapping("/courses")
    public Course AddCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        courseService.deleteCourse(id);
    }
}
