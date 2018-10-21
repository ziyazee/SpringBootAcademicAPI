package com.academicsinfo.ai.department;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.academicsinfo.ai.faculty.FacultyService;
import com.academicsinfo.ai.student.StudentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private FacultyService fc;
	@Autowired
	private StudentService sc;
	
	
	@RequestMapping("/department")
	public Map getAll(){
		
		//	List<Faculty> faculties=new ArrayList<>();
		//	faculties=fc.getAll();
		//	List<Student> students=new ArrayList<>();
		//	students=sc.getAll();
		
		//here details of students and faculties are stored in a map
		Map allMap = new HashMap();
		allMap.put("Faculties", fc.getAll());
		allMap.put("Students", sc.getAll());
		return allMap;
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/department/branch/{branch}")
	public Map getByBranch(@PathVariable String branch){
		
		//	List<Student> student=new ArrayList<>();
		//	student= sc.getAllStudentsOfSameBranch(branch);
		//	List<Faculty> faculty=new ArrayList<>();
		//	faculty= fc.getAllFacultiesOfSameBranch(branch);
		
		//here details of students and faculties of same branch are stored in a map 
		Map branchMap = new HashMap();
		branchMap.put("Faculties", sc.getAllStudentsOfSameBranch(branch));
		branchMap.put("Students", fc.getAllFacultiesOfSameBranch(branch));
		return branchMap;
	}	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/department/year/{year}")
	public Map getByYear(@PathVariable String year){
		
		//	List<Student> student=new ArrayList<>();
		//	student= sc.getAllStudentsOfSameYear(year);
		//	List<Faculty> faculty=new ArrayList<>();
		//	faculty= fc.getAllFacultiesOfSameYear(year);
		
		//here details of students and faculties of same year are stored in a map 
		Map yearMap = new HashMap();
		yearMap.put("Faculties", fc.getAllFacultiesOfSameYear(year));
		yearMap.put("Students", sc.getAllStudentsOfSameYear(year));
		return yearMap;
	}	
	}
	


