package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;
	public static WebDriver startbrowser(String browsername, String url)
	{
		if(browsername.equals("firefox"))
				{
					driver=new FirefoxDriver();
			
				}
		else if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.get("url");
		return driver;
		
	
		}
	
		

}
