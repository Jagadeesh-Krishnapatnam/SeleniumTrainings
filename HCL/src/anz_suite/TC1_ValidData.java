package anz_suite;


import com.pageobjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class TC1_ValidData {
	
	
	
	WebDriver driver;
	CalculatorPage pgobj = new CalculatorPage();
	
	public TC1_ValidData(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void EnterValidData() throws InterruptedException
	{
		
		//clicking on single button
		driver.findElement(pgobj.getSinglebutton()).click();
		
		//Selecting no of dependants as 0
		Select nod = new Select(driver.findElement(pgobj.getNoofdependants()));
		nod.selectByIndex(0);
		
		//clicking on HomeLivein button
		driver.findElement(pgobj.getHometolivein()).click();
		
		//Entering Annual Income as 80000
		driver.findElement(pgobj.getAnuualincome()).sendKeys("80000");
		
		//Entering Other Annual Income as 10000 
		driver.findElement(pgobj.getotherAnnualincome()).sendKeys("10000");
		
		//Entering Monthly Expenses 500
		driver.findElement(pgobj.getMonthlylivingexpense()).sendKeys("500");
		
		//Entering Monthly Home Loan Repayment as 0
		driver.findElement(pgobj.getHomeLoanrepayment()).sendKeys("0");
		
		//Entering Other Loan Repayment as 100
		driver.findElement(pgobj.getOtherloanrepayment()).sendKeys("100");
		
		//Entering Other Commitments as 0
		driver.findElement(pgobj.getOthercommitments()).sendKeys("0");
		
		//Entering TotalCreditCard Limits as 10000
		driver.findElement(pgobj.getTotalcreditlimit()).sendKeys("10000");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		//Clicking on Workout Howmuch i could borrow button
		driver.findElement(pgobj.getElibilityButton()).click();
		
		Thread.sleep(1000);
		
		String FinalAmount = driver.findElement(pgobj.getEligibieamount()).getText();
		
		System.out.println("We Estimated You Could Borrow >"+FinalAmount);
		
		
		driver.quit();
		
		
	}
	

	

}
