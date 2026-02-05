package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementLoadWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Wait WebElement"))).click().perform();
		
		driver.findElement(By.xpath("//button[text() = 'Click Me To View Text Box']")).click();
		WebElement textBox = driver.findElement(By.id("firstname"));
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		//textBox.sendKeys("Yash Agarwal");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Yash Agarwal'", textBox);
		
		
		driver.close();

	}

}
