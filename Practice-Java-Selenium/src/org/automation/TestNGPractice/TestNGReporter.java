package org.automation.TestNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReporter 
{
	@Test
	public void printingReport()
	{
		Reporter.log("Ist TestNG Program, Reporter.log", true);
	}
}
