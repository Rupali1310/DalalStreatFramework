package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase
{
static String file_path="D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\File HandelingExcelSheet\\DalalStreatFramework\\screenshots\\";

public static void takeScreenShot(String filename) 
{
	try
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File des= new File(file_path+filename+".png");
	FileHandler.copy(src,des);
	}
	catch(Exception e)
	{
		System.out.println("plz provide correct path");
		e.printStackTrace();
	}
	}





}
