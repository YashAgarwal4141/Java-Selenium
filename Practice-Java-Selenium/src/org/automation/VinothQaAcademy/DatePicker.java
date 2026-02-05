package org.automation.VinothQaAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		WebElement demoSites= driver.findElement(By.linkText("Demo Sites"));
		actions.moveToElement(demoSites).perform();
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		actions.moveToElement(practiceAutomation).perform();
		WebElement datePicker = driver.findElement(By.linkText("Date Picker Calendar"));
		actions.moveToElement(datePicker).click().perform();
		
		driver.findElement(By.id("dateCard")).click();
		String month = "December";
		int date = 1;
		String month1 = driver.findElement(By.id("m0")).getText().split(" ")[0];
		
		while(!month1.equals(month))
		{
			driver.findElement(By.id("nextBtn")).click();
			if(month.equals(driver.findElement(By.id("m0")).getText().split(" ")[0]))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//div[@id = 'm0']//div[text() = '"+date+"' and @class != 'cell out']")).click();
//		String month2 = driver.findElement(By.id("m1")).getText().split(" ")[0];
//		for(int i = 0; i <= 9; i++)
//		{
//			if(month1.equals(month))
//			{
//				System.out.println(month);
//				driver.findElement(By.xpath("//div[@id = 'm0']//div[text() = '"+date+"' and @class != 'cell out']")).click();
//				break;
//			}
//			else if(month2.equals(month))
//			{	
//				System.out.println(month);
//				driver.findElement(By.xpath("//div[@id = 'm1']//div[text() = '"+date+"' and @class != 'cell out']")).click();
//				break;
//			} 
//			else 
//			{
//				driver.findElement(By.id("nextBtn")).click();
//			}
		//}
		
		

	}

}
