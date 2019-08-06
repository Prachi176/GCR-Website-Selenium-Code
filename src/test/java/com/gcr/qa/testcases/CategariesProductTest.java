package com.gcr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.pages.CatagariesProductPage;
import com.gcr.qa.pages.HomePage;
import com.gcr.qa.pages.LoginPage;

public class CategariesProductTest extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	CatagariesProductPage catagariesproductsPage;
	
	public CategariesProductTest()
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
		homepage.clickOncatagarirs_productLink();
	}	
		
	@Test(priority=1)
	public void verifyCategoryProductPageLable() 
	{
		Assert.assertTrue(catagariesproductsPage.verifycatagariesProductlable(), "Lable is missing on the page");
	}
	
	@AfterMethod
	public void teardown()
		{
			driver.quit();
		}
    
}