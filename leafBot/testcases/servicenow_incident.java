package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.servicenowbackTonewinci;
import com.leafBot.pages.servicenowincidentpage;
import com.leafBot.pages.servicenowloginpage;
import com.leafBot.pages.servicenowlookupwindow;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenow_incident extends servicenowprojectspecficMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "servicenow_incident";
		testDescription = "Create new incident";
		nodes = "servicenow";
		authors = "vidya";
		category = "Functionality";
		dataSheetName = "Servicenowincidentpage1";
	}

	@Test(dataProvider = "fetchData")
	public void incidentpage(String uname, String password,String filter,String Search,String sdesc) throws InterruptedException 
	{
incidentno=

	new servicenowloginpage(driver, node)
		.enterUName(uname).enterPasswd(password).submitLogin().filterEnter(filter).clickincident()
		.clickNewincident().searchCaller().callerName(Search).clickCaller().		
	    enterShortdesc(sdesc).getnewincident();



	new  servicenowbackTonewinci (driver,node) .clickNewsubmit().
	    searchincident(incidentno);
	    
		
	}
		
		
		


}


