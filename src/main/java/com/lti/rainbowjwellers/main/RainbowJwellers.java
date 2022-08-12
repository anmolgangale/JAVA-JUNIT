package com.lti.rainbowjwellers.main;

import java.util.Scanner;

import com.lti.rainbowjwellers.service.RainbowJwellerService;

public class RainbowJwellers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner obj=new Scanner(System.in);
	    
		System.out.println("Enter the grams");
		double gram=Double.parseDouble(obj.nextLine());
		RainbowJwellerService service=new RainbowJwellerService();
		
		double totalprice=service.calculategoldprice(gram);
		System.out.println("Total Price: "+totalprice);
		
		obj.close();
	}

}
