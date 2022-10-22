package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNestedFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Get into the parent frame or outer frame
		driver.switchTo().frame(1); //to get into the second frame
		
		//get into the inner frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click1")).click();
		
		driver.switchTo().parentFrame(); // to move the control to the immediate parent frame


	}

}
