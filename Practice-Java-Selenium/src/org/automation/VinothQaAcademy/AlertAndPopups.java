package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertAndPopups {

	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Alert and Popup"))).click().perform();
		
		driver.findElement(By.xpath("//button[text() = 'Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text() = 'Confirm Alert Box']")).click();
		alert.accept();
		actions.pause(2000).click(driver.findElement(By.xpath("//button[text() = 'Confirm Alert Box']"))).perform();
		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text() = 'Prompt Alert Box']")).click();
		alert.sendKeys("Yes");
		alert.accept();
		
		actions.pause(2000).click(driver.findElement(By.xpath("//button[text() = 'Prompt Alert Box']"))).perform();
		alert.sendKeys("No");
		alert.accept();
		
		Thread.sleep(15000);
		driver.close();

	}

}
