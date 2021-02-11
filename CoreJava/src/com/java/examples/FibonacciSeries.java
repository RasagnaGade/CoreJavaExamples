package com.java.examples;
import java.util.*;


public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci series
		
		int n1=0,n2=1,n3,i;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.close();
		System.out.println(n1+" "+n2);

		for(i=0;i<count;i++){
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
