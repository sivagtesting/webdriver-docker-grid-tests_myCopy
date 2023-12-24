package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.LoginPage;

public class TC002_CreateAnotherLead extends ProjectHooks{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Another Lead";
		testDescription ="Create another new Lead";
		authors="Babu";
		category ="Smoke";
	}
	
	@Test()
	public void createLead() {
		
		new LoginPage()
			.doLogin()
			.clickCrmsfaLink()
			.clickLeadsLink()
			.clickCreateLeadLink()
			.enterFirstName("Siva")
			.enterLastName("G")
			.enterCompanyName("TL")
			.clickCreateLeadButton()
			.verifyFirstName("Siva");

	}

}