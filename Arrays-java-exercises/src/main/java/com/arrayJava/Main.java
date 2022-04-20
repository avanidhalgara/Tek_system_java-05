package com.arrayJava;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/-------------------------------QUESTION 1--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 1");
		System.out.println("");
		
		int [] array1 = new int [3];
		array1[0] = 1;
		array1[1] =2;
		array1[2]= 3;
		
		
		for(int i = 0; i<3; i++) {
			System.out.println(array1[i]);
		}
		
		
//		/-------------------------------QUESTION 2--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 2");
		System.out.println("");
		
		int[] integerAraay = {13,5,7,68,2};
		
		int middleNumber  = (integerAraay.length)/2;
		
		System.out.println(integerAraay[middleNumber]);
		
		
//		/-------------------------------QUESTION 3--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 3");
		System.out.println("");	
		
		String [] colors = {"red","green","blue","yellow"};
//		for (int i = 0; i < colors.length; i++) {
//			System.out.println(colors[i]);
//			sys
//			
//		}
		System.out.println( "The length of the array: "+colors.length);
		System.out.println("Original Array: "+Arrays.toString(colors));
		String [] copyColor = colors.clone();
		System.out.println("copy of the colors Array "+Arrays.toString(copyColor));
		
		
//		/-------------------------------QUESTION 4--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 4");
		System.out.println("");	
		
		
		int[] elements = new int [5];
		
	
		for(int i = 0; i < elements.length; i++){
			  elements[i] = i + 1;
			  System.out.println(elements[i]);
			}
		System.out.println("The value of the first Index: "+elements[0]);
		System.out.println("The value of the last Index: "+(elements[elements.length-1]));
//		System.out.println("The value at index = length :"+elements[elements.length]);
		
		
		
//		/-------------------------------QUESTION 5--------------------------------------------------------
	//	
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 5");
		System.out.println("");	
		
		 
		int[] number2 = new int[5];
		
		for (int i = 0; i < number2.length; i++) {
			number2[i] = i+1;
			System.out.print(+number2[i]+",");
			
		}
		
//		/-------------------------------QUESTION 6--------------------------------------------------------
		//	
			System.out.println("------------------------------------------------------------");
			System.out.println("Question 6");
			System.out.println("");	
			
			
			int[] number3 = new int[5];
			
			for (int i = 1; i < number2.length; i++) {
				number3[i] = i *2;
				System.out.println(number3[i]);
			}
			
			
//			/-------------------------------QUESTION 7--------------------------------------------------------
			//	
				System.out.println("------------------------------------------------------------");
				System.out.println("Question 7");
				System.out.println("");	
				
				
				
				int[] integerAraay1 = {13,5,7,68,2};
				
				int middleNumber1  = (integerAraay.length)/2;
				
				for (int i = 0; i < integerAraay1.length; i++) {
					if(i==middleNumber) {
						continue;
					}
					System.out.println(integerAraay[i]);
				}
				
//				/-------------------------------QUESTION 8--------------------------------------------------------
				//	
					System.out.println("------------------------------------------------------------");
					System.out.println("Question 8");
					System.out.println("");	
					
					int[] integerAraay2 = {13,5,7,68,2};
					
					int middleNumber2  = (integerAraay2.length)/2;
					
					int temp = integerAraay[0];					
					
					
						integerAraay[0] =integerAraay [middleNumber2];
						integerAraay [middleNumber2] = temp;
						
						
					
						System.out.println(Arrays.toString(integerAraay));
					
					
					
					
		
	}
	
	
//	

}
