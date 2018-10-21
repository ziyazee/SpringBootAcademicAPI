package com.academicsinfo.ai.faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

	@Autowired
	private FacultyCrudRepo facultyCrudRepo;
	
	
	public List<Faculty> getAll() {
		List<Faculty> faculties=new ArrayList<>();
		facultyCrudRepo.findAll().forEach(faculties::add);
		return faculties;
	}

	public Optional<Faculty> getOneFacultyInfo(String usn) {
		return facultyCrudRepo.findById(usn);
	}
	
	public List<Faculty> getAllFacultiesOfSameBranch(String branch) {
		return facultyCrudRepo.findAllBybranch(branch);
	}
	
	public List<Faculty> getAllFacultiesOfSameYear(String presentYear ){
		return facultyCrudRepo.findAllBypresentYear(presentYear);
	}
	
	public void add(Faculty faculty) {
		facultyCrudRepo.save(faculty);
		
	}
	
	

}
