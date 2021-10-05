package com.ltts.springboot;

public class Employee {
	  
     private Integer id;
	 private String Empname;
	 private String Designation;
	 
	 

	public Employee(Integer id ,String Empname, String Designation) {
		super();
		this.id=id;
		this.Empname = Empname;
		this.Designation = Designation;
	}
	
	public Integer getid() {
		return id;
	}
	public void setid( Integer id) {
		this.id =id;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setFirstname(String Empname) {
		this.Empname = Empname;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation =Designation;
	}
	 
}
