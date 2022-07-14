package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import hooks.PreLoginHooks;


public class TC003_CreateLead extends PreLoginHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead with mandatory fields";
		nodes = "Leads";		
		dataSheetName="TC003";
		category="Smoke";
		authors="Haja";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String companyName, String firstName, String lastName, String eMail){

		homePage
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(eMail)
		.clickCreateLeadSubmit()		
		.verifyFirstName(firstName);
		
		homePage
		 .clickCRMSFA();
	}
}
