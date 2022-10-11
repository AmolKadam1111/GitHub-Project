package com.practisePackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGKeywords {
	
	@Test(invocationCount=2)
	public void Test1()
	{
		System.out.println("Test-1 is Passed");
	}
	
	@Test(priority=1)
	public void Test2()
	{
		System.out.println("Test-2 is Passed");
	}
	
	@Test(priority=4,enabled=false)
	public void Test3()
	{
		System.out.println("Test-3 is Passed");
	}
	
	@Test(priority=2,invocationCount=2)
	public void Test4()
	{
		System.out.println("Test-4 is Passed");
	}
	
	@Test
	public void Test5()
	{
		System.out.println("Test-5 is Passed");
	}
	
	@Test(priority=0)
	public void Test6()
	{
		System.out.println("Test-6 is Passed");
	}
	
	@Test(priority=0,dependsOnMethods= {"Test8"})
	public void Test7()
	{
		System.out.println("Test-7 is Passed");
	}
	
	@Test
	public void Test8()
	{
		System.out.println("Test-8 is Passed");
//		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"Test10"})
	public void Test9()
	{
		System.out.println("Test-9 is Passed");
	}
	
	@Test(timeOut=3000)
	public void Test10() throws InterruptedException
	{
		System.out.println("Test-10 is Passed");
		Thread.sleep(5000);
		
	}
	

}
