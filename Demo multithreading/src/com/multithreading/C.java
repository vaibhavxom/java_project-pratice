package com.multithreading;

public class C implements Runnable{
	
	public void run()
	{
		
		System.out.println("Thread C started");
		for(int i =1;i<5;i++)
		{
			System.out.println("Thread C"+ i);
		}
		System.out.println("Thread C ended");
	}
}
