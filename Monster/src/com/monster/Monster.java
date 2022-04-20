package com.monster;

public class Monster {
	
	private String name;
	
	public Monster() {
		
	}

	public Monster(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	

	@Override
	public String toString() {
		return "Monster [name=" + name + "]";
	}

	public void attack( ) {
		
	}

	

}
