import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOfMouse {
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		WebElement dragMe = driver.findElement(By.xpath("//div[contains(text() ,'Drag Me')]"));
		WebElement dropHere = driver.findElement(By.xpath("//div[contains(text(),'Drop Here')]"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(dragMe).release(dropHere).perform();
		actions.moveToElement(dragMe).clickAndHold().moveToElement(dropHere).release().perform();
//		mouseEventPage(driver, actions);
//		actions.pause(Duration.ofSeconds(5));
//		actions.moveToElement(dragMe).clickAndHold().moveByOffset(0, -150).release().perform();
		WebElement toolTipBox = driver.findElement(By.xpath("//input[@title=\"Enter First Name\"]"));
		actions.moveToElement(toolTipBox).click().keyDown(Keys.SHIFT).sendKeys("yash agarwal").keyUp(Keys.SHIFT).perform();
		WebElement doubleClick = driver.findElement(By.id("dblclick"));
		
		actions.doubleClick(doubleClick).perform();
		if(driver.findElement(By.xpath("//p[@id = 'demo']")).isDisplayed())
		{
			System.out.println(driver.findElement(By.xpath("//p[@id = 'demo']")).getText());
		}
		
		WebElement contextClick = driver.findElement(By.id("rightclick"));
		actions.contextClick(contextClick).perform();
		
	}

}
