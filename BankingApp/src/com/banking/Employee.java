package com.banking;

public class Employee {
	
	private String firstName;
	private String lastName;
	private long empl_id;
	private String job_title;
	
	
	public Employee() {
		
		
	}
	
	
	public Employee(String firstName, String lastName, long empl_id, String job_title) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empl_id = empl_id;
		this.job_title = job_title;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public long getEmpl_id() {
		return empl_id;
	}




	public void setEmpl_id(long empl_id) {
		this.empl_id = empl_id;
	}




	public String getJob_title() {
		return job_title;
	}




	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}




	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", empl_id=" + empl_id + ", job_title="
				+ job_title + "]";
	}
	
	
	
	
	
	

}

