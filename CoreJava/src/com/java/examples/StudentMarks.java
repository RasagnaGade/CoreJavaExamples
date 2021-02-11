package com.java.examples;

public class StudentMarks {

	public static void main(String[] args) {
		
		// program using command line arguments
		int mark1 = Integer.parseInt(args[0]);
		int mark2 = Integer.parseInt(args[1]);
		int mark3 = Integer.parseInt(args[2]);
		int mark4 = Integer.parseInt(args[3]);
		int mark5 = Integer.parseInt(args[4]);
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		int avg = total/5;
		String grade = "fail";
		
		if(mark1<35 && mark2<35 && mark3<35 && mark4<35 && mark5<35){  
			grade = "Fail";
		
			if(total > 400 && total < 500){
				grade = "A";
			}
			if(total > 300 && total < 400){  
				grade = "B";
			}
			if(total > 200 && total < 300){  
				grade = "c";
			}
		}
		System.out.println("Total marks obtained are " +total + " and avg is " +avg+ " and grade is " +grade);
	}

}
