package com.prescholas.cafe;

public class Espresso extends Product {
	
	private boolean extraShot;
	private boolean macchiato;

	
	
	public Espresso(boolean extraShot, boolean macchiato) {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}
	



	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = false;
		this.macchiato = false;
	}

	



	public Espresso(String string) {
		// TODO Auto-generated constructor stub
	}




	public boolean isExtraShot() {
		return extraShot;
	}




	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}




	public boolean isMacchiato() {
		return macchiato;
	}




	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}




	@Override
	public double calculateProductTotal() {
		return 0;
	}

}
