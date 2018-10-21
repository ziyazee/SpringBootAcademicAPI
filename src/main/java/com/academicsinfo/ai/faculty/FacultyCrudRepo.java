package com.academicsinfo.ai.faculty;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FacultyCrudRepo extends CrudRepository<Faculty,String>{
	
	//Custom query to get all the faculty list by branch
	List<Faculty> findAllBybranch(String branch);
	
	//Custom query to get all the faculty list by year
	List<Faculty> findAllBypresentYear(String presentYear);
}