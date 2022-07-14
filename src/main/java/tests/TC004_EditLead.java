package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import hooks.PreLoginHooks;

public class TC004_EditLead extends PreLoginHooks{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit existing Lead on LeafTaps";
		nodes = "Leads";
		dataSheetName="TC004";
		category="Sanity";
		authors="Haja";
	}

	@Test(dataProvider="fetchData")
	public void editLead(String firstName, String companyName){

		homePage
		.clickCRMSFA()		
		.clickLeadLink()		
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindleadsButton()
		.clickFirstResultingLead()
		.clickEditLeadLink()
		.updateCompanyName(companyName)
		.clickUpdateSubmit()
		.verifyCompanyName(companyName);

	}

}
