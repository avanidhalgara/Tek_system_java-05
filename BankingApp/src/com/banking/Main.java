package com.banking;



public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Employee empOne = new Employee("Ibra", "Diallo",  2345,"Full stack developer");
		Employee empTwo = new Employee("RIddhi", "Shah", 1234, "Software Engineer");
		
		Manager managerOne = new Manager("Avani", "Dhalgara", 1235, "Software Developer", "Sales time card");
		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(managerOne);

	}

}
