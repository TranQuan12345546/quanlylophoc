package com.example.quanlylophoc.dto;

import com.example.quanlylophoc.entity.Student;

import java.util.List;

public record ClassDto(String address, List<Student> studentList) {
}
