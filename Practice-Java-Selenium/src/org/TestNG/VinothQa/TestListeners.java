package org.TestNG.VinothQa;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends DemoSiteNavigation implements ITestListener {
	
	@Override
	public void onTestFailure( ITestResult result)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File obj = ts.getScreenshotAs(OutputType.FILE);
		File img = new File("./screenshots/VinothQafailed.png");
		try {
			FileHandler.copy(obj, img);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
