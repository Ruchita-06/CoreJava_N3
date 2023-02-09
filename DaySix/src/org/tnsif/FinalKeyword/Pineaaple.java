package org.tnsif.FinalKeyword;
//program to demonstrate on final method

public class Pineaaple extends Cake {
	private int price;
	/* */
	final void display(int price)
	{
		System.out.println("The price is:"+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
