package com.ITSM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ITSM.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="/html/body/div/div[1]/div/div[2]/div[2]/div/ul/li[2]/a/span[2]")
	WebElement IncidentManagement;
	
	@FindBy(xpath=" //button[@type ='button' and @class ='MuiButtonBase-root MuiIconButton-root "
			+ "MuiIconButton-sizeMedium Toolbar__container-action css-1yxmbwk']")
    WebElement Add;
	
	
	
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	public CreatTicketPage Home() throws IOException {
		
		IncidentManagement.click();
		Add.click();
		return new CreatTicketPage();
	}

}
