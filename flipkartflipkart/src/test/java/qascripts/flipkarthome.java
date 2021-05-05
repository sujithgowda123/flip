package qascripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import qapages.flipkartnew;

import pagefactory.Browser;

public class flipkarthome {
	@Test
	public void checkvaliduser()
	{
		WebDriver driver=Browser.startbrowser("chrome", "https://www.flipkart.com/account/login?ret=/");
		flipkartnew login=PageFactory.initElements(driver, flipkartnew.class);
		login.logintoflipkart("sujithgowda658@gmail.com","08181235r");
	}
	
	

}