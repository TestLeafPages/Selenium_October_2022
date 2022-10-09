package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) {
	// Setup driver before starting the browser
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	WebElement elementUsername = driver.findElement(By.linkText("Create New Account"));
	elementUsername.click();
	
	
	driver.findElement(By.name("firstname")).sendKeys("Hari");
	driver.findElement(By.name("lastname")).sendKeys("Radhakrishnan");
	
	
	
	
	
	
}
}
