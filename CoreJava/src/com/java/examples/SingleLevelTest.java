package com.java.examples;


	class Person{
	    public int eid;
	    public String name = "andy";
	    Person(){
	        System.out.println("parent default constructor");
	    }
	    Person(int eid, String name){
	        this.eid = eid;
	        this.name = name;
	    }
	    public void display(){
	        System.out.println("Id = "+eid+"\n Name = "+name);
	    }
	}
	class Employe extends Person{
	    //int eid = 102;
	    String designation;
	    Employe(){
	        System.out.println("child class default constructor");
	    }
	    Employe(int eid, String name, String designation){
	        super(eid,name);
	        this.designation = designation;
	    }
	    @Override
	    public void display(){
	        System.out.println("Id = "+eid+"\n Name = "+name+"\n designation = "+designation);
	    }
	    void show(){
	        this.display();
	    }
	}
	public class SingleLevelTest {

	 

	    public static void main(String[] args) {
	        Employe e = new Employe();
	        //Person p = new Person();
	        //e.display();
	        //p.display();
	        Person p1 = new Employe(101,"abc","Trainees");
	        p1.display();
	        e.show();
	        //Employe e1 = (Employe)new Person();
	        //e1.display();

	 

	    }

	 

	}