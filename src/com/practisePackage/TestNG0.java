package com.practisePackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG0 {
	
	
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void method2()
	{
		String Expected = "http://www.Facebook.com";
		String Actual = "Abc";
		soft.assertEquals(Expected, Actual);
		
		String Product = "Chain";
		String Product1 = "Chain1";
		soft.assertEquals(Product, Product1);
		soft.assertAll();
	}
	@Test
	public void method4()
	{
		String HomepageName = "SauceDemo";
		String HomeTitle = "SauceDemo";
		soft.assertEquals(HomepageName, HomeTitle);
		
		String Product = "Chain";
		String Product1 = "Chain";
		soft.assertEquals(Product, Product1);
		
	}
	
	

}
