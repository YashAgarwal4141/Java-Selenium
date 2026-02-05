package org.Automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BasicSelenium {

	public static void main(String[] args) 
	{
		ChromeDriver chrome= new ChromeDriver();
		chrome.manage().window().maximize();
		
		chrome.get("https://vinothqaacademy.com/demo-site/");
		chrome.findElement(By.id("vfb-5")).sendKeys("ViNOTH");
		chrome.findElement(By.id("vfb-7")).sendKeys("QaAcademy");
		WebDriver driver = chrome;
		
		String[] visibleText = {"Male", "Selenium WebDriver", "Java", "TestNG", "DevOps"};
		for(String x : visibleText)
		{
			driver.findElement(By.xpath("//label[ text() = '"+x+"']")).click();
		}
		
		
//		driver.findElement(By.xpath("//label[ text() = 'Male']")).click();
//		WebElement courses = driver.findElement(By.xpath("//label[ text() = 'Selenium WebDriver']"));
//		courses.click();
//		driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(courses)).click();
//		//driver.findElement(By.xpath("//label[ text() = 'Java']")).click();
//		driver.findElement(By.xpath("//label[ text() = 'TestNG']")).click();
//		driver.findElement(By.xpath("//label[ text() = 'DevOps']")).click();
		
	}

}
