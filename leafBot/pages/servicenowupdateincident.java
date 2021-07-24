package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenowupdateincident extends servicenowprojectspecficMethods{
	
	public servicenowupdateincident(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}
	
	
	
	@FindBy(how=How.XPATH,using="//a[@class='linked formlink']")
	private WebElement eledetails;
	
	public servicenowupdateincident clickPreview()
	{
		//switchToFrame("gsft_main");
		click(eledetails);
		return this;	
		}

	@FindBy(how=How.XPATH,using="//select[@id='incident.state']")
	private WebElement elestate;
	
	public servicenowupdateincident clickState()
	{		//switchToFrame("gsft_main");
		selectDropDownUsingIndex( elestate, 1);
		return this;	
		} 
	
	@FindBy(how=How.ID,using="incident.urgency")
	private WebElement elerecord;
	
	public servicenowupdateincident clickUrgency()
	{		
		//switchToFrame("gsft_main");
		selectDropDownUsingIndex(elerecord, 0);
		return this;	
		} 
     
	@FindBy(how=How.ID,using="sysverb_update")
	private WebElement eleupdate;
	
	public servicenowupdatewindow clickupdate()
	{		
				click(eleupdate);
			//	System.out.println("Incident Updated");
		return new servicenowupdatewindow(driver,node)	;
		} 

	@FindBy(how=How.ID,using="lookup.incident.assignment_group")
	private WebElement elelookup;
	
	public servicenowassignpage clicklookup()
	{		  // switchToFrame("gsft_main");
		
				clickWithNoSnap(elelookup);
				return new servicenowassignpage(driver,node);
		} 
	
	
	@FindBy(how=How.ID,using="lookup.incident.assigned_to")
	private WebElement elelookup2;
	public servicenowassignpage clicklookupwindow() {
		//switchToFrame("gsft_main");
		 switchToWindow(0);
		 switchToFrame("gsft_main");
		// clickWithNoSnap
		clickWithNoSnap(elelookup2);
		return new servicenowassignpage(driver,node);
} 	
	
	
	@FindBy(how=How.ID,using="activity-stream-work_notes-textarea")
	private WebElement eletextarea;
	
	public servicenowupdateincident Entertext()
	{		
		//switchToFrame("gsft_main");
		eletextarea.sendKeys("Working with servicenow");
		return this;	
		}
	
	
	
	} 

	
	

