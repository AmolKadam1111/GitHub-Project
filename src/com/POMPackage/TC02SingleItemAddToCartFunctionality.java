package com.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC02SingleItemAddToCartFunctionality {

	@Test
	public void LoginFunctionality() {
		
		
//		6. setProperty to call ChromeDriver & to open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
//		7. Create object of POM class to call methods to perform Actions.
		
		SigleItemAddToCartFunctionalityWithPOM hp = new SigleItemAddToCartFunctionalityWithPOM(driver);
		
		hp.sendUserName();
		hp.SendPassword();
		hp.clickLoginButton();
		hp.AddToCartButton();
		
		String actualText= hp.RemoveButtonText();
		
		String expectedText = "REMOVE";
		
		if (expectedText.equals(actualText)) {
			System.out.println("Add to Cart Test case is passed");
		}else {
			System.out.println("Test Case is Failed");
		}
		
   }
}
