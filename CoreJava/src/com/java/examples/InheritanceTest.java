package com.java.examples;


	class Parent{
	    Parent(){
	        System.out.println("this is parent class constructor");
	    }
	}
	class Child extends Parent{
	    Child(){
	        System.out.println("this is child class constructor");
	    }
	}
	public class InheritanceTest {

	 

	    public static void main(String[] args) {
	        //Parent p = new Parent();
//	        Child c = new Child();
//	        Parent p1 = new Child();
	        Child c1 = (Child)new Parent();
	        

	 

	    }

	 

	}