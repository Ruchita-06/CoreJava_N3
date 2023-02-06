package org.tnsif.classesandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		//Customer c=new Customer(06,"Rucha","Nashik");
		//c.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int id;
		String custname,city;
		
		id=sc.nextInt();
		
		custname=sc.next();
		city=sc.next();
		
		//for cust1
		Customer c1 = new Customer();
		c1.setId(id);
		c1.setCustname(custname);
    	c1.setCity(city);
    	c1.display();
		
		//for cust2
    	Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the values:");
		int id2;
		String custname2,city2;
		
		id2=sc2.nextInt();
		
		custname2=sc2.next();
		city2=sc2.next();
				
		Customer c2 = new Customer();
		c2.setId(id2);
		c2.setCustname(custname2);
		c2.setCity(city2);
		c2.display();
		
	}

}
