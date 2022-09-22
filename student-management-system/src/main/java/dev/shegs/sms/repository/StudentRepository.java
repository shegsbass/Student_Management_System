package dev.shegs.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.shegs.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
