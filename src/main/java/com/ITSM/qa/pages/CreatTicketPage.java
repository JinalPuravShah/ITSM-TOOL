package com.ITSM.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ITSM.qa.base.TestBase;

public class CreatTicketPage extends TestBase{
	
	
     @FindBy(xpath="//button[@type ='button' and @class =\"MuiButton-root MuiButton-outlined "
     		+ "MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation MuiButtonBase-root px-5 css-9jspx3\"]")
     WebElement CancelButton;
     
     
     @FindBy(xpath="/html/body/div/div[1]/div/div[2]/div[2]/div/ul/li[3]/a/span[2]")
     WebElement ProblemManagement;
     
     
     @FindBy(xpath="/html/body/div/div[1]/div/div[2]/div[2]/div/ul/li[4]/a/span]")
     WebElement ProblemTicket;
     
     @FindBy(xpath="//input[@name=\"project_id\"]")
     WebElement Project;
     
     @FindBy(xpath="//input[@name=\"assign_to\"]")
     WebElement AssignTo;
     
     @FindBy(xpath="//input[@name =\"priority_id\"]")
     WebElement Priority;
     
     @FindBy(xpath="//input[@id=\"react-select-10-input\"]")
     WebElement Tags;
     
     @FindBy(xpath="//span[@id=\"react-select-11-live-region\"]")
     WebElement Observer;
     
     @FindBy(xpath="//textarea[@id=\"mui-8\"]")
     WebElement Description;
     
     
     @FindBy(xpath="//button[@id=\"mui-9\"]")
     WebElement Create;
     

	public CreatTicketPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		//driver.switchTo().frame("/html/body/div[2]/div[3]/div");
		// TODO Auto-generated constructor stub
	}
           
	public IncidentManagementPage CreatTicket() throws IOException, InterruptedException {
		//Thread.sleep(3000);
		CancelButton.click();
		ProblemManagement.click();
		 
		ProblemTicket.click();
	
		
		
		
		
		Description.sendKeys("gdfxdf");
		
		Create.click();
	    return new IncidentManagementPage();
	}
	}
	

