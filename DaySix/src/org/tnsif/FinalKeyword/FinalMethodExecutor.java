package org.tnsif.FinalKeyword;

public class FinalMethodExecutor {
	public static void main(String args[]) {
		Pineaaple p=new Pineaaple();
		p.flavour="MixedFruit";
		p.display();
		p.setPrice(250);
		p.display(p.getPrice());
		}

}
