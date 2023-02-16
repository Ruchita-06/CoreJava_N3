package org.tnsif.exceptionhandlingdemo;
//Program to demonstrate on throw and throws keyword
public class ThrowKeywordDemo {
	//method definition
	//throws is used to declare an exception
	public static void donate(int age,int weight) throws Exception {

		if(age>18 && weight>50) 
			System.out.println("Eligible to donate the blood");
		else
			throw new Exception("Not Eligible");		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			donate(17,55);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
