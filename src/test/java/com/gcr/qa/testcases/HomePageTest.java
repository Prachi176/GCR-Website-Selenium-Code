package com.gcr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.pages.CatagariesProductPage;
import com.gcr.qa.pages.HomePage;
import com.gcr.qa.pages.LoginPage;

public class HomePageTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	CatagariesProductPage catagariesproductsPage;
	
	public HomePageTest()
	{ 
		super();
	}
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
		loginpage = new LoginPage();
		catagariesproductsPage = new CatagariesProductPage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() 
	{
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "GCR Shop","Homepage Title is not matched");
	}
	
	@Test(priority=2)
	public void verifyFirstUsername() 
	{
		Assert.assertTrue(homepage.verifyCorrectusername());
	}
	
	@Test(priority=3)
	public void verifyCatagariesProductsTest() 
	{
		catagariesproductsPage =  homepage.clickOncatagarirs_productLink();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
