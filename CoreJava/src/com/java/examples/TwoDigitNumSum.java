package com.java.examples;
import java.util.Scanner;


public class TwoDigitNumSum {

	public static void main(String[] args) {
		int num1,num2,val,sum;
		System.out.println("Enter any two digit number");
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        num1 = val%10;
        num2 = val/10;
        sum = num1 + num2;
        System.out.println("Sum of digits is : " +sum);
        sc.close();
        
	}

}
