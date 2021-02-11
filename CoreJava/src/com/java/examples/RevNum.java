package com.java.examples;
import java.util.Scanner;


public class RevNum {

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i = num; i > 1; i--){
			System.out.println(i);
		}
		sc.close();

	}

}
