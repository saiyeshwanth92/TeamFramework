package com.vedhaframework.CoreComponents;

import org.openqa.selenium.WebDriver;

public interface IDriverFactory {

	WebDriver CreateWebDriver(BrowserType browser);

	public enum LocatorType{
		id,
		name,
		classname,
		tagname,
		xpath,
		cssselector,
		linktext,
		partiallinktext
	}
	public enum BrowserType {
		chrome,
		edge,
		firefox
	}
	public enum ListItemInputType{
		value,
		text,
		index
	}
	public enum WindowType{
		window,
		tab
	}
}