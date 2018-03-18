package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Page {
	
	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void verifyElementIsPresent(WebElement el) {
		Assert.assertTrue("Verify Element is present failed", el.isDisplayed());
	}
}
