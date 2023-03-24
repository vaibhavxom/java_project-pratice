package com.calcy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("test class started");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("test class ended");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("test methord started");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("test methord ended");
	}

	@Test
	public void testCalArea() {
		assertEquals(5000,new Rectangle().calArea(100, 50));
	}

}
