package com.test;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String is not a primitive data type , its a class hence we declare a string with capital at starting of the delaration 
		
		int a = 15;
		
		String c = "Hello Everyone"; 
		String d = "This is the third session";
		String e = c + a ;
		String text = "Thor and Loki are \rNorse\rgods  ";
		String text1 = "Thor and Loki are \tNorse\tgods  ";
		String text2 = "Thor and Loki are \nNorse\ngods  ";
		String b = Integer.toString(a); // Converting integer to its wrapper class 
		String greeting = "Hello Everyone";
        System.out.println(greeting.length());
        System.out.println(greeting.charAt(10));
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.equalsIgnoreCase(c));
        System.out.println("Concatination of two strings is :" + greeting + " " + d );
        System.out.println( greeting.concat(d) );
        System.out.println(e);
        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
	}

}
