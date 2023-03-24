package com.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoBufferedReader {

	public static void main(String[] args) {
		
		try {
		String c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter charaters, 'stop' to Quit");
		
		do	{
			c = br.readLine();
			System.out.println(c);
		}
		while(!c.equals("stop"));
		
		}
		catch(IOException ex)
		{
			System.err.println("wrong input!!!.......");
		}

	}

}
