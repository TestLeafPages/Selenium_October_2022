package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
public static void main(String[] args) {
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
	
	
	//26th Feb
	
	//Step1: Locate the parent element -> which is having select tag
	WebElement eleDay = driver.findElement(By.id("day"));
	
	//Step2: Create object for Select class and pass the parent WebElement
	Select dd = new Select(eleDay);
	
	//Step3: Select the option using VisibleText
	dd.selectByVisibleText("26");
	
	//Locate the parent
	WebElement eleMonth = driver.findElement(By.id("month"));
	
	//Create object for Select class
	Select dd1 = new Select(eleMonth);
	
	//select using value
	//dd1.selectByValue("2");
	
	//how to use index to select the option -> index starts with 0
	dd1.selectByIndex(1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
