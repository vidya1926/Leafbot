package com.leafBot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

import cucumber.api.java.en.Given;



public class servicenowloginpage extends servicenowprojectspecficMethods{
	
	public servicenowloginpage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}
	 
	@FindBy(how=How.ID,using="user_name")
	private WebElement eleUserName;	
	
	@FindBy(how=How.ID,using="user_password")
	private WebElement elePassword;	
	
	
	@FindBy(how=How.ID,using="sysverb_login")
	private WebElement eleLogin;
	
	

     public servicenowloginpage enterUName(String data) 
     {	
		
		switchToFrame(0);
		clearAndType(eleUserName,data);
		 
				return this;
	}	

	public servicenowloginpage enterPasswd(String data) {
		clearAndType(elePassword, data);
		 takeSnap();
		return this;
	}	

	public servicenowincidentpage submitLogin() {
		click(eleLogin);
		return new servicenowincidentpage(driver,node);		
	}
	

	

}
