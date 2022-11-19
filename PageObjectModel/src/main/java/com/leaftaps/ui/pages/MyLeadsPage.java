package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
public MyLeadsPage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
}
public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
}
}
