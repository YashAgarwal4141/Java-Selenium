package org.automation.DemoQa;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//Alert with only Ok button
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//2nd way
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		//Timer Alert box
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 200).perform();
		
		WebElement timerAlert = driver.findElement(By.id("timerAlertButton"));
		timerAlert.click();
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		explicitWait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//Confirm Alert Button
		WebElement confirmButton = driver.findElement(By.id("confirmButton"));
		action.scrollToElement(confirmButton).perform();
		action.scrollByAmount(0, 200).perform();
		confirmButton.click();
		driver.switchTo().alert().accept();
		WebElement CBMessage=driver.findElement(By.id("confirmResult"));
		System.out.println(CBMessage.getText());
		
		confirmButton.click();
		driver.switchTo().alert().dismiss();
		System.out.println(CBMessage.getText());
		
		
	}

}
