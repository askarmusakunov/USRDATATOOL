package com.usrdatatool.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
			switch (Config.getProperty("browser").toLowerCase()) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "chrome":
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				option.addArguments("--disable-infobars");
				option.addArguments("--start-fullscreen");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(option);
				break;
				
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
				
			case "safari":
				driver = new SafariDriver();
				break;
				
			default:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("--disable-infobars");
				options.addArguments("--start-fullscreen");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}
