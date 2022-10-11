package testNGAssertKeywordsAnnotations;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TestNGPOMClass.POMClass;
import com.TestNGUtilityClass.UtilityClass;

public class TC1LoginFunctionality 
{
//	WebDriver driver;
	
	@Test
	public void LoginFunctionality() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		UtilityClass.Screenshot(driver);
//		System.out.println("Screenshot Taken...");
		
		POMClass m = new POMClass(driver);
		
		m.sendUserName();
		m.SendPassword();
		m.clickLoginButton();
		
		
		String expectedHomePageURL = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageURL = driver.getCurrentUrl();
		
		System.out.println("5. Cheking Login Test Case");
		
		if (expectedHomePageURL.equals(actualHomePageURL)) {
			System.out.println("6. Login Test Passed, We have successfully Login");
		}else {
			System.out.println("6. Login Test Failed");
		}
		
	}	

}
