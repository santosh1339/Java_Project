package com.test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s1 = new Square();
		
		//s1.side = 4;
		//s1.setSide(11.34);
		System.out.println("The side of the sqaure is :" + s1.getSide() );
		System.out.println("The are of the square is :" + s1.calculateArea());
		System.out.println("The perimeter of the sqaure is :" + s1.perimeter());
		

		Rectangle r1 = new Rectangle();
		r1.setValues(11.23, 45.67);
		System.out.println("Length is " + r1.getLength());
		System.out.println("Breadth is " + r1.getBreadth());
		
		System.out.println("Area is : " + r1.findArea());
		
		
		
		
	}

}
