package org.Tricentis.VehicleInsuranceApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automobile {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://sampleapp.keeley.nz/101/app.php");
//Vehicle Data Entry		
		driver.findElement(By.linkText("Automobile")).click();
		WebElement make = driver.findElement(By.id("make"));
		
		Select select = new Select(make);
		select.selectByVisibleText("Skoda");
		
		driver.findElement(By.id("engineperformance")).sendKeys("116");
		driver.findElement(By.id("opendateofmanufacturecalender")).click();
		
		boolean flag = true;
		while(flag)
		{
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			if(!year.equals("2024"))
			{
				driver.findElement(By.xpath("//a[@title=\"Prev\"]")).click();
			}
			else
			{
				
				flag = false;
			}
		}
		flag = true;
		while(flag)
		{
			String month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			if(!month.equalsIgnoreCase("June"))
			{
				driver.findElement(By.xpath("//a[@title=\"Prev\"]")).click();
			}
			else
			{
				driver.findElement(By.xpath("//a[@class=\"ui-state-default\" and contains(text(), '12')]")).click();
				flag = false;
			}
		}
		
		WebElement seats = driver.findElement(By.id("numberofseats"));
		Select seatsCount = new Select(seats);
		seatsCount.selectByVisibleText("4");
		
		Select fuel = new Select(driver.findElement(By.id("fuel")));
		fuel.selectByVisibleText("Petrol");
		
		driver.findElement(By.id("listprice")).sendKeys("98000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys(("mh12se1234").toUpperCase());
		driver.findElement(By.id("annualmileage")).sendKeys("11000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		
//Enter Insurant Data
		Actions actions = new Actions(driver);
		WebElement fristName = driver.findElement(By.id("firstname"));
		WebElement lastName = driver.findElement(By.id("lastname"));
		WebElement zipCode = driver.findElement(By.id("zipcode"));
		WebElement street = driver.findElement(By.id("streetaddress"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement website = driver.findElement(By.id("website"));
		
		actions.sendKeys(fristName, "Yash").sendKeys(lastName, "Agarwal").sendKeys(zipCode, "411033").sendKeys(street, "Hinjewaji")
		.sendKeys(city, "Pune").sendKeys(website, "www.google.com").perform();
		
		
		String gender = "male";

		if(gender.equalsIgnoreCase("male"))
		{	
			
			driver.findElement(By.xpath("(//label[@class=\"ideal-radiocheck-label\"])[1]")).click();
		}
		else
		{	
			
			driver.findElement(By.xpath("(//label[@class=\\\"ideal-radiocheck-label\\\"])[2]")).click();
		}
		
		driver.findElement(By.id("opendateofbirthcalender")).click();
		flag = true;
		while(flag)
		{
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			if(!year.equalsIgnoreCase("2006"))
			{
				driver.findElement(By.xpath("//a[@title = 'Prev']")).click();
			}
			else if(!driver.findElement(By.className("ui-datepicker-month")).getText().equalsIgnoreCase("December"))
			{
				actions.click(driver.findElement(By.xpath("//a[@title = 'Prev']"))).perform();
			}else
			{   int date = 20;
				driver.findElement(By.xpath("//a[@class='ui-state-default' and text() = '"+date+"']")).click(); //date = 20
				flag = false;
			}
		}
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		
		String[] hobby = {"speeding", "Other"};
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@name=\"Hobbies\"]/.."));
		for(int i = 0; i <= hobby.length-1; i++)
		{
			for(WebElement x : checkBox)
			{
				if(x.getText().equalsIgnoreCase(hobby[i]))
				{
					x.click();
				}
			}
		}
		
		Select coccupation = new Select(driver.findElement(By.id("occupation")));
		coccupation.selectByVisibleText("Employee");
		
		driver.findElement(By.xpath("//input[@type = 'file']")).sendKeys("C:\\Users\\yash\\Downloads\\passportPhoto.jpg");
		driver.findElement(By.id("nextenterproductdata")).click();
		
		
//Enter Product Data
		WebElement insuranceSum = driver.findElement(By.id("insurancesum"));
		Select insureSum = new Select(insuranceSum);
		insureSum.selectByIndex(2);
		
		WebElement merit = driver.findElement(By.id("meritrating"));
		Select meritRating = new Select(merit);
		meritRating.selectByValue("Bonus 4");
		
		WebElement damageInsur = driver.findElement(By.id("damageinsurance"));
		Select damageInsurance = new Select(damageInsur);
		damageInsurance.selectByVisibleText("Full Coverage");
		
		WebElement courtsey = driver.findElement(By.id("courtesycar"));
		Select cc = new Select(courtsey);
		cc.selectByVisibleText("No");
		
		driver.findElement(By.id("openstartdatecalender")).click();
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime req = LocalDateTime.of(ldt.getYear(), ldt.getMonthValue()+1, ldt.getDayOfMonth() +1, ldt.getHour(), ldt.getMinute());
		System.out.println(req.getDayOfMonth()+"\n"+req.getMonth().toString());
		
		flag =true;
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
		
		driver.findElement(By.id("nextselectpriceoption")).click();	
		
		
		String priceOption = "Platinum";
		List<WebElement> options = driver.findElements(By.xpath("//table[@id=\"priceTable\"]//label//input"));
		
		for(WebElement x: options )
		{	
			String value = x.getAttribute("value");
			if(value.equals(priceOption))
			{
				driver.findElement(By.xpath("//table[@id='priceTable']//label//input[@value = '"+value+"']/..")).click();
			}
		}
		
		driver.findElement(By.id("nextsendquote")).click();
		
		//Send Quote
		driver.findElement(By.id("email")).sendKeys("yashagarwal2097@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9511637395");
		driver.findElement(By.id("username")).sendKeys("YashAgarwal2097");
		driver.findElement(By.id("password")).sendKeys("Yash@1230");
		driver.findElement(By.id("confirmpassword")).sendKeys("Yash@1230");
		driver.findElement(By.id("Comments")).sendKeys("Thankyou ....!!!!!");
		
		driver.findElement(By.id("sendemail")).click();
		
	}

}
