package com.thread.add;

public class Add extends Thread{
	
	public void run() {
		System.out.println("thread Add started ");
		int x = 3;
		int y = 4;
		int z = x+ y;
		
		System.out.println("thread Add = " + z);
		System.out.println("thread Add ended");
	}
	
}
