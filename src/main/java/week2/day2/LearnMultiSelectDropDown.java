package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMultiSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement multiSelect = driver.findElement(By.xpath("(//select)[6]"));
	
	Select comboBox = new Select(multiSelect);
	
	comboBox.selectByVisibleText("Selenium");
	
	comboBox.selectByVisibleText("Appium");
	
	comboBox.selectByVisibleText("UFT/QTP");
	
	Thread.sleep(2000); //to wait for 2 secs
	comboBox.deselectByVisibleText("Appium");
	
	comboBox.selectByVisibleText("Appium");
	
	
	
	
	
	
	
	
	
}
}
