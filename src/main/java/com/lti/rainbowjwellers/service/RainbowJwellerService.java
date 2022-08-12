package com.lti.rainbowjwellers.service;

public class RainbowJwellerService {
	
	private final double ratepergram=4450;
	private double makingcharges;
	private double gst;
	private double totalprice;

	public double calculategoldprice(double gram)
	{	
		double totalpriceofgold=0.0;
		
		totalprice=gram*ratepergram;
		makingcharges=(totalprice*10)/100;
		gst=((totalprice+makingcharges)*3)/100;
		
		totalpriceofgold=totalprice+makingcharges+gst;
		
		return totalpriceofgold;
	}
	
	
}
