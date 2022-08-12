package com.lti.rainbowjwellers.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.lti.junitExample.TestLogic3;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result=JUnitCore.runClasses(TestLogic3.class);
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
