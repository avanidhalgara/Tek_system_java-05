package com.arrayJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

 class Book{
	 int number;
	 String name;
	 String description;
	 String review;
	 double price;
	 
	 public Book() {
		 
	 }

	public Book(int number, String name, String description, String review, double price) {
		super();
		this.number = number;
		this.name = name;
		this.description = description;
		this.review = review;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", name=" + name + ", description=" + description + ", review=" + review
				+ ", price=" + price + "]";
	}
	
	 
	
}
 
 

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
					
					
					
//						/-------------------------------QUESTION 9--------------------------------------------------------
						//	
							System.out.println("------------------------------------------------------------");
							System.out.println("Question 9");
							System.out.println("");	
							
							
							int[] newArray  = {4,2,9,13,1,0};
							int array11;
							int smallNumber = newArray[0];
							int biggestNumber = newArray[0];
							
							 Arrays.sort(newArray);
							System.out.println(
			                           Arrays.toString(newArray));
					
//							for (int i = 0; i < newArray.length; i++) {
//								 array11 = newArray[i];
//								 System.out.print(array11);
						
//							}
							for (int i = 0; i < newArray.length; i++) {
								 if(newArray[i] > biggestNumber) {
									 biggestNumber = newArray[i];
								 }
									 else if(newArray[i]< smallNumber) {
										 smallNumber = newArray[i];
									 }
											 
								
								 
							}
							System.out.println("The smallest number is: "+smallNumber);	 
							System.out.println("The biggest number is: "+biggestNumber);
							
							
							Book book = new Book(1,"cat in the Hat","Cat story","Good",8.98);
							System.out.println();
							Book[] books = new Book[3];
							
							
							ArrayList<Book> myLibrary = new ArrayList<Book>();
							myLibrary.add(new Book(1, "Thinking In Java", "English" ,"good",10.98));
							myLibrary.add(new Book(2, "Hacking for Fun and Profit", "English","Good", 8.98));
							
						 for (Book b : myLibrary) {
							 
							 System.out.println(b);
						 }
							
						
							
			                           
		
	}
	
	
//	

}
