package org.tnsif.superkeyword;

public class Lotus extends Flower{

	private String name;


	//getter and setter
		public String getName() {
			return name;
	}
		public void setName(String name) {
			this.name = name;
	}
	//default method
		public Lotus() {
			super();
			System.out.println("Flower parent class");
			// TODO Auto-generated constructor stub
	}
	//parameterize method
		public Lotus(String name) {
			super();
			this.name = name;
	}
		public void display() {
			System.out.println(name);
			super.setName("Flower");
			System.out.println(super.getName());
			
	}

	}

