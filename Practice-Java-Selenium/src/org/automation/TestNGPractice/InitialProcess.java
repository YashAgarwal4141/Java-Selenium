package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class InitialProcess 
{
	public static WebDriver driver;
	
	@BeforeClass
	public void launchingChrome()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	public void ClosingChrome()
	{
		driver.quit();
	}

}
