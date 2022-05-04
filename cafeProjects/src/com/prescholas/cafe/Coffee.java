package com.prescholas.cafe;

public class Coffee extends Product {
	
	private boolean sugar;
	private boolean milk;
	
	

	public Coffee(boolean sugar, boolean milk) {
		super();
		this.sugar = sugar;
		this.milk = milk;
	}
	
	



	public Coffee(String name, double price, String description ) {
		
	}





	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.sugar = false;
		this.milk = false;
	}
	




	public Coffee(String string) {
		
	}




	public boolean isSugar() {
		return sugar;
	}




	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}




	public boolean isMilk() {
		return milk;
	}




	public void setMilk(boolean milk) {
		this.milk = milk;
	}




	@Override
	public double calculateProductTotal() {
		double subTotal;
		subTotal = getPrice() * getQuantity();
		
	  return subTotal;
	}

}
