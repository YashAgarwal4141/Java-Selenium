package org.automation.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChatGPT extends InitialProcess{
	
	@Test(groups = {"AI"})
	public void launchChatGPT()
	{
		driver.get("https://chatgpt.com/");
		Reporter.log("ChatGPT Launched", true);
	}

}
