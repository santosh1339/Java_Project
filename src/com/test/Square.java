package com.test;

public class Square {
	
	public double side;
	
	public double calculateArea() {
		
		return (side*side);
		
	}
	
    public double perimeter() {
		
		return (4*side);
		
	}
    
    public void setSide(double side) {
    	
    	this.side = side;
    }
    public double getSide() {
    	
    	return (side);
    	
    }

}
