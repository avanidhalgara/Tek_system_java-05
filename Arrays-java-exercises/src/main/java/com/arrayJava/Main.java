package com.arrayJava;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/-------------------------------QUESTION 1--------------------------------------------------------
//		
		System.out.println("------------------------------------------------------------");
		System.out.println("Question 1");
		System.out.println("");
		
		int [] array1 = new int [3];
		for (int i = 1; i < 3; i++) {
			array1[i] = i + array1[i-1];
			
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
	}

}
