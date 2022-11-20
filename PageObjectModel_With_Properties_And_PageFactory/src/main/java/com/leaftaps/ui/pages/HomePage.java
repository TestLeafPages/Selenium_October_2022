package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.How;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
public HomePage(RemoteWebDriver receivedDriver) {
	this.driver = receivedDriver;
}


public MyLeadsPage clickLeads() {
	driver.findElement(By.linkText(prop.getProperty("HomePage.Leads.LinkText"))).click();
	return new MyLeadsPage(driver);
}
}
