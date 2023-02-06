package org.tnsif.accessspecifierdemo;

public class AccesSpecifierExample {
	//data members
	private  String name;
	/*if any data members is default it will access only inside the name package*/
	//void display();
	public void display()
	{
		System.out.println("The name is:"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
