package com.academicsinfo.ai.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	//get all the list of students
	@RequestMapping(method=RequestMethod.GET,value="/students")
	public List<Student> getAllStudentsInfo() {
		return studentService.getAll();
	}
	//get all the list of students by usn
	@RequestMapping(method=RequestMethod.GET,value="/students/{usn}")
	public Optional<Student> getOneStudentInfo(@PathVariable String usn){
		return studentService.getOneStduentInfo(usn);
	}
	
	//add a student details
	@RequestMapping(method=RequestMethod.POST,value="/students")
	public void addStudentInfo(@RequestBody Student student) {
		studentService.add(student);
		
	}
	
	//get all the list of students by branch
	//	@RequestMapping(method=RequestMethod.GET,value="/students/branch/{branch}")
	//	public List<Student> getAllStudentsOfSameBranch(@PathVariable String branch){
	//		return studentService.getAllStudentsOfSameBranch(branch);
	//	}
	
	//get all the list of students by year
	//	@RequestMapping(method=RequestMethod.GET,value="/students/year/{year}")
	//	public List<Student> getAllStudentsOfSameYear(@PathVariable String year){
	//		return studentService.getAllStudentsOfSameYear(year);
	//	}

}
