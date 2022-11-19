package com.leaftaps.leads.ui.cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelfilename = "tc001";
	}

	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname) {
		System.out.println("Driver from @Test"+driver);
		LoginPage pg = new LoginPage(driver);
		pg.enterUsername(username).enterPassword(password).clickLoginButton_Positive().clickCRMSFA().clickLeads()
				.clickCreateLead().enterCompanyName(cname).enterFirstName(fname).enterLastName(lname)
				.clickCreateLeadButton();
	}

}
