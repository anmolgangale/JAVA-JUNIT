package com.lti.junitExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.lti.rainbowjwellers.test.RainbowJwellersParameterizeTest;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(RainbowJwellersParameterizeTest.class);
		if(result.getFailureCount()==0)
		{
			System.out.println("All test cased are passed!!!");
		}
		else
		{
			for(Failure failure:result.getFailures())
			{
				System.out.println("Test execution failed"+failure.getMessage());
				
			}
		}
		System.out.println("Result "+result.wasSuccessful());
	}

}
