package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.servicenowloginpage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;
import com.leafBot.testng.api.base.servicenowprojectspecficMethods;

public class servicenow_LoginLogOut extends servicenowprojectspecficMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "servicenow_LoginLoginOut";
		testDescription = "Login testCase using admin UserName and LogOut";
		nodes = "servicenow";
		authors = "vidya";
		category = "Functionality";
		dataSheetName = "ServicenowLogin";
	}

	@Test(dataProvider = "fetchData")
	public void navigateLogin(String uname, String password) {
		new servicenowloginpage(driver, node)
		.enterUName(uname)
		.enterPasswd(password)
		.submitLogin();
		
	}


}





