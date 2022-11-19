package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
	}
	
	public LoginPage enterUsername(String username) {
		System.out.println("Driver from loginpage"+driver);
		driver.findElement(By.id("username")).sendKeys(username);
//		return new LoginPage();
		return this;
	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickLoginButton_Positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	public LoginPage clickLoginButton_Negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
}
