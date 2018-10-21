package com.academicsinfo.ai.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentCrudRepo studentCrudRepo; 
	
	public List<Student> getAll() {
		List<Student> students=new ArrayList<>();
		studentCrudRepo.findAll().forEach(students::add);
		return students;
	}

	public Optional<Student> getOneStduentInfo(String usn) {
		return studentCrudRepo.findById(usn);
	}
	public List<Student> getAllStudentsOfSameBranch(String branch) {
		return studentCrudRepo.findAllBybranch(branch);
	}
	
	public List<Student> getAllStudentsOfSameYear(String year){
		return studentCrudRepo.findAllByyear(year);
	}

	public void add(Student student) {
		studentCrudRepo.save(student);
	}
	

}
