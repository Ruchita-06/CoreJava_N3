package org.tnsif.thiskeyword;
//this keyword-3


class HR
{
	//void function(HR obj)
	void function()
	{
		System.out.println("Human Resources");
	}
	void accept()
	{
		//function(this);
		function();
	}
}



public class ThisKeywordDemoExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR obj= new HR();
		obj.accept();
		
		
	}

}
