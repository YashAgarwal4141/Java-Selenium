package org.Tricentis.VehicleInsuranceApp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://sampleapp.keeley.nz/101/app.php");
		driver.findElement(By.id("enterinsurantdata")).click();
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@name=\"Hobbies\"]/.."));
		String[] check = {"Speeding", "other"}; 
		for(int i =0 ; i<= check.length -1 ; i++)
		{
		for(WebElement x : checkBox)
		{
			System.out.println(x.getText());
			if(x.getText().equalsIgnoreCase(check[i]))
			{
				x.click();
			}
		}
		}
		
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\Users\\yash\\Downloads\\passportPhoto.jpg");
	}

}
