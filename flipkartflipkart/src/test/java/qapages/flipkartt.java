/**
 * 
 */
package qapages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Lenovo
 *
 */
public class flipkartt {
	WebDriver driver;
	
	By email=By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input");
	By password=By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[2]/input");
    By loginbtn= By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[4]/button/span");


public flipkartt(WebDriver driver)
{
	this.driver=driver;
}
public void logintoflipkart(String EID, String pwd)
{
	driver.findElement(email).sendKeys("sujithgowda658@gmail.com");
	driver.findElement(password).sendKeys("08181235r");
	driver.findElement(loginbtn).click();
}
public void email(String EID)
{
	driver.findElement(email).sendKeys("EID");
}
public void password(String pwd)
{
	driver.findElement(password).sendKeys("pwd");
	
}
public void clickonbutton()
{
	driver.findElement(loginbtn).click();
}
}