package com.synchronization;

public class DemoSynchronize {

	public static void main(String[] args) {
		Table t = new Table();
		ThreadFive t1 = new ThreadFive(t);
		ThreadNine t2 = new ThreadNine(t);
		
		t2.start();
		t1.start();
		

	}

}
             