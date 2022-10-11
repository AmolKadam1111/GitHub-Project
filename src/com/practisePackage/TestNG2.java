package com.practisePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestNGPOMClass.POMClass;

public class TestNG2 
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
	public void varifyLoginFunctionality()
	{
		String expectedHomePageURL = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageURL = driver.getCurrentUrl();
		
		System.out.println("5. Cheking Login Test Case");
		
		if (expectedHomePageURL.equals(actualHomePageURL)) {
			System.out.println("Login Test Passed, We have successfully Login");
		}else {
			System.out.println("Login Test Failed");
		}
	}
	
	@AfterMethod
	public void TearDownMethod()
	{
		POMClass m = new POMClass(driver);
		
		m.clickMenuButton();
		m.clickLogOutButton();
		
		driver.quit();
	}

}
