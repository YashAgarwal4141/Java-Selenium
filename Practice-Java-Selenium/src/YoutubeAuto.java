import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeAuto {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name=\"search_query\"]")).sendKeys("Hosanna", Keys.ENTER);
		driver.findElement(By.xpath("//img[contains(@class,\"ytCoreImageHost\")]")).click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(45));
		WebElement skipButton = driver.findElement(By.xpath("//button[@class=\"ytp-skip-ad-button\"]"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(skipButton));
		skipButton.click();
		
		
	}

}
