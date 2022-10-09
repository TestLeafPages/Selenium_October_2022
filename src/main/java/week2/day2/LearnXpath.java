package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
public static void main(String[] args) {
	// Setup driver before starting the browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Find an element
	WebElement elementUsername = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
	// Action on the element found
	elementUsername.sendKeys("Demosalesmanager");
	
	
	
	
}
}
