package com.example.quanlylophoc;

import com.example.quanlylophoc.entity.Clazz;
import com.example.quanlylophoc.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuanlylophocApplication implements CommandLineRunner {
	@Autowired
	private ClassRepository classRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuanlylophocApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Clazz clazz = new Clazz();
//		clazz.setAddress("Java 16");
//		classRepository.save(clazz);
	}
}
