package com.example.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.domain.Student;

@Service
public interface IStudentService {
  public List<Student> getStudents();
}
