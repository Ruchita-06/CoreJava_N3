package org.tnsif.superkeyword;
//program to demonstrate and example to super  keyword term of variable
//parent class

	public class Flower {
		private String name;


//getter and setter
	public String getName() {
		return name;
}
	public void setName(String name) {
		this.name = name;
}
//default method
	public Flower() {
		System.out.println("Flower parent class");
		// TODO Auto-generated constructor stub
}
//parameterize method
	public Flower(String name) {
		super();
		this.name = name;
}


}
