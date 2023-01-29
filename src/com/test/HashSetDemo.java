package com.test;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> myBatch= new HashSet<String>();
		myBatch.add("Santosh");
		myBatch.add("Anjali");
		myBatch.add("Raju");
		myBatch.add("Santosh");
		System.out.println(myBatch);
		myBatch.add("babu");
		System.out.println(myBatch);// Indexing does not work with Sets 
		
		
		

	}

}
