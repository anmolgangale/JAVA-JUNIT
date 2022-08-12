package com.lti.junitExample;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.logic.Calculation;
public class TestLogic {
	
	@Test
	public void testMax()
	{
	 assertEquals(5,Calculation.findMax(new int[] {1,5,3,4,5}));
	}

}
