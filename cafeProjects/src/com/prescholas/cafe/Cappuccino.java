package com.prescholas.cafe;

public class Cappuccino extends Product{

	private boolean peppermint;
	private boolean whippedCream;
	
	
	
	
	public Cappuccino(boolean peppermint, boolean whippedCream) {
		super();
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	




	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	





	public Cappuccino(String string) {
		// TODO Auto-generated constructor stub
	}





	public boolean isPeppermint() {
		return peppermint;
	}





	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}





	public boolean isWhippedCream() {
		return whippedCream;
	}





	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}





	@Override
	public double calculateProductTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
