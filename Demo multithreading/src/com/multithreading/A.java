package com.multithreading;


public class A extends Thread {
	
	public void run()
	{
		System.out.println("Thread A started");
		for(int i =1;i<5;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println("");
			}
			System.out.println("Thread A"+ i);
		}
		System.out.println("Thread A ended");
	}
}
