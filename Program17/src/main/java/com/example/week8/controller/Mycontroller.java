package com.example.week8.controller;
import com.example.week8.entity.Student;
import com.example.week8.service.StudentService;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
public class Mycontroller {
  private final StudentService service;
  public Mycontroller(StudentService service) { this.service=service; }
  @GetMapping("/") public String home() { return "<h1>Welcome to GPT Bagepalli</h1>"; }
  @GetMapping("/student") public List<Student> show() { return service.display(); }
  @PostMapping("/student") public Student add(@RequestBody Student student) { return service.addStudent(student); }
  @PutMapping("/student") public Student update(@RequestBody Student student) { return service.updateStudent(student); }
  @DeleteMapping("/student/{studentregno}") public void delete(@PathVariable int studentregno) { service.deleteStudent(studentregno); }
}
