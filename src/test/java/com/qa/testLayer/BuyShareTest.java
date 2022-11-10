package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class BuyShareTest extends TestBase
{
	String exp_result="Order Created successfully";

@Test	
public void verifyScenarioWipro() throws InterruptedException
{
	Thread.sleep(2000);


	dash.searchCompany("wipro");
	Thread.sleep(2000);
	dash.clickOnWipro();
	Thread.sleep(3000);

	exchange.clickOnbuy1();
	Thread.sleep(3000);

	exchange.enetrQuantity(5);
	Thread.sleep(5000);

	exchange.clickOnBuy2();
	Thread.sleep(2000);
		String actual_result=exchange.getOrderSuccessMsg();
	Assert.assertEquals(exp_result, actual_result);




}
@Test
public void verifyScenarioAxis() throws InterruptedException
{
	Thread.sleep(2000);
	
	dash.searchCompany("Axis");
	Thread.sleep(3000);

	dash.clickOnAxis();
	Thread.sleep(2000);
	
	exchange.clickOnbuy1();
	Thread.sleep(2000);

	exchange.enetrQuantity(4);
	Thread.sleep(5000);

	exchange.clickOnBuy2();
	String actual_result=exchange.getOrderSuccessMsg();
	Assert.assertEquals(actual_result,exp_result);
	
}

}
