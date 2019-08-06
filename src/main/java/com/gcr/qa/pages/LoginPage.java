package com.gcr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory or OR
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//span[@class='ui-button-text']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//img[contains(@src,'images/admin_logo.png')]")
	WebElement gcrLogo;
	
	//Initializing the page Objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	//Actions
	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}
	
	public boolean validateGCRLogo()
	{
		return gcrLogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) 
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
