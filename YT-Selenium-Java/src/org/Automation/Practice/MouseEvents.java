package org.Automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement dragMe = driver.findElement(By.id("draggableElement"));
		WebElement dropHere = driver.findElement(By.id("droppableElement"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(dragMe).release(dropHere).perform();

	}

}
