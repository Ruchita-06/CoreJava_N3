package org.tnsif.encapsulationdemo;

import java.util.Scanner;


public class EncapsulationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin:");
		HDFC h=new HDFC();
		//h.setPin(4757);
		h.setPin(sc.nextInt());
		System.out.println(h.getPin());
		h.accept();
	}

}
