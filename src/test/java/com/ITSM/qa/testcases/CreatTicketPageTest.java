package com.ITSM.qa.testcases;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ITSM.qa.base.TestBase;
import com.ITSM.qa.pages.CreatTicketPage;
import com.ITSM.qa.pages.HomePage;
import com.ITSM.qa.pages.IncidentManagementPage;
import com.ITSM.qa.pages.LogInPage;

//import io.netty.handler.timeout.TimeoutException;

public class CreatTicketPageTest extends TestBase{
	
	LogInPage loginPage;
	HomePage homePage;
	CreatTicketPage creatTicketPage;
	IncidentManagementPage incidentmanagementPage;

	public CreatTicketPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void SetUp() throws NullPointerException, IOException ,IllegalStateException{
		initialization();
		loginPage =new LogInPage();
		homePage=new HomePage();
		creatTicketPage=new CreatTicketPage();
		}
	
	@Test(priority=1)
    public void CreateTicket() throws IOException, InterruptedException ,CancellationException ,TimeoutException{
		homePage = loginPage.Login(prop.getProperty("Email"),prop.getProperty("Password"));
		creatTicketPage=homePage.Home();
		//incidentmanagementPage=creatTicketPage.CreatTicket();
	}
	
	@AfterMethod
	public void tearDown() {
	//driver.quit();
}}
