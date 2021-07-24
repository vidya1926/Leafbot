package com.leafBot.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenowlookupwindow extends servicenowprojectspecficMethods{
	
	public servicenowlookupwindow(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}
	 @FindBy(how=How.XPATH,using=("//input[@placeholder='Search']"))
	 public WebElement elecallerName;
	 public servicenowlookupwindow callerName(String data) throws InterruptedException {
		 switchToWindow(1);
		 clearAndType(elecallerName,data);
		 Thread.sleep(2000);
		 return this;
		 
	 }
	 @FindBy(how=How.XPATH,using="//tr[@data-list_id='sys_user']//a")
	 public WebElement eleCalleradmin;
	 public servicenowbackTonewinci clickCaller() {
		 click(eleCalleradmin);
		 return new servicenowbackTonewinci(driver,node);
	 }
	
	



}