package org.automation.TestNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityProgram 
{
	@Test(priority = 1, enabled = true, dependsOnMethods = {"apple","ball"})
	public void cat()
	{
		Reporter.log("Cat Method", true);
	}
	
	@Test(priority = 3, enabled = true, invocationCount = 2, timeOut =2000 )
	public void apple()
	{
		Reporter.log("Apple Method", true);
	}
	
	@Test(priority = 2)
	public void ball()
	{
		Reporter.log("Ball method", true);
	}
	
	
	
}
