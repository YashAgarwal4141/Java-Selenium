package BasicPrograms;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalDateTimeOperations {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://sampleapp.keeley.nz/101/app.php");
		driver.findElement(By.id("nav_automobile")).click();
		driver.findElement(By.id("enterproductdata")).click();
		driver.findElement(By.id("openstartdatecalender")).click();
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime req = LocalDateTime.of(ldt.getYear(), ldt.getMonthValue()+1, ldt.getDayOfMonth() +1, ldt.getHour(), ldt.getMinute());
		System.out.println(req.getDayOfMonth()+"\n"+req.getMonth().toString());
		
		boolean flag =true;
		while(flag)
		{
			WebElement year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			if(!year.getText().equalsIgnoreCase(String.valueOf(req.getYear())))
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			else if(!month.getText().equalsIgnoreCase(req.getMonth().toString()))
			{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			else 
			{
				driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and text() = '"+req.getDayOfMonth()+"']")).click();
				flag = false;
			}
		}
		
		String product = "Euro Protection";
		if(product.equalsIgnoreCase("Euro Protection"))
		{
			driver.findElement(By.xpath("(//input[@name='Optional Products[]']/..)[1]")).click();
		}
		else
		{
			driver.findElement(By.xpath("(//input[@name='Optional Products[]']/..)[2]")).click();
		}
	}

}
