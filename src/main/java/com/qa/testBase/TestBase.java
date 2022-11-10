package com.qa.testBase;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.qa.pageLayer.Dashboard;
import com.qa.pageLayer.ExchangePage;
import com.qa.pageLayer.Transactions;
import com.qa.pageLayer.loginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class TestBase 
{
	public static WebDriver driver;

	 public static Dashboard dash;	
	 public static ExchangePage exchange;
	 public static Transactions transactions;
	 public static loginPage login;
	 public static Logger logger ;
	 @BeforeClass
	public void start()
	{
		logger=Logger.getLogger("DalalStreatFramework");
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("framework execution started");
	}
	@AfterClass
	public void stop()
	{
		logger.info("framework execuction stopped");
	}
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) throws InterruptedException
	{	if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		logger.info(" chrome Browser launches");
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		logger.info(" fireFox Browser launches");

		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			logger.info(" Edge Browser launches");

		}
		else
		{
			System.out.println("plz provide correct browser name");
		
		}
	
		driver.get("https://www.apps.dalalstreet.ai/login");
		logger.info("url launches");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		logger.info(" deleted all cookies,pageloade timeout provided");

	
		
		dash=new Dashboard();
		exchange=new ExchangePage();
		transactions=new Transactions();
		
		login=new loginPage();
		
		login.userID("rupali.sg94@gmail.com");
		Thread.sleep(3000);

		login.password("rupali2020");
		
		login.loginClick();
		logger.info("user logged with valid credential");
		
		
	
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	}
	

