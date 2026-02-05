import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDown {

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
		WebElement dropDown = driver.findElement(By.linkText("DropDown"));
		actions.moveToElement(dropDown).click().perform();
		
		WebElement multiSelect = driver.findElement(By.name("programming"));
		Select select = new Select(multiSelect);
		select.selectByIndex(1);
		actions.pause(2000).perform();
		select.selectByValue("JAVASCRIPT");
		actions.pause(3000).perform();
		select.selectByVisibleText("Java");
		actions.pause(2000).perform();
		select.deselectAll();

	}

}
