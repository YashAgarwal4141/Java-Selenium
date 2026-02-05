import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopUp {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//div[@id=\"date-box\"]")).click();
		
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String month = ldt.getMonth().toString();
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class, 'DayNavigator')])[3]"));
		System.out.println(element.getText().split(" ")[0]);
		String mon = element.getText().split(" ")[0];
		WebElement element2 = driver.findElement(By.xpath("(//div[contains(@class, 'DayNavigator')])[5]"));
		String mon2 = element2.getText().split(" ")[0];
		if(mon.equalsIgnoreCase(month))
		{
			driver.findElement(By.xpath("//span[text() = '"+date+"']/../../../..//div[contains(text(),'"+mon+"')]/../..//span[text() = '"+date+"']")).click();
			System.out.println("Same");
		}else if(mon2.equalsIgnoreCase(month)){
			driver.findElement(By.xpath("//span[text() = '"+date+"']/../../../..//div[contains(text(),'"+mon2+"')]/../..//span[text() = '"+date+"']")).click();
			System.out.println(("Not found"));
		}

	}

}
