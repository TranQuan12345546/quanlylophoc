package com.example.quanlylophoc.mapper;

import com.example.quanlylophoc.dto.StudentDto;
import com.example.quanlylophoc.entity.Student;

public class StudentMapper {
    public static StudentDto toStudentDto(Student student) {
        return new StudentDto(student.getName(), student.getAge(), student.getRanks());
    }
}
