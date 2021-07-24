package com.leafBot.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenowassignpage
	extends servicenowprojectspecficMethods{
		
		public servicenowassignpage(RemoteWebDriver driver, ExtentTest node){
			this.driver = driver;
			this.node = node;
			PageFactory.initElements(driver, this);		
		}
		
			
		@FindBy(how=How.XPATH,using="//input[@class='form-control']")
		private WebElement elelookdetails;
		
		public servicenowassignpage searchlookup(String data)
		{
			switchToWindow(1);
			System.out.println("childWindow opened");
			elelookdetails.sendKeys(data,Keys.ENTER);
		return this;	
		}

		@FindBy(how=How.LINK_TEXT,using="Software")
		private WebElement eleclick;
		
		public servicenowupdateincident selectgrp()
		{ 
			click(eleclick);
			switchToWindow(0);
			switchToFrame("gsft_main");
		return new servicenowupdateincident(driver,node);	
		}	
		
		@FindBy(how=How.LINK_TEXT,using="ITIL User")
		private WebElement eleclick1;
		
		public servicenowupdateincident selectgrp1()
		{ switchToWindow(1);
			click(eleclick1);
			switchToWindow(0);
			switchToFrame("gsft_main");
		return new servicenowupdateincident(driver,node);	
		}	
		
		
		
		
		
		
		
		
}
//*[@id="row_sys_user_group_8a4dde73c6112278017a6a4baf547aa7"]/td[3]/a