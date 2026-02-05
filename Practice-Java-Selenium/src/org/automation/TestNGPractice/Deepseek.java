package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Deepseek extends InitialProcess
{
	@Test(groups = {"AI"})
	public void launchDeepseek()
	{
		driver.get("https://use.ai/");
		Reporter.log("DeepSeek Launched", true);
	}

}
