package org.Automation.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/drop-down/");
		
		//Simple Drop down
//		WebElement simpleDropDown = driver.findElement(By.id("simpleDropdown"));
//		Select simpleOpt = new Select(simpleDropDown);
//		System.out.println(simpleOpt.isMultiple());
//		simpleOpt.selectByIndex(1);
//		Thread.sleep(2000);
//		simpleOpt.selectByValue("CH");
//		Thread.sleep(2000);
//		simpleOpt.selectByVisibleText("London");
//		List<WebElement> li = simpleOpt.getOptions();
//		for(WebElement x : li)
//		{
//			System.out.println(x.getAttribute("value") + " " +x.getText());
//		}
//		
		//Multi drop down
		WebElement mDD=driver.findElement(By.xpath("//select[@name='programming']"));
		Select multi = new Select(mDD);
		
		System.out.println(multi.isMultiple());
		List<WebElement> options = multi.getOptions();
		for(WebElement opt : options)
		{
			System.out.println(opt.getAttribute("value") +"  =  "+ opt.getText());
		}
		
		multi.selectByIndex(0);
		multi.selectByValue("PYTHON");
		multi.selectByVisibleText("JavaScript");
		
		multi.selectByIndex(2);
		multi.selectByIndex(4);
		
		List<WebElement> selected = multi.getAllSelectedOptions();
		for(WebElement sel : selected)
		{
			System.out.print("\n"+sel.getText());
		}
		
		multi.deselectByIndex(2);
		multi.deselectByValue("PHP");
		multi.deselectByVisibleText("Python");
		Thread.sleep(3000);
		
		System.out.println("\n"+multi.getFirstSelectedOption().getText());
		multi.deselectAll();
		
	}

}
