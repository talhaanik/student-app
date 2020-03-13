package com.studapp.studentms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.studapp.studentms.model.Student;
import com.studapp.studentms.repositories.StudentRepository;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping
	public List<Student> list(){
		return studentRepository.findAll();
	}
}
