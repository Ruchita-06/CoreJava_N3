package org.tnsif.FinalKeyword;

public class Cake {
	
	protected String flavour;
	final void display()
	{
		System.out.println("The flavoir of cake is:"+flavour);
	}
	
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	

}
