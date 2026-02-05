package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExecution 
{
	@Test
	public void launchAmazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("flipkart Launched", true);
		driver.close();
	}

	@Test
	public void launchFlipkart()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Reporter.log("Myntra Launched", true);
		driver.close();
	}
	
	@Test
	public void launchMyntra()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Reporter.log("Amazon Launched", true);
		driver.close();
	}
}
