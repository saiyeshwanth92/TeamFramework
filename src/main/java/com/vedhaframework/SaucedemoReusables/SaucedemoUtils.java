package com.vedhaframework.SaucedemoReusables;

import org.openqa.selenium.interactions.Actions;

import com.vedhaframework.Basetest.Basetest;
import com.vedhaframework.ObjRepository.*;
import com.vedhaframework.corecomponents.SeleniumUtils;
import com.vedhaframework.corecomponents.IDriverFactory.LocatorType;

public class SaucedemoUtils extends Basetest {
	
	public void SaucedemoLogin(SeleniumUtils seleniumUtils) {
		
		seleniumUtils.EnterText(SaucedemoLogin.getUsername(), LocatorType.xpath, property.getProperty("standard_user"));
		seleniumUtils.EnterText(SaucedemoLogin.getPassword(), LocatorType.xpath, property.getProperty("secret_sauce"));
		seleniumUtils.Click(SaucedemoLogin.getLogin(), LocatorType.id);
	}
	
	public void SaucedemoLogout(SeleniumUtils seleniumUtils) throws InterruptedException
    {
        //As logout link is hidden on the page, so using actions
        Actions action = new Actions(instance());
        seleniumUtils.Sleep();
        action.moveToElement(seleniumUtils.FindElement(SaucedemoLogout.getThreebars(), LocatorType.classname)).build().perform();
        seleniumUtils.Click(SaucedemoLogout.getLogout(), LocatorType.id);
        

}
}