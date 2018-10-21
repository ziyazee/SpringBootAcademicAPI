package com.academicsinfo.ai.faculty;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	//get all the list of faculties
	@RequestMapping(method=RequestMethod.GET,value="/faculties")
	public List<Faculty> getAllFacultiesInfo() {
		return facultyService.getAll();
	}
	
	//get all the list of faculties by usn
	@RequestMapping(method=RequestMethod.GET,value="/faculties/{usn}")
	public Optional<Faculty> getOneFacultyInfo(@PathVariable String usn){
		return facultyService.getOneFacultyInfo(usn);
	}
	
	//add a faculty details
	@RequestMapping(method=RequestMethod.POST,value="/faculties")
	public void addFacultyInfo(@RequestBody Faculty faculty) {
		facultyService.add(faculty);
		
	}
	
	//get all the list of faculties by branch
	//	@RequestMapping(method=RequestMethod.GET,value="/faculties/branch/{branch}")
	//	public List<Faculty> getAllFacultiesOfSameBranch(@PathVariable String branch){
	//		return facultyService.getAllFacultiesOfSameBranch(branch);
	//	}
		
	//get all the list of faculties by year
	//	@RequestMapping(method=RequestMethod.GET,value="/faculties/year/{presentYear}")
	//	public List<Faculty> getAllFacultiesOfSameYear(@PathVariable String presentYear){
	//		return facultyService.getAllFacultiesOfSameYear(presentYear);
	//	}
	

}
