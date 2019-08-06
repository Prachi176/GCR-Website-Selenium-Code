package com.gcr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.TestBase;
import com.gcr.qa.pages.HomePage;
import com.gcr.qa.pages.LoginPage;

public class LoginPageTest extends TestBase 
{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{ 
		super();
	}
	
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() 
	{
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "GCR Shop");
	}
	
	@Test(priority = 2)
	public void gcrImageTest() 
	{
		boolean flag = loginpage.validateGCRLogo();
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3)
	public void loginTest() 
	{
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
}
