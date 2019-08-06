package com.gcr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class CatagariesProductPage extends TestBase 
{
	@FindBy(xpath = "//td[contains(text(),'Categories / Products')and @class='pageHeading']")
	WebElement catagariesProductlable;
	
	//Initializing the page Objects
		public CatagariesProductPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public boolean verifycatagariesProductlable() 
		{
			return catagariesProductlable.isDisplayed();
		}
}
