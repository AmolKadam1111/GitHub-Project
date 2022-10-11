package com.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigleItemAddToCartFunctionalityWithPOM {
	
//	1. WebDriver declared
	private WebDriver driver;
	
//	2. Find WebElements
	
//	Username
	@FindBy (xpath="//input[@id='user-name']")
	private WebElement username;
	
//	Password
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
//	LoginButton
	@FindBy (xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
//	Add Single Item in Cart
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement AddToCartButtom1;
	
//	Remove Button Text
	@FindBy (xpath="//button[text()='Remove']")
	private WebElement RemoveButton;
	
//	3. Create Constructor
	public SigleItemAddToCartFunctionalityWithPOM (WebDriver driver) {
		
//		Global v.     Local v.
		this.driver = driver;
		
//		Selenium class --> initElements
		PageFactory.initElements(driver, this);
	}
	
//	4. Actions performs on Elements
	public void sendUserName () {
		username.sendKeys("standard_user");
	}
	
	public void SendPassword() {
		password.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void AddToCartButton() {
		AddToCartButtom1.click();
	}
	
	public String RemoveButtonText() {
		String RemoveButtonText = RemoveButton.getText();
		return RemoveButtonText;
	}
	
	
}
