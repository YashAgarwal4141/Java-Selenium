package org.automation.VinothQaAcademy;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TransactionDetailsSS {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Transaction Details"))).click().perform();
		
		LocalDateTime ldt = LocalDateTime.now();
		String currentTime = ldt.toString().replace(":", "_");
		TakesScreenshot ss = (TakesScreenshot)driver;

		File screenshot = ss.getScreenshotAs(OutputType.FILE); //Temporary
		File dest = new File("./screenshots/"+currentTime+"screenshot.png"); //creating a png file
		FileHandler.copy(screenshot, dest);
		
		driver.navigate().refresh();
		WebElement transaction = driver.findElement(By.id("messageContainer"));
		
		File tss = transaction.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshots/"+currentTime+"Tss.png");
		FileHandler.copy(tss, dest1);

	}


}
