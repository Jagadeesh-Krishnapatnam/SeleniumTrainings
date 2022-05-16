package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Drivers {
	
	
	WebDriver driver ;
	
	public WebDriver OpenBrowser(String url,String Browsername)
	{
		
		if(Browsername.equalsIgnoreCase("Firefox"))
		{
		driver = new FirefoxDriver();
		}else if (Browsername.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}else if (Browsername.equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		
		
		driver.manage().window().maximize();
		
		driver.get(url);
			
		return driver;
				
	}	

}
