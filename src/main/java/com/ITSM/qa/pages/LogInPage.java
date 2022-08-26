package com.ITSM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ITSM.qa.base.TestBase;
import com.ITSM.qa.pages.HomePage;

public class LogInPage extends TestBase{

	

	@FindBy(xpath="//*[@id=\"mui-1\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"mui-2\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"mui-3\"]")
	WebElement LogIn;
	
	
	
	public LogInPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public HomePage Login(String mail,String pwd) throws IOException {
		 Email.sendKeys(mail);
         Password.sendKeys(pwd);
		 LogIn.click(); 
		return new HomePage();
	 }
}
