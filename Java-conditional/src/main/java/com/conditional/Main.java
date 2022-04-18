package com.conditional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 10; i > 0; i--) {
//
//			System.out.println(i);
//			
			
			
//		}
		
		
//question 1
	System.out.println("Question 1");
	System.out.println("");
	
	int x = 7;
//		int x =15;
		if(x<10) {
			
			System.out.println(x+ " is less than 10");
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 2");
//		System.out.println("");
//		question 2
//		int x1 = 7;
		int x1=15;
		if(x1<10) {
			System.out.println(x1+ "is less than 10");
		}
		else {
			System.out.println(x1+ " is greater than 10");
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 3");
		
		int x2 = 17;
		if(x2<10) {
			System.out.println(x2+" is  than less than 10");
		}
		else if( (x2>10) && (x2<=20)) {
			System.out.println(x2+" is greatee than 10 but less than or equal to 20");
		}
		else {
			System.out.println(x2+" is greater than 20");
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 4");
		
		
		int x3 = 12;
		if((x3 < 10) || (x3>20)) {
			System.out.println("Out of range");
			
		}
		else {
			System.out.println("In range");
		}
		
		
//		System.out.println("------------------------------------------------------------");
//		System.out.println("Question 5");
		Scanner useInput = new Scanner(System.in);
//		System.out.println("Please enter your score: ");
//		int number = useInput.nextInt();
//		
//		if(number>=90 && number<=100) {
//			System.out.println("A");
//		}
//		else if(number >=80 && number<=89) {
//			System.out.println("B");
//		}
//		else if (number >=70 && number <=79) {
//			System.out.println("C");
//		}
//		else if (number >=60 && number <=69) {
//			System.out.println("D");
//		}
//		else if(number <60){
//			System.out.println("F");
//			
//		}
//		else {
//			
//		System.out.println("Score out of range");
//		}
		
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 6");
		
		System.out.println("Please enter the number: ");
		
		int number2 = useInput.nextInt();
		
		
		switch(number2) {
		case 1: 
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednseday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		default :
			System.out.println("Out of range");
		
		
		}
		

	}

}
