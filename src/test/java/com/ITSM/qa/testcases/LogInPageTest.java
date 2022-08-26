package com.ITSM.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ITSM.qa.base.TestBase;
import com.ITSM.qa.pages.HomePage;
import com.ITSM.qa.pages.LogInPage;

public class LogInPageTest extends TestBase{

	
	LogInPage loginPage;
	HomePage homePage;
	
	public LogInPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void SetUp() throws NullPointerException, IOException {
		initialization();
		loginPage =new LogInPage();
	}
	
	@Test(priority=1)
	public void loginTest() throws IOException {
		homePage = loginPage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
	//driver.quit();
	}
}
