package org.automation.PracticeSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class HandlingNotificationCoitonic {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		
		List<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		//arguments.add("--disable-notifications");
		
		options.addArguments(arguments);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(8000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
