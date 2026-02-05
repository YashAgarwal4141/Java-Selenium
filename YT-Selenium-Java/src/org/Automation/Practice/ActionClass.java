package org.Automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vinothqaacademy.com/");
		WebElement demo = driver.findElement(By.xpath("(//a[ text() = 'Demo Sites'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(demo).perform();
		act.moveToElement(driver.findElement(By.xpath("(//a[ text() = 'Practice Automation'])[2]")))
		.click(driver.findElement(By.xpath("(//a[ text() = 'Mouse Event'])[2]"))).perform();
		
		act.clickAndHold(driver.findElement(By.id("draggableElement"))).release(driver.findElement(By.id("droppableElement"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//input[@title='Enter First Name']"))).click().sendKeys("Vinoth").perform();
		act.doubleClick(driver.findElement(By.id("dblclick"))).contextClick(driver.findElement(By.id("rightclick"))).perform();
		act.scrollByAmount(0, 150).pause(2000).scrollToElement(driver.findElement(By.xpath("(//a[ text() = 'Demo Sites'])[2]"))).perform();
		driver.navigate().refresh();
		act.dragAndDrop(driver.findElement(By.id("draggableElement")), driver.findElement(By.id("droppableElement"))).perform();
		
	}

}
