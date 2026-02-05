package org.TestNG.VinothQa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegistrationForm extends DemoSiteNavigation
{
	@FindBy(id = "vfb-7") public WebElement lastName; 
	@FindBy(id = "vfb-13-address") public WebElement address;
	@FindBy(xpath = "//label[ text() = 'Male']") public WebElement gender;
	@FindBy(xpath = "//label[ text() = 'Selenium WebDriver']") public WebElement checkBox;
	@FindBy(xpath = "//select[@id = \"vfb-13-country\"]/..//span") public WebElement country;
	@FindBy(className = "select2-search__field") public WebElement searchTf;
	@FindBy(xpath = "//li[ text() = 'India']") public WebElement option;
	
	
	
	@Test(priority = 1)
	public void textFields()
	{
		driver.findElement(By.xpath("(//a[ text() = 'Registration Form'])[2]")).click();
		driver.findElement(By.id("vfb-5")).sendKeys("VinothQa");
		PageFactory.initElements(driver,this);
		lastName.sendKeys("Academy");
		address.sendKeys("Gokul Dham Society");
		
	}
	
	@Test(priority = 2)
	public void radioAndChecks() throws AWTException
	{
		gender.click();
		checkBox.click();
		
		Robot robot = new Robot();
		for(int i = 0; i <= 2 ; i++)
		{
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		}
	}
	
	@Test(priority = 3)
	public void dateAndDropDown()
	{
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		country.click();
		searchTf.sendKeys("India");
		option.click();
		
	}
}


