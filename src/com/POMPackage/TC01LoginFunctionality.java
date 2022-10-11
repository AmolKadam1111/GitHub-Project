package com.POMPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC01LoginFunctionality {
	
	@Test
	public void LoginFunctionality() {
		
		
//		6. setProperty to call ChromeDriver & to open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
//		7. Create object of POM class to call methods to perform Actions.
		
		LoginPageWithPOM lp = new LoginPageWithPOM(driver);
		
		lp.sendUserName();
		lp.SendPassword();
		lp.clickLoginButton();
		
		
//		# Cecking Test Scenario
		
		String expectedHomePageURL = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageURL = driver.getCurrentUrl();
		
		System.out.println("Cheking Login Test Case");
		
		if (expectedHomePageURL.equals(actualHomePageURL)) {
			System.out.println("Login Test Passed, We have successfully Login");
		}else {
			System.out.println("Login Test Failed");
		}
		
	}

}
