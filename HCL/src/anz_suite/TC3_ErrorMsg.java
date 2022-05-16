package anz_suite;


import com.pageobjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class TC3_ErrorMsg {
	
	
	
	WebDriver driver;
	CalculatorPage pgobj = new CalculatorPage();

	
	public TC3_ErrorMsg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void ErrorMsg() throws InterruptedException
	{
		
		
		
		//Entering Monthly Expenses 1
		driver.findElement(pgobj.getMonthlylivingexpense()).sendKeys("1");
		
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		
		//Clicking on Workout Howmuch i could borrow button
		driver.findElement(pgobj.getElibilityButton()).click();

		Thread.sleep(1000);
		
		String Actualerror = driver.findElement(pgobj.getErrormsg()).getText();
		String Experror = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
		
		if(Actualerror.equalsIgnoreCase(Experror))
		{
			System.out.println("Error Msg>"+Actualerror+"<is Displayed");
		}else System.out.println("Error Msg is NOT DISPLAYED");
		
		driver.quit();
		
		
	}
	

	

}
