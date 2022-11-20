package com.leaftaps.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage(RemoteWebDriver receivedDriver) {
		this.driver = receivedDriver;
		// Mandatory
		PageFactory.initElements(receivedDriver, this);
	}

	@CacheLookup
	@FindBy(how = How.ID, using = "username")
	WebElement eleUsername;

	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement elePassword;

	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLoginButton;

	public LoginPage enterPassword(String password) {
		// driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		elePassword.sendKeys(prop.getProperty("password"));
		return this;
	}
	
	public LoginPage enterUsername(String username) {
		// System.out.println("Driver from loginpage"+driver);
		// locate the WebElement
		// Interact with WebElement

		// driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
//		return new LoginPage();
		// eleUsername.sendKeys(prop.getProperty("username"));

		/*
		 * for (WebElement eachEle : eleUsername) { String eleName =
		 * eachEle.getAttribute("name"); System.out.println(eleName); }
		 */

		eleUsername.sendKeys(prop.getProperty("username"));
		return this;
	}

	

	public WelcomePage clickLoginButton_Positive() {
		eleLoginButton.click();
		return new WelcomePage(driver);
	}

	public LoginPage clickLoginButton_Negative() {
		eleLoginButton.click();
		return this;
	}
	
	// To use multiple @FindBy -> AND condition
		/*
		 * @FindBys( {
		 * 
		 * @FindBy(how=How.CLASS_NAME, using="inputLogin123"), //will not find a match
		 * in DOM
		 * 
		 * @FindBy(how=How.XPATH, using="//input[@id='username']") } )
		 * 
		 * WebElement eleUsername;
		 */

		// OR -> Condition
		/*
		 * @FindAll( {
		 * 
		 * @FindBy(how=How.CLASS_NAME, using="inputLogin123"), //will not find a match
		 * in DOM
		 * 
		 * @FindBy(how=How.XPATH, using="//input[@id='username']") } )
		 * 
		 * WebElement eleUsername;
		 */

}
