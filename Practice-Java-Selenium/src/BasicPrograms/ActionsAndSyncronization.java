package BasicPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsAndSyncronization {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://vinothqaacademy.com/wait-statement/");
		driver.findElement(By.id("vtsBtn")).click();
		WebElement textBox = driver.findElement(By.id("firstname"));
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		explicitWait.until(ExpectedConditions.elementToBeClickable(textBox));
		textBox.sendKeys("Yash Agarwal");
		
		

	}

}
