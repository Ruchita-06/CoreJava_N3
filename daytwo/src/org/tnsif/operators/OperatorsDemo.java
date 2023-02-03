package org.tnsif.operators;

import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		//Arithmetic Operator
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//Relational
		boolean res=x>y;
		System.out.println(res);
		
		//Assignment
		x*=y;
		System.out.println(x);
		
		//Logic 
		boolean res2=(5==5)&&(5>3);//true
		boolean res3=(5==3)||(5>2);//true
		boolean res4=!(5!=4);//true
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		//Bitwise
		int a=12 & 5;
		int b=12 | 5;
		int c=12^5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Ternary
		String res5=(12%2==0)?"True":"False";
		System.out.println(res5);
		
		//Increment and Decrement
		int p= x++;//5
		int q= --x;//5
		System.out.println(q);
	}
}
