package com.tejasango;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tejasango.entity.Student;
import com.tejasango.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Sai", "Teja", "sai@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Sai", "Tarun", "tarun@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Teja", "sango", "sango@gmail.com");
		studentRepository.save(student3);
		
		Student student4 = new Student("sangoju", "saiteja", "sangoju@gmail.com");
		studentRepository.save(student4);
		
		Student student5 = new Student("ajet", "saiteja", "sangoju@gmail.com");
		studentRepository.save(student5);
	}

}
