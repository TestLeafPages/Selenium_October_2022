package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
public CreateLeadPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
}

public CreateLeadPage enterCompanyName(String cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	return this;
}
public CreateLeadPage enterFirstName(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
}
public CreateLeadPage enterLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage(driver);

}
}
