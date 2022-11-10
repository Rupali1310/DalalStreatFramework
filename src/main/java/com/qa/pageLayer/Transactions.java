package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Transactions extends TestBase
{
	public Transactions()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='nav-link dropdown-togglez arrow-none active']")private WebElement click_on_Transaction;
	public void clickOnTransactions()
	{
		click_on_Transaction.click();	
	}
	@FindBy(xpath="//input[@id='search-bar-0']")private WebElement search_company_to_see_transaction;

	public void searchForTransactions(String cname)
	{
		search_company_to_see_transaction.sendKeys(cname);
	}
	
}
