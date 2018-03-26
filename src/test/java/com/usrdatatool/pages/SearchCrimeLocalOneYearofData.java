package com.usrdatatool.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.usrdatatool.utilities.Driver;

public class SearchCrimeLocalOneYearofData{
	
	public SearchCrimeLocalOneYearofData() {
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy(name="NextPage")
	public WebElement nextBtn;
	
	@FindBy(name="BJSPopulationGroupId")
	public WebElement groupId;
	
	@FindBy(name="CrimeCrossId")
	WebElement cross;
	public Select crimeCrossBox;
	
//	@FindBy(xpath="//caption[contains(text(),'Crime in')]")
//	WebElement crimeYear;
	
	
	
	public WebElement getNextBtn() {
		return nextBtn;
	}
	
//	public void getGroupId(String value) {
//		Select group = new Select(groupId);
//		group.selectByVisibleText(value);
//	}
	
	public void getCrossId(int...index) {
		for(int i : index) {
			crimeCrossBox = new Select(cross);
			crimeCrossBox.selectByIndex(i);
		}
	}
	
//	public String getCrimeYear() {
//		String str = crimeYear.getText().substring(9);
//		return str;
//	}
	}

