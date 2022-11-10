package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class Dashboard extends TestBase
{ 
public Dashboard()
{
	
	PageFactory.initElements(driver,this);
}

	@FindBy(xpath="//input[@class='form-control']")private WebElement search_company;
	public void searchCompany(String cname)
	{
	search_company.sendKeys(cname);
	
	}
	
	@FindBy(partialLinkText="WIPR")private WebElement click_on_wipro;
	public void clickOnWipro()
	{
		click_on_wipro.click();
	}
	
	@FindBy(partialLinkText="AXIS")private WebElement click_on_axis;
	public void clickOnAxis()
	{
		click_on_axis.click();
	}
	
	@FindBy(partialLinkText="TATA MOTORS") private WebElement click_on_tatam;
	public void clickOnTatatMotors()
	{
	click_on_tatam.click();
	}

}





