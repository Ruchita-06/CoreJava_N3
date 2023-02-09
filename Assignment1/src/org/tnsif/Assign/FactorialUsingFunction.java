package org.tnsif.Assign;

import java.util.Scanner;

public class FactorialUsingFunction {
	
	//function defination
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1; i<=num ; i++)
		{
			fact = i*fact;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for factorial :");
		int num=sc.nextInt();
		
		//Function call
		System.out.println("Fact of given no is:"+factorial(num));
		sc.close();

	}

}
