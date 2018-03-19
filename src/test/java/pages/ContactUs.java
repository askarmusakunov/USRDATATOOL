package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

import static utilities.Driver.getDriver;

public class ContactUs {

	private WebDriver driver;

	public ContactUs() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		;
	}

	@FindBy(linkText = "Contact Us")
	public WebElement contactUsLink;

	@FindBy(xpath = "//h2[.='Contact Us']")
	public WebElement contactUsHeader;

	@FindBy(tagName = "p")
	public WebElement contactAddress;

	public boolean contactDisplayed() {
		contactUsLink.click();
		try {
			if (contactUsHeader.isDisplayed())
				;
			System.out.println("Contact Us is visible");
			System.out.println(contactAddress.getText());
			return true;
		} catch (Exception e) {
			System.out.println("Contact Us is not visible");
		}
		return false;
	}

}
