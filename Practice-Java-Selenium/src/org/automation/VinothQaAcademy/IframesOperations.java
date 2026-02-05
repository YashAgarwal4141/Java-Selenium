package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframesOperations {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://vinothqaacademy.com/iframe/");
		
		//Switching to frame by indexing
		driver.switchTo().frame(0);
		String h2 =driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2);
		driver.findElement(By.id("nameInput")).sendKeys("Yash");
		driver.switchTo().defaultContent();
		
		//Switching to Iframe using name or Id
		driver.switchTo().frame("popuppage");
		String h3 =driver.findElement(By.tagName("h2")).getText();
		System.out.println(h3);
		driver.findElement(By.name("alertbox")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
		//Switching to Iframe using frame WebElement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@name='registeruser']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("vfb-5")).sendKeys("Yash" , Keys.TAB,"Agarwal", Keys.TAB , Keys.SPACE);
		driver.findElement(By.id("vfb-3")).sendKeys("33");
		(new Actions(driver)).scrollToElement(driver.findElement(By.id("vfb-4"))).moveToElement(driver.findElement(By.id("vfb-4"))).perform();
		
		
	}

}
