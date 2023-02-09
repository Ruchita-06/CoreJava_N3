package org.tnsif.TypeCasting;

//Program to demonstrate on typeCasting
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Implicit TypeCasting
		int x=15;
		float y=x;
		System.out.println("The value of y is:"+y);
		
		//Explicit TypeCasting
		double d=12.5;
		long l=(long)d;
		System.out.println("The value of l is:"+l);
	}

}

/*OUTPUT
The value of y is:15.0
The value of l is:12
*/