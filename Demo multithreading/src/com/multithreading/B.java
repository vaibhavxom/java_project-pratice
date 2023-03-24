package com.multithreading;

public class B extends Thread {
	
	public void run() 
	{
		System.out.println("Thread B started ");
		for(int i =1;i<5;i++)
		{
			System.out.println("Thread B"+ i);
			
			if(i == 2 ) {
				stop();
			}
		}
		System.out.println("Thread B ended");
	}
	
}
