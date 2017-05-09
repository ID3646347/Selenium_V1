package com.adactin.pageclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	static WebDriver driver;
	Base(){
		if(driver==null){
			System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("firefox");
			driver = new RemoteWebDriver(dc);
			//driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			openUrl("http://adactin.com/HotelApp/");
		}
	}
	
//	Base(){
//		if(driver==null){
//			System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
//			driver = new FirefoxDriver();
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			openUrl("http://adactin.com/HotelApp/");
//		}
//	}
	
	public void openUrl(String text){
		driver.get(text);
	}

}
