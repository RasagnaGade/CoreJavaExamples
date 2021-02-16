package com.java.examples;

class Student1 {

	int stdid;
	String name;
	double examfee;
	Student1(){
		
	}
	Student1(int stdid, String name, double examfee){
		super();
		this.stdid = stdid;
		this.name = name;
		this.examfee = examfee;
	}
	
	@Override
	public String toString() {
		return "Student1 [stdid=" + stdid + ", name=" + name + ", examfee=" + examfee + "]";
	}
	
	public String displayDetails(){
		
		return null;
	}
	public double payFee(double d) {
		// TODO Auto-generated method stub
		return d;
	}
	
}
//	double payFee() {
//		
//		return null;
//	}
	
	//dayscholar class
 class DayScholar extends Student1
	{
		double transportfee;
		
		DayScholar(){
			
		}
		DayScholar(int stdid, String name, double examfee,double transportfee){
			super(stdid, name, examfee);
			this.transportfee = transportfee;
		}
		public String displayDetails(){
			
			 return "DayScholor [transportFee=" + transportfee + ", studentId=" + stdid + ", name=" + name + ", examFee="
					+ examfee + "]";
		}
		public double payFee(double amount){
	        if (amount < examfee+transportfee)
	            return (examfee+transportfee)-amount;
	        else
	            return amount-(examfee+transportfee);
	    }
		
	}
	
	
	
	//hosteller class
	 class Hosteller extends Student1{
		double hostelFee;
		Hosteller(){
			
		}
		public Hosteller(int studentId, String name, double examFee, double hostelFee) {
			super(studentId, name, examFee);
			this.hostelFee = hostelFee;
		}

		public String displayDetails() {
			return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + stdid + ", name=" + name + ", examFee="
					+ examfee + "]";
		}
		public double payFee(double amount){
	        if (amount < examfee+hostelFee)
	            return (examfee+hostelFee)-amount;
	        else
	            return amount-(examfee+hostelFee);
	    }
}

