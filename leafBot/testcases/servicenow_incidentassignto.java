package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.servicenowincidentpage;
import com.leafBot.pages.servicenowloginpage;
import com.leafBot.pages.servicenowlookupwindow;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenow_incidentassignto extends servicenowprojectspecficMethods{	

	@BeforeTest
	public void setValues()
	{
		testCaseName = "servicenow_incidentassignto";
		testDescription = "Assign the group";
		nodes = "servicenow";
		authors = "vidya";
		category = "Functionality";
		dataSheetName = "Servicenowincidentassign";
	}

	@Test(dataProvider = "fetchData")
	public void servicenowassign(String uname, String password,String filter,String incident,String searchlook)throws InterruptedException 
	
	{
		new servicenowloginpage(driver, node)
		.enterUName(uname).enterPasswd(password).submitLogin().filterEnter(filter)
		.clickincident().clickOpenincident().searchincident1(incident).clickPreview().clicklookup().
		searchlookup(searchlook).selectgrp().clicklookupwindow().selectgrp1().Entertext().clickupdate().clickPreview1();
   
			
    }			
}


