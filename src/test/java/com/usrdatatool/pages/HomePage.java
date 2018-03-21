package com.usrdatatool.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.usrdatatool.utilities.Driver;


public class HomePage {
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//img[@alt='FBI kiosk banner']")
	WebElement banner;
	
	@FindBy(name="StateId")
	WebElement states;
	public Select statesSelectBox;
	
	@FindBy(name="DataType")
	WebElement dataType;
	Select crimeTypeSelectBox;
	
	@FindBy(name="YearStart")
	WebElement yearStart;
	Select startYearSelectBox;
	
	@FindBy(name="YearEnd")
	WebElement yearEnd;
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
	
	List<WebElement> estimatedCrimeLabelList;
	
	@FindBy(xpath="//th[@id='pcrime1']/b/font")
	WebElement propertyCrimeLabel;
	
	@FindBy(xpath="//th[@id='larc']//font")
	WebElement larcenyColumnLabel;
	
	@FindBy(xpath="//th[@id='burg']//font")
	WebElement burgarlyColumnLabel;
	
	@FindBy(xpath="//th[@id='mvtheft']//font")
	WebElement mvtTherfColumnLabel;
	
	@FindBy(xpath="//table[contains(@title,'state level')]/tbody/tr")
	List<WebElement> crimeTableRowsByYearList;
	
	@FindBy(xpath="//table[contains(@title,'state level')]")
	List<WebElement> crimeTablesList;
	
	@FindBy(xpath="//div/a/strong[contains(text(),'table-building')]")
	WebElement buildingToolLink;
	
	@FindBy(xpath="//a/strong[contains(text(),'states')]")
	WebElement allStatesLink;
	
	@FindBy(xpath="//blockquote/table[@class='tblMain']")
	WebElement mainTable;
	
	public WebElement getMainTable() {
		return mainTable;
	}
	public WebElement getAllStatesLink() {
		return allStatesLink;
	}
	public WebElement getGetTableButton() {
		return getTableButton;
	}
	public WebElement getBuildingToolLink() {
		return buildingToolLink;
	}
	public WebElement getMvtTherfColumnLabel() {
		return mvtTherfColumnLabel;
	}
	public WebElement getLarcenyColumnLabel() {
		return larcenyColumnLabel;
	}
	public WebElement getBulgarlyColumnLabel() {
		return burgarlyColumnLabel;
	}
	
	public List<String> getStateNameTexts(){
		
		List<WebElement> statesElement = Driver.getDriver().findElements(By.xpath("//caption[contains(text(),'Estimated crime')]"));
		List<String> strStatesList = new ArrayList<String>();
		for(WebElement el : statesElement) {
			strStatesList.add(el.getText().substring(19));
		}
		return strStatesList;
	}
	
	public String getStateFromEstimatedCrimeLabelText() {
		String str = estimatedCrimeLabel.getText().substring(19);
		return str;
	}
	
	/** This method is used to select one or multiple states
	 * @param index is an int varargs
	 */
	public void selectStateOrStatesByIndex(int...index) {
		for(int i : index) {
			statesSelectBox = new Select(states);
			statesSelectBox.selectByIndex(i);
		}
	}
	
	/**
	 * This method is used to select one or more crime variable groups
	 * @param index is an int varargs
	 */
	public void selectOneOrMoreVariableGroupsByIndex(int...index) { 
		for(int i : index) {
			crimeTypeSelectBox = new Select(dataType);
			crimeTypeSelectBox.selectByIndex(i);
		
		}
	}
	
	/**
	 * This method is used to select start year by index
	 * @param index is an int varargs
	 */
	public void selectStartYear(int index) {
		startYearSelectBox = new Select(yearStart);
		startYearSelectBox.selectByIndex(index);
	}
	
	/**
	 * This method is used to select start year by visibleText
	 * @param index is an int varargs
	 */
	public void selectStartYear(String visibleText) {
		startYearSelectBox = new Select(yearStart);
		startYearSelectBox.selectByVisibleText(visibleText);
	}
	
	/**
	 * This method is used to select start year by value
	 * @param index is an int varargs
	 */
	public void selectStartYearByValue(String value) {
		startYearSelectBox = new Select(yearStart);
		startYearSelectBox.selectByValue(value);
	}
	
	/**
	 * This method is used to select start year by index
	 * @param index is an int varargs
	 */
	public void selectEndYear(int index) {
		endYearSelectBox = new Select(yearEnd);
		endYearSelectBox.selectByIndex(index);
	}
	
	/**
	 * This method is used to select end year by visibleText
	 * @param index is an int varargs
	 */
	public void selectEndYear(String visibleText) {
		endYearSelectBox = new Select(yearEnd);
		endYearSelectBox.selectByVisibleText(visibleText);
	}
	
	public boolean isLogoDisplayed() {
		return banner.isDisplayed();
	}
	
	public void selectAllStates() {
		  for(int i = 0; i <52; i++) {
			  selectStateOrStatesByIndex(i);
		  }
	}
	
	public List<String> convertWebElementsToString() {
		List<WebElement> selectedOptions = statesSelectBox.getAllSelectedOptions();
		List<String> strList = new ArrayList<String>();
		for(WebElement wl : selectedOptions) {
			strList.add(wl.getText());
		}
		return  strList;
	}


}
