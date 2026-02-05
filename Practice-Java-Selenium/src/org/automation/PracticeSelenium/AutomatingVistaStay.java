package org.automation.PracticeSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AutomatingVistaStay {

	public static void main(String[] args) 
	{
		ChromeOptions max = new ChromeOptions();
		max.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(max);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.stayvista.com/");
		driver.findElement(By.id("city-page-autocomplete")).sendKeys("Lonavala");
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 200).perform();
		WebElement location = driver.findElement(By.xpath("(//div[contains(@class ,'CityPageAutoComplete')]//span[text() = 'Lonavala'])[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", location);
		
		driver.findElement(By.id("check-in-date-desktop")).click();
		driver.findElement(By.xpath("(//span[@class='rdrDayNumber']//span[text() = '24'])[1]/..")).click();
		
		//driver.findElement(By.xpath("//span[text() = 'Check-out']")).click();
		driver.findElement(By.xpath("(//span[@class='rdrDayNumber']//span[text() = '30'])[2]/..")).click();
		
		WebElement search = driver.findElement(By.xpath("//div[text() = 'SEARCH']"));
		jse.executeScript("arguments[0].click();", search);
		
		WebElement view =driver.findElement(By.xpath("(//span[@class=\"PropertyUsp_city__arrow_btn_txt__ow2h_\"])[1]"));
		action.scrollToElement(view).scrollByAmount(0, 100).perform();
		view.click();
		
		String win1 =driver.getWindowHandle();
		Set<String> wins = driver.getWindowHandles();
		
		wins.remove(win1);
		for(String x : wins)
		{
			System.out.println(x);
			driver.switchTo().window(x);
		}
		
		driver.findElement(By.xpath("//img[@alt='wishlist']")).click();
		
		
	

	}

}
