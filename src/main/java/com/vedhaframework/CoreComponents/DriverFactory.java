package com.vedhaframework.CoreComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vedhaframework.corecomponents.IDriverFactory;

public class DriverFactory  implements IDriverFactory {

	public WebDriver CreateWebDriver(BrowserType browser) {
		try {
			WebDriver driver= null;
			switch(browser) {
			case chrome:
				driver = new ChromeDriver();
				break;
			case edge:
				driver= new EdgeDriver();
				break;
			case firefox:
				driver=new FirefoxDriver();
				break;
				
			default:
				break;
			
			}
			return driver;
			
		}
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		 
		
	
			
		}
			
		 

}