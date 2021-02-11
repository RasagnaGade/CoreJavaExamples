package com.java.examples;

public class ArgsSum {

	public static void main(String[] args) {
		/*// this does not add the munbers as it is in string. it just appends
		String res = args[0] + args[1];
		System.out.println("Sum is " +res);*/
		
		//add 
		int firstNum = Integer.parseInt(args[0]);
		int secNum = Integer.parseInt(args[1]);
		System.out.println("Sum = " + (firstNum + secNum ));

	}

}
