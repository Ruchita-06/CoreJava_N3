package org.tnsif.Assign;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num * factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no for factorial :");
		int num=sc.nextInt();
		
		//Function call
		System.out.print("Fact of given no using recursion is :"+factorial(num));
		sc.close();
	}

}
