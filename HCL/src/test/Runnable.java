package test;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import anz_suite.*;
import utilities.*;

public class Runnable {
	
	
	public WebDriver driver;
	
	public String url = "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/";
		
	
	@Parameters("browserType")
	@BeforeMethod
	public void InvokeDriver(String Browser) 

	{
		
		Drivers obj = new Drivers();
		driver = obj.OpenBrowser(url,Browser);
		
		
	}
	
	
	@Test(priority=0)
	public void EnterData() throws InterruptedException
	{
		TC1_ValidData obj1 = new TC1_ValidData(driver);
		obj1.EnterValidData();		
	}
	
	@Test(priority=1)
	public void Reset() throws InterruptedException
	{
		TC2_ResetForm obj2 = new TC2_ResetForm(driver);
		obj2.StartOVer();	
	}
	
	@Test(priority=2)
	public void Errormsg() throws InterruptedException
	{
		TC3_ErrorMsg obj3 = new TC3_ErrorMsg(driver);
		obj3.ErrorMsg();	
	}
	
	
	
	
	
	
	
	

}
