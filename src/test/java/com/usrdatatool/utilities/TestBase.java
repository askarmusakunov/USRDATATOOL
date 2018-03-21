package com.usrdatatool.utilities;

import static com.usrdatatool.utilities.Driver.getDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.usrdatatool.pages.HomePage;
public class TestBase {
	
	protected HomePage homePage;
	
	@BeforeClass(alwaysRun=true)
	public void setUP() {
		homePage = new HomePage();
		getDriver();
		getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		Page.sleep(15000);
		Driver.closeDriver();
	}
	
}
