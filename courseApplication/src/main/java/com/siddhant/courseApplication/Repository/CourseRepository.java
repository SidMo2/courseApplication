package com.siddhant.courseApplication.Repository;

import com.siddhant.courseApplication.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
