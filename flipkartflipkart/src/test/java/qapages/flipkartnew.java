package qapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkartnew {
	WebDriver driver;
	public flipkartnew(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input")
	WebElement email;
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button/span")
	WebElement login;
	@FindBy(xpath="/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/a/span")
	WebElement forgot;
	
	public void logintoflipkart(String EID, String pwd)
	{
		email.sendKeys(EID);
		password.sendKeys(pwd);
		login.click();
		
	}
}
