package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra extends InitialProcess{

	@Test(groups = {"E-commerce"})
	public void launchMyntra()
	{
		driver.get("https://www.myntra.com/");
		Reporter.log("Myntra Launched", true);
	}
}
