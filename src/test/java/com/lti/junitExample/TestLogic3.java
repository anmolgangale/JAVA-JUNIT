package com.lti.junitExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.ebBill.EBBIll;

public class TestLogic3 {
	
	@Test
	public void testBill_input_0()
	{
		EBBIll obj=new EBBIll(0);
		assertEquals(0.0,(obj.calculateBillAmount()),0.001);
		
	}
	
	
	@Test
	public void testBill_input_upto_50()
	{
		EBBIll obj=new EBBIll(50);
		assertEquals(130,(obj.calculateBillAmount()),0.001);
		
	}
	
	@Test
	public void testBill_input_upto_100()
	{
		EBBIll obj=new EBBIll(100);
		assertEquals(292.5,(obj.calculateBillAmount()),0.001);
		
	}
	
	@Test
	public void testBill_input_upto_200()
	{
		EBBIll obj=new EBBIll(200);
		assertEquals(818.5,(obj.calculateBillAmount()),0.001);
		
	}
	
	@Test
	public void testBill_input_upto_1000()
	{
		EBBIll obj=new EBBIll(1000);
		assertEquals(7018.5,(obj.calculateBillAmount()),0.001);
		
	}
	
	@Test
	public void testBill_input_upto_5000()
	{
		EBBIll obj=new EBBIll(5000);
		assertEquals(47018.5,(obj.calculateBillAmount()),0.001);
		
	}

}
