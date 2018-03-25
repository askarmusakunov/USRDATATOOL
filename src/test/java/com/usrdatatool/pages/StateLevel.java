package com.usrdatatool.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usrdatatool.utilities.Driver;

public class StateLevel {
	
	
	public StateLevel() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
		
		@FindBy(xpath="//img") 
		public WebElement image;
		
		@FindBy(linkText = "FBI Home")
		public WebElement fbiHome;
		
		@FindBy(xpath="//a[@href='https://ucr.fbi.gov/word/']")
		public WebElement UCR;
		
		@FindBy(xpath="//a[@href='/index.cfm']")
		public WebElement UCRDataOnline;
		
		@FindBy(xpath="//a[@href='/Search/Crime/Crime.cfm']")
		public WebElement reportedCrime;
		
		@FindBy(linkText = "Contact Us")
		public WebElement contactUsLink;
		
		@FindBy(className="//*[@class='indent']")
		public WebElement stateAndNatCrimeText;
		
		@FindBy(xpath="//a[@title='Links to the FBI website, a government agency']")
		public WebElement fbiCrimeReport;
		
		//UCR offenses 
		
		@FindBy(linkText="//*[.='UCR Offense Definitions']")
		public WebElement ucrOffenceDefinition;
		
		//State by state and
		//national estimates
		
		@FindBy(linkText="//*[.='Data with one variable']")
		public WebElement dataWithOneVariable;
		
		//one year of data
		
		@FindBy(linkText="//*[.='Home page']")
		public WebElement homePage;
		
		@FindBy(linkText="//*[.='Top of this page']")
		public WebElement topOfThisPage;
		
		@FindBy(linkText="eRulemaking")
		public WebElement eRulemaking;
		
		
		
		
		
	
}
