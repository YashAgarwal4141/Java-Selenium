package org.automation.PracticeSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider
{

	public static void main(String[] args) throws IOException 
	{
		
		File demo =new File("./data/demo.properties");
		FileInputStream fis = new FileInputStream(demo);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("Chrome"));
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

}
