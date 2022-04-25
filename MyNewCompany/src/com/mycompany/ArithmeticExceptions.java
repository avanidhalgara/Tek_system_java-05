package com.mycompany;



public class ArithmeticExceptions extends Exception {
	
	
		

	 String message;
	 ArithmeticExceptions(String str){
	 super(str);
		
	 message =str;
			 
	 }
	 public String toString() {
		 
		 return ("can not divide by Zero: "+message);
 }
	 
	 
	
}
