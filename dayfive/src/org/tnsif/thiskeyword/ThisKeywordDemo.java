package org.tnsif.thiskeyword;
//this keyword
//It can be used to refer instance variable of current class.


class Account
{
	int a;  int b;
	public void setdata(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}
	
	public void print() {
		System.out.println("Value of A= " +a);
		System.out.println("Value of B= " +b);
	}
}

//main function
public class ThisKeywordDemo {
public static void main (String args[])
  	{
	Account s=new Account();
	s.setdata(2,10);
	s.print();
	}
	
	
}
