package com.java.examples;
import java.util.Scanner;


public class CheckArmstrong {
	
	

	public static  void main(String[] args) {
	   int num, n, digit, digits, power, sum=0;

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to check for Armstrong Number:");
	num = input.nextInt();

	String s = String.valueOf(num);
	digits = s.length();
	power = digits;

	n = num;

	while (n != 0)
	{
	digit = n % 10;
	sum = sum + (int)Math.pow(digit,power);
	n = n / 10;
	}

	if(num == sum) 
	System.out.println(num+ " is an Armstrong Number");
	else
	System.out.println(num+ " is not an Armstrong Number");
	

	}

	}