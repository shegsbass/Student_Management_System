package dev.shegs.sms.service;

import java.util.List;

import dev.shegs.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id); 
	
	Student updateStudent(Student student);

}
