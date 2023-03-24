package com.synchronization;

public class ThreadFive extends Thread{
	Table t ;
	public ThreadFive(Table t) {
		
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
		
	}
}
