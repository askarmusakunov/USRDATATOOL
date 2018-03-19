package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;
import utilities.Page;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name="StateId")
	Select statesSelectBox;
	
	@FindBy(name="DataType")
	Select crimeTypeSelectBox;
	
	@FindBy(name="YearStart")
	Select startYearSelectBox;
	
	@FindBy(name="YearEnd")
	Select endYearSelectBox;
	
	@FindBy(name="NextPage")
	WebElement getTableButton;
	
	@FindBy(name="Cancel")
	WebElement resetButton;
	
	@FindBy(xpath="//a[contains(text(),'Revise')]")
	WebElement reviseLink;
	
	@FindBy(xpath="//a[contains(text(),'Get a different')]")
	WebElement getDifferetTableLink;
	
	@FindBy(xpath="//caption[contains(text(),'Estimated crime')]")
	WebElement estimatedCrimeLabel;
	
	@FindBy(xpath="//th[@id='pcrime1']/b/font")
	WebElement propertyCrimeLabel;
	
	@FindBy(xpath="//th[@id='larc']//font")
	WebElement larcenyColumnLabel;
	
	@FindBy(xpath="//th[@id='mvtheft']//font")
	WebElement mvtTherfColumnLabel;
	
	@FindBy(xpath="//table[contains(@title,'state level')]/tbody/tr")
	List<WebElement> crimeTableRowsByYearList;
	
	@FindBy(xpath="//table[contains(@title,'state level')]")
	List<WebElement> crimeTablesList;
	
	
	/** This method is used to select one or multiple states
	 * @param index is an int varargs
	 */
	public void selectStateOrStatesByIndex(int...index) {
		for(int i : index) {
			statesSelectBox.selectByIndex(i);
			Page.sleep(2000);
		}
	}
	
	/**
	 * This method is used to select one or more crime variable groups
	 * @param index is an int varargs
	 */
	public void selectOneOrMoreVariableGroupsByIndex(int...index) { 
		for(int i : index) {
			crimeTypeSelectBox.selectByIndex(i);
			Page.sleep(2000);
		}
	}
	
	/**
	 * This method is used to select start year by index
	 * @param index is an int varargs
	 */
	public void selectStartYear(int index) {
		startYearSelectBox.selectByIndex(index);
	}
	
	/**
	 * This method is used to select start year by visibleText
	 * @param index is an int varargs
	 */
	public void selectStartYear(String visibleText) {
		startYearSelectBox.selectByVisibleText(visibleText);
	}
	
	/**
	 * This method is used to select start year by value
	 * @param index is an int varargs
	 */
	public void selectStartYearByValue(String value) {
		
		startYearSelectBox.selectByValue(value);
	}
}
