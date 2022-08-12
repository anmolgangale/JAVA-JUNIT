package com.lti.rainbowjwellers.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.lti.rainbowjwellers.service.RainbowJwellerService;

@RunWith(Parameterized.class)
public class RainbowJwellersParameterizeTest {
	
	RainbowJwellerService service=new RainbowJwellerService();
	
	private double gram;
	private double expectedgoldpric;
	
	public RainbowJwellersParameterizeTest(double gram,double expectedgoldpric)
	{
		this.gram=gram;
		this.expectedgoldpric=expectedgoldpric;
	}
	
	@Parameters
	public static Collection dataProvider() {
		
		return Arrays.asList(new Object[][] {
			{9.6,48401.76},
			{56,282343.6},
			{24.5,123525.325},
			{0,0},
			{-1,-5041.85}
		});
	}
	
	@Test
	public void testCalculateGoldPrice()
	{
		assertEquals(expectedgoldpric,service.calculategoldprice(gram),0.001);
	}

}
