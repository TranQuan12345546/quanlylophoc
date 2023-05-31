package com.example.quanlylophoc.repository;

import com.example.quanlylophoc.entity.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClassRepository extends JpaRepository<Clazz, Integer> {
    @Query(value = "select * from clazz", nativeQuery = true)
    Clazz getClassInfo();
}
