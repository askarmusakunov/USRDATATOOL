package com.usrdatatool.utilities;


import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	
	private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

	public static void click(WebElement webElement) {
		
		webElement = wait.until(elementToBeClickable(webElement));
		webElement.click();
	}
	
	public static boolean isElementClickable(WebElement el) {
		try {
			el = wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		}
		catch(Exception e) {
			e.getMessage();
			return false;
		}
	}
	public static boolean isLinkNavToRightPage(WebElement el, String url) {
		click(el);
		Page.sleep(2000);
		boolean bool = Driver.getDriver().getCurrentUrl().equals(url);
		Driver.getDriver().navigate().back();
		if(!bool) {
			System.err.println("Wrong page or URL");
			return false;
		}
		return true;
	}
	
	public static boolean IsElementPresent(WebElement el) {
		el = wait.until(ExpectedConditions.visibilityOf(el));
		if(el.isDisplayed())
			return true;
		else
			return false;
	}
	
	public static boolean isAlertPresent() {
		try {
			Driver.getDriver().switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch

	}
}


	

