package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.click(driver.findElement(By.linkText("Mouse Event"))).perform();
		
		WebElement dragMe = driver.findElement(By.id("draggableElement"));
		WebElement dropHere = driver.findElement(By.id("droppableElement"));
		actions.clickAndHold(dragMe).moveToElement(dropHere).release().perform();
		//actions.moveToElement(driver.findElement(By.id("textbox"))).click().perform();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value = 'Yash Agarwal'", driver.findElement(By.id("textbox")) );
		
		actions.doubleClick(driver.findElement(By.id("dblclick"))).perform();
		
		actions.contextClick(driver.findElement(By.id("rightclick"))).perform();
		
		

	}

}
