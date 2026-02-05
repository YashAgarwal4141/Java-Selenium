package org.automation.VinothQaAcademy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerCalendar {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Demo Sites"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Practice Automation"))).perform();
		actions.moveToElement(driver.findElement(By.linkText("Date Picker Calendar"))).click().perform();
		
		driver.findElement(By.id("dateBig")).click();
		
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		//String month = ldt.getMonth().toString();
		String month = "October";
		
		//String mon = driver.findElement(By.id("m1-title")).getText().split(" ")[0];
		//System.out.println(mon.toLowerCase());
		boolean flag = true;
		while(flag == true)
		{	
			String[] mon = driver.findElement(By.id("m1-title")).getText().split(" ");
			if(mon[0].equalsIgnoreCase(month))
			{
				driver.findElement(By.xpath("//div[@id='m1']//div[contains(@class , 'cell') and @data-date='"+date+"']")).click();
				System.out.println(Arrays.toString(mon));
				flag = false;
			}
			else
			{
				driver.findElement(By.id("nextBtn")).click();
			}
		}
		
		
		actions.pause(5000).perform();
		driver.close();
	}

}
