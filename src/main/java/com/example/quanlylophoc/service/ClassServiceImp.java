package com.example.quanlylophoc.service;

import com.example.quanlylophoc.dto.ClassDto;
import com.example.quanlylophoc.dto.StudentDto;
import com.example.quanlylophoc.entity.Clazz;
import com.example.quanlylophoc.entity.Student;
import com.example.quanlylophoc.mapper.ClassMapper;
import com.example.quanlylophoc.repository.ClassRepository;
import com.example.quanlylophoc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImp implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public ClassDto getClassInfo() {
        Clazz classes = classRepository.getClassInfo();
        return ClassMapper.toClassDto(classes);
    }

    @Override
    public ClassDto addStudent(List<Student> students) {
        Clazz classes = classRepository.getClassInfo();
        for (Student student : students) {
            student.setClazz(classes);
            classes.getStudent().add(student);
            classRepository.save(classes);
            studentRepository.save(student);
        }
        return ClassMapper.toClassDto(classes);
    }

    @Override
    public boolean updateStudent(Integer id, String ranks) {
        Student student1 = studentRepository.findById(id).orElse(null);
        if (student1 != null) {
            student1.setRanks(ranks);
            studentRepository.save(student1);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        Student student1 = studentRepository.findById(id).orElse(null);
        if (student1 != null) {
            studentRepository.delete(student1);
            return true;
        }
        return false;
    }
}
