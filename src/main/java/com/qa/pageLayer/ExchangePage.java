package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase
{
	public ExchangePage()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")private WebElement click_On_buy1;
	public void clickOnbuy1()
	{
		click_On_buy1.click();
		
	}
	@FindBy(xpath="//input[@name='input-Qunatity']")  private WebElement enter_Quantity;
	public void enetrQuantity(int count)
	{
		enter_Quantity.click();
		enter_Quantity.sendKeys(String.valueOf(count));
		
	}
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")private WebElement click_on_buy2;
	public void clickOnBuy2()
	{
		click_on_buy2.click();
		
	}
	@FindBy(xpath="//div[text()='Order Created successfully']")private WebElement order_succes_msg;
	public String getOrderSuccessMsg()
	{
		String status=order_succes_msg.getText();
		return status;
		
	}
	
	
	
	@FindBy(xpath="//input[@id='quantity']")  private WebElement entersell_Quantity;
	public void enetrsellQuantity(int count)
	{
		entersell_Quantity.click();
		entersell_Quantity.sendKeys(String.valueOf(count));
		
	}

	@FindBy(xpath="//a[text()='Sell']")private WebElement click_On_sell1;
	public void clickOnsell1()
	{
		click_On_sell1.click();
		
	}

	@FindBy(xpath="//button[@class='w-md btn btn-danger']")private WebElement click_On_sell2;
	public void clickOnsell2()
	{
		click_On_sell2.click();
		
	}
	
	
	
}