package com.siddhant.courseApplication.Service;

import com.siddhant.courseApplication.Repository.CourseRepository;
import com.siddhant.courseApplication.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

//    List<Course> courses;
    @Autowired
    private CourseRepository courseRepository;

    public CourseServiceImpl() {
//        courses = new ArrayList<>();
//        courses.add(new Course(1,"Java course", "A book on java"));
//        courses.add(new Course(2,"Spring course", "A book on Spring"));
    }

    @Override
    public List<Course> getCourses() {
//        return courses;
        return this.courseRepository.findAll();
    }

    @Override
    public Course getCourseById(int id) {
//        Course c=null;
//        for(Course course: courses){
//            if(course.getId()==id){
//                c=course;
//            }
//        }
//        return c;
        return this.courseRepository.getOne(id);
        }

    @Override
    public Course addCourse(Course course) {
//        courses.add(course);
//        return course;
        this.courseRepository.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

//        for(Course course1 : courses){
//            if(course1.getId()==course.getId()){
//                course1.setCourseName(course.getCourseName());
//                course1.setCourseDesc(course.getCourseDesc());
//            }
//        }
//        return course;
        this.courseRepository.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
//        courses = courses.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course toDelete = courseRepository.getOne((int)parseLong);
        this.courseRepository.delete(toDelete);

    }
}
