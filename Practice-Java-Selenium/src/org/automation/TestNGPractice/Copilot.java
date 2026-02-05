package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Copilot extends InitialProcess
{
	@Test(groups = {"AI"})
	public void launchCopilot()
	{
	
		driver.get("https://copilot.microsoft.com/");
		Reporter.log("Copilot Launched", true);
		
	}

}
