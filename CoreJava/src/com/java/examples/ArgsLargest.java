package com.java.examples;

public class ArgsLargest {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]); // 5,2,9,6,4
		int i = 4;
		while(i!=0)
		{
			
			int num1 = Integer.parseInt(args[i]); //20
			if( num < num1)
			{
				num = Integer.parseInt(args[i]);
			}
			i--;
		}
		System.out.println(num);

	}
}
