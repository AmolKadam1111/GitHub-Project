package com.practisePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestNGPOMClass.POMClass;

public class TestNG3 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setupMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		POMClass m = new POMClass(driver);
		
		m.sendUserName();
		m.SendPassword();
		m.clickLoginButton();
	}
	
	@Test
	public void varifyLogOutFunctionality()
	{
		POMClass m = new POMClass(driver);
		m.clickMenuButton();
		m.clickLogOutButton();
		String expectedLoginPageURL = "https://www.saucedemo.com/";
		String actualLoginPageURL = driver.getCurrentUrl();
		
		if (expectedLoginPageURL.equals(actualLoginPageURL)) {
			System.out.println("LogOut Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
	}
	
	@AfterMethod
	public void TearDownMethod()
	{
		driver.quit();
	}

}
