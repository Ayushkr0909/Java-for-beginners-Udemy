package com.spring.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.learnspringboot.courses.bean.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
