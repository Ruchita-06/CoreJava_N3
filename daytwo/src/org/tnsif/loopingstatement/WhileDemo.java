package org.tnsif.loopingstatement;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			System.out.println(i+" ");
			i++;
		}
		System.out.println(" ");
		int m=10;
		while(m>=1)
		{
			System.out.println(m+" ");
			m--;
		}

	}

}
