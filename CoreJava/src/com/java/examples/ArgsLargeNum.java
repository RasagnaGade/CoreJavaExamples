package com.java.examples;

public class ArgsLargeNum {

	public static void main(String[] args) {
		// largest digit in a number using command line arguments
		int num = Integer.parseInt(args[0]);
		int rem, large = 0;
		while(num > 0){
			rem = num % 10;
			if(large < rem){
				large = rem;
			}
			num = num / 10;
		}
		System.out.println("Largest digit is " +large);

	}

}
