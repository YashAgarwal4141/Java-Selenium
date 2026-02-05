package org.automation.VinothQaAcademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
//		File file = new File(".\\data\\VQA.properties");
//		FileInputStream fis = new FileInputStream(file);
//		
//		Properties prop = new Properties();
//		prop.load(fis);
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("url"));
		
		File excel = new File(".\\data\\EmpDetails.xlsx");
		FileInputStream fin = new FileInputStream(excel);
		
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sheet = wb.createSheet("Sheet2");
		sheet.getRow(0);
		
//		for(int i =0 ; i<4 ; i++)
//		{
//			Cell cell = row.getCell(i);
//			System.out.println(cell);
//		}
		
		
		
	
		
	}
}
