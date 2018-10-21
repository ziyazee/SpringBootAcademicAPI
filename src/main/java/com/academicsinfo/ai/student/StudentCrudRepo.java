package com.academicsinfo.ai.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentCrudRepo extends CrudRepository<Student,String> {
	
	//Custom query to get all the student list by branch
	List<Student> findAllBybranch(String branch);
	
	//Custom query to get all the student list by year
	List<Student> findAllByyear(String year);

}
