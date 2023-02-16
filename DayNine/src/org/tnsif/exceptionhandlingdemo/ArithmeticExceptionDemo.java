package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;

//Program to demonstrate on ArithmeticException
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			int res=x/y;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("Exception handling using catch block "+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
