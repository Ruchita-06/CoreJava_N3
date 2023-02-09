package org.tnsif.instanceofdemo;

//child class
public class Child extends Person{
private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
//default constructor
public Child(String name,String address,int age) {
	super();
	this.age = age;
}
//parameterize constructor
public Child() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
}



}
