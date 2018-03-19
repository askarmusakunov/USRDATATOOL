package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class USRDataOnline {

	public USRDataOnline() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	/**
	 * Page UCR Data Online: UCR topics:
	 * 
	 * Boxes on the left side of page
	 * 
	 * All boxes are clickable
	 * 
	 * 
	 */
	@FindBy(xpath = "//a[text()='About the UCR Program ']")
	public WebElement aboutUSRProg;

	/**
	 * next two path is inside of aboutUSRProg:
	 * 
	 */

	@FindBy(xpath = "//div[@id='11']")
	public WebElement UCROffenceDefinitons;

	@FindBy(xpath = "//div[@id='12']")
	public WebElement UCRPublications;

	@FindBy(xpath = "//a[text()='About the UCR Data Tool ']")
	public WebElement aboutUCRDataTool;

	/**
	 * next two is subboxes of aboutUCRDataTool:
	 * 
	 */

	@FindBy(xpath = "//div[@id='13']")
	public WebElement methodology;

	@FindBy(xpath = "//div[@id='15']")
	public WebElement toolsDecinionMakings;
	
	@FindBy(xpath="//a[text()='Caution Against Ranking']")
	public WebElement CausionAgainsRank;
	
      /**
       * this boxes have no subBoxes
       */
	@FindBy(xpath ="//a[contains(@onclick,'twomeasures.cfm')]")
	public WebElement TwoCrimeMeasures;
	
	@FindBy (xpath = "//a[contains(@onclick,'data')]")
	public WebElement DataQualityGuidelines;
	
	@FindBy(xpath = "//a[contains(@onclick,'faq.cfm')]")
	public WebElement FAQs;
	
	/**
	 *                Find Data:
	 * 
	 */
	@FindBy (xpath ="//a[contains(@onclick,'Search/Crime/Crime.cfm')]")
	public WebElement GoToTableBuilding;
	
	 @FindBy (xpath = "//a[contains(@onclick,'/Search/Crime/State/StatebyState.cfm')]") 
	 public WebElement NationalMVariables;
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/State/TrendsInOneVar.cfm')]")
	 public WebElement  NationalMVariable2;
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/State/OneYearofData.cfm')]")
	 public WebElement NatOrStateOneYearOfData;
	 
	 
	 /**
	  * Local law enforcement agencies(city and county)
	  */
	 @FindBy(xpath="//a[contains(@onclick,'/Search/Crime/Local/JurisbyJuris.cfm')]")
	 public WebElement OneAgencyMultipleVar;
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/Local/TrendsInOneVar.cfm')]")
	 public WebElement MultipleAgenciesOneVar;
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/Local/OneYearofData.cfm')]")
	 public WebElement oneYearOfData;
	 
	 /**
	  * Large local agencies
        (Populations of 100,000 and greater)
	  */
	
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/Local/JurisbyJurisLarge.cfm')]")
	 public WebElement OneAgencyMultVariables2; 
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/Local/TrendsInOneVarLarge.cfm')]")
	 public WebElement MultipleAgenciesOneVar2;
	 
	 @FindBy(xpath ="//a[contains(@onclick,'/Search/Crime/Local/OneYearofDataLarge.cfm')]")
	 public WebElement oneYearOfData2;
	 
	 /**
	  * 
	  *    Button "Contact Us"
	  *    It's clickable and will lead to contact page
	  */
	 
	  @FindBy(xpath ="//a[@title='Contact Us']")
	  public WebElement ButtonContactUs;
	 
	   /**
	    * Button FBI Home 
	    * it's clickable and will lead to homePage
	    */
	 
	  @FindBy(xpath ="//a[@title='FBI Home']")
	  public WebElement ButtonFBIHome;
	  /**
	    * Button UCR 
	    * it's clickable and will lead to Uniform Crime Reporting
	    */
	  
	  @FindBy(xpath ="//a[@title='UCR']")
	  public WebElement ButtonUCR;
	 
	  /**
	    * Button UCR Data Online 
	    * it's clickable and will lead to UCR Online Statistics
	    */
	  
	  @FindBy(xpath ="//a[@title='UCR Data Online']")
	  public WebElement ButtonUCRDataOnline;
	  
	   /** 
	    * Button "HomePage" on the bottom
	    * It will just update same page 
	    * 
	    */
	  @FindBy(xpath ="//a[@class='unchanged'][1]")
	  public WebElement HomePageButton;
	  
	  /**
	   * Button "Top of this page" on the bottom
	   *  It will just scroll up
	   */
	  @FindBy(xpath ="//a[@class='unchanged'][2]")
	  public WebElement ButtomTopOfThisPage;
	  
	  
	  
	  
	  
	  
	  
	  
	  
	    
}
