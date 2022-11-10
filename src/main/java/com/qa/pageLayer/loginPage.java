package com.qa.pageLayer;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class loginPage extends TestBase
{
	public loginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='email']")private WebElement username;
	public void userID(String uid)
	{
		username.sendKeys(uid);
		
	}
	
	@FindBy(xpath="//input[@name='password']")private WebElement passw;
	public void password(String psw)
	{
		passw.sendKeys(psw);
	}
	
	@FindBy(xpath="//div[@class='mt-3 d-grid']")private WebElement login;
	public void loginClick()
	{
		login.click();
	}
	
	}
