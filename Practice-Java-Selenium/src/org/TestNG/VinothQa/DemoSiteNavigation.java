package org.TestNG.VinothQa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class DemoSiteNavigation 
{
	static WebDriver driver = null;
	
	
	@BeforeClass
	public void demoSite()
	{
		ChromeOptions max = new ChromeOptions();
		max.addArguments("--start-maximized");
		driver = new ChromeDriver(max);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[ text() = 'Demo Sites'])[2]"))).perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[ text() = 'Practice Automation'])[2]"))).perform();
		//action.click(driver.findElement(By.xpath("(//a[ text() = 'Registration Form'])[2]"))).perform();
		
	}
}
