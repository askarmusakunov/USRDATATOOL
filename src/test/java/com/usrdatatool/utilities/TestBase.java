package com.usrdatatool.utilities;

import static com.usrdatatool.utilities.Driver.getDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.usrdatatool.pages.HomePage;
import com.usrdatatool.pages.ReportedCrimePage;
import com.usrdatatool.pages.SearchCrimeLocalOneYearofData;
public class TestBase {
	
	protected HomePage homePage;
	protected ReportedCrimePage reportedCrimePage;
	protected SearchCrimeLocalOneYearofData localOneYearData;
	
	@BeforeClass(alwaysRun=true)
	public void setUP() {
		homePage = new HomePage();
		reportedCrimePage= new ReportedCrimePage();
		getDriver();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		Page.sleep(10000);
		Driver.closeDriver();
	}
	
}
