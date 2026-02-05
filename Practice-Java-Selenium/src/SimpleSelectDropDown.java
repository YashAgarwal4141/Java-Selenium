import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SimpleSelectDropDown {
	
	public static Actions mouseEventPage(WebDriver driver)
	{	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://vinothqaacademy.com/");
		Actions act = new Actions(driver);
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
		act.moveToElement(demoSites).perform();
		WebElement prac = driver.findElement(By.linkText("Practice Automation"));
		act.moveToElement(prac).perform();
		WebElement mouseEvent = driver.findElement(By.linkText("DropDown"));
		act.click(mouseEvent).perform();
		WebElement simpleDropDown = driver.findElement(By.id("simpleDropdown"));
		Select dropDown = new Select(simpleDropDown);
		List<WebElement> options = dropDown.getOptions();
		
		for(WebElement x : options) {
			String val = x.getText();
			String atrVal = x.getAttribute("value");
			System.out.println(val+" , "+atrVal);
		}
		
		dropDown.selectByIndex(2);  //London
		act.pause(2000).perform();
		dropDown.selectByValue("NY"); //NewYork
		act.pause(2000).perform();
		dropDown.selectByVisibleText("Mumbai"); //Mumbai
		
		
		return act;
		
	}
	public static void main(String[] args) 
	{
		
		Actions actions = mouseEventPage(new ChromeDriver());
		
		

	}

}
