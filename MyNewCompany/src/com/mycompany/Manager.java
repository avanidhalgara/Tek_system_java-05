package com.mycompany;

public class Manager extends Employee {

	public Manager(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		
		this.basicSalary = salary;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public double calculateTransportAllownce() {  
	 
		double transportAllowance = 15*basicSalary/100;
		return transportAllowance;
	 
	
	}
	
	
	

}
