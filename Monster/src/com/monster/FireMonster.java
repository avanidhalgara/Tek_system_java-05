package com.monster;

public class FireMonster  extends Monster{
	
	
	private String name;

	public FireMonster(String name) {
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
		return "FireMonster [name=" + name + "]";
	}
	
public void attack( ) {
		System.out.println("Attack with Fire");
	}

	

	
	


}
