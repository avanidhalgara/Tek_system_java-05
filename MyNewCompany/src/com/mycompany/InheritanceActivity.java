package com.mycompany;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		Manager manager = new Manager(126534, "Peter","Chennai India",237844,65000);
		 double salaryAmountManager =manager.calculateSalary();
		 System.out.println(salaryAmountManager);
		 
		 Trainee trainee = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		 double salaryAmountTrainee = trainee.calculateSalary();
		 System.out.println(salaryAmountTrainee);
		 
		 double allowanceForManager = manager.calculateTransportAllownce();
		 System.out.println(allowanceForManager);
		 
		 
		 
		
		try {
			 double allowanceForTrainee;
			allowanceForTrainee = trainee.calculateTransportAllowance();
			System.out.println(allowanceForTrainee);
		throw new ArithmeticExceptions("can not divide by Zero "+ trainee.calculateTransportAllowance());
		} catch (ArithmeticExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		 

	}

}
