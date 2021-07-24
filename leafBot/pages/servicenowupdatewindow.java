package com.leafBot.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenowupdatewindow
	extends servicenowprojectspecficMethods{
		
		public servicenowupdatewindow(RemoteWebDriver driver, ExtentTest node){
			this.driver = driver;
			this.node = node;
			PageFactory.initElements(driver, this);		
		}
		

			
		@FindBy(how=How.XPATH,using="//a[@class='linked formlink']")
		private WebElement eledetails;
		
		public servicenowupdatewindow clickPreview()
		{//switchToFrame("gsft_main");
			click(eledetails);
			takeSnap();
			System.out.println("incident updted");
			
			return this;	
			}

		@FindBy(how=How.XPATH,using="//a[@class='linked formlink']")
		private WebElement eleassign;
		
		public servicenowupdatewindow clickPreview1()
		{//switchToFrame("gsft_main");
			click(eleassign);
			takeSnap();
			System.out.println("Incident Assigned to group:Software");
			
			return this;	
			}
		
		
		
}
