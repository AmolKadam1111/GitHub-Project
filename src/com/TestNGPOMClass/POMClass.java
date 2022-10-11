package com.TestNGPOMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	
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
	
//	Add Multiple Items in a Cart
	@FindBy(xpath="//button[text()='Add to cart']")
	private List <WebElement> SelectMulitipleItems;

//	Remove Button Text
	@FindBy (xpath="//button[text()='Remove']")
	private WebElement RemoveButton;
	
//	Main Menu Button
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement MainMenuButton;
	
//	LogOut Button
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
//	3. Create Constructor
	public POMClass (WebDriver driver) {
		
//		Global v.     Local v.
		this.driver = driver;
		
//		Selenium class --> initElements
		PageFactory.initElements(driver, this);
	}
	
//	4. Actions performs on Elements
	public void sendUserName () {
		username.sendKeys("standard_user");
		System.out.println("2. Username Entered");
	}
	
	public void SendPassword() {
		password.sendKeys("secret_sauce");
		System.out.println("3. Password Entered");
	}
	
	public void clickLoginButton() {
		loginButton.click();
		System.out.println("4. Clicked on Login Button ");
	}
	
	public void AddToCartButton() {
		AddToCartButtom1.click();
		System.out.println("5. Single Item Added in a Cart");
	}
	
	public void ClickOnAddToCartButtom(){
		for (int i=0;i<=5;i++) {
			SelectMulitipleItems.get(i).click();
			System.out.println("5. Multiple Item Added in a Cart");
		}
	}
	
	public String RemoveButtonText() {
		String RemoveButtonText = RemoveButton.getText();
		return RemoveButtonText;
	}

	public void clickMenuButton() {
		MainMenuButton.click();
		System.out.println("8. Clicked on Main Menu Button");
	}
	
	public void clickLogOutButton() {
		logoutButton.click();
		System.out.println("9. Clicked on Logout Button");
	}

}
