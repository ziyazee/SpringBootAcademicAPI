package com.academicsinfo.ai.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//creates a TABLE name "Student"
@Entity
public class Student {
	
	//Column creations
	@Id
	private String usn;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String branch;
	@Column(length=4)
	private String year;
	
	public Student() {
		
	}
	
	public Student(String usn, String name, String branch, String year) {
		super();
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.year = year;
	}
	
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
