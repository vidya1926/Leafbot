package com.leafBot.pages;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

import cucumber.api.java.en.Given;



public class servicenowincidentpage extends servicenowprojectspecficMethods{
	
	public servicenowincidentpage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}

	@FindBy(how=How.ID,using="filter")
	private WebElement elefilter;
		

	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Incidents")
	private WebElement eleincident;
	
	@FindBy(how=How.XPATH,using="//div[text()='Create New']")
	private WebElement elenew;
	@FindBy(how=How.XPATH,using="//div[text()='Open']")
	private WebElement eleopenexisting;
	
	@FindBy(how=How.XPATH,using="//input[@id='incident_table_header_search_control']")//
	private WebElement elesearchincident;
	
	
	public servicenowincidentpage filterEnter(String data) {
		clearAndType(elefilter,data);
		return this;		
	}
	public servicenowincidentpage clickincident() throws InterruptedException {
		click(eleincident);
		Thread.sleep(1000);
		return this;		
	}
	public servicenowincidentpage clickOpenincident() {
		click(eleopenexisting);
		return this;
	}
	
	
  
	
	public servicenowincidentpage clickNewincident() {
		click(elenew);
		return this;	
		
	}
	 @FindBy(how=How.XPATH,using="//button[@id='lookup.incident.caller_id']//span[1]")
	 public WebElement eleCaller;
	 public servicenowlookupwindow searchCaller() throws InterruptedException {
		 switchToFrame("gsft_main");
		 switchToWindow(0);
		 switchToFrame("gsft_main");
		 clickWithNoSnap(eleCaller);
		
		 Thread.sleep(5000); 
		 return new servicenowlookupwindow(driver,node);
	 }
	
	  public servicenowupdateincident searchincident1(String data) {
	    	switchToFrame("gsft_main");
	    	elesearchincident.sendKeys(data,Keys.ENTER);    
		return new servicenowupdateincident(driver,node);
	}	
   
    	
}
