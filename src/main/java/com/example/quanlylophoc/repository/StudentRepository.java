package com.example.quanlylophoc.repository;

import com.example.quanlylophoc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
