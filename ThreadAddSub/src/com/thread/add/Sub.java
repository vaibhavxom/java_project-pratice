package com.thread.add;

public class Sub extends Thread{
	
	public void run()
	{
		int x = 5;
		int y = 2;
		int z = x -y ;
		
		System.out.println("thread sub = "+ z);
		
	}

}
