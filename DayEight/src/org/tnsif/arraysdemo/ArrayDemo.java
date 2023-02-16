package org.tnsif.arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements "
				+"in the array");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Sort Array is: ");
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		

	}

}
