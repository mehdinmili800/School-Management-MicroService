package com.example.academicservice.service;

import com.example.academicservice.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course createCourse(Course course);
    void deleteCourse(Long id);
}
