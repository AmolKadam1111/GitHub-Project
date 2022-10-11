package testNGAssertKeywordsAnnotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TestNGPOMClass.POMClass;

public class TC3MultipleItemSelection 
{	
	@Test
	public void MultipleItemSelection ()
	{
		
		
//		6. setProperty to call ChromeDriver & to open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolk\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Chrome Browser is opened");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
//		7. Create object of POM class to call methods to perform Actions.
		
		POMClass m = new POMClass(driver);
		
		m.sendUserName();
		m.SendPassword();
		m.clickLoginButton();
		try
		{
		m.ClickOnAddToCartButtom();
		}catch(Exception e)
		{
			String actualText= m.RemoveButtonText();
			
			String expectedText = "REMOVE";
			
			if (expectedText.equals(actualText)) {
				System.out.println("Add to Cart Test case is passed");
			}else {
				System.out.println("Test Case is Failed");
			}
		}
		
	}
}

