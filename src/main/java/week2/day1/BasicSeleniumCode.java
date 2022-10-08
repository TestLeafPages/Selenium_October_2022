package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {
public static void main(String[] args) {
	// Setup driver before starting the browser
	WebDriverManager.chromedriver().setup();
	// Open a chrome browser
	ChromeDriver driver = new ChromeDriver();
	// Load the URL to test
	driver.get("http://leaftaps.com/opentaps/control/main");
	// Maximize the browser
	driver.manage().window().maximize();
	
	// Find an element
	WebElement elementUsername = driver.findElement(By.id("username"));
	// Action on the element found
	elementUsername.sendKeys("Demosalesmanager");
	
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	
	// Close the browser
//	driver.close();
	
	
	
	
	
}
}
