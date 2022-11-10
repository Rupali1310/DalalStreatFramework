package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.loginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase
{
@Test
public void verifyLoginPage()
{
	loginPage login=new loginPage();
	login.userID("rupali.sg94@gmail.com");
	login.password("rupali2020");
	login.loginClick();
			
}
}
