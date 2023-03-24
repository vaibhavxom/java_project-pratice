package com.calcy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatoreTest {

	
	
	@Test
	public void testAdd() {
		assertEquals(90, new Calculatore().add(40, 50));
	}
	//assertEquals (expected output, new obj().class(arg 1, arg2));

	@Test
	public void testSub() {
		assertEquals(50,new Calculatore().sub(100, 50));
	}
	
	

}
