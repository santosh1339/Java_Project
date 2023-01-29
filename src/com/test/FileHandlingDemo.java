package com.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		File myFile = new File ( "TestFile.txt");
		
		if (myFile.createNewFile())
			
		{
			System.out.println("File created" + myFile.getName());
		}

		
		else 
		{
			System.out.println("File already exists");
		}
		/*
		FileWriter fWrite = new FileWriter("TestFile.txt");
		fWrite.write("Opening the file");
		fWrite.append(" Appending and writing in the file");
		fWrite.close();
		*/
		
		BufferedWriter buffWrite =  new BufferedWriter(new FileWriter("TestFile.txt",true));
		buffWrite.write(" Santosh A");
		buffWrite.close();
		
		// Read a file 
		
		Scanner  scanner = new Scanner(myFile);
		while(scanner.hasNextLine())
			
		{
			String str = scanner.nextLine();
			System.out.println(str);
		}
		
		
	}


	}
	