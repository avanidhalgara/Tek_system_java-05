package com.monster;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster M1 = new FireMonster("r2u2");
	
		Monster M2 = new WaterMonster("u2r2");
		Monster M3 = new StoneMonster("r2r2");
		Monster M4 = new Monster("u2u2");
		
//		System.out.println(M1.attack());
		M1.attack();
		M2.attack();
		M3.attack();
		M4.attack();
		System.out.println(M1.getName());
		
		

	}

}
