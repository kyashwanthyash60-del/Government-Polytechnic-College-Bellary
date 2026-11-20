package com.example.week8.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.week8.entity.Student;
public interface StudentDao extends JpaRepository<Student, Integer> { }
