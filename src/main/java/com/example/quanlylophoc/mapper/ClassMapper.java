package com.example.quanlylophoc.mapper;

import com.example.quanlylophoc.dto.ClassDto;
import com.example.quanlylophoc.entity.Clazz;

public class ClassMapper {
    public static ClassDto toClassDto(Clazz clazz) {
        return new ClassDto(clazz.getAddress(), clazz.getStudent());
    }
}
