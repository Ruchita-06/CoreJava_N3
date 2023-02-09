package org.tnsif.staticdemo;

public class StaticBlock {
	//nonstatic variable
	private int num;
	//static variable
	private static String name;
	
	//static block
	/*static block is use to initialize static variable*/
	static 
	{
		name="Rucha";
	}
	//getters and setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
}
