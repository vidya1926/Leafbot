package com.leafBot.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;


public class servicenowprojectspecficMethods extends SeleniumBase {
		public String dataSheetName;	
		public static String incidentno;

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}	

	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("chrome", "http://dev111627.service-now.com");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("successful");
		driver.close();
	}













}
