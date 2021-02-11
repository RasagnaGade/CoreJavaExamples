package com.java.examples;
import java.util.Scanner;

public class RevDigit {

	public static void main(String[] args) {
		int sum=0,val=0,rev=0;
		System.out.println("Enter min range number:");
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		System.out.println("Enter max range number:");
		int max = sc.nextInt();
		sc.close();
		System.out.println("The sum of munbers in given range is ");

		//add num from min to max
		for(int i=max;i>min;i--)
			 sum=sum+i;
			System.out.println(sum);
		System.out.println("The reverse of " +sum+ " is ");
		//reverse the sum
		while(sum!=0){
			val=sum%10;
			rev=rev*10+val;
			sum/=10;
		}
       System.out.println(rev);
	}

}
