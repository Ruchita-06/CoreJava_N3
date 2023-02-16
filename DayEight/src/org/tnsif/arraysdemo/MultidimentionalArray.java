package org.tnsif.arraysdemo;
import java.util.Scanner;
//Program to demonstrate on Multidimensional array
public class MultidimentionalArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter outer array size");
		int r=s.nextInt();
		System.out.println("Enter inner array size");
		int c=s.nextInt();
		//System.out.println("Enter the number of elements in array");
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<r;i++) {
			System.out.println("arr["+i+"] ");
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}