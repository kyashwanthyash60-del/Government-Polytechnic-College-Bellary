package com.example.week8.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="student")
public class Student {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int regNo;
  private String name;
  public Student() { }
  public Student(int regNo, String name) { this.regNo=regNo; this.name=name; }
  public int getRegNo() { return regNo; }
  public void setRegNo(int regNo) { this.regNo=regNo; }
  public String getName() { return name; }
  public void setName(String name) { this.name=name; }
  @Override public String toString() { return "Student{regNo="+regNo+", name='"+name+"'}"; }
}
