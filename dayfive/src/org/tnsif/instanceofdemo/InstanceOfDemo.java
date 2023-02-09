package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("Enter the name, Address and age");
String name=a.nextLine();
String address=a.nextLine();
int age=a.nextInt();


//Object creation 
Child c=new Child();
Child c1=new Child(name,address,age);
c1.setName(name);
c1.setAddress(address);
c1.setAge(age);
System.out.println(c1);
System.out.println(c instanceof Person);
System.out.println(c1 instanceof Child);

	}

}
