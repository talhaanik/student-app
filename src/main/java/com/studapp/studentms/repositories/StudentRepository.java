package com.studapp.studentms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studapp.studentms.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
