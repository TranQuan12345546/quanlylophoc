package com.example.quanlylophoc.controller;

import com.example.quanlylophoc.dto.ClassDto;
import com.example.quanlylophoc.dto.StudentDto;
import com.example.quanlylophoc.entity.Clazz;
import com.example.quanlylophoc.entity.Student;
import com.example.quanlylophoc.repository.ClassRepository;
import com.example.quanlylophoc.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ClassController {
    @Autowired
    private ClassService classService;
    @GetMapping("/class")
    public ResponseEntity<?> getClassInfo() {
        ClassDto classDto = classService.getClassInfo();
        return ResponseEntity.ok(classDto);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody List<Student> students) {
        ClassDto classDto = classService.addStudent(students);
        return ResponseEntity.ok(classDto);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<?> updateStudent(@PathVariable Integer id, @RequestParam String ranks) {
        boolean result = classService.updateStudent(id, ranks);
        if(result == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
        return ResponseEntity.ok("update success");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
        boolean result = classService.deleteStudent(id);
        if(result == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
        }
        return ResponseEntity.ok("delete success");
    }
}
