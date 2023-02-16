package org.tnsif.arraysdemo;

import java.util.Scanner;
//Program to demonstrate on 2D jagged array
public class JaggedArrayDemo {

	public static void main(String[] args) {
		int arr[][]=new int[2][];
		//First array 3 collumns  
		arr[0]=new int[3];
		//Second array 2 collumns
		arr[1]=new int[2];
		/*int count=0;
		  for(int i=0;i<arr.length;i++)
		  {
		  for(int j=0;j<arr[i].length;j++)
		  {
		  arr[i][j]=count++;
		  }
		  }*/
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the jagged array elements: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=s.nextInt();
			}
	}
		System.out.println("Content of 2D jagged array...");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}

}
}
