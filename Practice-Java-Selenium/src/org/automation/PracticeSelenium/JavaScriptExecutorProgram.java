package org.automation.PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorProgram {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions max = new ChromeOptions();
		max.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(max);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.cars24.com/sell-used-cars/");
		WebElement carNum = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		//SendKeys Using java script executor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(4000);
		jse.executeScript("arguments[0].value = 'mh26ax0951';", carNum);
		
		//Click action using JSE
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click()", driver.findElement(By.xpath("//img[@data-title='Maruti Suzuki']/..")));
	
		//scroll Action using JSE
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//h3[text() = 'Instant']/../..")));

	}

}

