package qascripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import qapages.flipkartt;

public class flipkart1 {
	@Test
	public void verifylogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		flipkartt login=new flipkartt(driver);
		login.logintoflipkart("xyz","abcd");
	
		
	}
}
