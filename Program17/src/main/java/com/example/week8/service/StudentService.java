package com.example.week8.service;
import com.example.week8.entity.Student;
import java.util.List;
public interface StudentService {
  List<Student> display();
  Student addStudent(Student student);
  Student updateStudent(Student student);
  void deleteStudent(int regNo);
}
