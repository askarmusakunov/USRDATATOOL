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
			popUpDecline.click();
		  }catch(Exception e)  {
			  e.printStackTrace();
		  }
		}

		
		
}
