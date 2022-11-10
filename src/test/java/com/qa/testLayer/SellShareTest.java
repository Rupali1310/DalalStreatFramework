package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class SellShareTest extends TestBase
{
	String exp_result="Order Created successfully";
@Test
public void verifySellScenariowipro() throws InterruptedException
{
	Thread.sleep(3000);
	dash.searchCompany("wipro");
	Thread.sleep(3000);
	dash.clickOnWipro();
	Thread.sleep(2000);
	exchange.clickOnsell1();
	Thread.sleep(2000);
	
	exchange.enetrsellQuantity(3);
	Thread.sleep(2000);

	exchange.clickOnsell2();
	Thread.sleep(3000);
	
	
	String actual_result=exchange.getOrderSuccessMsg();
	Assert.assertEquals(exp_result, actual_result);

}@Test
public void verifySellScenarioAxis() throws InterruptedException
{
	
dash.searchCompany("Axis");
Thread.sleep(3000);

dash.clickOnAxis();
Thread.sleep(3000);

exchange.clickOnsell1();

Thread.sleep(2000);

exchange.enetrsellQuantity(5);

Thread.sleep(3000);
exchange.clickOnsell2();
Thread.sleep(2000);

String actual_result=exchange.getOrderSuccessMsg();
Assert.assertEquals(actual_result, exp_result);

}



}
