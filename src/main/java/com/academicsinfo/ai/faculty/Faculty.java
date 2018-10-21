package com.academicsinfo.ai.faculty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//creates a TABLE name "Faculty"
@Entity
public class Faculty {
	
	//Column creations
	@Id
	private String usn;
	@Column(length=50)
	private String name;
	@Column(length=50)
	private String areaOfInterest;
	@Column(length=50)
	private String branch;
	@Column(length=4)
	private int yearOfJoining;
	@Column(length=4)
	private String presentYear;
	

	public Faculty() {
		
	}
	
	public Faculty(String usn, String name, String areaOfInterest,String branch, int yearOfJoining,String presentYear) {
		super();
		this.usn = usn;
		this.name = name;
		this.areaOfInterest = areaOfInterest;
		this.branch=branch;
		this.yearOfJoining = yearOfJoining;
		this.presentYear=presentYear;
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
	public String getAreaOfInterest() {
		return areaOfInterest;
	}
	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getPresentYear() {
		return presentYear;
	}
	public void setPresentYear(String presentYear) {
		this.presentYear = presentYear;
	}
}
