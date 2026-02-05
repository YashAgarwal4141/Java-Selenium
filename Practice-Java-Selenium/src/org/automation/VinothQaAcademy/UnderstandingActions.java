package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnderstandingActions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://vinothqaacademy.com/ecommerce-demo/home.html");
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//h3[text() = 'Apple iPhone 15 Pro Max']"))).perform();
		driver.findElement(By.id("qty")).clear();
		action.sendKeys(driver.findElement(By.id("qty")), "3").perform();
		action.click(driver.findElement(By.xpath("//button[contains(text() , 'Add to Cart')]"))).perform();
		
		WebElement p = driver.findElement(By.xpath("//p[contains(@class , 'w-24')]"));
		String price = p.getText();
		System.out.println(price);
		WebElement count = driver.findElement(By.xpath("//input[@type=\"number\"]"));
		count.click();
		count.sendKeys(Keys.BACK_SPACE,"1");
		action.pause(2000).moveToElement(p).click().perform();
		
		WebElement revisedPrice = driver.findElement(By.xpath("//p[contains(@class , 'w-24')]"));
		System.out.println(revisedPrice.getText());
		action.click(driver.findElement(By.xpath("//button[contains(text(),'Remove')]"))).perform();
		
		driver.findElement(By.partialLinkText("Continue Shopping")).click();

	}

}
