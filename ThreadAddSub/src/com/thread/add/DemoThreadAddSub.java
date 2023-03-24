package com.thread.add;

public class DemoThreadAddSub {

	public static void main(String[] args) {
		
		Add a1 = new Add();
		Sub s1 = new Sub();
		
		a1.start();
		s1.start();
		System.out.println("main thread ");

	}

}
