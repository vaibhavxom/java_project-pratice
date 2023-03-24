package com.synchronization;

public class ThreadNine extends Thread{
	Table t ;
	public ThreadNine(Table t) {
		
		this.t = t;
	}
	public void run()
	{
		t.printTable(9);
	}
}
