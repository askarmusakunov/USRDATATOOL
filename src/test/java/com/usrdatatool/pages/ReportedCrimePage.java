package com.usrdatatool.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usrdatatool.utilities.Driver;

public class ReportedCrimePage {
	
	
		public ReportedCrimePage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy (xpath="//h1[@class='indent']")
		WebElement ReportedCrimePageHeader;

		public WebElement getReportedCrimePageHeader() {
			return ReportedCrimePageHeader;
		}
		
		@FindBy (xpath="//a[contains(.,'thanks')]")
		WebElement popUpDecline;
		
		@FindBy (xpath="//a[@title='Single agency trends tables']")
		WebElement singleAgencyReportedCrime;
		
		@FindBy (xpath=" //a[@href='/Search/Crime/Local/TrendsInOneVarLarge.cfm']")
		WebElement oneVariableofData;
		
		
		
		public WebElement getOneVariableofData() {
			return oneVariableofData;
		}

		public WebElement getSingleAgencyReportedCrime() {
			return singleAgencyReportedCrime;
		}

		
		public WebElement getPopUpDecline() {
			return popUpDecline;
		}
	

		@FindBy(xpath="//h2[contains(., 'Data')]")
		WebElement DataWithOneVariableHeader;

		public WebElement getDataWithOneVariableHeader() {
			return DataWithOneVariableHeader;
		}
		
		public void handlepopUp(){
		try {		  
			  getPopUpDecline().click();
		  }catch(Exception e)  {
			  e.printStackTrace();
		  }
		}

		
		
}
