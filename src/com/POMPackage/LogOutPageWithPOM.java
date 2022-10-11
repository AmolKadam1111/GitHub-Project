package com.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPageWithPOM {
	
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
	
//	Main Menu Button
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement MainMenuButton;
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
//	3. Create Constructor
	public LogOutPageWithPOM (WebDriver driver) {
		
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
	
	public void clickMenuButton() {
		MainMenuButton.click();
	}
	
	public void clickLogOutButton() {
		logoutButton.click();
	}

}
