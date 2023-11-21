package com.abm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abm.entity.Student;
import com.abm.repository.StudentRepository;


@Controller
public class StudentController {

	
	@Autowired
	private StudentRepository stdRepo;
	
	@RequestMapping("/add-std")
	public String addPart(Student std) {
		stdRepo.save(std);
		return "addStudent.jsp";
	}
	@RequestMapping("/fetchall-std")
	public String displayallemploye(Map model) {
		List<Student> list = stdRepo.findAll();
		model.put("students", list);
		return "viewAllStudents.jsp";
	}
	
	@RequestMapping("/delete-std")
	public String delete(@RequestParam int rollno, Map model) {
		stdRepo.deleteById(rollno);
		model.put("message", "Record deleted sucessfully");
		return "index.jsp";
	}
	
	@RequestMapping("/edit-std")
	public String edit(@RequestParam int rollno, Map model) {
		Student s = stdRepo.findById(rollno).get();
		model.put("student", s);
		return "editstd.jsp";
	}

	@RequestMapping("/update-std")
	public String update(Student std) {
		stdRepo.save(std);
		return "index.jsp";
	}
}
