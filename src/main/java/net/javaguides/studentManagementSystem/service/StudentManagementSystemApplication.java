package net.javaguides.studentManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.studentManagementSystem.repository.StudentRepository;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@SuppressWarnings("unused")
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Wasif", "Fadatare", "wasif@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("tiny", "stark", "tiny@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
