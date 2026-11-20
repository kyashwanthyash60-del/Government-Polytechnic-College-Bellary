package com.example.week8.service;
import com.example.week8.entity.Student;
import com.example.week8.repository.StudentDao;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentServiceImplement implements StudentService {
  private final StudentDao dao;
  public StudentServiceImplement(StudentDao dao) { this.dao=dao; }
  public List<Student> display() { return dao.findAll(); }
  public Student addStudent(Student student) { return dao.save(student); }
  public Student updateStudent(Student student) { return dao.save(student); }
  public void deleteStudent(int regNo) { dao.deleteById(regNo); }
}
