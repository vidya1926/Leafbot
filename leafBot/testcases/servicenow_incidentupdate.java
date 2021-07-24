package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.servicenowincidentpage;
import com.leafBot.pages.servicenowloginpage;
import com.leafBot.pages.servicenowlookupwindow;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenow_incidentupdate extends servicenowprojectspecficMethods{	

	@BeforeTest
	public void setValues()
	{
		testCaseName = "servicenow_incidentupdate";
		testDescription = "update the incident";
		nodes = "servicenow";
		authors = "vidya";
		category = "Functionality";
		dataSheetName = "Servicenowincidentpageupdate";
	}

	@Test(dataProvider = "fetchData")
	public void servicenowupdate(String uname, String password,String filter,String incident)throws InterruptedException 
	
	{
		new servicenowloginpage(driver, node)
		.enterUName(uname).enterPasswd(password).submitLogin().filterEnter(filter)
		.clickincident().clickOpenincident().searchincident1(incident).
		clickPreview().clickUrgency().clickState().clickupdate().clickPreview();
			
    }			

}


