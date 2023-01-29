package com.test;



public class Main_Methodbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childbank_ICICI b1 = new Childbank_ICICI();
		b1.principal = 1000;
		b1.branch_city = "New Delhi";
		b1.time = 12;
		System.out.println("Branch city of ICIC bank is: " + b1.branch_city);
		System.out.println("ICICI bank updated balance is :" + b1.Intrest_calcualtion());
		
		Childbank_HDFC b2 = new Childbank_HDFC();
        b2.principal = 2000;
		b2.branch_city = "Bangalore";
		b2.time = 12;
		System.out.println("Branch city of ICIC bank is: " + b2.branch_city);
		System.out.println("HDFC bank updated balance is :" + b2.Intrest_calcualtion());
		
		
	}

}
