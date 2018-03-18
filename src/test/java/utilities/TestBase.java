package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import static utilities.Driver.getDriver;
public class TestBase {
	
;
	
	
	@BeforeClass(alwaysRun=true)
	public void setUP() {
						
		getDriver();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();		
		getDriver().get(Config.getProperty("url"));
	}
	
	//@AfterClass(alwaysRun=true)
	public void tearDown() {
		Driver.closeDriver();
	}
	
}
