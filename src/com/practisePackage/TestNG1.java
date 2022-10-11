package com.practisePackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 
{
	
	@BeforeMethod
	public void method1()
	{
		System.out.println("Method1");
	}
	
	@Test
	public void method2()
	{
		String Expected = "http://www.Facebook.com";
		String Actual = "Abc";
		Assert.assertEquals(Expected, Actual, "Test Case-1 is Failed");
		
		String Product = "Chain";
		String Product1 = "Chain";
		Assert.assertEquals(Product, Product1, "Test Case is Passed");
	}
	
	@AfterMethod
	public void Method3 ()
	{
		System.out.println("method3");
	}
	
	@Test
	public void method4()
	{
		String HomepageName = "SauceDemo";
		String HomeTitle = "SauceDemo";
		Assert.assertEquals(HomepageName, HomeTitle, "Test case is Passed");
	}
	
	

}
