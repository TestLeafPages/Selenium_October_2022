package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		// Setup driver before starting the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Find an element
		WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
		// Action on the element found
		elementUsername.sendKeys("Demosalesmanager");

		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");

		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();

		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// Source 
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(eleSource);
		dd1.selectByVisibleText("Employee");

		// Industry 
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(eleIndustry);
		dd2.selectByValue("IND_FINANCE");

		// Ownership 
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd3 = new Select(eleOwnership);
		dd3.selectByIndex(5);

	}
}
