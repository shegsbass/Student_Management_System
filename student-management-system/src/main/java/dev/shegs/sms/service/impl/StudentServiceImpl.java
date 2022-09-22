package dev.shegs.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.shegs.sms.entity.Student;
import dev.shegs.sms.repository.StudentRepository;
import dev.shegs.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}



	@Override
	public List<Student> viewStudent(Student student) {
		return studentRepository.findAll();
	}
	
	

}
