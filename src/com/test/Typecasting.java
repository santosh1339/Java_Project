package com.test;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int , float , double , String and char are commonly used data types 
		
		//byte , short , int ,long , float and  double 

		int a = 23;
		double b = a; // implicit casting 
		
		System.out.println("value of a :" + a );
	    System.out.println("value of b :" + b );
	    
	    double c = 10.58;
	    
	    
	    int d = (int) c; // Manual or explicit casting  assigning bigger size value to lower size value to a variable vice versa for implicit casting 
	    
	    System.out.println("value of c :" + c);
	    System.out.println("value of d :" + d);
	    
	   // String e = (String) c;
	    
	    
	}

}
