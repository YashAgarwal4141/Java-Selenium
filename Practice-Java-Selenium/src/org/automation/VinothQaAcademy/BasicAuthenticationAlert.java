package org.automation.VinothQaAcademy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicAuthenticationAlert {
	
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		WebElement demoSites= driver.findElement(By.linkText("Demo Sites"));
		actions.moveToElement(demoSites).perform();
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		actions.moveToElement(practiceAutomation).perform();
		WebElement dropDown = driver.findElement(By.linkText("Basic Authentication"));
		actions.moveToElement(dropDown).click().perform();
		
		driver.findElement(By.linkText("Test Basic Authentication")).click();
		Robot robot = new Robot();
		String loginID = "admin";
		for(char c :loginID.toCharArray()) {
			char key =(char) KeyEvent.getExtendedKeyCodeForChar(c);
			
			robot.keyPress(key);
			robot.keyRelease(key);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		String pwd = "vinothqa";
		for(char c :pwd.toCharArray()) {
			char key =(char) KeyEvent.getExtendedKeyCodeForChar(c);
			
			robot.keyPress(key);
			robot.keyRelease(key);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
