package com.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage {
	
	WebDriver driver ;
	
	By Singlebutton = By.xpath("//label[contains(text(),'Single')]");
	By NoofDependants = By.xpath("//select[contains(@title,'Number of dependants')]");
	By Hometolivein = By.xpath("//label[contains(text(),'Home to live in')]");
	By AnnualIncome = By.xpath("//input[@aria-labelledby=\"q2q1\"]");
	By OtherAnnualIncome = By.xpath("//input[@aria-labelledby=\"q2q2\"]");
	By Monthlylivingexpenses = By.xpath("//input[@id='expenses']");
	By Homeloanrepayment = By.xpath("//input[@id='homeloans']");
	By Otherloanrepayment = By.xpath("//input[@id='otherloans']");
	By OtherCommitments = By.xpath("//input[@aria-labelledby=\"q3q4\"]");
	By TotalCreditLimits = By.xpath("//input[@id='credit']");
	By EligibilityButton = By.xpath("//button[@id='btnBorrowCalculater']");
	By EligibleAmount = By.xpath("//span[@id='borrowResultTextAmount']");
	By StartOver = By.cssSelector("body.desktop:nth-child(2) main.navigation-offset:nth-child(7) div.columns:nth-child(1) div.container.container--one-column div.grid div.clearfix div.container__items.container__main div.aem__component.clearfix div.container__item.container__main__element div.borrowingpower.text.parbase div.container.homeloan-borrowpower.container--four.box--white:nth-child(1) div.borrow__scenario__container div.grid.borrow__result div.flex-container div.borrow__result__action div.result__restart > button.start-over");
	By ErrorMsg = By.xpath("//div[contains(@class,'borrow__error__text')]");
	
	
	
	public By getSinglebutton()
	{
	 return Singlebutton;
	}
	
	public By getNoofdependants()
	{
	 return NoofDependants;
	}
	
	public By getHometolivein()
	{
	 return Hometolivein;
	}
	
	public By getAnuualincome()
	{
	 return AnnualIncome;
	}
	
	public By getotherAnnualincome()
	{
	 return OtherAnnualIncome;
	}
	
	public By getMonthlylivingexpense()
	{
	 return Monthlylivingexpenses;
	}
	
	public By getHomeLoanrepayment()
	{
	 return Homeloanrepayment;
	}
	
	public By getOtherloanrepayment()
	{
	 return Otherloanrepayment;
	}
	
	public By getOthercommitments()
	{
	 return OtherCommitments;
	}
	
	public By getTotalcreditlimit()
	{
	 return TotalCreditLimits;
	}
	
	public By getElibilityButton()
	{
	 return EligibilityButton;
	}
	
	public By getEligibieamount()
	{
	 return EligibleAmount;
	}
	
	public By getStartoverbutton()
	{
	 return StartOver;
	}
	
	public By getErrormsg()
	{
	 return ErrorMsg;
	}
	
	

}
