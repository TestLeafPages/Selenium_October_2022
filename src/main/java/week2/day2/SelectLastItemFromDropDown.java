package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLastItemFromDropDown {
public static void main(String[] args) {
	// Setup driver before starting the browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
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
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	
	//Ownership
	WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd3 = new Select(eleOwnership);
	
	//to get all the options as WebElements under the select tag
	List<WebElement> options = dd3.getOptions();
	
	//to find the number of items
	int size = options.size();
	System.out.println(size); //0,1,2,3,4,5,6 last item index size()-1
	
	// to get single item from List
	//options.get(5); 
	
	for (int i = 0; i < size; i++) {
		WebElement eleOption = options.get(i); 
	//	String optionValue = eleOption.getAttribute("value");
		String text = eleOption.getText();
		
		if(text.equals("Corporation")) {
			eleOption.click();
		}

		
	}
	
	//to select the last item index = size-1
	//WebElement eleLast = options.get(size-1); 
//	eleLast.click();
	
	//dd3.selectByIndex(5);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
