package com.streams;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		
		try {
		File inputfile = new File("E:/xyz.txt"); // read from file with [ath
		File outputfile = new File("E:/abc.txt"); //
		FileReader in = new FileReader(inputfile);
		FileWriter out = new FileWriter(outputfile);
		
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		in.close();
		out.close();
		System.out.println("data copied Successfully");
		} 
		catch (IOException ex) 
		{
		}
		
	}

}
