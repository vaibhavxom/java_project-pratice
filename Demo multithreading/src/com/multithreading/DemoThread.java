package com.multithreading;

public class DemoThread {

	public static void main(String[] args) {
		
		A t1 = new A();
		B t2 = new B();				// OBJ of thread B And A
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(10);
	
			
			
		
		t2.start();
		t1.start();					// starting threads
		
		System.out.println("Main Thread started");
		System.out.println("Main Thread ended ");
		
		C c = new C();
		Thread t3 = new Thread(c);
		
		t3.start();
		
	}

}
