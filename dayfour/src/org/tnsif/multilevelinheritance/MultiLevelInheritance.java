package org.tnsif.multilevelinheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone il = new Iphone();
		Iphone i1 = new Iphone(1528,"Kitkat","Singleslot");

		System.out.println(i1);
		i1.accept();
		i1.Display();
		i1.slot(); 
	}
		
	
	

}