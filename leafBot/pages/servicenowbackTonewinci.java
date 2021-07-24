package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenowbackTonewinci extends servicenowprojectspecficMethods{
	
	public servicenowbackTonewinci(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@name='sys_display.incident.short_description']/following-sibling::input[1]")
	private WebElement eleshortdesc;
		
	@FindBy(how=How.ID,using="sysverb_insert_bottom")
	private WebElement eleinsert;
	
	@FindBy(how=How.NAME,using="incident.number")
	private WebElement createdincidentno;
	
	@FindBy(how=How.XPATH,using="//input[@class='form-control']")
	private WebElement eleexistingincident;
	
	 public servicenowbackTonewinci enterShortdesc(String data) {
   	     switchToWindow(0);
   	     switchToFrame("gsft_main");
  		  clearAndType(eleshortdesc,data);    		
    		return this;		
    	}  
		public String getnewincident() { 
     	    	   
	    
	        return  getTypedText(createdincidentno);
	    	}
			
      	public servicenowbackTonewinci clickNewsubmit()
    	{ 
    		click(eleinsert);
    		
    		return this;		
    	}   	
      	      	          	
      	 public servicenowbackTonewinci searchincident(String incident) {
      	   clearAndType(eleexistingincident,incident); 
      	 
      	    System.out.println(incident);
      	    takeSnap();
      	    System.out.println("New incident created");
      	         		return this;
      	}	
      	 
      	 
	
	

}
