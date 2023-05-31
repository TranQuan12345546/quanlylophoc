package com.example.quanlylophoc.service;

import com.example.quanlylophoc.dto.ClassDto;
import com.example.quanlylophoc.dto.StudentDto;
import com.example.quanlylophoc.entity.Student;

import java.util.List;

public interface ClassService {
    ClassDto getClassInfo();
    ClassDto addStudent(List<Student> students);

    boolean updateStudent(Integer id, String ranks);

    boolean deleteStudent(Integer id);
}
