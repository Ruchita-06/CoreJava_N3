package org.tnsif.instanceofdemo;
 //parent class
public class Person {
	
private String name;
private String address;

   //getter setter method***********
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

   //generate constructor super class***********
public Person() {
	System.out.println("Parent class");
	// TODO Auto-generated constructor stub
}

	//generate constructor**********
public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}

	//generate to string**********
@Override
public String toString() {
	return "Person [toString()=" + super.toString() + "]";
}





}
