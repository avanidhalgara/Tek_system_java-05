package com.loopExercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 1");
		System.out.println("");
		
		
		int num1= 1;
		for ( num1 = 1; num1 <=10; num1++) {
			
			System.out.println(num1);
			
		}
		
//	-------------------------------QUESTION 2--------------------------------------------------------
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 2");
		System.out.println("");
		
		int num2 = 0;
		while(num2 <=100) {
			System.out.println(num2);
			num2 = num2+10;
		}
		
//		-------------------------------QUESTION 3--------------------------------------------------------
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 3");
		System.out.println("");
		
		int count =0;
		do {
			System.out.println(count);
			count++;
			
		}while(count<=10);
		
		
//-------------------------------QUESTION 4--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 4");
		System.out.println("");
		
		int num3;
		for (num3 = 1; num3 < 100; num3++) {
			if (num3 >= 25 && num3 <= 75) {
				continue;
			}
			else if (num3 % 5 == 0) {
				System.out.println(num3);
			}
			else {
//				System.out.print("");
				continue;
			}

		}
//		/-------------------------------QUESTION 5--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 5");
		System.out.println("");
		
		for (int i = 1; i < 100; i++) {
			if(i >50) {
				break;
			}
			if(i % 5==0) {
				
				System.out.println(i);
			}
			
			
			
		}
//		/-------------------------------QUESTION 5--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 6");
		System.out.println("");
		
		int number4;
		for ( number4 = 1; number4 <= 2; number4++) {
			System.out.println("Week: "+number4);
			
			for (int j = 1; j <=5; j++) {
				System.out.println();
				System.out.println("Day "+j);
				
			}
			System.out.println("");
			
			
		}
		
//		/-------------------------------QUESTION 7--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 7");
		System.out.println("");

		int reverse;
		for (int i = 10; i <= 200; i++) {
			int palindromeNum = i;
			reverse = 0;
			while (palindromeNum > 0) {
				reverse = reverse * 10 + palindromeNum % 10;
				palindromeNum = palindromeNum / 10;
			}
			if (i == reverse) {
				System.out.println(i);
			}

		}
		
//		/-------------------------------QUESTION 8--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 8");
		System.out.println("");
		int n8=10;
		int firstNum = 0;
		int secondNum = 1;
		for (int increment =1; increment<=n8; ++increment ) {
			System.out.print(firstNum+ " "); 
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
			
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 9");
		System.out.println("");
		
		for (int d = 0; d <= 4; d++) {
			for (int k = 1; k < 5; k++) {
				System.out.println("Inner loop :"+k);
				
				
			}
			System.out.println("Outer loop:" +d);
			
		}
		
		
		
		

		
	}

}
