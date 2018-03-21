package com.usrdatatool.tests;

import static com.usrdatatool.utilities.Driver.getDriver;
import static com.usrdatatool.utilities.PageActions.*;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.usrdatatool.utilities.Config;
import com.usrdatatool.utilities.TestBase;

import junit.framework.Assert;


public class SmokeTestSuiteRunner extends TestBase {
  
	
  @Test
  public void smokeTest() {
		getDriver().get(Config.getProperty("Url"));
		assertTrue(homePage.isLogoDisplayed(),"HomePage Logo is not displayed");
		click(homePage.getBuildingToolLink());
		assertTrue(homePage.areReportLinksDisplayed(), "Not all report link are displayed on HomePage");
		click(homePage.getAllStatesLink());
		assertTrue(homePage.areTableTypeLinksValid(), "Table type Links Error");
		click(homePage.getStateByStateLink());
		homePage.selectStateOrStatesByIndex(6);
		homePage.selectOneOrMoreVariableGroupsByIndex(1);
		homePage.selectStartYear("2013");
		homePage.selectEndYear("2014");
		click(homePage.getGetTableButton());
		Assert.assertEquals("Colorado", homePage.getStateFromEstimatedCrimeLabelText());
		Assert.assertTrue("bulgarly coloumn is not present",IsElementPresent(homePage.getBulgarlyColumnLabel()));
		Assert.assertTrue("larceny coloumn is not present",IsElementPresent(homePage.getLarcenyColumnLabel()));
		Assert.assertTrue("motor vehicle coloumn is not present",IsElementPresent(homePage.getMvtTherfColumnLabel()));
	}

}
