package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import hooks.PreLoginHooks;

public class TC005_DeleteLead extends PreLoginHooks{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Search by Phone Number and Delete the Lead";
		nodes = "Leads";
		dataSheetName="TC005";
		category="Sanity";
		authors="Haja";
	}

	@Test(dataProvider="fetchData")
	public void deleteLead(String phoneNum,String errorMsg){

		String firstResultingLead =
				homePage
				.clickCRMSFA()
				.clickLeadLink()		
				.clickFindLead()
				.clickPhoneTab()
				.enterPhoneNumberField(phoneNum)
				.clickFindleadsButton()
				.getFirstResultingLead();
		
				findLeadPage
				.clickFirstResultingLead()
				.clickDeleteLeadLink()
				.clickFindLead()
				.enterLeadId(firstResultingLead)
				.clickFindleadsButton()
				.verifyErrorMsg(errorMsg);
	}
}
