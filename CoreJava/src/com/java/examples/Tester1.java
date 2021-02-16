package com.java.examples;


public class Tester1 {

	public static void main(String[] args) {
		Student1 student1 = new DayScholar(123,"John Smit",100.0,500);
		System.out.println(student1.displayDetails());
		System.out.println("Total amount you have to pay "+student1.payFee(5000.0));
		
		Student1 hosteller = new Hosteller(123,"John Smit",100.0,5000);
		System.out.println(hosteller.displayDetails());
		System.out.println("Total amount you have to pay "+hosteller.payFee(10000));
		

	}

}
