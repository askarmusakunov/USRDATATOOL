package tests;

import static utilities.Driver.getDriver;
import static utilities.PageActions.IsElementPresent;
import static utilities.PageActions.click;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.google.common.collect.Ordering;

import junit.framework.Assert;
import utilities.Config;
import utilities.TestBase;

public class TestRunner extends TestBase {

  @Test
  public void test1() {
	  getDriver().get(Config.getProperty("baseUrl"));
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
  
  @Test
  public void test2() {
	  getDriver().get(Config.getProperty("baseUrl"));
	  homePage.selectStateOrStatesByIndex(6,1,15,20,44);
	  homePage.selectOneOrMoreVariableGroupsByIndex(1);
	  homePage.selectStartYear("2009");
	  homePage.selectEndYear("2014");
	  click(homePage.getGetTableButton());
	  Assert.assertEquals("Alabama", homePage.getStateNameTexts().get(0));
	  Assert.assertEquals("Colorado", homePage.getStateNameTexts().get(1));
	  Assert.assertEquals("Indiana", homePage.getStateNameTexts().get(2));
	  Assert.assertEquals("Maine", homePage.getStateNameTexts().get(3));
	  Assert.assertEquals("Texas", homePage.getStateNameTexts().get(4));
  }
  
  
  @Test
  public void test3() {
	  getDriver().get(Config.getProperty("baseUrl"));
	  homePage.selectAllStates();
	  int i = homePage.statesSelectBox.getAllSelectedOptions().size();
	  homePage.statesSelectBox.deselectByIndex(0);
	  boolean sorted = Ordering.natural().isOrdered(homePage.convertWebElementsToString());
	  Assert.assertEquals(52, i);
	  Assert.assertTrue(sorted);
	  
  }
  
  @AfterMethod()
  public void afterMethod() {
	  
  }



}