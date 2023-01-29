package com.test;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array is collection of items of same data type 
		
		double[] marks = {23.5,35.5,45.5,55.5};
		
		Scanner s1 = new Scanner(System.in);
		
		
		
		/* for (int j=0; j<marks.length;j++)
		{
			System.out.println("Enter the value of " + j + " element is : ");
			marks[j] = s1.nextInt();
		}
		
		for(int i=0;i<marks.length;i++) // initialisor , comparison , incrementor 
		
		{
		System.err.println("Value of the element :" + i + " is : " + marks[i]);
		
		}
		
		*/
		
		int [] [] numbers = {{10,20,30,40}, {50,60,70,80},{90,100,110}};
		System.out.println(numbers.length);
		
		for (int m=0; m<numbers.length;m++)
		{
			
			System.out.println("Value of m is :" + m);
			
			for (int n=0;n<numbers[m].length;n++)
			{
				System.out.println("Value of n is :" + n);
				System.out.println("Array value is :" + numbers[m][n]);
			}
			
		}
		

	}

}
