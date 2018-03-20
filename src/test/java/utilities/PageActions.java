package utilities;


import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {
	private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

	public static void click(WebElement webElement) {
		
		webElement = wait.until(elementToBeClickable(webElement));
		webElement.click();
	}
	
	public static void waitUntilElementIsVisible(WebElement webElement) {
			
	
	}
		
	public static boolean IsElementPresent(WebElement el) {
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


	

