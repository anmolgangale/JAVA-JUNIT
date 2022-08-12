package com.lti.junitExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lti.logic.Calculation;

public class TestLogic2 {
	@BeforeClass
	public static void setUpBeforeClass()
	{
		System.out.println("Before class");
	}
	
	@Before
	public void setup()
	{
		System.out.println("Before each");
	}
   
	@Test
	public void testMax()
	{
		System.out.println("Test case to find max");
	 assertEquals(5,Calculation.findMax(new int[] {1,5,3,4,5}));
	}
	
	@Test
	public void testCube()
	{
		assertEquals(27,Calculation.cube(3));
	}
	@After
	public void after()
	{
		System.out.println("After each");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After class");
	}
}
