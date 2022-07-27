package com.ak.springboot.assignment3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.springboot.assignment3.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
