package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart extends InitialProcess {
	
	@Test(groups = {"E-commerce"})
	public void launchFlipkart()
	{
		driver.get("https://www.flipkart.com/");
		Reporter.log("Flipkart Launched", true);
		
	}

}
