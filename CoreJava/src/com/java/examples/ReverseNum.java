package com.java.examples;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		//reverse numbers in given range
		
		System.out.println("Enter min range number:");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("Enter max range number:");
        int max = sc.nextInt();
        sc.close();
    	System.out.println("The numbers in reverse order are :");

        for(int i = max; i >= min; i--){
        	System.out.println(i);
        }
		
		/*//diff between i++ and ++i
		int i=1;
		System.out.println(i);
		System.out.println(++i + 5);
		System.out.println(i);*/
		
		/*for(int i=0;i<10;++i)
			//System.out.println(i);
			System.out.println(i+5);
			//System.out.println(i);
		*/
	}

}
					