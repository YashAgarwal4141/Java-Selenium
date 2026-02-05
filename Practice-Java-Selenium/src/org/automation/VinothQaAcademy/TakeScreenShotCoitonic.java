package org.automation.VinothQaAcademy;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotCoitonic {

	public static void main(String[] args) throws IOException 
	{
		
		LocalDateTime ldt = LocalDateTime.now();
		String time = ldt.toString().replaceAll(":","_");
		System.out.println(time);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://coitonic.com/collections/compression-fit");
		
		//page Screenshot
		Object s = (TakesScreenshot)driver;
		TakesScreenshot ss = (TakesScreenshot)s;
		File doc = ss.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./screenshots/coitonic"+time+".png");
		FileHandler.copy(doc, permanent);
		
		//Web Element screenshot
		WebElement prod = driver.findElement(By.xpath("//div[@class=\"t4s-product-wrapper\"]//span[contains(text(),' Beige')]/../..//a[contains(text(),'Compression Half Sleeves T-shirt')]/../../../../.."));
		FileHandler.copy(prod.getScreenshotAs(OutputType.FILE), new File("./screenshots/prod"+time+".png") );
	}

}
