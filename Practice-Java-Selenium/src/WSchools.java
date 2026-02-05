import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class WSchools {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//673,213
		//Actions actions = new Actions(driver);
		//actions.moveByOffset(673, 213).click().perform();
		driver.switchTo().frame(0).findElement(By.xpath("//button[text() = 'Try it']")).click();
		
		driver.switchTo().alert().sendKeys("Yash Agarwal");
		driver.switchTo().alert().accept();
		

	}

}
