package com.gcr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath = "//td[contains(text(),'Logged in as: admin (')]")
	WebElement usernameLable;
	
	@FindBy(xpath = "//a[contains(text(),'Categories/Products')]")
	WebElement catagarirs_productLink;
	
	@FindBy(xpath = "//a[contains(text(),'Manufacturers')]")
	WebElement manufacturers_link;
	
	@FindBy(xpath = "//a[contains(text(),'Reviews')]")
	WebElement reviews_link;
	
	//Initializing the page Objects
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() 
		{
			return driver.getTitle();
		}
		
		public boolean verifyCorrectusername() 
		{
			return usernameLable.isDisplayed();
		}
		
		public CatagariesProductPage clickOncatagarirs_productLink() 
		{
			catagarirs_productLink.click();
			return new CatagariesProductPage();
		}
		
		public ManufacturersPage clickOnManufacturersLink() 
		{
			catagarirs_productLink.click();
			return new ManufacturersPage();
		}
		
		public ReviewsPage clickOnReviewsLink() 
		{
			reviews_link.click();
			return new ReviewsPage();
		}
}
