package com.POMPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04LogOutFunctionality {
	@Test
public void LogOutFunctionality () {
		
		
//		6. setProperty to call ChromeDriver & to open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
//		7. Create object of POM class to call methods to perform Actions.
		
		LogOutPageWithPOM s = new LogOutPageWithPOM (driver);
		s.sendUserName();
		s.SendPassword();
		s.clickLoginButton();
		s.clickMenuButton();
		s.clickLogOutButton();
		
		String expectedLoginPageURL = "https://www.saucedemo.com/";
		String actualLoginPageURL = driver.getCurrentUrl();
		
		if (expectedLoginPageURL.equals(actualLoginPageURL)) {
			System.out.println("LogOut Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
		
		
   }

}
