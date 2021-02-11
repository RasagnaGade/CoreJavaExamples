package com.java.examples;

public class ArgsAdd {

	public static void main(String[] args) {
		int sum = Integer.parseInt(args[0]);
		int next = Integer.parseInt(args[1]);
		sum+=next;
		next=Integer.parseInt(args[2]);
		sum+=next;
		next=Integer.parseInt(args[3]);
		sum+=next;
		System.out.println("Sum of 4 numbers = " +sum);
System.out.println("add");


	}

}
