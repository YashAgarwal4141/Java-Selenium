package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeHandling {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.click(driver.findElement(By.linkText("iFrames"))).perform();
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.switchTo().defaultContent();
		
		WebElement alert = driver.findElement(By.xpath("//iframe[@title = 'Alert & Popup']"));
		driver.switchTo().frame(alert);
		System.out.println(driver.findElement(By.tagName("h2")).getText());

	}

}
