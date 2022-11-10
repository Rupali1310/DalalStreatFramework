package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestTransactions extends TestBase
{
	@Test
	public void showTransactionsHistoryAxis() throws InterruptedException
	{	Thread.sleep(2000);
		transactions.clickOnTransactions();
		transactions.searchForTransactions("axis");
	}
	
}
