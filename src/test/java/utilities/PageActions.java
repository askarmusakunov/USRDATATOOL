package utilities;


import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageActions {
	private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

	public static void click(WebElement webElement) {
		
		webElement = wait.until(elementToBeClickable(webElement));
		webElement.click();
	}
	
	public static void waitUntilElementIsVisible(WebElement webElement) {

		
	
	}
		
	public static void verifyElementIsPresent(WebElement el) {
		Assert.assertTrue(el.isDisplayed(),"Verify Element is present failed");
	}
}


	

