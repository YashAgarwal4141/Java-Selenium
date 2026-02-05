import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalScroll {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starquik.com/");
		WebElement homeCare =  driver.findElement(By.xpath("//span[text() = 'Home Care']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(homeCare).pause(1000).moveByOffset(0, -300).click().perform();
		//pause(1000).scrollByAmount(-200, 0).perform();

	}

}
