package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constant;

public class BaseClass {

	public static WebDriver driver;

	static public void setUp() {
		ConfigsReader.readProperties(Constant.CREDENTIALS_FILEPATH);
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(Constant.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		driver.get(ConfigsReader.getProperty("url"));
	}

	static public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}