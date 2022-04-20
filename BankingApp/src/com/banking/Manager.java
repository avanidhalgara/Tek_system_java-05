package com.banking;

public class Manager extends Employee {
	
	
	
	private String timeCard;
	
	public Manager() {
		
	}

	public Manager(String firstName, String lastName, long empl_id, String job_title, String timeCard) {
		super(firstName, lastName, empl_id, job_title);
		this.timeCard = timeCard;
		
		// TODO Auto-generated constructor stub
	}

	public String getTimeCard() {
		return timeCard;
	}

	public void setTimeCard(String timeCard) {
		this.timeCard = timeCard;
	}

	@Override
	public String toString() {
		return "Manager [timeCard=" + timeCard + "]";
	}
	
	
	

}
