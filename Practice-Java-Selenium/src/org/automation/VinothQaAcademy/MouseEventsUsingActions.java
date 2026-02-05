package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsUsingActions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://vinothqaacademy.com/");
		
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
		
		Actions act = new Actions(driver);
		act.moveToElement(demoSites).perform();
		act.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Mouse Event"))).click().perform();
		
		act.clickAndHold(driver.findElement(By.id("draggableElement"))).release(driver.findElement(By.id("droppableElement"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//input[@title=\"Enter First Name\"]")), 10, 10).click().perform();
		act.doubleClick(driver.findElement(By.id("dblclick"))).perform();
		act.contextClick(driver.findElement(By.id("rightclick"))).perform();
		
		
		
		
		
	}

}
