package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon extends InitialProcess{
	
	@Test(groups = {"E-commerce"})
	public void launchAmazon()
	{
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon Launched", true);
		
	}

}
