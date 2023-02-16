package org.tnsif.customexception;
//Program to demonstrate on custom exception
public class LoginCredential extends Exception {
	
	//Data Members
	String str;
	
	//parameterized constructor
	public LoginCredential(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}
	
	

}
