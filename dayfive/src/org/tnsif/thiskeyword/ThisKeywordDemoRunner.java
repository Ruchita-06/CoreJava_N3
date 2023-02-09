package org.tnsif.thiskeyword;
//This keyword-4

class Mathematics{

int a,b;
Mathematics()
{
	a=10;
	b=20;
}

void display() {
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
	}
Mathematics accept() {
	return (this);
}
}
public class ThisKeywordDemoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mathematics obj=new Mathematics();

obj.accept().display();
	}

}
